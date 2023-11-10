// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for ScopeMaps Delete.
 */
public final class ScopeMapsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/
     * ScopeMapDelete.json
     */
    /**
     * Sample code: ScopeMapDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void scopeMapDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getScopeMaps().delete("myResourceGroup", "myRegistry",
            "myScopeMap", com.azure.core.util.Context.NONE);
    }
}
