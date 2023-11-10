// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for ArchiveVersions List.
 */
public final class ArchiveVersionsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/
     * ArchiveVersionList.json
     */
    /**
     * Sample code: ArchiveVersionList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void archiveVersionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getArchiveVersions().list("myResourceGroup", "myRegistry",
            "myPackageType", "myArchiveName", com.azure.core.util.Context.NONE);
    }
}
