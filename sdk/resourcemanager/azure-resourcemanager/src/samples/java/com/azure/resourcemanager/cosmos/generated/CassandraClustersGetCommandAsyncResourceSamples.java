// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for CassandraClusters GetCommandAsyncResource.
 */
public final class CassandraClustersGetCommandAsyncResourceSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBManagedCassandraCommandResult.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraCommandResult.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBManagedCassandraCommandResult(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getCassandraClusters().getCommandAsyncResourceWithResponse(
            "cassandra-prod-rg", "cassandra-prod", "318653d0-3da5-4814-b8f6-429f2af0b2a4",
            com.azure.core.util.Context.NONE);
    }
}
