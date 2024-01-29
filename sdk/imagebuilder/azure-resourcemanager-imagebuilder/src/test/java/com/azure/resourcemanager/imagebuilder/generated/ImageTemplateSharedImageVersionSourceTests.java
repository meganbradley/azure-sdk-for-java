// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateSharedImageVersionSource;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplateSharedImageVersionSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplateSharedImageVersionSource model = BinaryData
            .fromString(
                "{\"type\":\"SharedImageVersion\",\"imageVersionId\":\"ynnaam\",\"exactVersion\":\"ctehfiqscjey\"}")
            .toObject(ImageTemplateSharedImageVersionSource.class);
        Assertions.assertEquals("ynnaam", model.imageVersionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplateSharedImageVersionSource model
            = new ImageTemplateSharedImageVersionSource().withImageVersionId("ynnaam");
        model = BinaryData.fromObject(model).toObject(ImageTemplateSharedImageVersionSource.class);
        Assertions.assertEquals("ynnaam", model.imageVersionId());
    }
}
