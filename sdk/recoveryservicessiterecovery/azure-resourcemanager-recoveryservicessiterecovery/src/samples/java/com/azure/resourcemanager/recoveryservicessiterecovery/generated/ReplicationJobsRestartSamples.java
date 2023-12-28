// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationJobs Restart. */
public final class ReplicationJobsRestartSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/ReplicationJobs_Restart.json
     */
    /**
     * Sample code: Restarts the specified job.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void restartsTheSpecifiedJob(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationJobs()
            .restart(
                "vault1", "resourceGroupPS1", "0664564c-353e-401a-ab0c-722257c10e25", com.azure.core.util.Context.NONE);
    }
}
