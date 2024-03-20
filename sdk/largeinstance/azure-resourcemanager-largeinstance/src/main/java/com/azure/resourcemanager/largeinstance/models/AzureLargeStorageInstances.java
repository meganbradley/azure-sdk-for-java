// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of AzureLargeStorageInstances.
 */
public interface AzureLargeStorageInstances {
    /**
     * Gets a list of AzureLargeStorageInstances in the specified subscription. The
     * operations returns various properties of each Azure LargeStorage instance.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of AzureLargeStorageInstances in the specified subscription as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<AzureLargeStorageInstance> list();

    /**
     * Gets a list of AzureLargeStorageInstances in the specified subscription. The
     * operations returns various properties of each Azure LargeStorage instance.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of AzureLargeStorageInstances in the specified subscription as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<AzureLargeStorageInstance> list(Context context);

    /**
     * Gets a list of AzureLargeStorageInstances in the specified subscription and
     * resource group. The operations returns various properties of each Azure
     * LargeStorage instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of AzureLargeStorageInstances in the specified subscription and
     * resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureLargeStorageInstance> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of AzureLargeStorageInstances in the specified subscription and
     * resource group. The operations returns various properties of each Azure
     * LargeStorage instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of AzureLargeStorageInstances in the specified subscription and
     * resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureLargeStorageInstance> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets an Azure Large Storage instance for the specified subscription, resource
     * group, and instance name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureLargeStorageInstanceName Name of the AzureLargeStorageInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Large Storage instance for the specified subscription, resource
     * group, and instance name along with {@link Response}.
     */
    Response<AzureLargeStorageInstance> getByResourceGroupWithResponse(String resourceGroupName,
        String azureLargeStorageInstanceName, Context context);

    /**
     * Gets an Azure Large Storage instance for the specified subscription, resource
     * group, and instance name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureLargeStorageInstanceName Name of the AzureLargeStorageInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Large Storage instance for the specified subscription, resource
     * group, and instance name.
     */
    AzureLargeStorageInstance getByResourceGroup(String resourceGroupName, String azureLargeStorageInstanceName);

    /**
     * Patches the Tags field of a Azure Large Storage Instance for the specified
     * subscription, resource group, and instance name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureLargeStorageInstanceName Name of the AzureLargeStorageInstance.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azureLargeStorageInstance info on Azure (ARM properties and
     * AzureLargeStorageInstance properties) along with {@link Response}.
     */
    Response<AzureLargeStorageInstance> updateWithResponse(String resourceGroupName,
        String azureLargeStorageInstanceName, AzureLargeStorageInstanceTagsUpdate properties, Context context);

    /**
     * Patches the Tags field of a Azure Large Storage Instance for the specified
     * subscription, resource group, and instance name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureLargeStorageInstanceName Name of the AzureLargeStorageInstance.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azureLargeStorageInstance info on Azure (ARM properties and
     * AzureLargeStorageInstance properties).
     */
    AzureLargeStorageInstance update(String resourceGroupName, String azureLargeStorageInstanceName,
        AzureLargeStorageInstanceTagsUpdate properties);
}
