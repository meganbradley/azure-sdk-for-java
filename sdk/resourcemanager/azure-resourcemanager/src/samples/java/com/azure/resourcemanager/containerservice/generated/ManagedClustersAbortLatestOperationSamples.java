// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for ManagedClusters AbortLatestOperation. */
public final class ManagedClustersAbortLatestOperationSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-03-01/examples/ManagedClustersAbortOperation.json
     */
    /**
     * Sample code: Abort operation on managed cluster.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void abortOperationOnManagedCluster(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getManagedClusters()
            .abortLatestOperation("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
