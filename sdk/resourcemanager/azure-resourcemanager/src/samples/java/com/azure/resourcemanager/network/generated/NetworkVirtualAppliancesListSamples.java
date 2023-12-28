// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkVirtualAppliances List.
 */
public final class NetworkVirtualAppliancesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * NetworkVirtualApplianceListBySubscription.json
     */
    /**
     * Sample code: List all Network Virtual Appliances for a given subscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listAllNetworkVirtualAppliancesForAGivenSubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getNetworkVirtualAppliances().list(com.azure.core.util.Context.NONE);
    }
}
