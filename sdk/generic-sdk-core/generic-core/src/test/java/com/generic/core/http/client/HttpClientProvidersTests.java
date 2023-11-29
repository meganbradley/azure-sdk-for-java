// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.http.client;

import com.generic.core.http.models.HttpClientOptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HttpClientProvidersTests {
    @Test
    public void testNoProvider() {
        HttpClient httpClient = HttpClient.createDefault();

        assertInstanceOf(DefaultHttpClient.class, httpClient);
    }

    @Test
    public void testIncorrectExplicitProvider() {
        HttpClientOptions options = new HttpClientOptions();

        options.setHttpClientProvider(AnotherHttpClientProvider.class);

        assertThrows(IllegalStateException.class, () -> HttpClient.createDefault(options));
    }

    class AnotherHttpClientProvider implements HttpClientProvider {
        @Override
        public HttpClient createInstance() {
            throw new IllegalStateException("should never be called");
        }
    }
}
