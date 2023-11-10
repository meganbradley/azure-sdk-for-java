// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for Registries ListCredentials.
 */
public final class RegistriesListCredentialsSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/
     * RegistryListCredentials.json
     */
    /**
     * Sample code: RegistryListCredentials.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryListCredentials(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getRegistries()
            .listCredentialsWithResponse("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
