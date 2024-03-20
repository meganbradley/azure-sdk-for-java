// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/**
 * Samples for ManagedClusters List.
 */
public final class ManagedClustersListSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-01-01/examples/
     * ManagedClustersList.json
     */
    /**
     * Sample code: List Managed Clusters.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedClusters(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters().manager().serviceClient().getManagedClusters()
            .list(com.azure.core.util.Context.NONE);
    }
}
