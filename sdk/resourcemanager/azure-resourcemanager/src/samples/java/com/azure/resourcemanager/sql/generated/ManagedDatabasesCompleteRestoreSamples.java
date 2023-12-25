// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.CompleteDatabaseRestoreDefinition;

/**
 * Samples for ManagedDatabases CompleteRestore.
 */
public final class ManagedDatabasesCompleteRestoreSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/
     * ManagedDatabaseCompleteExternalRestore.json
     */
    /**
     * Sample code: Completes a managed database external backup restore.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        completesAManagedDatabaseExternalBackupRestore(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedDatabases().completeRestore("myRG",
            "myManagedInstanceName", "myDatabase",
            new CompleteDatabaseRestoreDefinition().withLastBackupName("testdb1_log4"),
            com.azure.core.util.Context.NONE);
    }
}
