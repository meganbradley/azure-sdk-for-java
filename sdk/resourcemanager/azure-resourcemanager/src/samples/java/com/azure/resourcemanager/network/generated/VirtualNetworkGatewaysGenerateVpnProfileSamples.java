// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.VpnClientParameters;

/** Samples for VirtualNetworkGateways GenerateVpnProfile. */
public final class VirtualNetworkGatewaysGenerateVpnProfileSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/VirtualNetworkGatewayGenerateVpnProfile.json
     */
    /**
     * Sample code: GenerateVirtualNetworkGatewayVPNProfile.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void generateVirtualNetworkGatewayVPNProfile(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .generateVpnProfile("rg1", "vpngw", new VpnClientParameters(), com.azure.core.util.Context.NONE);
    }
}
