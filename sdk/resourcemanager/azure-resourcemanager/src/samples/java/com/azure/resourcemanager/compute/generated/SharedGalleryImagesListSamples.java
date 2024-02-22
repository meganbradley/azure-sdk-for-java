// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for SharedGalleryImages List.
 */
public final class SharedGalleryImagesListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2023-07-03/examples/
     * sharedGalleryExamples/SharedGalleryImages_List.json
     */
    /**
     * Sample code: List shared gallery images.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSharedGalleryImages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getSharedGalleryImages().list("myLocation",
            "galleryUniqueName", null, com.azure.core.util.Context.NONE);
    }
}
