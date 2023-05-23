// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for VirtualNetworkGateways GetVpnclientIpsecParameters. */
public final class VirtualNetworkGatewaysGetVpnclientIpsecParametersSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/VirtualNetworkGatewayGetVpnClientIpsecParameters.json
     */
    /**
     * Sample code: Get VirtualNetworkGateway VpnClientIpsecParameters.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetworkGatewayVpnClientIpsecParameters(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .getVpnclientIpsecParameters("rg1", "vpngw", com.azure.core.util.Context.NONE);
    }
}
