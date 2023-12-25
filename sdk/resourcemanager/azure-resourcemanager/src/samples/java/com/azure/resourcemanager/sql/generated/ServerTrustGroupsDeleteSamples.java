// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ServerTrustGroups Delete.
 */
public final class ServerTrustGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerTrustGroupDelete.json
     */
    /**
     * Sample code: Drop server trust group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dropServerTrustGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getServerTrustGroups().delete("Default", "Japan East",
            "server-trust-group-test", com.azure.core.util.Context.NONE);
    }
}
