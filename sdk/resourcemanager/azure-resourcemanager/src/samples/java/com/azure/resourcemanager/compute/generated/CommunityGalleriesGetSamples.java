// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for CommunityGalleries Get. */
public final class CommunityGalleriesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-01-03/GalleryRP/examples/communityGalleryExamples/CommunityGallery_Get.json
     */
    /**
     * Sample code: Get a community gallery.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getACommunityGallery(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getCommunityGalleries()
            .getWithResponse("myLocation", "publicGalleryName", Context.NONE);
    }
}
