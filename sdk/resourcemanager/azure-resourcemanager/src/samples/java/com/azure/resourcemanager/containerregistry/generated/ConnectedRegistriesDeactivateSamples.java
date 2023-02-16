// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for ConnectedRegistries Deactivate. */
public final class ConnectedRegistriesDeactivateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-01-01-preview/examples/ConnectedRegistryDeactivate.json
     */
    /**
     * Sample code: ConnectedRegistryDeactivate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void connectedRegistryDeactivate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getConnectedRegistries()
            .deactivate("myResourceGroup", "myRegistry", "myConnectedRegistry", com.azure.core.util.Context.NONE);
    }
}
