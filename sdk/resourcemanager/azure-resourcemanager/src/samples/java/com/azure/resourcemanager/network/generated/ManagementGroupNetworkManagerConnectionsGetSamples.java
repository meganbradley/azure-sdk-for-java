// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ManagementGroupNetworkManagerConnections Get. */
public final class ManagementGroupNetworkManagerConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkManagerConnectionManagementGroupGet.json
     */
    /**
     * Sample code: Get Management Group Network Manager Connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getManagementGroupNetworkManagerConnection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getManagementGroupNetworkManagerConnections()
            .getWithResponse("managementGroupA", "TestNMConnection", Context.NONE);
    }
}
