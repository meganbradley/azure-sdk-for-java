// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ReplicationLinks ListByServer.
 */
public final class ReplicationLinksListByServerSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/ReplicationLinkListByServer.
     * json
     */
    /**
     * Sample code: List replication links on server.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listReplicationLinksOnServer(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getReplicationLinks().listByServer("Default", "sourcesvr",
            com.azure.core.util.Context.NONE);
    }
}
