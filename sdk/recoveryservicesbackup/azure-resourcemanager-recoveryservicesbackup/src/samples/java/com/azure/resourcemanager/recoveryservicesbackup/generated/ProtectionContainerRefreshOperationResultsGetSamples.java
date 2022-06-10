// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for ProtectionContainerRefreshOperationResults Get. */
public final class ProtectionContainerRefreshOperationResultsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2022-02-01/examples/Common/RefreshContainers_OperationResults.json
     */
    /**
     * Sample code: Azure Vm Discovery Operation Result.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void azureVmDiscoveryOperationResult(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionContainerRefreshOperationResults()
            .getWithResponse(
                "NetSDKTestRsVault", "SwaggerTestRg", "Azure", "00000000-0000-0000-0000-000000000000", Context.NONE);
    }
}
