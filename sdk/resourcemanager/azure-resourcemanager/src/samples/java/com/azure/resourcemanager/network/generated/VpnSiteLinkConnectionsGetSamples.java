// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for VpnSiteLinkConnections Get. */
public final class VpnSiteLinkConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/VpnSiteLinkConnectionGet.json
     */
    /**
     * Sample code: VpnSiteLinkConnectionGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnSiteLinkConnectionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVpnSiteLinkConnections()
            .getWithResponse("rg1", "gateway1", "vpnConnection1", "Connection-Link1", com.azure.core.util.Context.NONE);
    }
}
