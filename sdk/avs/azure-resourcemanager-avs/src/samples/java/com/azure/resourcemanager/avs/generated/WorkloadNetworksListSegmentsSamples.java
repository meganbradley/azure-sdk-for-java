// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks ListSegments. */
public final class WorkloadNetworksListSegmentsSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/WorkloadNetworks_ListSegments.json
     */
    /**
     * Sample code: WorkloadNetworks_ListSegments.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksListSegments(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks().listSegments("group1", "cloud1", Context.NONE);
    }
}
