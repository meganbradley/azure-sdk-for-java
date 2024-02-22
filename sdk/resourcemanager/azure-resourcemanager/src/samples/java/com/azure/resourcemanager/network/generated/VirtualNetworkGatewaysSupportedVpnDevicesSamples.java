// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkGateways SupportedVpnDevices.
 */
public final class VirtualNetworkGatewaysSupportedVpnDevicesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * VirtualNetworkGatewaySupportedVpnDevice.json
     */
    /**
     * Sample code: ListVirtualNetworkGatewaySupportedVPNDevices.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listVirtualNetworkGatewaySupportedVPNDevices(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualNetworkGateways().supportedVpnDevicesWithResponse("rg1",
            "vpngw", com.azure.core.util.Context.NONE);
    }
}
