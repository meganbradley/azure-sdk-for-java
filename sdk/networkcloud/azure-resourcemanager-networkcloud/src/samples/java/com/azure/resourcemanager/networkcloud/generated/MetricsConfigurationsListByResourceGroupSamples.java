// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for MetricsConfigurations ListByResourceGroup. */
public final class MetricsConfigurationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/ClusterMetricsConfigurations_ListByResourceGroup.json
     */
    /**
     * Sample code: List metrics configurations of cluster for resource group.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listMetricsConfigurationsOfClusterForResourceGroup(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .metricsConfigurations()
            .listByResourceGroup("resourceGroupName", "clusterName", com.azure.core.util.Context.NONE);
    }
}
