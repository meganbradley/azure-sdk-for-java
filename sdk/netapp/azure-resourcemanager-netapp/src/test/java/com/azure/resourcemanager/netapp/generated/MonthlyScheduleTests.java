// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import org.junit.jupiter.api.Assertions;

public final class MonthlyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonthlySchedule model = BinaryData.fromString(
            "{\"snapshotsToKeep\":1895840108,\"daysOfMonth\":\"efkdlf\",\"hour\":1731932488,\"minute\":1662630957,\"usedBytes\":2710412149295788675}")
            .toObject(MonthlySchedule.class);
        Assertions.assertEquals(1895840108, model.snapshotsToKeep());
        Assertions.assertEquals("efkdlf", model.daysOfMonth());
        Assertions.assertEquals(1731932488, model.hour());
        Assertions.assertEquals(1662630957, model.minute());
        Assertions.assertEquals(2710412149295788675L, model.usedBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonthlySchedule model = new MonthlySchedule().withSnapshotsToKeep(1895840108).withDaysOfMonth("efkdlf")
            .withHour(1731932488).withMinute(1662630957).withUsedBytes(2710412149295788675L);
        model = BinaryData.fromObject(model).toObject(MonthlySchedule.class);
        Assertions.assertEquals(1895840108, model.snapshotsToKeep());
        Assertions.assertEquals("efkdlf", model.daysOfMonth());
        Assertions.assertEquals(1731932488, model.hour());
        Assertions.assertEquals(1662630957, model.minute());
        Assertions.assertEquals(2710412149295788675L, model.usedBytes());
    }
}
