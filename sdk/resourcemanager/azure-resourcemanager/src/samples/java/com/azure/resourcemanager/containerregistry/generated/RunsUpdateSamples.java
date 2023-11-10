// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.models.RunUpdateParameters;

/**
 * Samples for Runs Update.
 */
public final class RunsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/
     * RunsUpdate.json
     */
    /**
     * Sample code: Runs_Update.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void runsUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getRuns().update("myResourceGroup", "myRegistry",
            "0accec26-d6de-4757-8e74-d080f38eaaab", new RunUpdateParameters().withIsArchiveEnabled(true),
            com.azure.core.util.Context.NONE);
    }
}
