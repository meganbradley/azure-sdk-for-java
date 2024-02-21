// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.monitor.fluent.models.AzureMonitorPrivateLinkScopeInner;
import com.azure.resourcemanager.monitor.models.TagsResource;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PrivateLinkScopesClient.
 */
public interface PrivateLinkScopesClient extends InnerSupportsGet<AzureMonitorPrivateLinkScopeInner>,
    InnerSupportsListing<AzureMonitorPrivateLinkScopeInner>, InnerSupportsDelete<Void> {
    /**
     * Gets a list of all Azure Monitor PrivateLinkScopes within a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Azure Monitor PrivateLinkScopes within a subscription as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AzureMonitorPrivateLinkScopeInner> listAsync();

    /**
     * Gets a list of all Azure Monitor PrivateLinkScopes within a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Azure Monitor PrivateLinkScopes within a subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureMonitorPrivateLinkScopeInner> list();

    /**
     * Gets a list of all Azure Monitor PrivateLinkScopes within a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all Azure Monitor PrivateLinkScopes within a subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureMonitorPrivateLinkScopeInner> list(Context context);

    /**
     * Gets a list of Azure Monitor PrivateLinkScopes within a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Monitor PrivateLinkScopes within a resource group as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AzureMonitorPrivateLinkScopeInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets a list of Azure Monitor PrivateLinkScopes within a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Monitor PrivateLinkScopes within a resource group as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureMonitorPrivateLinkScopeInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of Azure Monitor PrivateLinkScopes within a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Azure Monitor PrivateLinkScopes within a resource group as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureMonitorPrivateLinkScopeInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Deletes a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String scopeName);

    /**
     * Deletes a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String scopeName);

    /**
     * Deletes a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String scopeName);

    /**
     * Deletes a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String scopeName, Context context);

    /**
     * Deletes a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String scopeName);

    /**
     * Deletes a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String scopeName);

    /**
     * Deletes a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String scopeName, Context context);

    /**
     * Returns a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AzureMonitorPrivateLinkScopeInner>> getByResourceGroupWithResponseAsync(String resourceGroupName,
        String scopeName);

    /**
     * Returns a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AzureMonitorPrivateLinkScopeInner> getByResourceGroupAsync(String resourceGroupName, String scopeName);

    /**
     * Returns a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureMonitorPrivateLinkScopeInner> getByResourceGroupWithResponse(String resourceGroupName,
        String scopeName, Context context);

    /**
     * Returns a Azure Monitor PrivateLinkScope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureMonitorPrivateLinkScopeInner getByResourceGroup(String resourceGroupName, String scopeName);

    /**
     * Creates (or updates) a Azure Monitor PrivateLinkScope. Note: You cannot specify a different value for
     * InstrumentationKey nor AppId in the Put operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param azureMonitorPrivateLinkScopePayload Properties that need to be specified to create or update a Azure
     * Monitor PrivateLinkScope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AzureMonitorPrivateLinkScopeInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String scopeName, AzureMonitorPrivateLinkScopeInner azureMonitorPrivateLinkScopePayload);

    /**
     * Creates (or updates) a Azure Monitor PrivateLinkScope. Note: You cannot specify a different value for
     * InstrumentationKey nor AppId in the Put operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param azureMonitorPrivateLinkScopePayload Properties that need to be specified to create or update a Azure
     * Monitor PrivateLinkScope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AzureMonitorPrivateLinkScopeInner> createOrUpdateAsync(String resourceGroupName, String scopeName,
        AzureMonitorPrivateLinkScopeInner azureMonitorPrivateLinkScopePayload);

    /**
     * Creates (or updates) a Azure Monitor PrivateLinkScope. Note: You cannot specify a different value for
     * InstrumentationKey nor AppId in the Put operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param azureMonitorPrivateLinkScopePayload Properties that need to be specified to create or update a Azure
     * Monitor PrivateLinkScope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureMonitorPrivateLinkScopeInner> createOrUpdateWithResponse(String resourceGroupName, String scopeName,
        AzureMonitorPrivateLinkScopeInner azureMonitorPrivateLinkScopePayload, Context context);

    /**
     * Creates (or updates) a Azure Monitor PrivateLinkScope. Note: You cannot specify a different value for
     * InstrumentationKey nor AppId in the Put operation.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param azureMonitorPrivateLinkScopePayload Properties that need to be specified to create or update a Azure
     * Monitor PrivateLinkScope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureMonitorPrivateLinkScopeInner createOrUpdate(String resourceGroupName, String scopeName,
        AzureMonitorPrivateLinkScopeInner azureMonitorPrivateLinkScopePayload);

    /**
     * Updates an existing PrivateLinkScope's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param privateLinkScopeTags Updated tag information to set into the PrivateLinkScope instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AzureMonitorPrivateLinkScopeInner>> updateTagsWithResponseAsync(String resourceGroupName,
        String scopeName, TagsResource privateLinkScopeTags);

    /**
     * Updates an existing PrivateLinkScope's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param privateLinkScopeTags Updated tag information to set into the PrivateLinkScope instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AzureMonitorPrivateLinkScopeInner> updateTagsAsync(String resourceGroupName, String scopeName,
        TagsResource privateLinkScopeTags);

    /**
     * Updates an existing PrivateLinkScope's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param privateLinkScopeTags Updated tag information to set into the PrivateLinkScope instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureMonitorPrivateLinkScopeInner> updateTagsWithResponse(String resourceGroupName, String scopeName,
        TagsResource privateLinkScopeTags, Context context);

    /**
     * Updates an existing PrivateLinkScope's tags. To update other fields use the CreateOrUpdate method.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param privateLinkScopeTags Updated tag information to set into the PrivateLinkScope instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Monitor PrivateLinkScope definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureMonitorPrivateLinkScopeInner updateTags(String resourceGroupName, String scopeName,
        TagsResource privateLinkScopeTags);
}
