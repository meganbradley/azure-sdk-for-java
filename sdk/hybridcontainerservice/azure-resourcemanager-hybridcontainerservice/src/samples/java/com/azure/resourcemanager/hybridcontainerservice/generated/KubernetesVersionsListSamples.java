// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

/**
 * Samples for KubernetesVersions List.
 */
public final class KubernetesVersionsListSamples {
    /*
     * x-ms-original-file:
     * specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/
     * ListKubernetesVersions.json
     */
    /**
     * Sample code: ListKubernetesVersions.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void
        listKubernetesVersions(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.kubernetesVersions().list(
            "subscriptions/a3e42606-29b1-4d7d-b1d9-9ff6b9d3c71b/resourceGroups/test-arcappliance-resgrp/providers/Microsoft.ExtendedLocation/customLocations/testcustomlocation",
            com.azure.core.util.Context.NONE);
    }
}
