// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.CustomImageFragment;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomImageFragmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomImageFragment model =
            BinaryData
                .fromString("{\"tags\":{\"b\":\"kqnyh\",\"jivfxzsjabib\":\"j\"}}")
                .toObject(CustomImageFragment.class);
        Assertions.assertEquals("kqnyh", model.tags().get("b"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomImageFragment model = new CustomImageFragment().withTags(mapOf("b", "kqnyh", "jivfxzsjabib", "j"));
        model = BinaryData.fromObject(model).toObject(CustomImageFragment.class);
        Assertions.assertEquals("kqnyh", model.tags().get("b"));
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
