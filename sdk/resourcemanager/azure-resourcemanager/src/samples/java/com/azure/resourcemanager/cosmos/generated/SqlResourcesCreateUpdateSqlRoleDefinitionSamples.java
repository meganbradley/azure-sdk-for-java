// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.Permission;
import com.azure.resourcemanager.cosmos.models.RoleDefinitionType;
import com.azure.resourcemanager.cosmos.models.SqlRoleDefinitionCreateUpdateParameters;
import java.util.Arrays;

/**
 * Samples for SqlResources CreateUpdateSqlRoleDefinition.
 */
public final class SqlResourcesCreateUpdateSqlRoleDefinitionSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-02-15-preview/examples/
     * CosmosDBSqlRoleDefinitionCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBSqlRoleDefinitionCreateUpdate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlRoleDefinitionCreateUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources().createUpdateSqlRoleDefinition(
            "myRoleDefinitionId", "myResourceGroupName", "myAccountName",
            new SqlRoleDefinitionCreateUpdateParameters().withRoleName("myRoleName")
                .withType(RoleDefinitionType.CUSTOM_ROLE)
                .withAssignableScopes(Arrays.asList(
                    "/subscriptions/mySubscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.DocumentDB/databaseAccounts/myAccountName/dbs/sales",
                    "/subscriptions/mySubscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.DocumentDB/databaseAccounts/myAccountName/dbs/purchases"))
                .withPermissions(Arrays.asList(new Permission()
                    .withDataActions(
                        Arrays.asList("Microsoft.DocumentDB/databaseAccounts/sqlDatabases/containers/items/create",
                            "Microsoft.DocumentDB/databaseAccounts/sqlDatabases/containers/items/read"))
                    .withNotDataActions(Arrays.asList()))),
            com.azure.core.util.Context.NONE);
    }
}
