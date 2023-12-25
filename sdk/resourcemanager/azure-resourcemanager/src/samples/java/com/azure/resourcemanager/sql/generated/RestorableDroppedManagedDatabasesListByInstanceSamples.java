// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for RestorableDroppedManagedDatabases ListByInstance.
 */
public final class RestorableDroppedManagedDatabasesListByInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-05-01-preview/examples/
     * RestorableDroppedManagedDatabaseListByManagedInstance.json
     */
    /**
     * Sample code: List restorable dropped databases by managed instances.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listRestorableDroppedDatabasesByManagedInstances(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getRestorableDroppedManagedDatabases().listByInstance("Test1",
            "managedInstance", com.azure.core.util.Context.NONE);
    }
}
