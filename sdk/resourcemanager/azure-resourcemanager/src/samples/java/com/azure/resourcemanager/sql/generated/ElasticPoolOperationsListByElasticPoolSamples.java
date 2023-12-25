// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ElasticPoolOperations ListByElasticPool.
 */
public final class ElasticPoolOperationsListByElasticPoolSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ListElasticPoolOperations.
     * json
     */
    /**
     * Sample code: List the elastic pool management operations.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listTheElasticPoolManagementOperations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getElasticPoolOperations().listByElasticPool("sqlcrudtestgroup",
            "sqlcrudtestserver", "testpool", com.azure.core.util.Context.NONE);
    }
}
