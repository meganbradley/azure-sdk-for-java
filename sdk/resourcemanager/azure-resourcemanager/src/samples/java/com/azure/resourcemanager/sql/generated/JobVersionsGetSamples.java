// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for JobVersions Get.
 */
public final class JobVersionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/GetJobVersion.json
     */
    /**
     * Sample code: Get a version of a job.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAVersionOfAJob(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getJobVersions().getWithResponse("group1", "server1", "agent1",
            "job1", 1, com.azure.core.util.Context.NONE);
    }
}
