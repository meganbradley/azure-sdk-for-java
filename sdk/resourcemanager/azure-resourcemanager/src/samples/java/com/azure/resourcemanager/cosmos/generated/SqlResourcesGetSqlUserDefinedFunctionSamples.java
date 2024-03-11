// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for SqlResources GetSqlUserDefinedFunction.
 */
public final class SqlResourcesGetSqlUserDefinedFunctionSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBSqlUserDefinedFunctionGet.json
     */
    /**
     * Sample code: CosmosDBSqlUserDefinedFunctionGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlUserDefinedFunctionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources().getSqlUserDefinedFunctionWithResponse(
            "rgName", "ddb1", "databaseName", "containerName", "userDefinedFunctionName",
            com.azure.core.util.Context.NONE);
    }
}
