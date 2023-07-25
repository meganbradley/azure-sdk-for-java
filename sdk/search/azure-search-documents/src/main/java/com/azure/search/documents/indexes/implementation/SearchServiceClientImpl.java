// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.search.documents.indexes.implementation.models.RequestOptions;
import com.azure.search.documents.indexes.implementation.models.SearchErrorException;
import com.azure.search.documents.indexes.models.SearchServiceStatistics;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the SearchServiceClient type. */
public final class SearchServiceClientImpl {
    /** The proxy service used to perform REST calls. */
    private final SearchServiceClientService service;

    /** The endpoint URL of the search service. */
    private final String endpoint;

    /**
     * Gets The endpoint URL of the search service.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The DataSourcesImpl object to access its operations. */
    private final DataSourcesImpl dataSources;

    /**
     * Gets the DataSourcesImpl object to access its operations.
     *
     * @return the DataSourcesImpl object.
     */
    public DataSourcesImpl getDataSources() {
        return this.dataSources;
    }

    /** The IndexersImpl object to access its operations. */
    private final IndexersImpl indexers;

    /**
     * Gets the IndexersImpl object to access its operations.
     *
     * @return the IndexersImpl object.
     */
    public IndexersImpl getIndexers() {
        return this.indexers;
    }

    /** The SkillsetsImpl object to access its operations. */
    private final SkillsetsImpl skillsets;

    /**
     * Gets the SkillsetsImpl object to access its operations.
     *
     * @return the SkillsetsImpl object.
     */
    public SkillsetsImpl getSkillsets() {
        return this.skillsets;
    }

    /** The SynonymMapsImpl object to access its operations. */
    private final SynonymMapsImpl synonymMaps;

    /**
     * Gets the SynonymMapsImpl object to access its operations.
     *
     * @return the SynonymMapsImpl object.
     */
    public SynonymMapsImpl getSynonymMaps() {
        return this.synonymMaps;
    }

    /** The IndexesImpl object to access its operations. */
    private final IndexesImpl indexes;

    /**
     * Gets the IndexesImpl object to access its operations.
     *
     * @return the IndexesImpl object.
     */
    public IndexesImpl getIndexes() {
        return this.indexes;
    }

    /**
     * Initializes an instance of SearchServiceClient client.
     *
     * @param endpoint The endpoint URL of the search service.
     * @param apiVersion Api Version.
     */
    public SearchServiceClientImpl(String endpoint, String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                apiVersion);
    }

    /**
     * Initializes an instance of SearchServiceClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The endpoint URL of the search service.
     * @param apiVersion Api Version.
     */
    public SearchServiceClientImpl(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, apiVersion);
    }

    /**
     * Initializes an instance of SearchServiceClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The endpoint URL of the search service.
     * @param apiVersion Api Version.
     */
    public SearchServiceClientImpl(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.dataSources = new DataSourcesImpl(this);
        this.indexers = new IndexersImpl(this);
        this.skillsets = new SkillsetsImpl(this);
        this.synonymMaps = new SynonymMapsImpl(this);
        this.indexes = new IndexesImpl(this);
        this.service =
                RestProxy.create(SearchServiceClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for SearchServiceClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "SearchServiceClient")
    public interface SearchServiceClientService {
        @Get("/servicestats")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<Response<SearchServiceStatistics>> getServiceStatistics(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Gets service level statistics for a search service.
     *
     * @param requestOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws SearchErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service level statistics for a search service along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchServiceStatistics>> getServiceStatisticsWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        final String accept = "application/json; odata.metadata=minimal";
        UUID xMsClientRequestIdInternal = null;
        if (requestOptions != null) {
            xMsClientRequestIdInternal = requestOptions.getXMsClientRequestId();
        }
        UUID xMsClientRequestId = xMsClientRequestIdInternal;
        return service.getServiceStatistics(
                this.getEndpoint(), xMsClientRequestId, this.getApiVersion(), accept, context);
    }
}
