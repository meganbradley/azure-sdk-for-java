// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.generic.core.http.client;

import com.generic.core.http.models.HttpClientOptions;
import com.generic.core.util.Providers;
import com.generic.core.util.configuration.Configuration;

/**
 * This class handles loading available HTTP clients
 */
public final class HttpClientProviders {
    private static final String NO_DEFAULT_PROVIDER_MESSAGE = "A request was made to load the default HttpClient provider "
        + "but one could not be found on the classpath. If you are using a dependency manager, consider including a "
        + "dependency on azure-core-http-netty or azure-core-http-okhttp. Depending on your existing dependencies, you "
        + "have the choice of Netty or OkHttp implementations. Additionally, refer to "
        + "https://aka.ms/azsdk/java/docs/custom-httpclient to learn about writing your own implementation.";

    private static final Providers<HttpClientProvider, HttpClient> HTTP_CLIENT_PROVIDERS = new Providers<>(HttpClientProvider.class,
        Configuration.getGlobalConfiguration().get(Configuration.PROPERTY_HTTP_CLIENT_IMPLEMENTATION),
        NO_DEFAULT_PROVIDER_MESSAGE);

    private HttpClientProviders() {
        // no-op
    }

    public static HttpClient createInstance() {
        return createInstance(null);
    }

    public static HttpClient createInstance(HttpClientOptions httpClientOptions) {
        Class<? extends HttpClientProvider> selectedImplementation = null;
        if (httpClientOptions != null) {
            selectedImplementation = httpClientOptions.getHttpClientProvider();
        }

        return HTTP_CLIENT_PROVIDERS.create(p -> p.createInstance(httpClientOptions), null, selectedImplementation);
    }
}
