// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for DatabaseRecommendedActions Get.
 */
public final class DatabaseRecommendedActionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DatabaseRecommendedActionGet
     * .json
     */
    /**
     * Sample code: Get database recommended action.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDatabaseRecommendedAction(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getDatabaseRecommendedActions().getWithResponse(
            "workloadinsight-demos", "misosisvr", "IndexAdvisor_test_3", "CreateIndex",
            "IR_[CRM]_[DataPoints]_4821CD2F9510D98184BB", com.azure.core.util.Context.NONE);
    }
}
