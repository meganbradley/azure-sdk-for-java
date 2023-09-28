// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.http.netty;

import com.client.core.http.HttpClient;
import com.client.core.http.HttpHeader;
import com.client.core.http.HttpRequest;
import com.client.core.http.HttpResponse;
import com.client.core.http.ProxyOptions;
import com.client.core.http.netty.implementation.ClientNettyHttpClientContext;
import com.client.core.http.netty.implementation.NettyAsyncHttpBufferedResponse;
import com.client.core.http.netty.implementation.NettyAsyncHttpResponse;
import com.client.core.implementation.util.BinaryDataContent;
import com.client.core.implementation.util.BinaryDataHelper;
import com.client.core.implementation.util.ByteArrayContent;
import com.client.core.implementation.util.FileContent;
import com.client.core.implementation.util.InputStreamContent;
import com.client.core.implementation.util.SerializableContent;
import com.client.core.implementation.util.StringContent;
import com.client.core.util.BinaryData;
import com.client.core.util.Context;
import com.client.core.util.Contexts;
import com.client.core.util.ProgressReporter;
import com.client.core.util.logging.ClientLogger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.EventLoopGroup;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.proxy.HttpProxyHandler;
import io.netty.handler.proxy.ProxyConnectException;
import io.netty.handler.stream.ChunkedNioFile;
import io.netty.handler.stream.ChunkedStream;
import io.netty.handler.stream.ChunkedWriteHandler;
import org.reactivestreams.Publisher;
import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.Connection;
import reactor.netty.NettyOutbound;
import reactor.netty.NettyPipeline;
import reactor.netty.http.client.HttpClientRequest;
import reactor.netty.http.client.HttpClientResponse;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

import javax.net.ssl.SSLException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.Objects;
import java.util.function.BiFunction;

import static com.client.core.http.netty.implementation.Utility.closeConnection;

/**
 * This class provides a Netty-based implementation for the {@link HttpClient} interface. Creating an instance of this
 * class can be achieved by using the {@link NettyAsyncHttpClientBuilder} class, which offers Netty-specific API for
 * features such as {@link NettyAsyncHttpClientBuilder#eventLoopGroup(EventLoopGroup) thread pooling},
 * {@link NettyAsyncHttpClientBuilder#wiretap(boolean) wiretapping},
 * {@link NettyAsyncHttpClientBuilder#proxy(ProxyOptions) setProxy configuration}, and much more.
 *
 * @see HttpClient
 * @see NettyAsyncHttpClientBuilder
 */
class NettyAsyncHttpClient implements HttpClient {
    private static final ClientLogger LOGGER = new ClientLogger(NettyAsyncHttpClient.class);
    private static final byte[] EMPTY_BYTES = new byte[0];

    private static final String AZURE_EAGERLY_READ_RESPONSE = "client-eagerly-read-response";
    private static final String AZURE_IGNORE_RESPONSE_BODY = "client-ignore-response-body";
    private static final String AZURE_RESPONSE_TIMEOUT = "client-response-timeout";
    private static final String AZURE_EAGERLY_CONVERT_HEADERS = "client-eagerly-convert-headers";

    final boolean disableBufferCopy;

    final boolean addProxyHandler;

    final reactor.netty.http.client.HttpClient nettyClient;

