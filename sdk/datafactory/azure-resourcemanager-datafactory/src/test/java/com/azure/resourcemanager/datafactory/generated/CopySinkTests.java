// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CopySink;
import java.util.HashMap;
import java.util.Map;

public final class CopySinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CopySink model = BinaryData.fromString(
            "{\"type\":\"ayo\",\"writeBatchSize\":\"dataetzcxlisvqfb\",\"writeBatchTimeout\":\"dataizxp\",\"sinkRetryCount\":\"datapsaploex\",\"sinkRetryWait\":\"datamvlocd\",\"maxConcurrentConnections\":\"datahkob\",\"disableMetricsCollection\":\"datahhipn\",\"\":{\"n\":\"datadyriw\"}}")
            .toObject(CopySink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CopySink model = new CopySink().withWriteBatchSize("dataetzcxlisvqfb")
            .withWriteBatchTimeout("dataizxp")
            .withSinkRetryCount("datapsaploex")
            .withSinkRetryWait("datamvlocd")
            .withMaxConcurrentConnections("datahkob")
            .withDisableMetricsCollection("datahhipn")
            .withAdditionalProperties(mapOf("type", "ayo"));
        model = BinaryData.fromObject(model).toObject(CopySink.class);
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
