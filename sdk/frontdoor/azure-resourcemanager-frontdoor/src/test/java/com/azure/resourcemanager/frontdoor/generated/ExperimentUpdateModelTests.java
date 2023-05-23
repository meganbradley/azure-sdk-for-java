// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.ExperimentUpdateModel;
import com.azure.resourcemanager.frontdoor.models.State;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExperimentUpdateModelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentUpdateModel model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"cgpik\":\"bi\"},\"properties\":{\"description\":\"mejzanlfzxia\",\"enabledState\":\"Disabled\"}}")
                .toObject(ExperimentUpdateModel.class);
        Assertions.assertEquals("bi", model.tags().get("cgpik"));
        Assertions.assertEquals("mejzanlfzxia", model.description());
        Assertions.assertEquals(State.DISABLED, model.enabledState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentUpdateModel model =
            new ExperimentUpdateModel()
                .withTags(mapOf("cgpik", "bi"))
                .withDescription("mejzanlfzxia")
                .withEnabledState(State.DISABLED);
        model = BinaryData.fromObject(model).toObject(ExperimentUpdateModel.class);
        Assertions.assertEquals("bi", model.tags().get("cgpik"));
        Assertions.assertEquals("mejzanlfzxia", model.description());
        Assertions.assertEquals(State.DISABLED, model.enabledState());
    }

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
