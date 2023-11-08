// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.GalleryImageVersionStorageProfile;
import com.azure.resourcemanager.azurestackhci.models.GalleryOSDiskImage;

public final class GalleryImageVersionStorageProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GalleryImageVersionStorageProfile model =
            BinaryData
                .fromString("{\"osDiskImage\":{\"sizeInMB\":5597579256870764074}}")
                .toObject(GalleryImageVersionStorageProfile.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GalleryImageVersionStorageProfile model =
            new GalleryImageVersionStorageProfile().withOsDiskImage(new GalleryOSDiskImage());
        model = BinaryData.fromObject(model).toObject(GalleryImageVersionStorageProfile.class);
    }
}
