// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

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
import com.azure.resourcemanager.network.fluent.ExpressRouteProviderPortsLocationsClient;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteProviderPortListResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ExpressRouteProviderPortsLocationsClient.
 */
public final class ExpressRouteProviderPortsLocationsClientImpl implements ExpressRouteProviderPortsLocationsClient {
    /** The proxy service used to perform REST calls. */
    private final ExpressRouteProviderPortsLocationsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteProviderPortsLocationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ExpressRouteProviderPortsLocationsClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ExpressRouteProviderPortsLocationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientExpressRouteProviderPortsLocations to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface ExpressRouteProviderPortsLocationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/expressRouteProviderPorts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExpressRouteProviderPortListResultInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieves all the ExpressRouteProviderPorts in a subscription.
     *
     * @param filter The filter to apply on the operation. For example, you can use $filter=location eq '{state}'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteProviderPort API service call along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ExpressRouteProviderPortListResultInner>> listWithResponseAsync(String filter) {
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
        final String apiVersion = "2023-02-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            filter,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves all the ExpressRouteProviderPorts in a subscription.
     *
     * @param filter The filter to apply on the operation. For example, you can use $filter=location eq '{state}'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteProviderPort API service call along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExpressRouteProviderPortListResultInner>> listWithResponseAsync(
        String filter, Context context) {
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
        final String apiVersion = "2023-02-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), filter, accept, context);
    }

    /**
     * Retrieves all the ExpressRouteProviderPorts in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteProviderPort API service call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteProviderPortListResultInner> listAsync() {
        final String filter = null;
        return listWithResponseAsync(filter).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves all the ExpressRouteProviderPorts in a subscription.
     *
     * @param filter The filter to apply on the operation. For example, you can use $filter=location eq '{state}'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteProviderPort API service call along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExpressRouteProviderPortListResultInner> listWithResponse(String filter, Context context) {
        return listWithResponseAsync(filter, context).block();
    }

    /**
     * Retrieves all the ExpressRouteProviderPorts in a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteProviderPort API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteProviderPortListResultInner list() {
        final String filter = null;
        return listWithResponse(filter, Context.NONE).getValue();
    }
}
