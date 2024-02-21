// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for GatewayCustomDomains Delete.
 */
public final class GatewayCustomDomainsDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * GatewayCustomDomains_Delete.json
     */
    /**
     * Sample code: GatewayCustomDomains_Delete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void gatewayCustomDomainsDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getGatewayCustomDomains().delete("myResourceGroup",
            "myservice", "default", "myDomainName", com.azure.core.util.Context.NONE);
    }
}
