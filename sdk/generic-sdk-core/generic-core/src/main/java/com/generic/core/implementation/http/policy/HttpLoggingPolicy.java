// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.implementation.http.policy;

import com.generic.core.http.models.HttpHeaderName;
import com.generic.core.http.models.HttpRequest;
import com.generic.core.http.models.HttpResponse;
import com.generic.core.http.pipeline.HttpPipelineNextPolicy;
import com.generic.core.http.pipeline.HttpPipelinePolicy;
import com.generic.core.http.policy.HttpLogOptions;
import com.generic.core.implementation.util.CoreUtils;
import com.generic.core.models.BinaryData;
import com.generic.core.models.Header;
import com.generic.core.models.Headers;
import com.generic.core.util.logging.ClientLogger;
import com.generic.core.util.logging.LogLevel;
import com.generic.core.util.logging.LoggingEventBuilder;

import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * The pipeline policy that handles logging of HTTP requests and responses.
 */
public class HttpLoggingPolicy implements HttpPipelinePolicy {
    // private static final ObjectMapperShim PRETTY_PRINTER = ObjectMapperShim.createPrettyPrintMapper();
    private static final int MAX_BODY_LOG_SIZE = 1024 * 16;
    private static final String REDACTED_PLACEHOLDER = "REDACTED";
    private static final String APPLICATION_JSON = "application/json";
    private static final String APPLICATION_OCTET_STREAM = "application/octet-stream";

    // Use a cache to retain the caller method ClientLogger.
    //
    // The same method may be called thousands or millions of times, so it is wasteful to create a new logger instance
    // each time the method is called. Instead, retain the created ClientLogger until a certain number of unique method
    // calls have been made and then clear the cache and rebuild it. Long term, this should be replaced with an LRU,
    // or another type of cache, for better cache management.
    private static final int LOGGER_CACHE_MAX_SIZE = 1000;
    private static final Map<String, ClientLogger> CALLER_METHOD_LOGGER_CACHE = new ConcurrentHashMap<>();

    private static final ClientLogger LOGGER = new ClientLogger(HttpLoggingPolicy.class);

    private final HttpLogOptions.HttpLogDetailLevel httpLogDetailLevel;
    private final Set<String> allowedHeaderNames;
    private final Set<String> allowedQueryParameterNames;
    private final HttpRequestLogger requestLogger;
    private final HttpResponseLogger responseLogger;

    private static final String REQUEST_LOG_MESSAGE = "HTTP request";
    private static final String RESPONSE_LOG_MESSAGE = "HTTP response";

