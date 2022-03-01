// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.policy;

import com.azure.core.http.HttpHeader;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelineSynchronousPolicy;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/**
 * Wraps any potential error responses from the service and applies post processing of the response's eTag header to
 * standardize the value.
 */
public class ScrubEtagPolicy extends HttpPipelineSynchronousPolicy {
    private static final Pattern QUOTE_PATTERN = Pattern.compile("\"");
    private static final String ETAG = "eTag";

    /**
     * Wraps any potential error responses from the service and applies post processing of the response's eTag header to
     * standardize the value.
     *
     * @return an updated response with post processing steps applied.
     */
    @Override
    protected HttpResponse afterReceivedResponse(HttpPipelineCallContext context, HttpResponse response) {
        return scrubETagHeader(response);
    }

    /*
    The service is inconsistent in whether or not the etag header value has quotes. This method will check if the
    response returns an etag value, and if it does, remove any quotes that may be present to give the user a more
    predictable format to work with.
     */
    private HttpResponse scrubETagHeader(HttpResponse unprocessedResponse) {
        HttpHeader eTagHeader = unprocessedResponse.getHeaders().get(ETAG);
        if (eTagHeader == null) {
            return unprocessedResponse;
        }
        String eTag = eTagHeader.getValue();

        eTag = QUOTE_PATTERN.matcher(eTag).replaceAll("");
        HttpHeaders headers = unprocessedResponse.getHeaders();
        headers.set(eTagHeader.getName(), eTag);
        return new InnerHttpResponse(unprocessedResponse, headers, unprocessedResponse.getRequest());
    }

    private static final class InnerHttpResponse extends HttpResponse {
        private final HttpResponse innerHttpResponse;
        private final HttpHeaders headers;
        InnerHttpResponse(HttpResponse innerHttpResponse, HttpHeaders headers, HttpRequest request) {
            super(request);
            this.innerHttpResponse = innerHttpResponse;
            this.headers = headers;
        }

        @Override
        public int getStatusCode() {
            return innerHttpResponse.getStatusCode();
        }

        @Override
        public String getHeaderValue(String name) {
            return innerHttpResponse.getHeaderValue(name);
        }

        @Override
        public HttpHeaders getHeaders() {
            return headers;
        }

        @Override
        public Flux<ByteBuffer> getBody() {
            return innerHttpResponse.getBody();
        }

        @Override
        public BinaryData getContent() {
            return null;
        }

        @Override
        public Mono<byte[]> getBodyAsByteArray() {
            return innerHttpResponse.getBodyAsByteArray();
        }

        @Override
        public Mono<String> getBodyAsString() {
            return innerHttpResponse.getBodyAsString();
        }

        @Override
        public Mono<String> getBodyAsString(Charset charset) {
            return innerHttpResponse.getBodyAsString(charset);
        }
    }
}
