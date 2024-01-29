// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceVaultConfigResourceInner;

/**
 * Resource collection API of BackupResourceVaultConfigs.
 */
public interface BackupResourceVaultConfigs {
    /**
     * Fetches resource vault config.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup resource vault config details along with {@link Response}.
     */
    Response<BackupResourceVaultConfigResource> getWithResponse(String vaultName, String resourceGroupName,
        Context context);

    /**
     * Fetches resource vault config.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup resource vault config details.
     */
    BackupResourceVaultConfigResource get(String vaultName, String resourceGroupName);

    /**
     * Updates vault security config.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters resource config request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup resource vault config details along with {@link Response}.
     */
    Response<BackupResourceVaultConfigResource> updateWithResponse(String vaultName, String resourceGroupName,
        BackupResourceVaultConfigResourceInner parameters, Context context);

    /**
     * Updates vault security config.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters resource config request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup resource vault config details.
     */
    BackupResourceVaultConfigResource update(String vaultName, String resourceGroupName,
        BackupResourceVaultConfigResourceInner parameters);

    /**
     * Updates vault security config.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters resource config request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup resource vault config details along with {@link Response}.
     */
    Response<BackupResourceVaultConfigResource> putWithResponse(String vaultName, String resourceGroupName,
        BackupResourceVaultConfigResourceInner parameters, Context context);

    /**
     * Updates vault security config.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters resource config request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return backup resource vault config details.
     */
    BackupResourceVaultConfigResource put(String vaultName, String resourceGroupName,
        BackupResourceVaultConfigResourceInner parameters);
}
