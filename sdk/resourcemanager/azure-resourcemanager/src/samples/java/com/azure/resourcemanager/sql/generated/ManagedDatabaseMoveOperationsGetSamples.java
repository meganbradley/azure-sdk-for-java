// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import java.util.UUID;

/**
 * Samples for ManagedDatabaseMoveOperations Get.
 */
public final class ManagedDatabaseMoveOperationsGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/
     * ManagedDatabaseMoveOperationResultGet.json
     */
    /**
     * Sample code: Gets a managed database move operation.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAManagedDatabaseMoveOperation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedDatabaseMoveOperations().getWithResponse("rg1",
            "westeurope", UUID.fromString("15961324-d809-46ed-86b9-d786953140e2"), com.azure.core.util.Context.NONE);
    }
}
