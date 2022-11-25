// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceProperties;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ShareablePrivateLinkResourceTypeTests {
    @Test
    public void testDeserialize() {
        ShareablePrivateLinkResourceType model =
            BinaryData
                .fromString(
                    "{\"name\":\"c\",\"properties\":{\"description\":\"wdsjnkalju\",\"groupId\":\"iswac\",\"type\":\"gdkz\"}}")
                .toObject(ShareablePrivateLinkResourceType.class);
        Assertions.assertEquals("c", model.name());
        Assertions.assertEquals("wdsjnkalju", model.properties().description());
        Assertions.assertEquals("iswac", model.properties().groupId());
        Assertions.assertEquals("gdkz", model.properties().type());
    }

    @Test
    public void testSerialize() {
        ShareablePrivateLinkResourceType model =
            new ShareablePrivateLinkResourceType()
                .withName("c")
                .withProperties(
                    new ShareablePrivateLinkResourceProperties()
                        .withDescription("wdsjnkalju")
                        .withGroupId("iswac")
                        .withType("gdkz"));
        model = BinaryData.fromObject(model).toObject(ShareablePrivateLinkResourceType.class);
        Assertions.assertEquals("c", model.name());
        Assertions.assertEquals("wdsjnkalju", model.properties().description());
        Assertions.assertEquals("iswac", model.properties().groupId());
        Assertions.assertEquals("gdkz", model.properties().type());
    }
}
