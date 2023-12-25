// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ServerAdvisors Get.
 */
public final class ServerAdvisorsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerAdvisorGet.json
     */
    /**
     * Sample code: Get server advisor.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getServerAdvisor(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getServerAdvisors().getWithResponse("workloadinsight-demos",
            "misosisvr", "CreateIndex", com.azure.core.util.Context.NONE);
    }
}
