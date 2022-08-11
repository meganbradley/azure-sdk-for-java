// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

import com.azure.core.util.Context;

/** Samples for MhsmPrivateEndpointConnections Get. */
public final class MhsmPrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2021-10-01/examples/ManagedHsm_getPrivateEndpointConnection.json
     */
    /**
     * Sample code: ManagedHsmGetPrivateEndpointConnection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void managedHsmGetPrivateEndpointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .vaults()
            .manager()
            .serviceClient()
            .getMhsmPrivateEndpointConnections()
            .getWithResponse("sample-group", "sample-mhsm", "sample-pec", Context.NONE);
    }
}
