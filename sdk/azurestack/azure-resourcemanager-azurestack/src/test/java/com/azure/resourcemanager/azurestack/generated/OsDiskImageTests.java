// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestack.models.OsDiskImage;

public final class OsDiskImageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OsDiskImage model =
            BinaryData
                .fromString("{\"operatingSystem\":\"None\",\"sourceBlobSasUri\":\"okktwhrdxw\"}")
                .toObject(OsDiskImage.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OsDiskImage model = new OsDiskImage();
        model = BinaryData.fromObject(model).toObject(OsDiskImage.class);
    }
}
