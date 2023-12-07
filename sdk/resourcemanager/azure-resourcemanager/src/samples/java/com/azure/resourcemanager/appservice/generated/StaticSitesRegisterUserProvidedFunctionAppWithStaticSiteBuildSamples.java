// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.StaticSiteUserProvidedFunctionAppArmResourceInner;

/**
 * Samples for StaticSites RegisterUserProvidedFunctionAppWithStaticSiteBuild.
 */
public final class StaticSitesRegisterUserProvidedFunctionAppWithStaticSiteBuildSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/
     * RegisterUserProvidedFunctionAppWithStaticSiteBuild.json
     */
    /**
     * Sample code: Register a user provided function app with a static site build.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        registerAUserProvidedFunctionAppWithAStaticSiteBuild(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getStaticSites().registerUserProvidedFunctionAppWithStaticSiteBuild(
            "rg", "testStaticSite0", "default", "testFunctionApp",
            new StaticSiteUserProvidedFunctionAppArmResourceInner().withFunctionAppResourceId(
                "/subscription/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/functionRG/providers/Microsoft.Web/sites/testFunctionApp")
                .withFunctionAppRegion("West US 2"),
            true, com.azure.core.util.Context.NONE);
    }
}
