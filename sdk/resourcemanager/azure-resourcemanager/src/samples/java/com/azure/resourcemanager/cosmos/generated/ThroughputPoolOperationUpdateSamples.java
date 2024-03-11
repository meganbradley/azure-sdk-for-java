// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.ThroughputPoolUpdate;

/**
 * Samples for ThroughputPoolOperation Update.
 */
public final class ThroughputPoolOperationUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/throughputPool/
     * CosmosDBThroughputPoolUpdate.json
     */
    /**
     * Sample code: CosmosDB ThroughputPool Update.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBThroughputPoolUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getThroughputPoolOperations().update("rg1", "tp1",
            new ThroughputPoolUpdate().withMaxThroughput(10000), com.azure.core.util.Context.NONE);
    }
}
