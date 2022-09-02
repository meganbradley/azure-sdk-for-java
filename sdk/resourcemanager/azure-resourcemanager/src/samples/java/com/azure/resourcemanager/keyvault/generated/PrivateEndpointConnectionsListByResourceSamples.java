// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections ListByResource. */
public final class PrivateEndpointConnectionsListByResourceSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2021-10-01/examples/listPrivateEndpointConnection.json
     */
    /**
     * Sample code: KeyVaultListPrivateEndpointConnection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void keyVaultListPrivateEndpointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .vaults()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .listByResource("sample-group", "sample-vault", Context.NONE);
    }
}
