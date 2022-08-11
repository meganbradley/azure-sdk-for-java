// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;

/** Samples for GremlinResources MigrateGremlinGraphToManualThroughput. */
public final class GremlinResourcesMigrateGremlinGraphToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-05-15/examples/CosmosDBGremlinGraphMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphMigrateToManualThroughput.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinGraphMigrateToManualThroughput(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getGremlinResources()
            .migrateGremlinGraphToManualThroughput("rg1", "ddb1", "databaseName", "graphName", Context.NONE);
    }
}
