// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.IotHubSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IotHubSettingsTests {
    @Test
    public void testDeserialize() {
        IotHubSettings model =
            BinaryData.fromString("{\"resourceId\":\"jeiachboosfl\"}").toObject(IotHubSettings.class);
        Assertions.assertEquals("jeiachboosfl", model.resourceId());
    }

    @Test
    public void testSerialize() {
        IotHubSettings model = new IotHubSettings().withResourceId("jeiachboosfl");
        model = BinaryData.fromObject(model).toObject(IotHubSettings.class);
        Assertions.assertEquals("jeiachboosfl", model.resourceId());
    }
}
