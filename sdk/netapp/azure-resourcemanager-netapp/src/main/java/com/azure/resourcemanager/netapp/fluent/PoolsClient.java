// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.netapp.fluent.models.CapacityPoolInner;
import com.azure.resourcemanager.netapp.models.CapacityPoolPatch;

/**
 * An instance of this class provides access to all the operations defined in PoolsClient.
 */
public interface PoolsClient {
    /**
     * Describe all Capacity Pools
     * 
     * List all capacity pools in the NetApp Account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of capacity pool resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapacityPoolInner> list(String resourceGroupName, String accountName);

    /**
     * Describe all Capacity Pools
     * 
     * List all capacity pools in the NetApp Account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of capacity pool resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapacityPoolInner> list(String resourceGroupName, String accountName, Context context);

    /**
     * Describe a Capacity Pool
     * 
     * Get details of the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified capacity pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CapacityPoolInner> getWithResponse(String resourceGroupName, String accountName, String poolName,
        Context context);

    /**
     * Describe a Capacity Pool
     * 
     * Get details of the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified capacity pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityPoolInner get(String resourceGroupName, String accountName, String poolName);

    /**
     * Create or Update the specified capacity pool within the resource group
     * 
     * Create or Update a capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param body Capacity pool object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of capacity pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CapacityPoolInner>, CapacityPoolInner> beginCreateOrUpdate(String resourceGroupName,
        String accountName, String poolName, CapacityPoolInner body);

    /**
     * Create or Update the specified capacity pool within the resource group
     * 
     * Create or Update a capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param body Capacity pool object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of capacity pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CapacityPoolInner>, CapacityPoolInner> beginCreateOrUpdate(String resourceGroupName,
        String accountName, String poolName, CapacityPoolInner body, Context context);

    /**
     * Create or Update the specified capacity pool within the resource group
     * 
     * Create or Update a capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param body Capacity pool object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capacity pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityPoolInner createOrUpdate(String resourceGroupName, String accountName, String poolName,
        CapacityPoolInner body);

    /**
     * Create or Update the specified capacity pool within the resource group
     * 
     * Create or Update a capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param body Capacity pool object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capacity pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityPoolInner createOrUpdate(String resourceGroupName, String accountName, String poolName,
        CapacityPoolInner body, Context context);

    /**
     * Update a capacity pool
     * 
     * Patch the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param body Capacity pool object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of capacity pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CapacityPoolInner>, CapacityPoolInner> beginUpdate(String resourceGroupName,
        String accountName, String poolName, CapacityPoolPatch body);

    /**
     * Update a capacity pool
     * 
     * Patch the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param body Capacity pool object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of capacity pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CapacityPoolInner>, CapacityPoolInner> beginUpdate(String resourceGroupName,
        String accountName, String poolName, CapacityPoolPatch body, Context context);

    /**
     * Update a capacity pool
     * 
     * Patch the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param body Capacity pool object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capacity pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityPoolInner update(String resourceGroupName, String accountName, String poolName, CapacityPoolPatch body);

    /**
     * Update a capacity pool
     * 
     * Patch the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param body Capacity pool object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capacity pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityPoolInner update(String resourceGroupName, String accountName, String poolName, CapacityPoolPatch body,
        Context context);

    /**
     * Delete a capacity pool
     * 
     * Delete the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String poolName);

    /**
     * Delete a capacity pool
     * 
     * Delete the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String poolName,
        Context context);

    /**
     * Delete a capacity pool
     * 
     * Delete the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String poolName);

    /**
     * Delete a capacity pool
     * 
     * Delete the specified capacity pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String poolName, Context context);
}
