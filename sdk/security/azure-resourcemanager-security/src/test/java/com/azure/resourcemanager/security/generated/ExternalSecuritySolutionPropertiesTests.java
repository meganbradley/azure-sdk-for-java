// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ConnectedWorkspace;
import com.azure.resourcemanager.security.models.ExternalSecuritySolutionProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExternalSecuritySolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExternalSecuritySolutionProperties model =
            BinaryData
                .fromString(
                    "{\"deviceVendor\":\"jc\",\"deviceType\":\"a\",\"workspace\":{\"id\":\"z\"},\"\":{\"qjf\":\"datakbnrzorpdltbqc\"}}")
                .toObject(ExternalSecuritySolutionProperties.class);
        Assertions.assertEquals("jc", model.deviceVendor());
        Assertions.assertEquals("a", model.deviceType());
        Assertions.assertEquals("z", model.workspace().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExternalSecuritySolutionProperties model =
            new ExternalSecuritySolutionProperties()
                .withDeviceVendor("jc")
                .withDeviceType("a")
                .withWorkspace(new ConnectedWorkspace().withId("z"))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(ExternalSecuritySolutionProperties.class);
        Assertions.assertEquals("jc", model.deviceVendor());
        Assertions.assertEquals("a", model.deviceType());
        Assertions.assertEquals("z", model.workspace().id());
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
