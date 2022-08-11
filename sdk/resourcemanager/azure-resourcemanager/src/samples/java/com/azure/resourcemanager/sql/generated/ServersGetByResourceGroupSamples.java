// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for Servers GetByResourceGroup. */
public final class ServersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2019-06-01-preview/examples/ServerGet.json
     */
    /**
     * Sample code: Get server.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getServer(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServers()
            .getByResourceGroupWithResponse("sqlcrudtest-7398", "sqlcrudtest-4645", Context.NONE);
    }
}
