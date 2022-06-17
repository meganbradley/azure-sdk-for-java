// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.ingestion.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the IngestionUsingDataCollectionRulesClient type. */
public final class IngestionUsingDataCollectionRulesClientImpl {
    /** The proxy service used to perform REST calls. */
    private final IngestionUsingDataCollectionRulesClientService service;

    /**
     * The Data Collection Endpoint for the Data Collection Rule, for example
     * https://dce-name.eastus-2.ingest.monitor.azure.com.
     */
    private final String endpoint;

    /**
     * Gets The Data Collection Endpoint for the Data Collection Rule, for example
     * https://dce-name.eastus-2.ingest.monitor.azure.com.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Service version. */
    private final IngestionUsingDataCollectionRulesServiceVersion serviceVersion;

    /**
     * Gets Service version.
     *
     * @return the serviceVersion value.
     */
    public IngestionUsingDataCollectionRulesServiceVersion getServiceVersion() {
        return this.serviceVersion;
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

    /**
     * Initializes an instance of IngestionUsingDataCollectionRulesClient client.
     *
     * @param endpoint The Data Collection Endpoint for the Data Collection Rule, for example
     *     https://dce-name.eastus-2.ingest.monitor.azure.com.
     * @param serviceVersion Service version.
     */
    public IngestionUsingDataCollectionRulesClientImpl(
            String endpoint, IngestionUsingDataCollectionRulesServiceVersion serviceVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                serviceVersion);
    }

    /**
     * Initializes an instance of IngestionUsingDataCollectionRulesClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The Data Collection Endpoint for the Data Collection Rule, for example
     *     https://dce-name.eastus-2.ingest.monitor.azure.com.
     * @param serviceVersion Service version.
     */
    public IngestionUsingDataCollectionRulesClientImpl(
            HttpPipeline httpPipeline,
            String endpoint,
            IngestionUsingDataCollectionRulesServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of IngestionUsingDataCollectionRulesClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The Data Collection Endpoint for the Data Collection Rule, for example
     *     https://dce-name.eastus-2.ingest.monitor.azure.com.
     * @param serviceVersion Service version.
     */
    public IngestionUsingDataCollectionRulesClientImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String endpoint,
            IngestionUsingDataCollectionRulesServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service =
                RestProxy.create(
                        IngestionUsingDataCollectionRulesClientService.class,
                        this.httpPipeline,
                        this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for IngestionUsingDataCollectionRulesClient to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "IngestionUsingDataCo")
    private interface IngestionUsingDataCollectionRulesClientService {
        @Post("/dataCollectionRules/{ruleId}/streams/{stream}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> upload(
                @HostParam("endpoint") String endpoint,
                @PathParam("ruleId") String ruleId,
                @PathParam("stream") String stream,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData body,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * See error response code and error response message for more detail.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Encoding</td><td>String</td><td>No</td><td>gzip</td></tr>
     *     <tr><td>x-ms-client-request-id</td><td>String</td><td>No</td><td>Client request Id</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     Object
     * ]
     * }</pre>
     *
     * @param ruleId The immutable Id of the Data Collection Rule resource.
     * @param stream The streamDeclaration name as defined in the Data Collection Rule.
     * @param body An array of objects matching the schema defined by the provided stream.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> uploadWithResponseAsync(
            String ruleId, String stream, BinaryData body, RequestOptions requestOptions) {
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        if (stream == null) {
            return Mono.error(new IllegalArgumentException("Parameter stream is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.upload(
                                this.getEndpoint(),
                                ruleId,
                                stream,
                                this.getServiceVersion().getVersion(),
                                body,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * See error response code and error response message for more detail.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Encoding</td><td>String</td><td>No</td><td>gzip</td></tr>
     *     <tr><td>x-ms-client-request-id</td><td>String</td><td>No</td><td>Client request Id</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     Object
     * ]
     * }</pre>
     *
     * @param ruleId The immutable Id of the Data Collection Rule resource.
     * @param stream The streamDeclaration name as defined in the Data Collection Rule.
     * @param body An array of objects matching the schema defined by the provided stream.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> uploadWithResponseAsync(
            String ruleId, String stream, BinaryData body, RequestOptions requestOptions, Context context) {
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        if (stream == null) {
            return Mono.error(new IllegalArgumentException("Parameter stream is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.upload(
                this.getEndpoint(),
                ruleId,
                stream,
                this.getServiceVersion().getVersion(),
                body,
                accept,
                requestOptions,
                context);
    }

    /**
     * See error response code and error response message for more detail.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Encoding</td><td>String</td><td>No</td><td>gzip</td></tr>
     *     <tr><td>x-ms-client-request-id</td><td>String</td><td>No</td><td>Client request Id</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     Object
     * ]
     * }</pre>
     *
     * @param ruleId The immutable Id of the Data Collection Rule resource.
     * @param stream The streamDeclaration name as defined in the Data Collection Rule.
     * @param body An array of objects matching the schema defined by the provided stream.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> uploadWithResponse(
            String ruleId, String stream, BinaryData body, RequestOptions requestOptions) {
        return uploadWithResponseAsync(ruleId, stream, body, requestOptions).block();
    }
}
