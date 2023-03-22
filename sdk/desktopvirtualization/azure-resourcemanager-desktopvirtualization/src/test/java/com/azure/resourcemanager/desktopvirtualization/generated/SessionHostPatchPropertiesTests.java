// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostPatchProperties;
import org.junit.jupiter.api.Assertions;

public final class SessionHostPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SessionHostPatchProperties model =
            BinaryData
                .fromString("{\"allowNewSession\":false,\"assignedUser\":\"duhpk\",\"friendlyName\":\"gymare\"}")
                .toObject(SessionHostPatchProperties.class);
        Assertions.assertEquals(false, model.allowNewSession());
        Assertions.assertEquals("duhpk", model.assignedUser());
        Assertions.assertEquals("gymare", model.friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SessionHostPatchProperties model =
            new SessionHostPatchProperties()
                .withAllowNewSession(false)
                .withAssignedUser("duhpk")
                .withFriendlyName("gymare");
        model = BinaryData.fromObject(model).toObject(SessionHostPatchProperties.class);
        Assertions.assertEquals(false, model.allowNewSession());
        Assertions.assertEquals("duhpk", model.assignedUser());
        Assertions.assertEquals("gymare", model.friendlyName());
    }
}
