// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.PhysicalPartitionId;
import com.azure.resourcemanager.cosmos.models.RetrieveThroughputParameters;
import com.azure.resourcemanager.cosmos.models.RetrieveThroughputPropertiesResource;
import java.util.Arrays;

/**
 * Samples for SqlResources SqlDatabaseRetrieveThroughputDistribution.
 */
public final class SqlResourcesSqlDatabaseRetrieveThroughputDistributionSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBSqlDatabaseRetrieveThroughputDistribution.json
     */
    /**
     * Sample code: CosmosDBSqlDatabaseRetrieveThroughputDistribution.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        cosmosDBSqlDatabaseRetrieveThroughputDistribution(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources().sqlDatabaseRetrieveThroughputDistribution(
            "rg1", "ddb1", "databaseName",
            new RetrieveThroughputParameters()
                .withResource(new RetrieveThroughputPropertiesResource().withPhysicalPartitionIds(
                    Arrays.asList(new PhysicalPartitionId().withId("0"), new PhysicalPartitionId().withId("1")))),
            com.azure.core.util.Context.NONE);
    }
}
