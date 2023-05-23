// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.ScheduleListResult;

public final class ScheduleListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"RolloutInProgress\",\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"jpxac\",\"timeZone\":\"udfnbyxba\",\"state\":\"Enabled\"},\"id\":\"yvayffimrzr\",\"name\":\"uzqogsexnevf\",\"type\":\"nwnwme\"}],\"nextLink\":\"syyceuzsoibjud\"}")
                .toObject(ScheduleListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleListResult model = new ScheduleListResult();
        model = BinaryData.fromObject(model).toObject(ScheduleListResult.class);
    }
}
