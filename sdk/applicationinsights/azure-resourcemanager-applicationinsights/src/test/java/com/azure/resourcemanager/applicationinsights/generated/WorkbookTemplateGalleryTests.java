// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateGallery;
import org.junit.jupiter.api.Assertions;

public final class WorkbookTemplateGalleryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkbookTemplateGallery model =
            BinaryData
                .fromString(
                    "{\"name\":\"ah\",\"category\":\"jyzhpvgq\",\"type\":\"j\",\"order\":391970506,\"resourceType\":\"jzlmw\"}")
                .toObject(WorkbookTemplateGallery.class);
        Assertions.assertEquals("ah", model.name());
        Assertions.assertEquals("jyzhpvgq", model.category());
        Assertions.assertEquals("j", model.type());
        Assertions.assertEquals(391970506, model.order());
        Assertions.assertEquals("jzlmw", model.resourceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkbookTemplateGallery model =
            new WorkbookTemplateGallery()
                .withName("ah")
                .withCategory("jyzhpvgq")
                .withType("j")
                .withOrder(391970506)
                .withResourceType("jzlmw");
        model = BinaryData.fromObject(model).toObject(WorkbookTemplateGallery.class);
        Assertions.assertEquals("ah", model.name());
        Assertions.assertEquals("jyzhpvgq", model.category());
        Assertions.assertEquals("j", model.type());
        Assertions.assertEquals(391970506, model.order());
        Assertions.assertEquals("jzlmw", model.resourceType());
    }
}
