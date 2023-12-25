// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for JobSteps GetByVersion.
 */
public final class JobStepsGetByVersionSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/GetJobStepByVersion.json
     */
    /**
     * Sample code: Get the specified version of a job step.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getTheSpecifiedVersionOfAJobStep(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getJobSteps().getByVersionWithResponse("group1", "server1",
            "agent1", "job1", 1, "step1", com.azure.core.util.Context.NONE);
    }
}
