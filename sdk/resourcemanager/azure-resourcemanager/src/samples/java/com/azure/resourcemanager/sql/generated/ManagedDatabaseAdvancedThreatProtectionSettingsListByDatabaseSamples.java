// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ManagedDatabaseAdvancedThreatProtectionSettings ListByDatabase.
 */
public final class ManagedDatabaseAdvancedThreatProtectionSettingsListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/
     * ManagedDatabaseAdvancedThreatProtectionSettingsListByDatabase.json
     */
    /**
     * Sample code: Get a list of the managed database's Advanced Threat Protection settings.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAListOfTheManagedDatabaseSAdvancedThreatProtectionSettings(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedDatabaseAdvancedThreatProtectionSettings()
            .listByDatabase("threatprotection-6852", "threatprotection-2080", "testdb",
                com.azure.core.util.Context.NONE);
    }
}
