// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprComponentResiliencyPolicyProperties;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyTimeoutPolicyConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DaprComponentResiliencyPolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprComponentResiliencyPolicyProperties model = BinaryData.fromString(
            "{\"inboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1818158355,\"retryBackOff\":{\"initialDelayInMilliseconds\":1487017150,\"maxIntervalInMilliseconds\":267572624}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":1237918766},\"circuitBreakerPolicy\":{\"consecutiveErrors\":745209495,\"timeoutInSeconds\":353739432,\"intervalInSeconds\":1569477780}},\"outboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":1931546764,\"retryBackOff\":{\"initialDelayInMilliseconds\":1973714604,\"maxIntervalInMilliseconds\":1422758538}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":1903849017},\"circuitBreakerPolicy\":{\"consecutiveErrors\":344097144,\"timeoutInSeconds\":1836074224,\"intervalInSeconds\":913638656}}}")
            .toObject(DaprComponentResiliencyPolicyProperties.class);
        Assertions.assertEquals(1818158355, model.inboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(1487017150,
            model.inboundPolicy().httpRetryPolicy().retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(267572624,
            model.inboundPolicy().httpRetryPolicy().retryBackOff().maxIntervalInMilliseconds());
        Assertions.assertEquals(1237918766, model.inboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(745209495, model.inboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(353739432, model.inboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(1569477780, model.inboundPolicy().circuitBreakerPolicy().intervalInSeconds());
        Assertions.assertEquals(1931546764, model.outboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(1973714604,
            model.outboundPolicy().httpRetryPolicy().retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(1422758538,
            model.outboundPolicy().httpRetryPolicy().retryBackOff().maxIntervalInMilliseconds());
        Assertions.assertEquals(1903849017, model.outboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(344097144, model.outboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1836074224, model.outboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(913638656, model.outboundPolicy().circuitBreakerPolicy().intervalInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprComponentResiliencyPolicyProperties model = new DaprComponentResiliencyPolicyProperties()
            .withInboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                .withHttpRetryPolicy(
                    new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1818158355)
                        .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()
                            .withInitialDelayInMilliseconds(1487017150).withMaxIntervalInMilliseconds(267572624)))
                .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                    .withResponseTimeoutInSeconds(1237918766))
                .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                    .withConsecutiveErrors(745209495).withTimeoutInSeconds(353739432)
                    .withIntervalInSeconds(1569477780)))
            .withOutboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                .withHttpRetryPolicy(
                    new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(1931546764)
                        .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()
                            .withInitialDelayInMilliseconds(1973714604).withMaxIntervalInMilliseconds(1422758538)))
                .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                    .withResponseTimeoutInSeconds(1903849017))
                .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                    .withConsecutiveErrors(344097144).withTimeoutInSeconds(1836074224)
                    .withIntervalInSeconds(913638656)));
        model = BinaryData.fromObject(model).toObject(DaprComponentResiliencyPolicyProperties.class);
        Assertions.assertEquals(1818158355, model.inboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(1487017150,
            model.inboundPolicy().httpRetryPolicy().retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(267572624,
            model.inboundPolicy().httpRetryPolicy().retryBackOff().maxIntervalInMilliseconds());
        Assertions.assertEquals(1237918766, model.inboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(745209495, model.inboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(353739432, model.inboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(1569477780, model.inboundPolicy().circuitBreakerPolicy().intervalInSeconds());
        Assertions.assertEquals(1931546764, model.outboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(1973714604,
            model.outboundPolicy().httpRetryPolicy().retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(1422758538,
            model.outboundPolicy().httpRetryPolicy().retryBackOff().maxIntervalInMilliseconds());
        Assertions.assertEquals(1903849017, model.outboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(344097144, model.outboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1836074224, model.outboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(913638656, model.outboundPolicy().circuitBreakerPolicy().intervalInSeconds());
    }
}
