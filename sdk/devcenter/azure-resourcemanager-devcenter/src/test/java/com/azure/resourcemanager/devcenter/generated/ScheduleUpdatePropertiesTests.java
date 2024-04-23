// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ScheduleUpdateProperties;
import com.azure.resourcemanager.devcenter.models.ScheduledFrequency;
import com.azure.resourcemanager.devcenter.models.ScheduledType;
import com.azure.resourcemanager.devcenter.models.ScheduleEnableStatus;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleUpdateProperties model = BinaryData.fromString(
            "{\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"b\",\"timeZone\":\"qvkjlmxho\",\"state\":\"Disabled\",\"tags\":{\"raauzzpt\":\"dwdigumb\",\"ysdzhez\":\"a\"},\"location\":\"vaiqyuvvf\"}")
            .toObject(ScheduleUpdateProperties.class);
        Assertions.assertEquals("dwdigumb", model.tags().get("raauzzpt"));
        Assertions.assertEquals("vaiqyuvvf", model.location());
        Assertions.assertEquals(ScheduledType.STOP_DEV_BOX, model.type());
        Assertions.assertEquals(ScheduledFrequency.DAILY, model.frequency());
        Assertions.assertEquals("b", model.time());
        Assertions.assertEquals("qvkjlmxho", model.timeZone());
        Assertions.assertEquals(ScheduleEnableStatus.DISABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleUpdateProperties model
            = new ScheduleUpdateProperties().withTags(mapOf("raauzzpt", "dwdigumb", "ysdzhez", "a"))
                .withLocation("vaiqyuvvf")
                .withType(ScheduledType.STOP_DEV_BOX)
                .withFrequency(ScheduledFrequency.DAILY)
                .withTime("b")
                .withTimeZone("qvkjlmxho")
                .withState(ScheduleEnableStatus.DISABLED);
        model = BinaryData.fromObject(model).toObject(ScheduleUpdateProperties.class);
        Assertions.assertEquals("dwdigumb", model.tags().get("raauzzpt"));
        Assertions.assertEquals("vaiqyuvvf", model.location());
        Assertions.assertEquals(ScheduledType.STOP_DEV_BOX, model.type());
        Assertions.assertEquals(ScheduledFrequency.DAILY, model.frequency());
        Assertions.assertEquals("b", model.time());
        Assertions.assertEquals("qvkjlmxho", model.timeZone());
        Assertions.assertEquals(ScheduleEnableStatus.DISABLED, model.state());
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
