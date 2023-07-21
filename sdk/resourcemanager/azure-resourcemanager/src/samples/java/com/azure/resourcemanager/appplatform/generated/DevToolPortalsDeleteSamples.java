// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/** Samples for DevToolPortals Delete. */
public final class DevToolPortalsDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/DevToolPortal_Delete.json
     */
    /**
     * Sample code: DevToolPortals_Delete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void devToolPortalsDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getDevToolPortals()
            .delete("myResourceGroup", "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
