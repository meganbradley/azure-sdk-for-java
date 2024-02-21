// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for SqlResources GetSqlStoredProcedure.
 */
public final class SqlResourcesGetSqlStoredProcedureSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBSqlStoredProcedureGet.json
     */
    /**
     * Sample code: CosmosDBSqlStoredProcedureGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlStoredProcedureGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources().getSqlStoredProcedureWithResponse("rgName",
            "ddb1", "databaseName", "containerName", "storedProcedureName", com.azure.core.util.Context.NONE);
    }
}
