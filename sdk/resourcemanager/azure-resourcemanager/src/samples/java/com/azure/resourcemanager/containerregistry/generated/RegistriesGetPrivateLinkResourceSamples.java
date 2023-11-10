// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for Registries GetPrivateLinkResource.
 */
public final class RegistriesGetPrivateLinkResourceSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/
     * RegistryGetPrivateLinkResource.json
     */
    /**
     * Sample code: RegistryGetPrivateLinkResource.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryGetPrivateLinkResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getRegistries().getPrivateLinkResourceWithResponse(
            "myResourceGroup", "myRegistry", "registry", com.azure.core.util.Context.NONE);
    }
}
