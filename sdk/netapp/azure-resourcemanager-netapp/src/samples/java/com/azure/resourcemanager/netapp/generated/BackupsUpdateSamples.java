// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.Backup;

/** Samples for Backups Update. */
public final class BackupsUpdateSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-11-01/examples/Backups_Update.json
     */
    /**
     * Sample code: Backups_Update.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void backupsUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        Backup resource =
            manager
                .backups()
                .getWithResponse("myRG", "account1", "pool1", "volume1", "backup1", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }
}