    /**
     * Creates an HttpLoggingPolicy with the given log configurations.
     *
     * @param httpLogOptions The HTTP logging configuration options.
     */
    public HttpLoggingPolicy(HttpLogOptions httpLogOptions) {
        if (httpLogOptions == null) {
            this.httpLogDetailLevel = HttpLogOptions.HttpLogDetailLevel.NONE;
            this.allowedHeaderNames = Collections.emptySet();
            this.allowedQueryParameterNames = Collections.emptySet();
            this.requestLogger = new DefaultHttpRequestLogger();
            this.responseLogger = new DefaultHttpResponseLogger();
        } else {
            this.httpLogDetailLevel = httpLogOptions.getLogLevel();
            this.allowedHeaderNames = httpLogOptions.getAllowedHeaderNames()
                .stream()
                .map(headerName -> headerName.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
            this.allowedQueryParameterNames = httpLogOptions.getAllowedQueryParamNames()
                .stream()
                .map(queryParamName -> queryParamName.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
            this.requestLogger = (httpLogOptions.getRequestLogger() == null)
                ? new DefaultHttpRequestLogger()
                : httpLogOptions.getRequestLogger();
            this.responseLogger = (httpLogOptions.getResponseLogger() == null)
                ? new DefaultHttpResponseLogger()
                : httpLogOptions.getResponseLogger();
        }
    }

    @Override
    public HttpResponse process(HttpRequest httpRequest, HttpPipelineNextPolicy next) {
        // No logging will be performed, trigger a no-op.
        if (httpLogDetailLevel == HttpLogOptions.HttpLogDetailLevel.NONE) {
            return next.process();
        }

        final ClientLogger logger = httpRequest.getMetadata().getRequestLogger();
        final long startNs = System.nanoTime();

        requestLogger.logRequest(logger, httpRequest);
        try {
            HttpResponse response = next.process();

            if (response != null) {
                response = responseLogger.logResponse(logger, response, Duration.ofNanos(System.nanoTime() - startNs));
            }

            return response;
        } catch (RuntimeException e) {
            //logger.warning("<-- HTTP FAILED: ", e);
            throw logger.logThrowableAsWarning(e);
        }
    }

    private final class DefaultHttpRequestLogger implements HttpRequestLogger {
        @Override
        public void logRequest(ClientLogger logger, HttpRequest request) {
            final LogLevel logLevel = getLogLevel(request);

            if (logger.canLogAtLevel(logLevel)) {
                log(logLevel, logger, request);
            }
        }

        private void log(LogLevel logLevel, ClientLogger logger, HttpRequest request) {
            LoggingEventBuilder logBuilder = getLogBuilder(logLevel, logger);

            // if (httpLogDetailLevel.shouldLogUrl()) {
            //     logBuilder
            //         .addKeyValue(LoggingKeys.HTTP_METHOD_KEY, request.getHttpMethod())
            //         .addKeyValue(LoggingKeys.URL_KEY, getRedactedUrl(request.getUrl(), allowedQueryParameterNames));
            //
            //     Integer retryCount = loggingOptions.getTryCount();
            //     if (retryCount != null) {
            //         logBuilder.addKeyValue(LoggingKeys.TRY_COUNT_KEY, retryCount);
            //     }
            // }
            //
            // if (httpLogDetailLevel.shouldLogHeaders() && logger.canLogAtLevel(LogLevel.INFORMATIONAL)) {
            //     addHeadersToLogMessage(allowedHeaderNames, request.getHeaders(), logBuilder);
            // }
            //
            // if (request.getBody() == null) {
            //     logBuilder.addKeyValue(LoggingKeys.CONTENT_LENGTH_KEY, 0)
            //         .log(REQUEST_LOG_MESSAGE);
            //     return;
            // }

            String contentType = request.getHeaders().getValue(HttpHeaderName.CONTENT_TYPE);
            long contentLength = getContentLength(logger, request.getHeaders());

            // logBuilder.addKeyValue(LoggingKeys.CONTENT_LENGTH_KEY, contentLength);

            if (httpLogDetailLevel.shouldLogBody() && shouldBodyBeLogged(contentType, contentLength)) {
                logBody(request, (int) contentLength, logBuilder, logger, contentType);

                return;
            }

            logBuilder.log(REQUEST_LOG_MESSAGE);
        }
    }

    private void logBody(HttpRequest request, int contentLength, LoggingEventBuilder logBuilder, ClientLogger logger,
                         String contentType) {
        BinaryData data = request.getBody();
        // BinaryDataContent content = BinaryDataHelper.getContent(data);
        // if (content instanceof StringContent
        //     || content instanceof ByteBufferContent
        //     || content instanceof SerializableContent
        //     || content instanceof ByteArrayContent) {
        //     logBody(logBuilder, logger, contentType, content.toString());
        // } else if (content instanceof InputStreamContent) {
        //     // TODO (limolkova) Implement sync version with logging stream wrapper
        //     byte[] contentBytes = content.toBytes();
        //     request.setBody(contentBytes);
        //     logBody(logBuilder, logger, contentType, new String(contentBytes, StandardCharsets.UTF_8));
        // }
    }

    private void logBody(LoggingEventBuilder logBuilder, ClientLogger logger, String contentType, String data) {
        // logBuilder.addKeyValue(LoggingKeys.BODY_KEY, prettyPrintIfNeeded(logger, prettyPrintBody, contentType, data))
        //     .log(REQUEST_LOG_MESSAGE);
    }


    private final class DefaultHttpResponseLogger implements HttpResponseLogger {
        private void logHeaders(ClientLogger logger, HttpResponse response, LoggingEventBuilder logBuilder) {
            if (httpLogDetailLevel.shouldLogHeaders() && logger.canLogAtLevel(LogLevel.INFORMATIONAL)) {
                addHeadersToLogMessage(allowedHeaderNames, response.getHeaders(), logBuilder);
            }
        }

        private void logUrl(HttpResponse response, Duration duration, LoggingEventBuilder logBuilder) {
            if (httpLogDetailLevel.shouldLogUrl()) {
                // logBuilder
                //     .addKeyValue(LoggingKeys.STATUS_CODE_KEY, response.getStatusCode())
                //     .addKeyValue(LoggingKeys.URL_KEY, getRedactedUrl(response.getRequest().getUrl(), allowedQueryParameterNames))
                //     .addKeyValue(LoggingKeys.DURATION_MS_KEY, duration.toMillis());
            }
        }

        private void logContentLength(HttpResponse response, LoggingEventBuilder logBuilder) {
            String contentLengthString = response.getHeaderValue(HttpHeaderName.CONTENT_LENGTH);

            if (!CoreUtils.isNullOrEmpty(contentLengthString)) {
                // logBuilder.addKeyValue(LoggingKeys.CONTENT_LENGTH_KEY, contentLengthString);
            }
        }

        @Override
        public HttpResponse logResponse(ClientLogger logger, HttpResponse response, Duration duration) {
            final LogLevel logLevel = getLogLevel(response);

            if (!logger.canLogAtLevel(logLevel)) {
                return response;
            }

            LoggingEventBuilder logBuilder = getLogBuilder(logLevel, logger);

            logContentLength(response, logBuilder);
            logUrl(response, duration, logBuilder);
            logHeaders(logger, response, logBuilder);

            if (httpLogDetailLevel.shouldLogBody()) {
                String contentTypeHeader = response.getHeaderValue(HttpHeaderName.CONTENT_TYPE);
                long contentLength = getContentLength(logger, response.getHeaders());

                if (shouldBodyBeLogged(contentTypeHeader, contentLength)) {
                    return new LoggingHttpResponse(response, logBuilder, logger,
                        (int) contentLength, contentTypeHeader);
                }
            }

            logBuilder.log(RESPONSE_LOG_MESSAGE);

            return response;
        }
    }

    /*
     * Generates the redacted URL for logging.
     *
     * @param url URL where the request is being sent.
     * @return A URL with query parameters redacted based on configurations in this policy.
     */
    private static String getRedactedUrl(URL url, Set<String> allowedQueryParameterNames) {
        String query = url.getQuery();

        if (CoreUtils.isNullOrEmpty(query)) {
            // URL doesn't have a query string, just return the URL as-is.
            return url.toString();
        }

        // URL does have a query string that may need redactions.
        // Use UrlBuilder to break apart the URL, clear the query string, and add the redacted query string.
        // UrlBuilder urlBuilder = ImplUtils.parseUrl(url, false);
        //
        // CoreUtils.parseQueryParameters(query).forEachRemaining(queryParam -> {
        //     if (allowedQueryParameterNames.contains(queryParam.getKey().toLowerCase(Locale.ROOT))) {
        //         urlBuilder.addQueryParameter(queryParam.getKey(), queryParam.getValue());
        //     } else {
        //         urlBuilder.addQueryParameter(queryParam.getKey(), REDACTED_PLACEHOLDER);
        //     }
        // });

        // return urlBuilder.toString();
        return null;
    }

    /*
     * Adds HTTP headers into the StringBuilder that is generating the log message.
     *
     * @param headers HTTP headers on the request or response.
     * @param sb StringBuilder that is generating the log message.
     * @param logLevel Log level the environment is configured to use.
     */
    private static void addHeadersToLogMessage(Set<String> allowedHeaderNames, Headers headers,
                                               LoggingEventBuilder logBuilder) {
        for (Header header : headers) {
            String headerName = header.getName();

            logBuilder.addKeyValue(headerName, allowedHeaderNames.contains(headerName.toLowerCase(Locale.ROOT))
                ? header.getValue() : REDACTED_PLACEHOLDER);
        }
    }

    /*
     * Attempts to retrieve and parse the Content-Length header into a numeric representation.
     *
     * @param logger Logger used to log a warning if the Content-Length header is an invalid number.
     * @param headers HTTP headers that are checked for containing Content-Length.
     * @return
     */
    private static long getContentLength(ClientLogger logger, Headers headers) {
        long contentLength = 0;

        String contentLengthString = headers.getValue(HttpHeaderName.CONTENT_LENGTH);

        if (CoreUtils.isNullOrEmpty(contentLengthString)) {
            return contentLength;
        }

        try {
            contentLength = Long.parseLong(contentLengthString);
        } catch (NumberFormatException | NullPointerException e) {
            // logger.warning("Could not parse the HTTP header content-length: '{}'.", contentLengthString, e);
        }

        return contentLength;
    }

    /**
     * Determines if the request or response body should be logged.
     *
     * <p>The request or response body is logged if the Content-Type is not "application/octet-stream" and the body
     * isn't empty and is less than 16KB in size.</p>
     *
     * @param contentTypeHeader Content-Type header value.
     * @param contentLength Content-Length header represented as a numeric.
     *
     * @return A flag indicating if the request or response body should be logged.
     */
    private static boolean shouldBodyBeLogged(String contentTypeHeader, long contentLength) {
        return !APPLICATION_OCTET_STREAM.equalsIgnoreCase(contentTypeHeader)
            && contentLength != 0
            && contentLength < MAX_BODY_LOG_SIZE;
    }

    /**
     * Gets the request retry count to include in logging.
     */
    private static int getRequestRetryCount(HttpRequest request) {
        return request.getMetadata().getRetryCount();
    }

    /*
     * Get or create the ClientLogger for the method having its request and response logged.
     */
    private static ClientLogger getOrCreateMethodLogger(String methodName) {
        if (CALLER_METHOD_LOGGER_CACHE.size() > LOGGER_CACHE_MAX_SIZE) {
            CALLER_METHOD_LOGGER_CACHE.clear();
        }

        return CALLER_METHOD_LOGGER_CACHE.computeIfAbsent(methodName, ClientLogger::new);
    }

    private static LoggingEventBuilder getLogBuilder(LogLevel logLevel, ClientLogger logger) {
        switch (logLevel) {
            case ERROR:
                return logger.atError();
            case WARNING:
                return logger.atWarning();
            case INFORMATIONAL:
                return logger.atInfo();
            case VERBOSE:
            default:
                return logger.atVerbose();
        }
    }

    private static final class LoggingHttpResponse extends HttpResponse {
        private final HttpResponse actualResponse;
        private final LoggingEventBuilder logBuilder;
        private final int contentLength;
        private final ClientLogger logger;
        private final String contentTypeHeader;

        private LoggingHttpResponse(HttpResponse actualResponse, LoggingEventBuilder logBuilder,
                                    ClientLogger logger, int contentLength, String contentTypeHeader) {
            super(actualResponse.getRequest());

            this.actualResponse = actualResponse;
            this.logBuilder = logBuilder;
            this.logger = logger;
            this.contentLength = contentLength;
            this.contentTypeHeader = contentTypeHeader;
        }

        @Override
        public int getStatusCode() {
            return actualResponse.getStatusCode();
        }

        @Override
        public String getHeaderValue(HttpHeaderName headerName) {
            return actualResponse.getHeaderValue(headerName);
        }

        @Override
        public Headers getHeaders() {
            return actualResponse.getHeaders();
        }

        @Override
        public BinaryData getBody() {
            BinaryData content = actualResponse.getBody();
            doLog(content.toString());

            return content;
        }

        @Override
        public void close() {
            actualResponse.close();
        }

        private void doLog(String body) {
            logBuilder.addKeyValue("body", body)
                .log(RESPONSE_LOG_MESSAGE);
        }
    }
}
