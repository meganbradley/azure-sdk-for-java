// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.http.pipeline;

import io.clientcore.core.http.NoOpHttpClient;
import io.clientcore.core.http.client.HttpClient;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpRequest;
import io.clientcore.core.http.models.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;

import static io.clientcore.core.util.TestUtils.createUrl;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpPipelinePolicyTests {
    @Test
    public void verifySend() throws Exception {
        SyncPolicy policy1 = new SyncPolicy();
        SyncPolicy policy2 = new SyncPolicy();
        URL url = createUrl("http://localhost/");

        HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient())
            .policies(policy1, policy2)
            .build();


        pipeline.send(new HttpRequest(HttpMethod.GET, url));

        assertEquals(1, policy1.syncCalls.get());
        assertEquals(1, policy2.syncCalls.get());
    }

    @Test
    public void defaultImplementationShouldCallRightStack() throws Exception {
        DefaultImplementationSyncPolicy policyWithDefaultSyncImplementation = new DefaultImplementationSyncPolicy();
        URL url = createUrl("http://localhost/");

        HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient())
            .policies(policyWithDefaultSyncImplementation)
            .build();

        pipeline.send(new HttpRequest(HttpMethod.GET, url));

        assertEquals(1, policyWithDefaultSyncImplementation.syncCalls.get());
        assertEquals(1, policyWithDefaultSyncImplementation.syncCalls.get());
    }

    /**
     * This is to cover case when reactor could complain about blocking on non-blocking thread.
     *
     * @throws MalformedURLException ignored.
     */
    @Test
    public void doesntThrowThatThreadIsNonBlocking() throws IOException {
        SyncPolicy policy1 = new SyncPolicy();
        HttpPipelinePolicy badPolicy1 = (httpRequest, next) -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return next.process();
        };

        HttpPipelinePolicy badPolicy2 = (httpRequest, next) -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return next.process();
        };

        HttpClient badClient = (request) -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        };
        URL url = createUrl("http://localhost/");

        HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(badClient)
            .policies(policy1, badPolicy1, badPolicy2)
            .build();

        pipeline.send(new HttpRequest(HttpMethod.GET, url));
    }


    private static class SyncPolicy implements HttpPipelinePolicy {
        final AtomicInteger syncCalls = new AtomicInteger();

        @Override
        public Response<?> process(HttpRequest httpRequest, HttpPipelineNextPolicy next) {
            syncCalls.incrementAndGet();

            return next.process();
        }
    }

    private static class DefaultImplementationSyncPolicy implements HttpPipelinePolicy {
        final AtomicInteger syncCalls = new AtomicInteger();

        @Override
        public Response<?> process(HttpRequest httpRequest, HttpPipelineNextPolicy next) {
            syncCalls.incrementAndGet();

            return next.process();
        }
    }
}
