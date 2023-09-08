// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maps.models.CreatorUpdateParameters;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CreatorUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreatorUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"sbj\":\"ye\",\"wfqkquj\":\"azqugxywpmueefj\"},\"properties\":{\"provisioningState\":\"uyonobglaoc\",\"storageUnits\":1422532209}}")
                .toObject(CreatorUpdateParameters.class);
        Assertions.assertEquals("ye", model.tags().get("sbj"));
        Assertions.assertEquals(1422532209, model.storageUnits());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreatorUpdateParameters model =
            new CreatorUpdateParameters()
                .withTags(mapOf("sbj", "ye", "wfqkquj", "azqugxywpmueefj"))
                .withStorageUnits(1422532209);
        model = BinaryData.fromObject(model).toObject(CreatorUpdateParameters.class);
        Assertions.assertEquals("ye", model.tags().get("sbj"));
        Assertions.assertEquals(1422532209, model.storageUnits());
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
