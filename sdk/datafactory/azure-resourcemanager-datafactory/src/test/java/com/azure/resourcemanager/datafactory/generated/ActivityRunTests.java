// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityRun;
import java.util.HashMap;
import java.util.Map;

public final class ActivityRunTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActivityRun model = BinaryData.fromString(
            "{\"pipelineName\":\"xvd\",\"pipelineRunId\":\"fwafqrouda\",\"activityName\":\"avehhrvkbunzo\",\"activityType\":\"dhcxgkmoy\",\"activityRunId\":\"dyuib\",\"linkedServiceName\":\"fdn\",\"status\":\"ydvfvfcjnae\",\"activityRunStart\":\"2020-12-25T22:41:16Z\",\"activityRunEnd\":\"2021-04-06T16:13:31Z\",\"durationInMs\":716191050,\"input\":\"dataorffukiscv\",\"output\":\"datazhwplefaxvxilc\",\"error\":\"datagnhnzeyq\",\"\":{\"dbeesmie\":\"datajfzqlqhycavodgg\",\"wqfbylyrfgiagt\":\"datanlrariaawiuagy\",\"zjvusfzldmo\":\"dataojocqwogf\",\"own\":\"datauxylfsbtkadpy\"}}")
            .toObject(ActivityRun.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ActivityRun model = new ActivityRun().withAdditionalProperties(
            mapOf("durationInMs", 716191050, "linkedServiceName", "fdn", "activityRunStart", "2020-12-25T22:41:16Z",
                "activityRunEnd", "2021-04-06T16:13:31Z", "activityName", "avehhrvkbunzo", "error", "datagnhnzeyq",
                "pipelineName", "xvd", "output", "datazhwplefaxvxilc", "activityRunId", "dyuib", "input",
                "dataorffukiscv", "pipelineRunId", "fwafqrouda", "activityType", "dhcxgkmoy", "status", "ydvfvfcjnae"));
        model = BinaryData.fromObject(model).toObject(ActivityRun.class);
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
