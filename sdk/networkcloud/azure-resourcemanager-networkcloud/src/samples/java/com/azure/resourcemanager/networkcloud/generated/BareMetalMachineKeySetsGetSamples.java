// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for BareMetalMachineKeySets Get. */
public final class BareMetalMachineKeySetsGetSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/BareMetalMachineKeySets_Get.json
     */
    /**
     * Sample code: Get bare metal machine key set of cluster.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void getBareMetalMachineKeySetOfCluster(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachineKeySets()
            .getWithResponse(
                "resourceGroupName", "clusterName", "bareMetalMachineKeySetName", com.azure.core.util.Context.NONE);
    }
}
