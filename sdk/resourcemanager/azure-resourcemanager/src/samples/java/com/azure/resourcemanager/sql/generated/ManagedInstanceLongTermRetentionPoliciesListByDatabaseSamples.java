// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ManagedInstanceLongTermRetentionPolicies ListByDatabase.
 */
public final class ManagedInstanceLongTermRetentionPoliciesListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * ManagedInstanceLongTermRetentionPolicyListByDatabase.json
     */
    /**
     * Sample code: Get the long term retention policies for the managed database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getTheLongTermRetentionPoliciesForTheManagedDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedInstanceLongTermRetentionPolicies()
            .listByDatabase("testResourceGroup", "testInstance", "testDatabase", com.azure.core.util.Context.NONE);
    }
}
