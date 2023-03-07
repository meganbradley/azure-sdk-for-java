// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for ManagedClusterSnapshots ListByResourceGroup. */
public final class ManagedClusterSnapshotsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/preview/2023-01-02-preview/examples/ManagedClusterSnapshotsListByResourceGroup.json
     */
    /**
     * Sample code: List Managed Cluster Snapshots by Resource Group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedClusterSnapshotsByResourceGroup(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getManagedClusterSnapshots()
            .listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
