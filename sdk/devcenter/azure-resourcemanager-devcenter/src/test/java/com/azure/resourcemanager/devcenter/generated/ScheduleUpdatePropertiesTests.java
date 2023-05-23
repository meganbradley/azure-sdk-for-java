// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ScheduleUpdateProperties;
import com.azure.resourcemanager.devcenter.models.ScheduleEnableStatus;
import com.azure.resourcemanager.devcenter.models.ScheduledFrequency;
import com.azure.resourcemanager.devcenter.models.ScheduledType;
import org.junit.jupiter.api.Assertions;

public final class ScheduleUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleUpdateProperties model =
            BinaryData
                .fromString(
                    "{\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"jkniodko\",\"timeZone\":\"bw\",\"state\":\"Enabled\"}")
                .toObject(ScheduleUpdateProperties.class);
        Assertions.assertEquals(ScheduledType.STOP_DEV_BOX, model.type());
        Assertions.assertEquals(ScheduledFrequency.DAILY, model.frequency());
        Assertions.assertEquals("jkniodko", model.time());
        Assertions.assertEquals("bw", model.timeZone());
        Assertions.assertEquals(ScheduleEnableStatus.ENABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleUpdateProperties model =
            new ScheduleUpdateProperties()
                .withType(ScheduledType.STOP_DEV_BOX)
                .withFrequency(ScheduledFrequency.DAILY)
                .withTime("jkniodko")
                .withTimeZone("bw")
                .withState(ScheduleEnableStatus.ENABLED);
        model = BinaryData.fromObject(model).toObject(ScheduleUpdateProperties.class);
        Assertions.assertEquals(ScheduledType.STOP_DEV_BOX, model.type());
        Assertions.assertEquals(ScheduledFrequency.DAILY, model.frequency());
        Assertions.assertEquals("jkniodko", model.time());
        Assertions.assertEquals("bw", model.timeZone());
        Assertions.assertEquals(ScheduleEnableStatus.ENABLED, model.state());
    }
}
