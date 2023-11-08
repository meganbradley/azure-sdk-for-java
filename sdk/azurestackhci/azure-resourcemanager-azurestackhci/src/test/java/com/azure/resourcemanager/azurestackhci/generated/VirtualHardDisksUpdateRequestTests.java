// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.VirtualHardDisksUpdateRequest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VirtualHardDisksUpdateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualHardDisksUpdateRequest model =
            BinaryData
                .fromString("{\"tags\":{\"vgyuguos\":\"yqiklbbovplwzb\"}}")
                .toObject(VirtualHardDisksUpdateRequest.class);
        Assertions.assertEquals("yqiklbbovplwzb", model.tags().get("vgyuguos"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualHardDisksUpdateRequest model =
            new VirtualHardDisksUpdateRequest().withTags(mapOf("vgyuguos", "yqiklbbovplwzb"));
        model = BinaryData.fromObject(model).toObject(VirtualHardDisksUpdateRequest.class);
        Assertions.assertEquals("yqiklbbovplwzb", model.tags().get("vgyuguos"));
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
