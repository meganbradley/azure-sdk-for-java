// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of StorageAccounts. */
public interface StorageAccounts {
    /**
     * Lists all the StorageAccounts in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the Storage Accounts on the Data Box Edge/Gateway device as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<StorageAccount> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Lists all the StorageAccounts in a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of all the Storage Accounts on the Data Box Edge/Gateway device as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<StorageAccount> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context);

    /**
     * Gets a StorageAccount by name.
     *
     * @param deviceName The device name.
     * @param storageAccountName The storage account name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StorageAccount by name along with {@link Response}.
     */
    Response<StorageAccount> getWithResponse(
        String deviceName, String storageAccountName, String resourceGroupName, Context context);

    /**
     * Gets a StorageAccount by name.
     *
     * @param deviceName The device name.
     * @param storageAccountName The storage account name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StorageAccount by name.
     */
    StorageAccount get(String deviceName, String storageAccountName, String resourceGroupName);

    /**
     * Deletes the StorageAccount on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String storageAccountName, String resourceGroupName);

    /**
     * Deletes the StorageAccount on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param storageAccountName The StorageAccount name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String deviceName, String storageAccountName, String resourceGroupName, Context context);

    /**
     * Gets a StorageAccount by name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StorageAccount by name along with {@link Response}.
     */
    StorageAccount getById(String id);

    /**
     * Gets a StorageAccount by name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StorageAccount by name along with {@link Response}.
     */
    Response<StorageAccount> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the StorageAccount on the Data Box Edge/Data Box Gateway device.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the StorageAccount on the Data Box Edge/Data Box Gateway device.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new StorageAccount resource.
     *
     * @param name resource name.
     * @return the first stage of the new StorageAccount definition.
     */
    StorageAccount.DefinitionStages.Blank define(String name);
}
