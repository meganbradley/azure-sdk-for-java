// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ServerAdvancedThreatProtectionSettings ListByServer.
 */
public final class ServerAdvancedThreatProtectionSettingsListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/
     * ServerAdvancedThreatProtectionSettingsListByServer.json
     */
    /**
     * Sample code: List the server's Advanced Threat Protection settings.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listTheServerSAdvancedThreatProtectionSettings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getServerAdvancedThreatProtectionSettings()
            .listByServer("threatprotection-4799", "threatprotection-6440", com.azure.core.util.Context.NONE);
    }
}
