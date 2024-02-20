// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.network.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateLinkServices UpdatePrivateEndpointConnection.
 */
public final class PrivateLinkServicesUpdatePrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * PrivateLinkServiceUpdatePrivateEndpointConnection.json
     */
    /**
     * Sample code: approve or reject private end point connection for a private link service.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void approveOrRejectPrivateEndPointConnectionForAPrivateLinkService(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getPrivateLinkServices()
            .updatePrivateEndpointConnectionWithResponse("rg1", "testPls", "testPlePeConnection",
                new PrivateEndpointConnectionInner().withName("testPlePeConnection")
                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                        .withStatus("Approved").withDescription("approved it for some reason.")),
                com.azure.core.util.Context.NONE);
    }
}
