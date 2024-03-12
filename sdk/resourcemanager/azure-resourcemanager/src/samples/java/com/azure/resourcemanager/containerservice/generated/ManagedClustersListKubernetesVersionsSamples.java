// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/**
 * Samples for ManagedClusters ListKubernetesVersions.
 */
public final class ManagedClustersListKubernetesVersionsSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-01-01/examples/
     * KubernetesVersions_List.json
     */
    /**
     * Sample code: List Kubernetes Versions.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listKubernetesVersions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters().manager().serviceClient().getManagedClusters()
            .listKubernetesVersionsWithResponse("location1", com.azure.core.util.Context.NONE);
    }
}
