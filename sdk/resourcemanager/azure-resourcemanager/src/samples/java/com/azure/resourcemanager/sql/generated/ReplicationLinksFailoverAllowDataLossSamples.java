// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ReplicationLinks FailoverAllowDataLoss.
 */
public final class ReplicationLinksFailoverAllowDataLossSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/
     * ReplicationLinkFailoverAllowDataLoss.json
     */
    /**
     * Sample code: Forced failover of a replication link.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void forcedFailoverOfAReplicationLink(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getReplicationLinks().failoverAllowDataLoss("Default", "sourcesvr",
            "gamma-db", "4891ca10-ebd0-47d7-9182-c722651780fb", com.azure.core.util.Context.NONE);
    }
}
