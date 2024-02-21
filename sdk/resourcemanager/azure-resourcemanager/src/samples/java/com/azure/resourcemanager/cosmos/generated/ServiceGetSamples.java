// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for Service Get.
 */
public final class ServiceGetSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBDataTransferServiceGet.json
     */
    /**
     * Sample code: DataTransferServiceGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dataTransferServiceGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getServices().getWithResponse("rg1", "ddb1", "DataTransfer",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBGraphAPIComputeServiceGet.json
     */
    /**
     * Sample code: GraphAPIComputeServiceGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void graphAPIComputeServiceGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getServices().getWithResponse("rg1", "ddb1",
            "GraphAPICompute", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBSqlDedicatedGatewayServiceGet.json
     */
    /**
     * Sample code: SqlDedicatedGatewayServiceGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void sqlDedicatedGatewayServiceGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getServices().getWithResponse("rg1", "ddb1",
            "SqlDedicatedGateway", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBMaterializedViewsBuilderServiceGet.json
     */
    /**
     * Sample code: MaterializedViewsBuilderServiceGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void materializedViewsBuilderServiceGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getServices().getWithResponse("rg1", "ddb1",
            "MaterializedViewsBuilder", com.azure.core.util.Context.NONE);
    }
}
