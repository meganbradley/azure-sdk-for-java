// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for SqlResources GetSqlRoleAssignment.
 */
public final class SqlResourcesGetSqlRoleAssignmentSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBSqlRoleAssignmentGet.json
     */
    /**
     * Sample code: CosmosDBSqlRoleAssignmentGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlRoleAssignmentGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources().getSqlRoleAssignmentWithResponse(
            "myRoleAssignmentId", "myResourceGroupName", "myAccountName", com.azure.core.util.Context.NONE);
    }
}
