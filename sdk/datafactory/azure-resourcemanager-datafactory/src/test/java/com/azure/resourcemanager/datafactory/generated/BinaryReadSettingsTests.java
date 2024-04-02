// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BinaryReadSettings;
import com.azure.resourcemanager.datafactory.models.CompressionReadSettings;
import java.util.HashMap;
import java.util.Map;

public final class BinaryReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BinaryReadSettings model = BinaryData.fromString(
            "{\"type\":\"BinaryReadSettings\",\"compressionProperties\":{\"type\":\"CompressionReadSettings\",\"\":{\"wigif\":\"datazpuz\"}},\"\":{\"tlpshxjhanskooal\":\"datays\"}}")
            .toObject(BinaryReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BinaryReadSettings model = new BinaryReadSettings().withCompressionProperties(
            new CompressionReadSettings().withAdditionalProperties(mapOf("type", "CompressionReadSettings")));
        model = BinaryData.fromObject(model).toObject(BinaryReadSettings.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
