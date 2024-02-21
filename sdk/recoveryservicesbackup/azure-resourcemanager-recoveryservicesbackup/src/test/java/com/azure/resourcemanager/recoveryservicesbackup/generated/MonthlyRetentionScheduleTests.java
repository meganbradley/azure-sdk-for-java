// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.Day;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthlyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionScheduleFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonthlyRetentionScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonthlyRetentionSchedule model = BinaryData.fromString(
            "{\"retentionScheduleFormatType\":\"Daily\",\"retentionScheduleDaily\":{\"daysOfTheMonth\":[{\"date\":2113184337,\"isLast\":false},{\"date\":91671580,\"isLast\":true},{\"date\":411873796,\"isLast\":false},{\"date\":874456434,\"isLast\":true}]},\"retentionScheduleWeekly\":{\"daysOfTheWeek\":[\"Tuesday\",\"Sunday\",\"Wednesday\"],\"weeksOfTheMonth\":[\"Fourth\",\"Invalid\",\"Third\"]},\"retentionTimes\":[\"2021-07-09T05:26:43Z\",\"2021-09-17T21:14:53Z\",\"2021-11-27T20:43:51Z\",\"2021-06-19T19:27:32Z\"],\"retentionDuration\":{\"count\":1842824093,\"durationType\":\"Days\"}}")
            .toObject(MonthlyRetentionSchedule.class);
        Assertions.assertEquals(RetentionScheduleFormat.DAILY, model.retentionScheduleFormatType());
        Assertions.assertEquals(2113184337, model.retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.FOURTH, model.retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-09T05:26:43Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(1842824093, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.DAYS, model.retentionDuration().durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonthlyRetentionSchedule model
            = new MonthlyRetentionSchedule().withRetentionScheduleFormatType(RetentionScheduleFormat.DAILY)
                .withRetentionScheduleDaily(new DailyRetentionFormat().withDaysOfTheMonth(Arrays.asList(
                    new Day().withDate(2113184337).withIsLast(false), new Day().withDate(91671580).withIsLast(true),
                    new Day().withDate(411873796).withIsLast(false), new Day().withDate(874456434).withIsLast(true))))
                .withRetentionScheduleWeekly(new WeeklyRetentionFormat()
                    .withDaysOfTheWeek(Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.SUNDAY, DayOfWeek.WEDNESDAY))
                    .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.FOURTH, WeekOfMonth.INVALID, WeekOfMonth.THIRD)))
                .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-07-09T05:26:43Z"),
                    OffsetDateTime.parse("2021-09-17T21:14:53Z"), OffsetDateTime.parse("2021-11-27T20:43:51Z"),
                    OffsetDateTime.parse("2021-06-19T19:27:32Z")))
                .withRetentionDuration(
                    new RetentionDuration().withCount(1842824093).withDurationType(RetentionDurationType.DAYS));
        model = BinaryData.fromObject(model).toObject(MonthlyRetentionSchedule.class);
        Assertions.assertEquals(RetentionScheduleFormat.DAILY, model.retentionScheduleFormatType());
        Assertions.assertEquals(2113184337, model.retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.FOURTH, model.retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-09T05:26:43Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(1842824093, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.DAYS, model.retentionDuration().durationType());
    }
}
