// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for VirtualNetworkRules Delete.
 */
public final class VirtualNetworkRulesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/VirtualNetworkRulesDelete.
     * json
     */
    /**
     * Sample code: Delete a virtual network rule.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAVirtualNetworkRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getVirtualNetworkRules().delete("Default", "vnet-test-svr",
            "vnet-firewall-rule", com.azure.core.util.Context.NONE);
    }
}
