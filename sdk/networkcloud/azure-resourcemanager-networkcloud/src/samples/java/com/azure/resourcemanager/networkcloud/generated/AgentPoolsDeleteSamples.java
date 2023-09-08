// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for AgentPools Delete. */
public final class AgentPoolsDeleteSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/AgentPools_Delete.json
     */
    /**
     * Sample code: Delete Kubernetes cluster agent pool.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void deleteKubernetesClusterAgentPool(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .agentPools()
            .delete("resourceGroupName", "kubernetesClusterName", "agentPoolName", com.azure.core.util.Context.NONE);
    }
}
