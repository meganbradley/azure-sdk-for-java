// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneResourceId;
import com.azure.resourcemanager.mobilenetwork.models.SiteDeletePacketCore;
import org.junit.jupiter.api.Assertions;

public final class SiteDeletePacketCoreTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SiteDeletePacketCore model = BinaryData.fromString("{\"packetCore\":{\"id\":\"zdwlvwlyoupfgfb\"}}")
            .toObject(SiteDeletePacketCore.class);
        Assertions.assertEquals("zdwlvwlyoupfgfb", model.packetCore().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SiteDeletePacketCore model = new SiteDeletePacketCore()
            .withPacketCore(new PacketCoreControlPlaneResourceId().withId("zdwlvwlyoupfgfb"));
        model = BinaryData.fromObject(model).toObject(SiteDeletePacketCore.class);
        Assertions.assertEquals("zdwlvwlyoupfgfb", model.packetCore().id());
    }
}
