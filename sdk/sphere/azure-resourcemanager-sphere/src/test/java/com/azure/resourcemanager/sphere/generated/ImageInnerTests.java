// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.ImageInner;
import com.azure.resourcemanager.sphere.models.ImageProperties;
import com.azure.resourcemanager.sphere.models.RegionalDataBoundary;
import org.junit.jupiter.api.Assertions;

public final class ImageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageInner model = BinaryData.fromString(
            "{\"properties\":{\"image\":\"ymwisdkft\",\"imageId\":\"xmnteiwaop\",\"imageName\":\"mijcmmxdcufufs\",\"regionalDataBoundary\":\"None\",\"uri\":\"zidnsezcxtbzsgfy\",\"description\":\"sne\",\"componentId\":\"dwzjeiach\",\"imageType\":\"CustomerBoardConfig\",\"provisioningState\":\"Failed\"},\"id\":\"nrosfqpte\",\"name\":\"hzzvypyq\",\"type\":\"i\"}")
            .toObject(ImageInner.class);
        Assertions.assertEquals("ymwisdkft", model.properties().image());
        Assertions.assertEquals("xmnteiwaop", model.properties().imageId());
        Assertions.assertEquals(RegionalDataBoundary.NONE, model.properties().regionalDataBoundary());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageInner model = new ImageInner().withProperties(new ImageProperties().withImage("ymwisdkft")
            .withImageId("xmnteiwaop").withRegionalDataBoundary(RegionalDataBoundary.NONE));
        model = BinaryData.fromObject(model).toObject(ImageInner.class);
        Assertions.assertEquals("ymwisdkft", model.properties().image());
        Assertions.assertEquals("xmnteiwaop", model.properties().imageId());
        Assertions.assertEquals(RegionalDataBoundary.NONE, model.properties().regionalDataBoundary());
    }
}
