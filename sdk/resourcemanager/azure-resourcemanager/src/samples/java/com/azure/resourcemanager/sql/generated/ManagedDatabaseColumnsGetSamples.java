// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ManagedDatabaseColumns Get.
 */
public final class ManagedDatabaseColumnsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ManagedDatabaseColumnGet.
     * json
     */
    /**
     * Sample code: Get managed database column.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getManagedDatabaseColumn(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedDatabaseColumns().getWithResponse("myRG",
            "myManagedInstanceName", "myDatabase", "dbo", "table1", "column1", com.azure.core.util.Context.NONE);
    }
}
