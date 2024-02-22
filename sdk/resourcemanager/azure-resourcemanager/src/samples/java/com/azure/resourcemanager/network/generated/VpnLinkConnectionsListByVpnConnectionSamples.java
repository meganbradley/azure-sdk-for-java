// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VpnLinkConnections ListByVpnConnection.
 */
public final class VpnLinkConnectionsListByVpnConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/VpnSiteLinkConnectionList.
     * json
     */
    /**
     * Sample code: VpnSiteLinkConnectionList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnSiteLinkConnectionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVpnLinkConnections().listByVpnConnection("rg1", "gateway1",
            "vpnConnection1", com.azure.core.util.Context.NONE);
    }
}
