// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ServerDnsAliases Get.
 */
public final class ServerDnsAliasesGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerDnsAliasGet.json
     */
    /**
     * Sample code: Get server DNS alias.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getServerDNSAlias(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getServerDnsAliases().getWithResponse("Default",
            "dns-alias-server", "dns-alias-name-1", com.azure.core.util.Context.NONE);
    }
}
