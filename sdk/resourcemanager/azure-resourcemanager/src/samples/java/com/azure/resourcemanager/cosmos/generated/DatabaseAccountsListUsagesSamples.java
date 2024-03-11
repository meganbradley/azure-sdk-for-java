// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for DatabaseAccounts ListUsages.
 */
public final class DatabaseAccountsListUsagesSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBDatabaseAccountGetUsages.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountGetUsages.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDatabaseAccountGetUsages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getDatabaseAccounts().listUsages("rg1", "ddb1",
            "$filter=name.value eq 'Storage'", com.azure.core.util.Context.NONE);
    }
}
