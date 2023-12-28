// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServiceEnvironments GetPrivateLinkResources.
 */
public final class AppServiceEnvironmentsGetPrivateLinkResourcesSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/
     * AppServiceEnvironments_GetPrivateLinkResources.json
     */
    /**
     * Sample code: Gets the private link resources.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsThePrivateLinkResources(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getAppServiceEnvironments()
            .getPrivateLinkResourcesWithResponse("test-rg", "test-ase", com.azure.core.util.Context.NONE);
    }
}
