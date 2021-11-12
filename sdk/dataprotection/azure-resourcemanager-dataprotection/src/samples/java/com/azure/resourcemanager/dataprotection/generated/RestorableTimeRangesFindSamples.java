// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequest;
import com.azure.resourcemanager.dataprotection.models.RestoreSourceDataStoreType;

/** Samples for RestorableTimeRanges Find. */
public final class RestorableTimeRangesFindSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/BackupInstanceOperations/FindRestorableTimeRanges.json
     */
    /**
     * Sample code: Find Restorable Time Ranges.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void findRestorableTimeRanges(
        com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .restorableTimeRanges()
            .findWithResponse(
                "ZBlobBackupVaultBVTD3",
                "Blob-Backup",
                "zblobbackuptestsa58",
                new AzureBackupFindRestorableTimeRangesRequest()
                    .withSourceDataStoreType(RestoreSourceDataStoreType.OPERATIONAL_STORE)
                    .withStartTime("2020-10-17T23:28:17.6829685Z")
                    .withEndTime("2021-02-24T00:35:17.6829685Z"),
                Context.NONE);
    }
}
