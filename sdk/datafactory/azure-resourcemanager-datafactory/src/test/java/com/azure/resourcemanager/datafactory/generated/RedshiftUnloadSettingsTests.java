// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.RedshiftUnloadSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RedshiftUnloadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RedshiftUnloadSettings model = BinaryData.fromString(
            "{\"s3LinkedServiceName\":{\"referenceName\":\"xcyai\",\"parameters\":{\"ssuuzfrwmct\":\"datatrdbtrkvluu\",\"c\":\"datangj\"}},\"bucketName\":\"datasfbkrtpu\"}")
            .toObject(RedshiftUnloadSettings.class);
        Assertions.assertEquals("xcyai", model.s3LinkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RedshiftUnloadSettings model = new RedshiftUnloadSettings()
            .withS3LinkedServiceName(new LinkedServiceReference().withReferenceName("xcyai")
                .withParameters(mapOf("ssuuzfrwmct", "datatrdbtrkvluu", "c", "datangj")))
            .withBucketName("datasfbkrtpu");
        model = BinaryData.fromObject(model).toObject(RedshiftUnloadSettings.class);
        Assertions.assertEquals("xcyai", model.s3LinkedServiceName().referenceName());
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
