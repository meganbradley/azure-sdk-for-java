// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ServerConfigurationOptions ListByManagedInstance.
 */
public final class ServerConfigurationOptionsListByManagedInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/
     * ServerConfigurationOptionList.json
     */
    /**
     * Sample code: Gets a list of managed instance server configuration options.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getsAListOfManagedInstanceServerConfigurationOptions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getServerConfigurationOptions().listByManagedInstance("testrg",
            "testinstance", com.azure.core.util.Context.NONE);
    }
}
