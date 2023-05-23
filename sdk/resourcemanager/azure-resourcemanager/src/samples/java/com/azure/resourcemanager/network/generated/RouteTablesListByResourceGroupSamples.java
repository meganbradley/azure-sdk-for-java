// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for RouteTables ListByResourceGroup. */
public final class RouteTablesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/RouteTableList.json
     */
    /**
     * Sample code: List route tables in resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listRouteTablesInResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getRouteTables()
            .listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
