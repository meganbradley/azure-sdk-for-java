// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for BuildService ListSupportedBuildpacks.
 */
public final class BuildServiceListSupportedBuildpacksSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * BuildService_ListSupportedBuildpacks.json
     */
    /**
     * Sample code: BuildService_ListSupportedBuildpacks.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildServiceListSupportedBuildpacks(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getBuildServices().listSupportedBuildpacksWithResponse(
            "myResourceGroup", "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
