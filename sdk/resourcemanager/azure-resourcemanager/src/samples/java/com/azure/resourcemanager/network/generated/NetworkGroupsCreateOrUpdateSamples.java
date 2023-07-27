// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.NetworkGroupInner;

/** Samples for NetworkGroups CreateOrUpdate. */
public final class NetworkGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/NetworkManagerGroupPut.json
     */
    /**
     * Sample code: NetworkGroupsPut.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkGroupsPut(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkGroups()
            .createOrUpdateWithResponse(
                "rg1",
                "testNetworkManager",
                "testNetworkGroup",
                new NetworkGroupInner().withDescription("A sample group"),
                null,
                com.azure.core.util.Context.NONE);
    }
}
