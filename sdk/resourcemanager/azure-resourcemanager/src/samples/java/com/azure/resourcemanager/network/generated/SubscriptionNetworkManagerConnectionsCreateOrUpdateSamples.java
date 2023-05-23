// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.NetworkManagerConnectionInner;

/** Samples for SubscriptionNetworkManagerConnections CreateOrUpdate. */
public final class SubscriptionNetworkManagerConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/NetworkManagerConnectionSubscriptionPut.json
     */
    /**
     * Sample code: Create or Update Subscription Network Manager Connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateSubscriptionNetworkManagerConnection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSubscriptionNetworkManagerConnections()
            .createOrUpdateWithResponse(
                "TestNMConnection",
                new NetworkManagerConnectionInner()
                    .withNetworkManagerId(
                        "/subscriptions/subscriptionC/resourceGroup/rg1/providers/Microsoft.Network/networkManagers/testNetworkManager"),
                com.azure.core.util.Context.NONE);
    }
}
