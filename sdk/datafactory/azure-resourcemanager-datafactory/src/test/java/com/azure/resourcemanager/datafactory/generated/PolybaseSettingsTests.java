// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PolybaseSettings;
import com.azure.resourcemanager.datafactory.models.PolybaseSettingsRejectType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PolybaseSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolybaseSettings model = BinaryData.fromString(
            "{\"rejectType\":\"value\",\"rejectValue\":\"datagrqzwypwhfybflrp\",\"rejectSampleValue\":\"datagqqxe\",\"useTypeDefault\":\"dataghpsqvuised\",\"\":{\"btpvwx\":\"datavfjkxxnqrqdx\",\"zss\":\"datalsvicvpagwohkro\",\"jpiezthflgpsal\":\"datamlozjyovrllvhbgk\",\"wzpfbiqjrz\":\"datanan\"}}")
            .toObject(PolybaseSettings.class);
        Assertions.assertEquals(PolybaseSettingsRejectType.VALUE, model.rejectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolybaseSettings model = new PolybaseSettings().withRejectType(PolybaseSettingsRejectType.VALUE)
            .withRejectValue("datagrqzwypwhfybflrp").withRejectSampleValue("datagqqxe")
            .withUseTypeDefault("dataghpsqvuised").withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(PolybaseSettings.class);
        Assertions.assertEquals(PolybaseSettingsRejectType.VALUE, model.rejectType());
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
