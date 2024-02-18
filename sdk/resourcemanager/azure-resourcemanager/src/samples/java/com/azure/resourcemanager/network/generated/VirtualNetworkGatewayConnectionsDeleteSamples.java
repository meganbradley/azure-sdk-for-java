// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkGatewayConnections Delete.
 */
public final class VirtualNetworkGatewayConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * VirtualNetworkGatewayConnectionDelete.json
     */
    /**
     * Sample code: DeleteVirtualNetworkGatewayConnection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteVirtualNetworkGatewayConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualNetworkGatewayConnections().delete("rg1", "conn1",
            com.azure.core.util.Context.NONE);
    }
}
