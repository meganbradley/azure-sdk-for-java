// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for ExportPipelines Delete. */
public final class ExportPipelinesDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-01-01-preview/examples/ExportPipelineDelete.json
     */
    /**
     * Sample code: ExportPipelineDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void exportPipelineDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getExportPipelines()
            .delete("myResourceGroup", "myRegistry", "myExportPipeline", com.azure.core.util.Context.NONE);
    }
}
