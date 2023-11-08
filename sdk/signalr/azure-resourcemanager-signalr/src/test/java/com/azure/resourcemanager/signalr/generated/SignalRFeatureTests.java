// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.FeatureFlags;
import com.azure.resourcemanager.signalr.models.SignalRFeature;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SignalRFeatureTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SignalRFeature model =
            BinaryData
                .fromString(
                    "{\"flag\":\"EnableLiveTrace\",\"value\":\"nvrk\",\"properties\":{\"ixqtn\":\"uaibrebqaaysj\"}}")
                .toObject(SignalRFeature.class);
        Assertions.assertEquals(FeatureFlags.ENABLE_LIVE_TRACE, model.flag());
        Assertions.assertEquals("nvrk", model.value());
        Assertions.assertEquals("uaibrebqaaysj", model.properties().get("ixqtn"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SignalRFeature model =
            new SignalRFeature()
                .withFlag(FeatureFlags.ENABLE_LIVE_TRACE)
                .withValue("nvrk")
                .withProperties(mapOf("ixqtn", "uaibrebqaaysj"));
        model = BinaryData.fromObject(model).toObject(SignalRFeature.class);
        Assertions.assertEquals(FeatureFlags.ENABLE_LIVE_TRACE, model.flag());
        Assertions.assertEquals("nvrk", model.value());
        Assertions.assertEquals("uaibrebqaaysj", model.properties().get("ixqtn"));
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
