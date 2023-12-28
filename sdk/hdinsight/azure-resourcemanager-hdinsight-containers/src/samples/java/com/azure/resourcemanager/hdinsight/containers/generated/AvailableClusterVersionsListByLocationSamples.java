// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

/** Samples for AvailableClusterVersions ListByLocation. */
public final class AvailableClusterVersionsListByLocationSamples {
    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2023-06-01-preview/examples/ListAvailableClusterVersions.json
     */
    /**
     * Sample code: ClusterVersionListResult.
     *
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void clusterVersionListResult(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager.availableClusterVersions().listByLocation("westus2", com.azure.core.util.Context.NONE);
    }
}
