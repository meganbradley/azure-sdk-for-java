// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPersonalSchedulePatch;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHandlingOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SetStartVMOnConnect;
import com.azure.resourcemanager.desktopvirtualization.models.StartupBehavior;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScalingPlanPersonalSchedulePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPlanPersonalSchedulePatch model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"daysOfWeek\":[\"Wednesday\",\"Tuesday\"],\"rampUpStartTime\":{\"hour\":256415791,\"minute\":1905459835},\"rampUpAutoStartHosts\":\"All\",\"rampUpStartVMOnConnect\":\"Enable\",\"rampUpActionOnDisconnect\":\"Hibernate\",\"rampUpMinutesToWaitOnDisconnect\":258725864,\"rampUpActionOnLogoff\":\"Hibernate\",\"rampUpMinutesToWaitOnLogoff\":1042702068,\"peakStartTime\":{\"hour\":1688847935,\"minute\":1314959549},\"peakStartVMOnConnect\":\"Disable\",\"peakActionOnDisconnect\":\"Hibernate\",\"peakMinutesToWaitOnDisconnect\":928593835,\"peakActionOnLogoff\":\"Hibernate\",\"peakMinutesToWaitOnLogoff\":2022160914,\"rampDownStartTime\":{\"hour\":1631327314,\"minute\":1757404890},\"rampDownStartVMOnConnect\":\"Enable\",\"rampDownActionOnDisconnect\":\"None\",\"rampDownMinutesToWaitOnDisconnect\":43385515,\"rampDownActionOnLogoff\":\"Hibernate\",\"rampDownMinutesToWaitOnLogoff\":928990245,\"offPeakStartTime\":{\"hour\":1261594790,\"minute\":1493412527},\"offPeakStartVMOnConnect\":\"Disable\",\"offPeakActionOnDisconnect\":\"Deallocate\",\"offPeakMinutesToWaitOnDisconnect\":1076611714,\"offPeakActionOnLogoff\":\"Deallocate\",\"offPeakMinutesToWaitOnLogoff\":76309450}}")
                .toObject(ScalingPlanPersonalSchedulePatch.class);
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(256415791, model.rampUpStartTime().hour());
        Assertions.assertEquals(1905459835, model.rampUpStartTime().minute());
        Assertions.assertEquals(StartupBehavior.ALL, model.rampUpAutoStartHosts());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampUpStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampUpActionOnDisconnect());
        Assertions.assertEquals(258725864, model.rampUpMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampUpActionOnLogoff());
        Assertions.assertEquals(1042702068, model.rampUpMinutesToWaitOnLogoff());
        Assertions.assertEquals(1688847935, model.peakStartTime().hour());
        Assertions.assertEquals(1314959549, model.peakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, model.peakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.peakActionOnDisconnect());
        Assertions.assertEquals(928593835, model.peakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.peakActionOnLogoff());
        Assertions.assertEquals(2022160914, model.peakMinutesToWaitOnLogoff());
        Assertions.assertEquals(1631327314, model.rampDownStartTime().hour());
        Assertions.assertEquals(1757404890, model.rampDownStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampDownStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.rampDownActionOnDisconnect());
        Assertions.assertEquals(43385515, model.rampDownMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampDownActionOnLogoff());
        Assertions.assertEquals(928990245, model.rampDownMinutesToWaitOnLogoff());
        Assertions.assertEquals(1261594790, model.offPeakStartTime().hour());
        Assertions.assertEquals(1493412527, model.offPeakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, model.offPeakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.offPeakActionOnDisconnect());
        Assertions.assertEquals(1076611714, model.offPeakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.offPeakActionOnLogoff());
        Assertions.assertEquals(76309450, model.offPeakMinutesToWaitOnLogoff());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPlanPersonalSchedulePatch model =
            new ScalingPlanPersonalSchedulePatch()
                .withDaysOfWeek(Arrays.asList(DayOfWeek.WEDNESDAY, DayOfWeek.TUESDAY))
                .withRampUpStartTime(new Time().withHour(256415791).withMinute(1905459835))
                .withRampUpAutoStartHosts(StartupBehavior.ALL)
                .withRampUpStartVMOnConnect(SetStartVMOnConnect.ENABLE)
                .withRampUpActionOnDisconnect(SessionHandlingOperation.HIBERNATE)
                .withRampUpMinutesToWaitOnDisconnect(258725864)
                .withRampUpActionOnLogoff(SessionHandlingOperation.HIBERNATE)
                .withRampUpMinutesToWaitOnLogoff(1042702068)
                .withPeakStartTime(new Time().withHour(1688847935).withMinute(1314959549))
                .withPeakStartVMOnConnect(SetStartVMOnConnect.DISABLE)
                .withPeakActionOnDisconnect(SessionHandlingOperation.HIBERNATE)
                .withPeakMinutesToWaitOnDisconnect(928593835)
                .withPeakActionOnLogoff(SessionHandlingOperation.HIBERNATE)
                .withPeakMinutesToWaitOnLogoff(2022160914)
                .withRampDownStartTime(new Time().withHour(1631327314).withMinute(1757404890))
                .withRampDownStartVMOnConnect(SetStartVMOnConnect.ENABLE)
                .withRampDownActionOnDisconnect(SessionHandlingOperation.NONE)
                .withRampDownMinutesToWaitOnDisconnect(43385515)
                .withRampDownActionOnLogoff(SessionHandlingOperation.HIBERNATE)
                .withRampDownMinutesToWaitOnLogoff(928990245)
                .withOffPeakStartTime(new Time().withHour(1261594790).withMinute(1493412527))
                .withOffPeakStartVMOnConnect(SetStartVMOnConnect.DISABLE)
                .withOffPeakActionOnDisconnect(SessionHandlingOperation.DEALLOCATE)
                .withOffPeakMinutesToWaitOnDisconnect(1076611714)
                .withOffPeakActionOnLogoff(SessionHandlingOperation.DEALLOCATE)
                .withOffPeakMinutesToWaitOnLogoff(76309450);
        model = BinaryData.fromObject(model).toObject(ScalingPlanPersonalSchedulePatch.class);
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(256415791, model.rampUpStartTime().hour());
        Assertions.assertEquals(1905459835, model.rampUpStartTime().minute());
        Assertions.assertEquals(StartupBehavior.ALL, model.rampUpAutoStartHosts());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampUpStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampUpActionOnDisconnect());
        Assertions.assertEquals(258725864, model.rampUpMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampUpActionOnLogoff());
        Assertions.assertEquals(1042702068, model.rampUpMinutesToWaitOnLogoff());
        Assertions.assertEquals(1688847935, model.peakStartTime().hour());
        Assertions.assertEquals(1314959549, model.peakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, model.peakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.peakActionOnDisconnect());
        Assertions.assertEquals(928593835, model.peakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.peakActionOnLogoff());
        Assertions.assertEquals(2022160914, model.peakMinutesToWaitOnLogoff());
        Assertions.assertEquals(1631327314, model.rampDownStartTime().hour());
        Assertions.assertEquals(1757404890, model.rampDownStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampDownStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.rampDownActionOnDisconnect());
        Assertions.assertEquals(43385515, model.rampDownMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampDownActionOnLogoff());
        Assertions.assertEquals(928990245, model.rampDownMinutesToWaitOnLogoff());
        Assertions.assertEquals(1261594790, model.offPeakStartTime().hour());
        Assertions.assertEquals(1493412527, model.offPeakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, model.offPeakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.offPeakActionOnDisconnect());
        Assertions.assertEquals(1076611714, model.offPeakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.offPeakActionOnLogoff());
        Assertions.assertEquals(76309450, model.offPeakMinutesToWaitOnLogoff());
    }
}
