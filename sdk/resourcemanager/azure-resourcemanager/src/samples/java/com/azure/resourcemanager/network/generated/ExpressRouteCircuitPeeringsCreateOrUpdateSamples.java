// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.ExpressRouteCircuitPeeringInner;

/** Samples for ExpressRouteCircuitPeerings CreateOrUpdate. */
public final class ExpressRouteCircuitPeeringsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/ExpressRouteCircuitPeeringCreate.json
     */
    /**
     * Sample code: Create ExpressRouteCircuit Peerings.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createExpressRouteCircuitPeerings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteCircuitPeerings()
            .createOrUpdate(
                "rg1",
                "circuitName",
                "AzurePrivatePeering",
                new ExpressRouteCircuitPeeringInner()
                    .withPeerAsn(200L)
                    .withPrimaryPeerAddressPrefix("192.168.16.252/30")
                    .withSecondaryPeerAddressPrefix("192.168.18.252/30")
                    .withVlanId(200),
                com.azure.core.util.Context.NONE);
    }
}
