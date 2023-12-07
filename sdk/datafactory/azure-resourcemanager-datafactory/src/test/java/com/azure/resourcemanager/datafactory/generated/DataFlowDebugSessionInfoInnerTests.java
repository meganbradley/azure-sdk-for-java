// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugSessionInfoInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataFlowDebugSessionInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowDebugSessionInfoInner model = BinaryData.fromString(
            "{\"dataFlowName\":\"bwefqsfapaqtfer\",\"computeType\":\"wexjkmfxapjwogq\",\"coreCount\":211935178,\"nodeCount\":775989398,\"integrationRuntimeName\":\"dcdab\",\"sessionId\":\"wpwyawbz\",\"startTime\":\"qbucljgkyexaoguy\",\"timeToLiveInMinutes\":166467616,\"lastActivityTime\":\"dsdaultxijjumf\",\"\":{\"nqnm\":\"dataz\",\"qdqx\":\"datajng\",\"zsvtuikzhajqgl\":\"databjwgnyfus\",\"l\":\"datafh\"}}")
            .toObject(DataFlowDebugSessionInfoInner.class);
        Assertions.assertEquals("bwefqsfapaqtfer", model.dataFlowName());
        Assertions.assertEquals("wexjkmfxapjwogq", model.computeType());
        Assertions.assertEquals(211935178, model.coreCount());
        Assertions.assertEquals(775989398, model.nodeCount());
        Assertions.assertEquals("dcdab", model.integrationRuntimeName());
        Assertions.assertEquals("wpwyawbz", model.sessionId());
        Assertions.assertEquals("qbucljgkyexaoguy", model.startTime());
        Assertions.assertEquals(166467616, model.timeToLiveInMinutes());
        Assertions.assertEquals("dsdaultxijjumf", model.lastActivityTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowDebugSessionInfoInner model
            = new DataFlowDebugSessionInfoInner().withDataFlowName("bwefqsfapaqtfer").withComputeType("wexjkmfxapjwogq")
                .withCoreCount(211935178).withNodeCount(775989398).withIntegrationRuntimeName("dcdab")
                .withSessionId("wpwyawbz").withStartTime("qbucljgkyexaoguy").withTimeToLiveInMinutes(166467616)
                .withLastActivityTime("dsdaultxijjumf").withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(DataFlowDebugSessionInfoInner.class);
        Assertions.assertEquals("bwefqsfapaqtfer", model.dataFlowName());
        Assertions.assertEquals("wexjkmfxapjwogq", model.computeType());
        Assertions.assertEquals(211935178, model.coreCount());
        Assertions.assertEquals(775989398, model.nodeCount());
        Assertions.assertEquals("dcdab", model.integrationRuntimeName());
        Assertions.assertEquals("wpwyawbz", model.sessionId());
        Assertions.assertEquals("qbucljgkyexaoguy", model.startTime());
        Assertions.assertEquals(166467616, model.timeToLiveInMinutes());
        Assertions.assertEquals("dsdaultxijjumf", model.lastActivityTime());
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
