// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.VirtualRouterInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualRoutersClient. */
public interface VirtualRoutersClient
    extends InnerSupportsGet<VirtualRouterInner>, InnerSupportsListing<VirtualRouterInner>, InnerSupportsDelete<Void> {
    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String virtualRouterName);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String virtualRouterName);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualRouterName);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualRouterName, Context context);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String virtualRouterName);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualRouterName);

    /**
     * Deletes the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualRouterName, Context context);

    /**
     * Gets the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<VirtualRouterInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String virtualRouterName, String expand);

    /**
     * Gets the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualRouterInner> getByResourceGroupAsync(String resourceGroupName, String virtualRouterName, String expand);

    /**
     * Gets the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualRouterInner> getByResourceGroupAsync(String resourceGroupName, String virtualRouterName);

    /**
     * Gets the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterInner getByResourceGroup(String resourceGroupName, String virtualRouterName);

    /**
     * Gets the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualRouterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualRouterName, String expand, Context context);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters VirtualRouter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters VirtualRouter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<VirtualRouterInner>, VirtualRouterInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters VirtualRouter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualRouterInner>, VirtualRouterInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters VirtualRouter Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualRouterInner>, VirtualRouterInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters, Context context);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters VirtualRouter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualRouterInner> createOrUpdateAsync(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters VirtualRouter Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterInner createOrUpdate(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters);

    /**
     * Creates or updates the specified Virtual Router.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param parameters VirtualRouter Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualRouter Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterInner createOrUpdate(
        String resourceGroupName, String virtualRouterName, VirtualRouterInner parameters, Context context);

    /**
     * Lists all Virtual Routers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualRouters API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VirtualRouterInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all Virtual Routers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualRouters API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Virtual Routers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualRouters API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the Virtual Routers in a subscription.
     *
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Virtual Routers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VirtualRouterInner> listAsync();

    /**
     * Gets all the Virtual Routers in a subscription.
     *
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Virtual Routers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterInner> list();

    /**
     * Gets all the Virtual Routers in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Virtual Routers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterInner> list(Context context);
}
