// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ConnectedWorkspace;
import org.junit.jupiter.api.Assertions;

public final class ConnectedWorkspaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectedWorkspace model = BinaryData.fromString("{\"id\":\"r\"}").toObject(ConnectedWorkspace.class);
        Assertions.assertEquals("r", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectedWorkspace model = new ConnectedWorkspace().withId("r");
        model = BinaryData.fromObject(model).toObject(ConnectedWorkspace.class);
        Assertions.assertEquals("r", model.id());
    }
}
