// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for P2SVpnGateways Delete. */
public final class P2SVpnGatewaysDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/P2SVpnGatewayDelete.json
     */
    /**
     * Sample code: P2SVpnGatewayDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void p2SVpnGatewayDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getP2SVpnGateways().delete("rg1", "p2sVpnGateway1", Context.NONE);
    }
}
