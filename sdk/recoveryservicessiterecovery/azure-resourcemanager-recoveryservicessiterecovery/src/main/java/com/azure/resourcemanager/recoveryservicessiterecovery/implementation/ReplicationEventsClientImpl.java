// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationEventsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.EventInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EventCollection;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ReplicationEventsClient.
 */
public final class ReplicationEventsClientImpl implements ReplicationEventsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ReplicationEventsService service;

    /**
     * The service client containing this operation class.
     */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationEventsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ReplicationEventsClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service
            = RestProxy.create(ReplicationEventsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientReplicationEvents to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    public interface ReplicationEventsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationEvents")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventCollection>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationEvents/{eventName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("eventName") String eventName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventCollection>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the list of Azure Site Recovery events.
     * 
     * Gets the list of Azure Site Recovery events for the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery events for the vault along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listSinglePageAsync(String resourceName, String resourceGroupName,
        String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), resourceName,
                resourceGroupName, this.client.getSubscriptionId(), filter, accept, context))
            .<PagedResponse<EventInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of Azure Site Recovery events.
     * 
     * Gets the list of Azure Site Recovery events for the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery events for the vault along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listSinglePageAsync(String resourceName, String resourceGroupName,
        String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), resourceName, resourceGroupName,
                this.client.getSubscriptionId(), filter, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets the list of Azure Site Recovery events.
     * 
     * Gets the list of Azure Site Recovery events for the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery events for the vault as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listAsync(String resourceName, String resourceGroupName, String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceName, resourceGroupName, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of Azure Site Recovery events.
     * 
     * Gets the list of Azure Site Recovery events for the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery events for the vault as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listAsync(String resourceName, String resourceGroupName) {
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(resourceName, resourceGroupName, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of Azure Site Recovery events.
     * 
     * Gets the list of Azure Site Recovery events for the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery events for the vault as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listAsync(String resourceName, String resourceGroupName, String filter,
        Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceName, resourceGroupName, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the list of Azure Site Recovery events.
     * 
     * Gets the list of Azure Site Recovery events for the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery events for the vault as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventInner> list(String resourceName, String resourceGroupName) {
        final String filter = null;
        return new PagedIterable<>(listAsync(resourceName, resourceGroupName, filter));
    }

    /**
     * Gets the list of Azure Site Recovery events.
     * 
     * Gets the list of Azure Site Recovery events for the vault.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Azure Site Recovery events for the vault as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventInner> list(String resourceName, String resourceGroupName, String filter,
        Context context) {
        return new PagedIterable<>(listAsync(resourceName, resourceGroupName, filter, context));
    }

    /**
     * Get the details of an Azure Site recovery event.
     * 
     * The operation to get the details of an Azure Site recovery event.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param eventName The name of the Azure Site Recovery event.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return implements the Event class along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EventInner>> getWithResponseAsync(String resourceName, String resourceGroupName,
        String eventName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (eventName == null) {
            return Mono.error(new IllegalArgumentException("Parameter eventName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(), resourceName,
                resourceGroupName, this.client.getSubscriptionId(), eventName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the details of an Azure Site recovery event.
     * 
     * The operation to get the details of an Azure Site recovery event.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param eventName The name of the Azure Site Recovery event.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return implements the Event class along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EventInner>> getWithResponseAsync(String resourceName, String resourceGroupName,
        String eventName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (eventName == null) {
            return Mono.error(new IllegalArgumentException("Parameter eventName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), resourceName, resourceGroupName,
            this.client.getSubscriptionId(), eventName, accept, context);
    }

    /**
     * Get the details of an Azure Site recovery event.
     * 
     * The operation to get the details of an Azure Site recovery event.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param eventName The name of the Azure Site Recovery event.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return implements the Event class on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<EventInner> getAsync(String resourceName, String resourceGroupName, String eventName) {
        return getWithResponseAsync(resourceName, resourceGroupName, eventName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the details of an Azure Site recovery event.
     * 
     * The operation to get the details of an Azure Site recovery event.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param eventName The name of the Azure Site Recovery event.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return implements the Event class along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EventInner> getWithResponse(String resourceName, String resourceGroupName, String eventName,
        Context context) {
        return getWithResponseAsync(resourceName, resourceGroupName, eventName, context).block();
    }

    /**
     * Get the details of an Azure Site recovery event.
     * 
     * The operation to get the details of an Azure Site recovery event.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param eventName The name of the Azure Site Recovery event.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return implements the Event class.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EventInner get(String resourceName, String resourceGroupName, String eventName) {
        return getWithResponse(resourceName, resourceGroupName, eventName, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of fabric details along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<EventInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of fabric details along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
