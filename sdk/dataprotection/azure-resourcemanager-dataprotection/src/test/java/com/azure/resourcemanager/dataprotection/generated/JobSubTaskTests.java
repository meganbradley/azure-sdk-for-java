// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.JobSubTask;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class JobSubTaskTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobSubTask model =
            BinaryData
                .fromString(
                    "{\"additionalDetails\":{\"bexilzznfqqnv\":\"fbjfdtwssotftpvj\",\"ujmkcjhwqy\":\"pmqtaru\"},\"taskId\":1656357002,\"taskName\":\"r\",\"taskProgress\":\"n\",\"taskStatus\":\"jewgdrjerv\"}")
                .toObject(JobSubTask.class);
        Assertions.assertEquals("fbjfdtwssotftpvj", model.additionalDetails().get("bexilzznfqqnv"));
        Assertions.assertEquals(1656357002, model.taskId());
        Assertions.assertEquals("r", model.taskName());
        Assertions.assertEquals("jewgdrjerv", model.taskStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobSubTask model =
            new JobSubTask()
                .withAdditionalDetails(mapOf("bexilzznfqqnv", "fbjfdtwssotftpvj", "ujmkcjhwqy", "pmqtaru"))
                .withTaskId(1656357002)
                .withTaskName("r")
                .withTaskStatus("jewgdrjerv");
        model = BinaryData.fromObject(model).toObject(JobSubTask.class);
        Assertions.assertEquals("fbjfdtwssotftpvj", model.additionalDetails().get("bexilzznfqqnv"));
        Assertions.assertEquals(1656357002, model.taskId());
        Assertions.assertEquals("r", model.taskName());
        Assertions.assertEquals("jewgdrjerv", model.taskStatus());
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
