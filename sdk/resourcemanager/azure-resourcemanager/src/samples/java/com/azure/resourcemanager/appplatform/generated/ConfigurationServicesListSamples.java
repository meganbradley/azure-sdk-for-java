// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/** Samples for ConfigurationServices List. */
public final class ConfigurationServicesListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/ConfigurationServices_List.json
     */
    /**
     * Sample code: ConfigurationServices_List.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void configurationServicesList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getConfigurationServices()
            .list("myResourceGroup", "myservice", com.azure.core.util.Context.NONE);
    }
}
