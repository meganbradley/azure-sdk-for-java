// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/** Samples for BackupPolicies Get. */
public final class BackupPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-11-01/examples/BackupPolicies_Get.json
     */
    /**
     * Sample code: Backups_Get.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void backupsGet(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .backupPolicies()
            .getWithResponse("myRG", "account1", "backupPolicyName", com.azure.core.util.Context.NONE);
    }
}
