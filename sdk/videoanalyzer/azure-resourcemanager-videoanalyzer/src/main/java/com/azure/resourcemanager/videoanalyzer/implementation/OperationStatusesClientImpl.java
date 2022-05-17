// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.videoanalyzer.fluent.OperationStatusesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoAnalyzerPrivateEndpointConnectionOperationStatusInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationStatusesClient. */
public final class OperationStatusesClientImpl implements OperationStatusesClient {
    /** The proxy service used to perform REST calls. */
    private final OperationStatusesService service;

    /** The service client containing this operation class. */
    private final VideoAnalyzerManagementClientImpl client;

    /**
     * Initializes an instance of OperationStatusesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationStatusesClientImpl(VideoAnalyzerManagementClientImpl client) {
        this.service =
            RestProxy.create(OperationStatusesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for VideoAnalyzerManagementClientOperationStatuses to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "VideoAnalyzerManagem")
    private interface OperationStatusesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Media"
                + "/videoAnalyzers/{accountName}/privateEndpointConnections/{name}/operationStatuses/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VideoAnalyzerPrivateEndpointConnectionOperationStatusInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("name") String name,
            @PathParam("operationId") String operationId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get private endpoint connection operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Private endpoint connection name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection operation status along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VideoAnalyzerPrivateEndpointConnectionOperationStatusInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String name, String operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            accountName,
                            name,
                            operationId,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get private endpoint connection operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Private endpoint connection name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection operation status along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VideoAnalyzerPrivateEndpointConnectionOperationStatusInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String name, String operationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                accountName,
                name,
                operationId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get private endpoint connection operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Private endpoint connection name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VideoAnalyzerPrivateEndpointConnectionOperationStatusInner> getAsync(
        String resourceGroupName, String accountName, String name, String operationId) {
        return getWithResponseAsync(resourceGroupName, accountName, name, operationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get private endpoint connection operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Private endpoint connection name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VideoAnalyzerPrivateEndpointConnectionOperationStatusInner get(
        String resourceGroupName, String accountName, String name, String operationId) {
        return getAsync(resourceGroupName, accountName, name, operationId).block();
    }

    /**
     * Get private endpoint connection operation status.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Private endpoint connection name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VideoAnalyzerPrivateEndpointConnectionOperationStatusInner> getWithResponse(
        String resourceGroupName, String accountName, String name, String operationId, Context context) {
        return getWithResponseAsync(resourceGroupName, accountName, name, operationId, context).block();
    }
}
