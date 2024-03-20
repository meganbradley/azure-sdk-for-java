// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of Operations.
 */
public interface Operations {
    /**
     * Returns the list of available operations.
     * 
     * Operation to return the list of available operations.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of ClientDiscovery details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OperationsDiscovery> listByResourceGroup(String resourceGroupName);

    /**
     * Returns the list of available operations.
     * 
     * Operation to return the list of available operations.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of ClientDiscovery details as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OperationsDiscovery> listByResourceGroup(String resourceGroupName, Context context);
}
