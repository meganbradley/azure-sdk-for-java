// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.NotificationChannelFragment;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NotificationChannelFragmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NotificationChannelFragment model =
            BinaryData.fromString("{\"tags\":{\"rb\":\"zuruocbgo\"}}").toObject(NotificationChannelFragment.class);
        Assertions.assertEquals("zuruocbgo", model.tags().get("rb"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NotificationChannelFragment model = new NotificationChannelFragment().withTags(mapOf("rb", "zuruocbgo"));
        model = BinaryData.fromObject(model).toObject(NotificationChannelFragment.class);
        Assertions.assertEquals("zuruocbgo", model.tags().get("rb"));
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
