// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for AvailableDelegations List. */
public final class AvailableDelegationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/AvailableDelegationsSubscriptionGet.json
     */
    /**
     * Sample code: Get available delegations.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableDelegations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getAvailableDelegations().list("westcentralus", Context.NONE);
    }
}
