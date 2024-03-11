// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for SqlResources DeleteSqlStoredProcedure.
 */
public final class SqlResourcesDeleteSqlStoredProcedureSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBSqlStoredProcedureDelete.json
     */
    /**
     * Sample code: CosmosDBSqlStoredProcedureDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlStoredProcedureDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources().deleteSqlStoredProcedure("rg1", "ddb1",
            "databaseName", "containerName", "storedProcedureName", com.azure.core.util.Context.NONE);
    }
}
