// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureFileStorageLocation;

public final class AzureFileStorageLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileStorageLocation model = BinaryData.fromString(
            "{\"type\":\"AzureFileStorageLocation\",\"folderPath\":\"datahuioaeoc\",\"fileName\":\"datajtfeyvkbdgddkr\",\"\":{\"uzy\":\"datacxbeuuqutkzwtjww\",\"deg\":\"dataijcxfno\",\"uckcatuqbhpow\":\"datadydhqkkkb\"}}")
            .toObject(AzureFileStorageLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileStorageLocation model
            = new AzureFileStorageLocation().withFolderPath("datahuioaeoc").withFileName("datajtfeyvkbdgddkr");
        model = BinaryData.fromObject(model).toObject(AzureFileStorageLocation.class);
    }
}
