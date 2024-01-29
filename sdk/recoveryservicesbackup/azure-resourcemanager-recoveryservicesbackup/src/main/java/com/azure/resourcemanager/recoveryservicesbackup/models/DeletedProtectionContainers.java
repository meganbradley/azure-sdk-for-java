// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of DeletedProtectionContainers.
 */
public interface DeletedProtectionContainers {
    /**
     * Lists the soft deleted containers registered to Recovery Services Vault.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectionContainer resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProtectionContainerResource> list(String resourceGroupName, String vaultName);

    /**
     * Lists the soft deleted containers registered to Recovery Services Vault.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectionContainer resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProtectionContainerResource> list(String resourceGroupName, String vaultName, String filter,
        Context context);
}
