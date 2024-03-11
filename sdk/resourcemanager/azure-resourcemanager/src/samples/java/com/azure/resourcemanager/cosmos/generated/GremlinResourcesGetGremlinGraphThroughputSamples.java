// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for GremlinResources GetGremlinGraphThroughput.
 */
public final class GremlinResourcesGetGremlinGraphThroughputSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBGremlinGraphThroughputGet.json
     */
    /**
     * Sample code: CosmosDBGremlinGraphThroughputGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGremlinGraphThroughputGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getGremlinResources().getGremlinGraphThroughputWithResponse(
            "rg1", "ddb1", "databaseName", "graphName", com.azure.core.util.Context.NONE);
    }
}
