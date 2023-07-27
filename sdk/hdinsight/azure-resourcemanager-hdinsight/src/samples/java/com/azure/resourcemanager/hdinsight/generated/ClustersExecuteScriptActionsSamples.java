// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.resourcemanager.hdinsight.models.ExecuteScriptActionParameters;
import com.azure.resourcemanager.hdinsight.models.RuntimeScriptAction;
import java.util.Arrays;

/** Samples for Clusters ExecuteScriptActions. */
public final class ClustersExecuteScriptActionsSamples {
    /*
     * x-ms-original-file: specification/hdinsight/resource-manager/Microsoft.HDInsight/preview/2023-04-15-preview/examples/PostExecuteScriptAction.json
     */
    /**
     * Sample code: Execute script action on HDInsight cluster.
     *
     * @param manager Entry point to HDInsightManager.
     */
    public static void executeScriptActionOnHDInsightCluster(
        com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager
            .clusters()
            .executeScriptActions(
                "rg1",
                "cluster1",
                new ExecuteScriptActionParameters()
                    .withScriptActions(
                        Arrays
                            .asList(
                                new RuntimeScriptAction()
                                    .withName("Test")
                                    .withUri("http://testurl.com/install.ssh")
                                    .withParameters("")
                                    .withRoles(Arrays.asList("headnode", "workernode"))))
                    .withPersistOnSuccess(false),
                com.azure.core.util.Context.NONE);
    }
}
