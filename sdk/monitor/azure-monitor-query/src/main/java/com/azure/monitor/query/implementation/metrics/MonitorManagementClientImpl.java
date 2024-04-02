// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the AzureMonitorMetricsDataAPI type.
 */
public final class MonitorManagementClientImpl {
    /**
     * The ID of the target subscription.
     */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String host;

    /**
     * Gets server parameter.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The Metrics object to access its operations.
     */
    private final MetricsImpl metrics;

    /**
     * Gets the Metrics object to access its operations.
     * 
     * @return the Metrics object.
     */
    public MetricsImpl getMetrics() {
        return this.metrics;
    }

    /**
     * Initializes an instance of AzureMonitorMetricsDataAPI client.
     * 
     * @param subscriptionId The ID of the target subscription.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    MonitorManagementClientImpl(String subscriptionId, String host, String apiVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), subscriptionId, host, apiVersion);
    }

    /**
     * Initializes an instance of AzureMonitorMetricsDataAPI client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param subscriptionId The ID of the target subscription.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    MonitorManagementClientImpl(HttpPipeline httpPipeline, String subscriptionId, String host, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), subscriptionId, host, apiVersion);
    }

    /**
     * Initializes an instance of AzureMonitorMetricsDataAPI client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param subscriptionId The ID of the target subscription.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    MonitorManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String subscriptionId,
        String host, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.subscriptionId = subscriptionId;
        this.host = host;
        this.apiVersion = apiVersion;
        this.metrics = new MetricsImpl(this);
    }
}
