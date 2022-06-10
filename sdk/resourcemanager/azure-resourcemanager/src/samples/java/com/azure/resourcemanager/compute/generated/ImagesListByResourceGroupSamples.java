// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for Images ListByResourceGroup. */
public final class ImagesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/imageExamples/Image_ListByResourceGroup.json
     */
    /**
     * Sample code: List all virtual machine images in a resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllVirtualMachineImagesInAResourceGroup(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getImages()
            .listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
