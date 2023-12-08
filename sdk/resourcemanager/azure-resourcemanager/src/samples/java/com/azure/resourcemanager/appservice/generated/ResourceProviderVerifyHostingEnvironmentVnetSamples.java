// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.models.VnetParameters;

/**
 * Samples for ResourceProvider VerifyHostingEnvironmentVnet.
 */
public final class ResourceProviderVerifyHostingEnvironmentVnetSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/VerifyHostingEnvironmentVnet.json
     */
    /**
     * Sample code: VerifyHostingEnvironmentVnet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void verifyHostingEnvironmentVnet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getResourceProviders()
            .verifyHostingEnvironmentVnetWithResponse(new VnetParameters().withVnetResourceGroup("vNet123rg")
                .withVnetName("vNet123").withVnetSubnetName("vNet123SubNet"), com.azure.core.util.Context.NONE);
    }
}
