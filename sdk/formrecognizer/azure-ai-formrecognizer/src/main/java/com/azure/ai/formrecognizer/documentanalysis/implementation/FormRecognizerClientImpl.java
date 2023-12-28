// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the FormRecognizerClient type.
 */
public final class FormRecognizerClientImpl {
    /**
     * Supported Cognitive Services endpoints (protocol and hostname, for
     * example: https://westus2.api.cognitive.microsoft.com).
     */
    private final String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for
     * example: https://westus2.api.cognitive.microsoft.com).
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
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
     * The DocumentModelsImpl object to access its operations.
     */
    private final DocumentModelsImpl documentModels;

    /**
     * Gets the DocumentModelsImpl object to access its operations.
     * 
     * @return the DocumentModelsImpl object.
     */
    public DocumentModelsImpl getDocumentModels() {
        return this.documentModels;
    }

    /**
     * The MiscellaneousImpl object to access its operations.
     */
    private final MiscellaneousImpl miscellaneous;

    /**
     * Gets the MiscellaneousImpl object to access its operations.
     * 
     * @return the MiscellaneousImpl object.
     */
    public MiscellaneousImpl getMiscellaneous() {
        return this.miscellaneous;
    }

    /**
     * The DocumentClassifiersImpl object to access its operations.
     */
    private final DocumentClassifiersImpl documentClassifiers;

    /**
     * Gets the DocumentClassifiersImpl object to access its operations.
     * 
     * @return the DocumentClassifiersImpl object.
     */
    public DocumentClassifiersImpl getDocumentClassifiers() {
        return this.documentClassifiers;
    }

    /**
     * Initializes an instance of FormRecognizerClient client.
     * 
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for
     * example: https://westus2.api.cognitive.microsoft.com).
     * @param apiVersion Api Version.
     */
    public FormRecognizerClientImpl(String endpoint, String apiVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of FormRecognizerClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for
     * example: https://westus2.api.cognitive.microsoft.com).
     * @param apiVersion Api Version.
     */
    public FormRecognizerClientImpl(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of FormRecognizerClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for
     * example: https://westus2.api.cognitive.microsoft.com).
     * @param apiVersion Api Version.
     */
    public FormRecognizerClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.documentModels = new DocumentModelsImpl(this);
        this.miscellaneous = new MiscellaneousImpl(this);
        this.documentClassifiers = new DocumentClassifiersImpl(this);
    }
}
