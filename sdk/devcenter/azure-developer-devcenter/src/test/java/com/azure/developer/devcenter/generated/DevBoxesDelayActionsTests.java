// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DevBoxesDelayActionsTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testDevBoxesDelayActionsTests() {
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response =
                devBoxesClient.delayAllActions(
                        "myProject", "me", "myDevBox", OffsetDateTime.parse("2022-09-30T17:00:00Z"), requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"schedule-default\",\"action\":{\"name\":\"schedule-default\",\"actionType\":\"Stop\",\"next\":{\"scheduledTime\":\"2022-09-30T17:00:00Z\"},\"sourceId\":\"/projects/myProject/pools/myPool/schedules/default\",\"suspendedUntil\":\"2022-09-30T17:00:00Z\"},\"result\":\"Succeeded\"}")
                        .toObject(Object.class),
                response.iterator().next().toObject(Object.class));
    }
}
