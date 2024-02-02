// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for Apps List.
 */
public final class AppsListSamples {
    /*
     * x-ms-original-file:
     * specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/Apps_List.json
     */
    /**
     * Sample code: Apps_List.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void appsList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getApps().list("myResourceGroup", "myservice",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * Apps_List_VNetInjection.json
     */
    /**
     * Sample code: Apps_List_VNetInjection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void appsListVNetInjection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getApps().list("myResourceGroup", "myservice",
            com.azure.core.util.Context.NONE);
    }
}
