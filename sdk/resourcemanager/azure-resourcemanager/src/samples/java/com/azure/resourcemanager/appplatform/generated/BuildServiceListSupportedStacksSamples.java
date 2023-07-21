// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/** Samples for BuildService ListSupportedStacks. */
public final class BuildServiceListSupportedStacksSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/BuildService_ListSupportedStacks.json
     */
    /**
     * Sample code: BuildService_ListSupportedStacks.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildServiceListSupportedStacks(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getBuildServices()
            .listSupportedStacksWithResponse(
                "myResourceGroup", "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
