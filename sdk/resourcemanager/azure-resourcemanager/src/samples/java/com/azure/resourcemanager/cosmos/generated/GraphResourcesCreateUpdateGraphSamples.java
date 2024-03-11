// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.models.GraphResource;
import com.azure.resourcemanager.cosmos.models.GraphResourceCreateUpdateParameters;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for GraphResources CreateUpdateGraph.
 */
public final class GraphResourcesCreateUpdateGraphSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBGraphResourceCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBGraphCreateUpdate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBGraphCreateUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getGraphResources().createUpdateGraph("rg1", "ddb1",
            "graphName",
            new GraphResourceCreateUpdateParameters().withLocation("West US").withTags(mapOf())
                .withResource(new GraphResource().withId("graphName")).withOptions(new CreateUpdateOptions()),
            com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
