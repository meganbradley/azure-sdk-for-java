// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for LongTermRetentionManagedInstanceBackups DeleteByResourceGroup.
 */
public final class LongTermRetentionManagedInstanceBackupsDeleteByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-05-01-preview/examples/
     * ResourceGroupBasedManagedInstanceLongTermRetentionBackupDelete.json
     */
    /**
     * Sample code: Delete the long term retention backup.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteTheLongTermRetentionBackup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getLongTermRetentionManagedInstanceBackups().deleteByResourceGroup(
            "testResourceGroup", "japaneast", "testInstance", "testDatabase",
            "55555555-6666-7777-8888-999999999999;131637960820000000", com.azure.core.util.Context.NONE);
    }
}
