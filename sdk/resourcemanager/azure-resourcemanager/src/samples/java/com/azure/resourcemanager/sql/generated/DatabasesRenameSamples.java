// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.ResourceMoveDefinition;

/**
 * Samples for Databases Rename.
 */
public final class DatabasesRenameSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2023-02-01-preview/examples/RenameDatabase.json
     */
    /**
     * Sample code: Renames a database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void renamesADatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getDatabases()
            .renameWithResponse("Default-SQL-SouthEastAsia", "testsvr", "testdb", new ResourceMoveDefinition().withId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/testsvr/databases/newtestdb"),
                com.azure.core.util.Context.NONE);
    }
}
