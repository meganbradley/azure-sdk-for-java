// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for Apps GetResourceUploadUrl.
 */
public final class AppsGetResourceUploadUrlSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * Apps_GetResourceUploadUrl.json
     */
    /**
     * Sample code: Apps_GetResourceUploadUrl.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void appsGetResourceUploadUrl(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getApps().getResourceUploadUrlWithResponse("myResourceGroup",
            "myservice", "myapp", com.azure.core.util.Context.NONE);
    }
}
