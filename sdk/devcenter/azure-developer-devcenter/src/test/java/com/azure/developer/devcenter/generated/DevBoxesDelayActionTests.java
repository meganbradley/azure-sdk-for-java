// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DevBoxesDelayActionTests extends DevCenterClientTestBase {
    @Test
    public void testDevBoxesDelayActionTests() {
        createDevBox();

        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
            devBoxesClient.delayActionWithResponse(
                projectName, "me", DevBoxName, "schedule-default", OffsetDateTime.parse("2023-05-06T05:00:00Z"), requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("schedule-default", response.getValue().toObject(LinkedHashMap.class).get("name"));
        deleteDevBox();
    }
}