    /**
     * Creates NettyAsyncHttpClient with provided http client.
     *
     * @param nettyClient the reactor-netty http client
     * @param disableBufferCopy Determines whether deep cloning of response buffers should be disabled.
     */
    NettyAsyncHttpClient(reactor.netty.http.client.HttpClient nettyClient, boolean disableBufferCopy,
        boolean addProxyHandler) {
        this.nettyClient = nettyClient;
        this.disableBufferCopy = disableBufferCopy;
        this.addProxyHandler = addProxyHandler;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<HttpResponse> send(HttpRequest request) {
        return send(request, Context.NONE);
    }

    @Override
    public Mono<HttpResponse> send(HttpRequest request, Context context) {
        Objects.requireNonNull(request.getHttpMethod(), "'request.getHttpMethod()' cannot be null.");
        Objects.requireNonNull(request.getUrl(), "'request.getUrl()' cannot be null.");
        Objects.requireNonNull(request.getUrl().getProtocol(), "'request.getUrl().getProtocol()' cannot be null.");

        boolean eagerlyReadResponse = (boolean) context.getData(AZURE_EAGERLY_READ_RESPONSE).orElse(false);
        boolean ignoreResponseBody = (boolean) context.getData(AZURE_IGNORE_RESPONSE_BODY).orElse(false);
        boolean headersEagerlyConverted = (boolean) context.getData(AZURE_EAGERLY_CONVERT_HEADERS).orElse(false);
        Long responseTimeout = context.getData(AZURE_RESPONSE_TIMEOUT)
            .filter(timeoutDuration -> timeoutDuration instanceof Duration)
            .map(timeoutDuration -> ((Duration) timeoutDuration).toMillis())
            .orElse(null);
        ProgressReporter progressReporter = Contexts.with(context).getHttpRequestProgressReporter();

        return attemptAsync(request, eagerlyReadResponse, ignoreResponseBody, headersEagerlyConverted, responseTimeout,
            progressReporter, false);
    }

    private Mono<HttpResponse> attemptAsync(HttpRequest request, boolean eagerlyReadResponse,
        boolean ignoreResponseBody, boolean headersEagerlyConverted, Long responseTimeout,
        ProgressReporter progressReporter, boolean proxyRetry) {
        Flux<Tuple2<HttpResponse, HttpHeaders>> nettyRequest = nettyClient
            .request(toReactorNettyHttpMethod(request.getHttpMethod()))
            .uri(request.getUrl().toString())
            .send(bodySendDelegate(request))
            .responseConnection(responseDelegate(request, disableBufferCopy, eagerlyReadResponse, ignoreResponseBody,
                headersEagerlyConverted));

        if (responseTimeout != null || progressReporter != null) {
            nettyRequest = nettyRequest.contextWrite(ctx -> ctx.put(ClientNettyHttpClientContext.KEY,
                new ClientNettyHttpClientContext(responseTimeout, progressReporter)));
        }

        return nettyRequest.single()
            .flatMap(responseAndHeaders -> {
                HttpResponse response = responseAndHeaders.getT1();
                if (addProxyHandler && response.getStatusCode() == 407) {
                    if (proxyRetry) {
                        // Exhausted retry attempt return an error.
                        return Mono.error(new HttpProxyHandler.HttpProxyConnectException(
                            "Failed to connect to proxy. Status: 407", responseAndHeaders.getT2()));
                    } else {
                        // Retry the request.
                        return attemptAsync(request, eagerlyReadResponse, ignoreResponseBody, headersEagerlyConverted,
                            responseTimeout, progressReporter, true);
                    }
                } else {
                    return Mono.just(response);
                }
            })
            .onErrorResume(throwable -> shouldRetryProxyError(proxyRetry, throwable)
                ? attemptAsync(request, eagerlyReadResponse, ignoreResponseBody, headersEagerlyConverted,
                        responseTimeout, progressReporter, true)
                : Mono.error(throwable));
    }

    private static boolean shouldRetryProxyError(boolean proxyRetry, Throwable throwable) {
        // Only retry if this is the first attempt to connect to a proxy and the exception was caused by a failure to
        // connect to the proxy.
        // Sometimes connecting to the proxy may return an SSLException that wraps the ProxyConnectException, this
        // generally happens if the proxy is using SSL.
        return !proxyRetry
               && (throwable instanceof ProxyConnectException
                   || (throwable instanceof SSLException && throwable.getCause() instanceof ProxyConnectException));
    }

    @Override
    public HttpResponse sendSync(HttpRequest request, Context context) {
        try {
            return send(request, context).block();
        } catch (Exception e) {
            Throwable unwrapped = Exceptions.unwrap(e);
            if (unwrapped instanceof RuntimeException) {
                throw LOGGER.logExceptionAsError((RuntimeException) unwrapped);
            } else if (unwrapped instanceof IOException) {
                throw LOGGER.logExceptionAsError(new UncheckedIOException((IOException) unwrapped));
            } else {
                throw LOGGER.logExceptionAsError(new RuntimeException(unwrapped));
            }
        }
    }

    /**
     * Delegate to send the request content.
     *
     * @param restRequest the Rest request contains the body to be sent
     * @return a delegate upon invocation sets the request body in reactor-netty outbound object
     */
    private static BiFunction<HttpClientRequest, NettyOutbound, Publisher<Void>> bodySendDelegate(
        final HttpRequest restRequest) {
        return (reactorNettyRequest, reactorNettyOutbound) -> {
            for (HttpHeader hdr : restRequest.getHeaders()) {
                // Get the Netty headers from Reactor Netty and work with the Netty headers directly. This removes the
                // need to do contains checks to determine if headers added by Reactor Netty need to be overwritten.
                // Additionally, this gives direct access to the set(String, Iterable<String>) API which is more
                // performant as it only needs to validate the header name once instead of each time a value from the
                // list is added.
                // This reduces header name and header name equality checks greatly, once for getting rid of contains
                // and once for each additional value in the header.
                reactorNettyRequest.requestHeaders().set(hdr.getName(), hdr.getValuesList());
            }
            BinaryData body = restRequest.getBodyAsBinaryData();
            if (body != null) {
                BinaryDataContent bodyContent = BinaryDataHelper.getContent(body);
                if (bodyContent instanceof ByteArrayContent) {
                    // This is marginally more performant than reactorNettyOutbound.sendByteArray which
                    // adds extra operators to achieve same result.
                    // The bytes are in memory at this time anyway and Unpooled.wrappedBuffer is lightweight.
                    return reactorNettyOutbound.send(Mono.just(Unpooled.wrappedBuffer(bodyContent.toBytes())));
                } else if (bodyContent instanceof StringContent
                    || bodyContent instanceof SerializableContent) {
                    // This defers encoding final bytes until emission happens.
                    return reactorNettyOutbound.send(
                        Mono.fromSupplier(() -> Unpooled.wrappedBuffer(bodyContent.toBytes())));
                } else if (bodyContent instanceof FileContent) {
                    return sendFile(restRequest, reactorNettyOutbound, (FileContent) bodyContent);
                } else if (bodyContent instanceof InputStreamContent) {
                    return sendInputStream(reactorNettyOutbound, (InputStreamContent) bodyContent);
                } else {
                    Flux<ByteBuf> nettyByteBufFlux = restRequest.getBody().map(Unpooled::wrappedBuffer);
                    return reactorNettyOutbound.send(nettyByteBufFlux);
                }
            } else {
                return reactorNettyOutbound;
            }
        };
    }

    private static NettyOutbound sendFile(
        HttpRequest restRequest, NettyOutbound reactorNettyOutbound, FileContent fileContent) {
        // NettyOutbound uses such logic internally for ssl connections but with smaller buffer of 1KB.
        // We use simplified check here to handle https instead of original check that Netty uses
        // as other corner cases are not existent (i.e. different protocols using ssl).
        // But in case we missed them these will be still handled by Netty's logic - they'd just use 1KB chunk
        // and this check should be evolved when they're discovered.
        if (fileContent.getLength() == 0) {
            // Send an empty file using send byte array as there is less overhead.
            return reactorNettyOutbound.sendByteArray(Flux.just(EMPTY_BYTES));
        } else if (restRequest.getUrl().getProtocol().equals("https")) {
            return reactorNettyOutbound.sendUsing(
                () -> FileChannel.open(fileContent.getFile(), StandardOpenOption.READ),
                (c, fc) -> {
                    if (c.channel().pipeline().get(ChunkedWriteHandler.class) == null) {
                        c.addHandlerLast(NettyPipeline.ChunkedWriter, new ChunkedWriteHandler());
                    }

                    try {
                        return new ChunkedNioFile(
                            fc, fileContent.getPosition(), fileContent.getLength(), fileContent.getChunkSize());
                    } catch (IOException e) {
                        throw LOGGER.logExceptionAsError(new UncheckedIOException(e));
                    }
                },
                (fc) -> {
                    try {
                        fc.close();
                    } catch (IOException e) {
                        throw LOGGER.logExceptionAsError(new UncheckedIOException(e));
                    }
                });
        } else {
            // Beware of NettyOutbound.sendFile(Path) it involves extra file length lookup.
            // This is going to use zero-copy transfer if there's no ssl
            return reactorNettyOutbound.sendFile(
                fileContent.getFile(), fileContent.getPosition(), fileContent.getLength());
        }
    }

    private static NettyOutbound sendInputStream(NettyOutbound reactorNettyOutbound, InputStreamContent bodyContent) {
        return reactorNettyOutbound.sendUsing(
            bodyContent::toStream,
            (c, stream) -> {
                if (c.channel().pipeline().get(ChunkedWriteHandler.class) == null) {
                    c.addHandlerLast(NettyPipeline.ChunkedWriter, new ChunkedWriteHandler());
                }

                return new ChunkedStream(stream);
            },
            (stream) -> {
                // NO-OP. We don't close streams passed to our APIs.
            });
    }

    /**
     * Delegate to receive response.
     *
     * @param restRequest the Rest request whose response this delegate handles
     * @param disableBufferCopy Flag indicating if the network response shouldn't be buffered.
     * @param eagerlyReadResponse Flag indicating if the network response should be eagerly read into memory.
     * @param ignoreResponseBody Flag indicating if the network response should be ignored.
     * @param headersEagerlyConverted Flag indicating if the Netty HttpHeaders should be eagerly converted to Client Core
     * HttpHeaders.
     * @return a delegate upon invocation setup Rest response object
     */
    private static BiFunction<HttpClientResponse, Connection, Mono<Tuple2<HttpResponse, HttpHeaders>>> responseDelegate(
        HttpRequest restRequest, boolean disableBufferCopy, boolean eagerlyReadResponse, boolean ignoreResponseBody,
        boolean headersEagerlyConverted) {
        return (reactorNettyResponse, reactorNettyConnection) -> {
            // For now, eagerlyReadResponse and ignoreResponseBody works the same.
//            if (ignoreResponseBody) {
//                AtomicBoolean firstNext = new AtomicBoolean(true);
//                return reactorNettyConnection.inbound().receive()
//                    .doOnNext(ignored -> {
//                        if (!firstNext.compareAndSet(true, false)) {
//                            LOGGER.log(LogLevel.WARNING, () -> "Received HTTP response body when one wasn't expected. "
//                                + "Response body will be ignored as directed.");
//                        }
//                    })
//                    .ignoreElements()
//                    .doFinally(ignored -> closeConnection(reactorNettyConnection))
//                    .then(Mono.fromSupplier(() -> new NettyAsyncHttpBufferedResponse(reactorNettyResponse, restRequest,
//                        EMPTY_BYTES, headersEagerlyConverted)));
//            }

            /*
             * If the response is being eagerly read into memory the flag for buffer copying can be ignored as the
             * response MUST be deeply copied to ensure it can safely be used downstream.
             */
            if (eagerlyReadResponse || ignoreResponseBody) {
                // Set up the body flux and dispose the connection once it has been received.
                return reactorNettyConnection.inbound().receive().aggregate().asByteArray()
                    .doFinally(ignored -> closeConnection(reactorNettyConnection))
                    .switchIfEmpty(Mono.just(EMPTY_BYTES))
                    .map(bytes -> Tuples.of(new NettyAsyncHttpBufferedResponse(reactorNettyResponse, restRequest, bytes,
                        headersEagerlyConverted), reactorNettyResponse.responseHeaders()));
            } else {
                return Mono.just(Tuples.of(new NettyAsyncHttpResponse(reactorNettyResponse, reactorNettyConnection,
                    restRequest, disableBufferCopy, headersEagerlyConverted), reactorNettyResponse.responseHeaders()));
            }
        };
    }

    private static HttpMethod toReactorNettyHttpMethod(com.client.core.http.HttpMethod azureHttpMethod) {
        switch (azureHttpMethod) {
            case GET: return HttpMethod.GET;
            case PUT: return HttpMethod.PUT;
            case HEAD: return HttpMethod.HEAD;
            case POST: return HttpMethod.POST;
            case DELETE: return  HttpMethod.DELETE;
            case PATCH: return HttpMethod.PATCH;
            case TRACE: return HttpMethod.TRACE;
            case CONNECT: return HttpMethod.CONNECT;
            case OPTIONS: return HttpMethod.OPTIONS;
            default: throw LOGGER.logExceptionAsError(
                new IllegalStateException("Unknown HttpMethod '" + azureHttpMethod + "'.")); // Should never happen
        }
    }
}
