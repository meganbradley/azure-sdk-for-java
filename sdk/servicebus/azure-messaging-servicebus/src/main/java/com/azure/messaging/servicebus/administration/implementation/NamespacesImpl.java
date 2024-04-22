// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.messaging.servicebus.administration.implementation.models.NamespacePropertiesEntryImpl;
import com.azure.messaging.servicebus.administration.implementation.models.ServiceBusManagementErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Namespaces. */
public final class NamespacesImpl {
    /** The proxy service used to perform REST calls. */
    private final NamespacesService service;

    /** The service client containing this operation class. */
    private final ServiceBusManagementClientImpl client;

    /**
     * Initializes an instance of NamespacesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NamespacesImpl(ServiceBusManagementClientImpl client) {
        this.service =
                RestProxy.create(NamespacesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceBusManagementClientNamespaces to be used by the proxy service
     * to perform REST calls.
     */
    @Host("https://{endpoint}")
    @ServiceInterface(name = "ServiceBusManagement")
    public interface NamespacesService {
        @Get("/$namespaceinfo")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ServiceBusManagementErrorException.class)
        Mono<Response<NamespacePropertiesEntryImpl>> get(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/$namespaceinfo")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ServiceBusManagementErrorException.class)
        Response<NamespacePropertiesEntryImpl> getSync(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Get Namespace Properties
     *
     * <p>Get the details about the Service Bus namespace.
     *
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the Service Bus namespace along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NamespacePropertiesEntryImpl>> getWithResponseAsync() {
        final String accept = "application/xml, application/atom+xml";
        return FluxUtil.withContext(
                context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(), accept, context));
    }

    /**
     * Get Namespace Properties
     *
     * <p>Get the details about the Service Bus namespace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the Service Bus namespace along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NamespacePropertiesEntryImpl>> getWithResponseAsync(Context context) {
        final String accept = "application/xml, application/atom+xml";
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * Get Namespace Properties
     *
     * <p>Get the details about the Service Bus namespace.
     *
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the Service Bus namespace on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NamespacePropertiesEntryImpl> getAsync() {
        return getWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Namespace Properties
     *
     * <p>Get the details about the Service Bus namespace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the Service Bus namespace on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NamespacePropertiesEntryImpl> getAsync(Context context) {
        return getWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Namespace Properties
     *
     * <p>Get the details about the Service Bus namespace.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the Service Bus namespace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NamespacePropertiesEntryImpl> getWithResponse(Context context) {
        final String accept = "application/xml, application/atom+xml";
        return service.getSync(this.client.getEndpoint(), this.client.getApiVersion(), accept, context);
    }

    /**
     * Get Namespace Properties
     *
     * <p>Get the details about the Service Bus namespace.
     *
     * @throws ServiceBusManagementErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the Service Bus namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NamespacePropertiesEntryImpl get() {
        return getWithResponse(Context.NONE).getValue();
    }
}
