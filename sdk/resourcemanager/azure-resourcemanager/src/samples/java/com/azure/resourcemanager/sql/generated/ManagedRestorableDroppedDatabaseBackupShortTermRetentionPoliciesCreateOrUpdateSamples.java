// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.ManagedBackupShortTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.models.ManagedShortTermRetentionPolicyName;

/**
 * Samples for ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies CreateOrUpdate.
 */
public final class ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * UpdateManagedShortTermRetentionPolicyRestorableDropped.json
     */
    /**
     * Sample code: Update the short term retention policy for the restorable dropped database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateTheShortTermRetentionPolicyForTheRestorableDroppedDatabase(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient()
            .getManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies().createOrUpdate("resourceGroup",
                "testsvr", "testdb,131403269876900000", ManagedShortTermRetentionPolicyName.DEFAULT,
                new ManagedBackupShortTermRetentionPolicyInner().withRetentionDays(14),
                com.azure.core.util.Context.NONE);
    }
}
