// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for ImportPipelines List. */
public final class ImportPipelinesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-01-01-preview/examples/ImportPipelineList.json
     */
    /**
     * Sample code: ImportPipelineList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void importPipelineList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getImportPipelines()
            .list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
