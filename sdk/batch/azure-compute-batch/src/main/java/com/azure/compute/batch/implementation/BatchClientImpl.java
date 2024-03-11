// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.compute.batch.implementation;

import com.azure.compute.batch.BatchServiceVersion;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the BatchClient type.
 */
public final class BatchClientImpl {
    /**
     * Batch account endpoint (for example: https://batchaccount.eastus2.batch.azure.com).
     */
    private final String endpoint;

    /**
     * Gets Batch account endpoint (for example: https://batchaccount.eastus2.batch.azure.com).
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final BatchServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public BatchServiceVersion getServiceVersion() {
        return this.serviceVersion;
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
     * The BatchApisImpl object to access its operations.
     */
    private final BatchApisImpl batchApis;

    /**
     * Gets the BatchApisImpl object to access its operations.
     * 
     * @return the BatchApisImpl object.
     */
    public BatchApisImpl getBatchApis() {
        return this.batchApis;
    }

    /**
     * Initializes an instance of BatchClient client.
     * 
     * @param endpoint Batch account endpoint (for example: https://batchaccount.eastus2.batch.azure.com).
     * @param serviceVersion Service version.
     */
    public BatchClientImpl(String endpoint, BatchServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of BatchClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Batch account endpoint (for example: https://batchaccount.eastus2.batch.azure.com).
     * @param serviceVersion Service version.
     */
    public BatchClientImpl(HttpPipeline httpPipeline, String endpoint, BatchServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of BatchClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Batch account endpoint (for example: https://batchaccount.eastus2.batch.azure.com).
     * @param serviceVersion Service version.
     */
    public BatchClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        BatchServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.batchApis = new BatchApisImpl(this);
    }
}
