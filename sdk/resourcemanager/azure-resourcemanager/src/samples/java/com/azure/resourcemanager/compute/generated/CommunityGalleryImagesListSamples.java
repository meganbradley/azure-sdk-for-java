// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for CommunityGalleryImages List.
 */
public final class CommunityGalleryImagesListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2023-07-03/examples/
     * communityGalleryExamples/CommunityGalleryImage_List.json
     */
    /**
     * Sample code: List community gallery images.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listCommunityGalleryImages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getCommunityGalleryImages().list("myLocation",
            "publicGalleryName", com.azure.core.util.Context.NONE);
    }
}
