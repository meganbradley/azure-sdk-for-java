// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for JobAgents Delete.
 */
public final class JobAgentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DeleteJobAgent.json
     */
    /**
     * Sample code: Delete a job agent.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAJobAgent(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getJobAgents().delete("group1", "server1", "agent1",
            com.azure.core.util.Context.NONE);
    }
}
