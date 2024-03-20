// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteCircuits ListArpTable.
 */
public final class ExpressRouteCircuitsListArpTableSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * ExpressRouteCircuitARPTableList.json
     */
    /**
     * Sample code: List ARP Table.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listARPTable(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getExpressRouteCircuits().listArpTable("rg1", "circuitName",
            "peeringName", "devicePath", com.azure.core.util.Context.NONE);
    }
}
