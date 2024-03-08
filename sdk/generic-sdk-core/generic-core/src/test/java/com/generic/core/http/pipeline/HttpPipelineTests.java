// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.http.pipeline;

import com.generic.core.http.MockHttpResponse;
import com.generic.core.http.NoOpHttpClient;
import com.generic.core.http.Response;
import com.generic.core.http.models.HttpMethod;
import com.generic.core.http.models.HttpRequest;
import com.generic.core.http.policy.RetryPolicy;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.generic.core.util.TestUtils.createUrl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HttpPipelineTests {
    @Test
    public void constructorWithNoArguments() {
        HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient() {
                @Override
                public Response<?> send(HttpRequest request) {
                    // do nothing
                    return null;
                }
            }).build();

        assertEquals(0, pipeline.getPolicies().size());
        assertNotNull(pipeline.getHttpClient());
    }

    @Test
    public void withRequestPolicy() {
        HttpPipeline pipeline = new HttpPipelineBuilder()
            .policies(new RetryPolicy())
            .httpClient(new NoOpHttpClient() {
                @Override
                public Response<?> send(HttpRequest request) {
                    // do nothing
                    return null;
                }
            }).build();

        assertEquals(1, pipeline.getPolicies().size());
        assertEquals(RetryPolicy.class, pipeline.getPolicies().get(0).getClass());
        assertNotNull(pipeline.getHttpClient());
    }

    @Test
    public void withRequestOptions() {
        HttpPipeline pipeline = new HttpPipelineBuilder()
            .policies(new RetryPolicy())
            .httpClient(new NoOpHttpClient() {
                @Override
                public Response<?> send(HttpRequest request) {
                    // do nothing
                    return null;
                }
            }).build();

        assertNotNull(pipeline.getHttpClient());
    }

    @Test
    public void withNoRequestPolicies() throws MalformedURLException {
        final HttpMethod expectedHttpMethod = HttpMethod.GET;
        final URL expectedUrl = createUrl("http://my.site.com");
        final HttpPipeline httpPipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient() {
                @Override
                public Response<?> send(HttpRequest request) {
                    assertEquals(0, request.getHeaders().getSize());
                    assertEquals(expectedHttpMethod, request.getHttpMethod());
                    assertEquals(expectedUrl, request.getUrl());

                    return new MockHttpResponse(request, 200);
                }
            })
            .build();
        final Response<?> response = httpPipeline.send(new HttpRequest(expectedHttpMethod, expectedUrl));

        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void sendWithPolicies() throws MalformedURLException {
        final HttpMethod expectedHttpMethod = HttpMethod.GET;
        final URL expectedUrl = createUrl("http://my.site.com");
        final HttpPipeline httpPipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient() {
                @Override
                public Response<?> send(HttpRequest request) {
                    assertEquals(0, request.getHeaders().getSize());
                    assertEquals(expectedHttpMethod, request.getHttpMethod());
                    assertEquals(expectedUrl, request.getUrl());

                    return new MockHttpResponse(request, 200);
                }
            })
            .build();
        final Response<?> response = httpPipeline.send(new HttpRequest(expectedHttpMethod, expectedUrl));

        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
    }
}
