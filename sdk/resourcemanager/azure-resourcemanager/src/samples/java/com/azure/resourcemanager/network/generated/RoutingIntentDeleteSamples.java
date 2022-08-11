// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for RoutingIntent Delete. */
public final class RoutingIntentDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/RoutingIntentDelete.json
     */
    /**
     * Sample code: RouteTableDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routeTableDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getRoutingIntents()
            .delete("rg1", "virtualHub1", "Intent1", Context.NONE);
    }
}
