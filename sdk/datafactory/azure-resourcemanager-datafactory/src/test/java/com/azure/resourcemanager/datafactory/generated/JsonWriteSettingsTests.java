// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JsonWriteSettings;

public final class JsonWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonWriteSettings model = BinaryData.fromString(
            "{\"type\":\"JsonWriteSettings\",\"filePattern\":\"databaqolwfkb\",\"\":{\"vazf\":\"datavhtgfdygaphlwm\"}}")
            .toObject(JsonWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonWriteSettings model = new JsonWriteSettings().withFilePattern("databaqolwfkb");
        model = BinaryData.fromObject(model).toObject(JsonWriteSettings.class);
    }
}
