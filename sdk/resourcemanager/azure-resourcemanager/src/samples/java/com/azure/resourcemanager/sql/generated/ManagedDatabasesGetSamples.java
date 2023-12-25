// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ManagedDatabases Get.
 */
public final class ManagedDatabasesGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/ManagedDatabaseGet.json
     */
    /**
     * Sample code: Gets a managed database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAManagedDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedDatabases().getWithResponse("Test1", "managedInstance",
            "managedDatabase", com.azure.core.util.Context.NONE);
    }
}
