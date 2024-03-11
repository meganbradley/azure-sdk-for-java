// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for RestorableMongodbResources List.
 */
public final class RestorableMongodbResourcesListSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBRestorableMongodbResourceList.json
     */
    /**
     * Sample code: CosmosDBRestorableMongodbResourceList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBRestorableMongodbResourceList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getRestorableMongodbResources().list("WestUS",
            "d9b26648-2f53-4541-b3d8-3044f4f9810d", "WestUS", "06/01/2022 4:56", com.azure.core.util.Context.NONE);
    }
}
