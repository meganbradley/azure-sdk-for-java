// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.TypeReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public final class DevBoxesGetScheduleByPoolTests extends DevCenterClientTestBase {
    @Test
    public void testDevBoxesGetScheduleByPoolTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                devBoxesClient.getScheduleWithResponse(projectName, poolName, "default", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());

        Map<String, Object> poolData = response.getValue().toObject(new TypeReference<Map<String, Object>>() {});
        Assertions.assertEquals("default", poolData.get("name"));
    }
}
