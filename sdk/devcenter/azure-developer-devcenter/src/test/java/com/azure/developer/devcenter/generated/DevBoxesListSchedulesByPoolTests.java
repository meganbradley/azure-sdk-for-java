// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.TypeReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public final class DevBoxesListSchedulesByPoolTests extends DevCenterClientTestBase {
    @Test
    public void testDevBoxesListSchedulesByPoolTests() {
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = devBoxesClient.listSchedules(projectName, poolName, requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());

        Map<String, Object> poolData = response.iterator().next().toObject(new TypeReference<Map<String, Object>>() {});
        Assertions.assertEquals("default", poolData.get("name"));
    }
}
