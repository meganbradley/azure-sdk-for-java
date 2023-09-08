// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.ServiceResourceId;
import org.junit.jupiter.api.Assertions;

public final class ServiceResourceIdTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceResourceId model =
            BinaryData.fromString("{\"id\":\"grttikteusqczk\"}").toObject(ServiceResourceId.class);
        Assertions.assertEquals("grttikteusqczk", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceResourceId model = new ServiceResourceId().withId("grttikteusqczk");
        model = BinaryData.fromObject(model).toObject(ServiceResourceId.class);
        Assertions.assertEquals("grttikteusqczk", model.id());
    }
}
