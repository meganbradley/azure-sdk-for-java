// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/** Samples for JobDetails Get. */
public final class JobDetailsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-04-01/examples/Common/GetJobDetails.json
     */
    /**
     * Sample code: Get Job Details.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getJobDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .jobDetails()
            .getWithResponse(
                "NetSDKTestRsVault",
                "SwaggerTestRg",
                "00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
