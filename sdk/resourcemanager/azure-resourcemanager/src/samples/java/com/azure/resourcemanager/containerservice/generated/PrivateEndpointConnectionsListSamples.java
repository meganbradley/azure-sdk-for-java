// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2022-01-01/examples/PrivateEndpointConnectionsList.json
     */
    /**
     * Sample code: List Private Endpoint Connections by Managed Cluster.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listPrivateEndpointConnectionsByManagedCluster(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .listWithResponse("rg1", "clustername1", Context.NONE);
    }
}
