// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

import com.azure.core.util.Context;

/** Samples for ManagedHsms Delete. */
public final class ManagedHsmsDeleteSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2021-10-01/examples/ManagedHsm_Delete.json
     */
    /**
     * Sample code: Delete a managed HSM Pool.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAManagedHSMPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults().manager().serviceClient().getManagedHsms().delete("hsm-group", "hsm1", Context.NONE);
    }
}
