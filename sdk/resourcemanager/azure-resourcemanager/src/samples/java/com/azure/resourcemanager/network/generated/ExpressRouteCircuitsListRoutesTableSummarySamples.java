// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ExpressRouteCircuits ListRoutesTableSummary. */
public final class ExpressRouteCircuitsListRoutesTableSummarySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/ExpressRouteCircuitRouteTableSummaryList.json
     */
    /**
     * Sample code: List Route Table Summary.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listRouteTableSummary(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteCircuits()
            .listRoutesTableSummary(
                "rg1", "circuitName", "peeringName", "devicePath", com.azure.core.util.Context.NONE);
    }
}
