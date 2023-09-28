// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.http;

import com.client.core.http.policy.RetryPolicy;

/**
 * Codesnippets for {@link HttpPipelineBuilder}.
 */
public class HttpPipelineBuilderJavaDocCodeSnippets {
    public void noConfigurationBuild() {
        // BEGIN: com.client.core.http.HttpPipelineBuilder.noConfiguration
        HttpPipeline pipeline = new HttpPipelineBuilder().build();
        // END: com.client.core.http.HttpPipelineBuilder.noConfiguration
    }

    public void defaultHttpClientWithRetryPolicyBuild() {
        // BEGIN: com.client.core.http.HttpPipelineBuilder.defaultHttpClientWithRetryPolicy
        HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(HttpClient.createDefault())
            .policies(new RetryPolicy())
            .build();
        // END: com.client.core.http.HttpPipelineBuilder.defaultHttpClientWithRetryPolicy
    }
}
