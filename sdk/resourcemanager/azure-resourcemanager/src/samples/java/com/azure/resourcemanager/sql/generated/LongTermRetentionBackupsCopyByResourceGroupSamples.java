// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.BackupStorageRedundancy;
import com.azure.resourcemanager.sql.models.CopyLongTermRetentionBackupParameters;

/**
 * Samples for LongTermRetentionBackups CopyByResourceGroup.
 */
public final class LongTermRetentionBackupsCopyByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2023-05-01-preview/examples/
     * ResourceGroupBasedLongTermRetentionBackupCopy.json
     */
    /**
     * Sample code: Copy the long term retention backup.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void copyTheLongTermRetentionBackup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getLongTermRetentionBackups().copyByResourceGroup(
            "testResourceGroup", "japaneast", "testserver", "testDatabase",
            "55555555-6666-7777-8888-999999999999;131637960820000000",
            new CopyLongTermRetentionBackupParameters().withTargetServerResourceId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Sql/resourceGroups/resourceGroup/servers/testserver2")
                .withTargetDatabaseName("testDatabase2").withTargetBackupStorageRedundancy(BackupStorageRedundancy.GEO),
            com.azure.core.util.Context.NONE);
    }
}
