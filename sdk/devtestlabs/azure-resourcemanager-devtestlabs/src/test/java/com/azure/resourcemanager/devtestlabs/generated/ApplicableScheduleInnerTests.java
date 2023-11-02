// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ApplicableScheduleInner;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devtestlabs.models.DayDetails;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.HourDetails;
import com.azure.resourcemanager.devtestlabs.models.NotificationSettings;
import com.azure.resourcemanager.devtestlabs.models.WeekDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicableScheduleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicableScheduleInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"labVmsShutdown\":{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"denxau\",\"weeklyRecurrence\":{\"weekdays\":[\"kdk\",\"fmjnnawtqa\",\"pxuckpggq\",\"wey\"],\"time\":\"dhlisngwflqqmpi\"},\"dailyRecurrence\":{\"time\":\"w\"},\"hourlyRecurrence\":{\"minute\":578532092},\"timeZoneId\":\"xiw\",\"notificationSettings\":{\"status\":\"Disabled\",\"timeInMinutes\":975807918,\"webhookUrl\":\"asi\",\"emailRecipient\":\"tmkzjvkviirhgfgr\",\"notificationLocale\":\"dpgra\"},\"createdDate\":\"2021-03-02T16:22:17Z\",\"targetResourceId\":\"bglbyvict\",\"provisioningState\":\"brxkjzwr\",\"uniqueIdentifier\":\"ffm\"},\"location\":\"hkwfbkgozxwop\",\"tags\":{\"clnapxbiygnugjkn\":\"dpizq\"},\"id\":\"smfcttuxuuyilfl\",\"name\":\"oiquvrehmrnjhvs\",\"type\":\"jztczytqj\"},\"labVmsStartup\":{\"properties\":{\"status\":\"Disabled\",\"taskType\":\"unfprnjletlxs\",\"weeklyRecurrence\":{\"weekdays\":[\"do\",\"ifamowazi\"],\"time\":\"knlqwzdvpiwhxqsz\"},\"dailyRecurrence\":{\"time\":\"aajquhuxylrj\"},\"hourlyRecurrence\":{\"minute\":1469986611},\"timeZoneId\":\"jbmzyospspsh\",\"notificationSettings\":{\"status\":\"Disabled\",\"timeInMinutes\":1546796808,\"webhookUrl\":\"mspbpssdfpp\",\"emailRecipient\":\"gt\",\"notificationLocale\":\"yujtvczkcnyx\"},\"createdDate\":\"2021-12-03T00:27:17Z\",\"targetResourceId\":\"njdxvglnkvxl\",\"provisioningState\":\"aglqivbgkcvkh\",\"uniqueIdentifier\":\"vuqd\"},\"location\":\"lvoniy\",\"tags\":{\"hjknidibg\":\"ubcpzgpxti\",\"ik\":\"jxgpnrhgovfg\",\"wjrmzvuporqzd\":\"mhha\",\"vxcnqmxqps\":\"uydzvk\"},\"id\":\"okmvkhlggd\",\"name\":\"bemzqkzszuwi\",\"type\":\"tglxx\"}},\"location\":\"ljfp\",\"tags\":{\"vpqcb\":\"crmnzhrgmqgjs\",\"s\":\"rmbodt\"},\"id\":\"qgvriibakcla\",\"name\":\"jfrnxousxauzlwv\",\"type\":\"gmwohqfzizvu\"}")
                .toObject(ApplicableScheduleInner.class);
        Assertions.assertEquals("ljfp", model.location());
        Assertions.assertEquals("crmnzhrgmqgjs", model.tags().get("vpqcb"));
        Assertions.assertEquals("hkwfbkgozxwop", model.labVmsShutdown().location());
        Assertions.assertEquals("dpizq", model.labVmsShutdown().tags().get("clnapxbiygnugjkn"));
        Assertions.assertEquals(EnableStatus.ENABLED, model.labVmsShutdown().status());
        Assertions.assertEquals("denxau", model.labVmsShutdown().taskType());
        Assertions.assertEquals("kdk", model.labVmsShutdown().weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("dhlisngwflqqmpi", model.labVmsShutdown().weeklyRecurrence().time());
        Assertions.assertEquals("w", model.labVmsShutdown().dailyRecurrence().time());
        Assertions.assertEquals(578532092, model.labVmsShutdown().hourlyRecurrence().minute());
        Assertions.assertEquals("xiw", model.labVmsShutdown().timeZoneId());
        Assertions.assertEquals(EnableStatus.DISABLED, model.labVmsShutdown().notificationSettings().status());
        Assertions.assertEquals(975807918, model.labVmsShutdown().notificationSettings().timeInMinutes());
        Assertions.assertEquals("asi", model.labVmsShutdown().notificationSettings().webhookUrl());
        Assertions.assertEquals("tmkzjvkviirhgfgr", model.labVmsShutdown().notificationSettings().emailRecipient());
        Assertions.assertEquals("dpgra", model.labVmsShutdown().notificationSettings().notificationLocale());
        Assertions.assertEquals("bglbyvict", model.labVmsShutdown().targetResourceId());
        Assertions.assertEquals("lvoniy", model.labVmsStartup().location());
        Assertions.assertEquals("ubcpzgpxti", model.labVmsStartup().tags().get("hjknidibg"));
        Assertions.assertEquals(EnableStatus.DISABLED, model.labVmsStartup().status());
        Assertions.assertEquals("unfprnjletlxs", model.labVmsStartup().taskType());
        Assertions.assertEquals("do", model.labVmsStartup().weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("knlqwzdvpiwhxqsz", model.labVmsStartup().weeklyRecurrence().time());
        Assertions.assertEquals("aajquhuxylrj", model.labVmsStartup().dailyRecurrence().time());
        Assertions.assertEquals(1469986611, model.labVmsStartup().hourlyRecurrence().minute());
        Assertions.assertEquals("jbmzyospspsh", model.labVmsStartup().timeZoneId());
        Assertions.assertEquals(EnableStatus.DISABLED, model.labVmsStartup().notificationSettings().status());
        Assertions.assertEquals(1546796808, model.labVmsStartup().notificationSettings().timeInMinutes());
        Assertions.assertEquals("mspbpssdfpp", model.labVmsStartup().notificationSettings().webhookUrl());
        Assertions.assertEquals("gt", model.labVmsStartup().notificationSettings().emailRecipient());
        Assertions.assertEquals("yujtvczkcnyx", model.labVmsStartup().notificationSettings().notificationLocale());
        Assertions.assertEquals("njdxvglnkvxl", model.labVmsStartup().targetResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicableScheduleInner model =
            new ApplicableScheduleInner()
                .withLocation("ljfp")
                .withTags(mapOf("vpqcb", "crmnzhrgmqgjs", "s", "rmbodt"))
                .withLabVmsShutdown(
                    new ScheduleInner()
                        .withLocation("hkwfbkgozxwop")
                        .withTags(mapOf("clnapxbiygnugjkn", "dpizq"))
                        .withStatus(EnableStatus.ENABLED)
                        .withTaskType("denxau")
                        .withWeeklyRecurrence(
                            new WeekDetails()
                                .withWeekdays(Arrays.asList("kdk", "fmjnnawtqa", "pxuckpggq", "wey"))
                                .withTime("dhlisngwflqqmpi"))
                        .withDailyRecurrence(new DayDetails().withTime("w"))
                        .withHourlyRecurrence(new HourDetails().withMinute(578532092))
                        .withTimeZoneId("xiw")
                        .withNotificationSettings(
                            new NotificationSettings()
                                .withStatus(EnableStatus.DISABLED)
                                .withTimeInMinutes(975807918)
                                .withWebhookUrl("asi")
                                .withEmailRecipient("tmkzjvkviirhgfgr")
                                .withNotificationLocale("dpgra"))
                        .withTargetResourceId("bglbyvict"))
                .withLabVmsStartup(
                    new ScheduleInner()
                        .withLocation("lvoniy")
                        .withTags(
                            mapOf(
                                "hjknidibg",
                                "ubcpzgpxti",
                                "ik",
                                "jxgpnrhgovfg",
                                "wjrmzvuporqzd",
                                "mhha",
                                "vxcnqmxqps",
                                "uydzvk"))
                        .withStatus(EnableStatus.DISABLED)
                        .withTaskType("unfprnjletlxs")
                        .withWeeklyRecurrence(
                            new WeekDetails()
                                .withWeekdays(Arrays.asList("do", "ifamowazi"))
                                .withTime("knlqwzdvpiwhxqsz"))
                        .withDailyRecurrence(new DayDetails().withTime("aajquhuxylrj"))
                        .withHourlyRecurrence(new HourDetails().withMinute(1469986611))
                        .withTimeZoneId("jbmzyospspsh")
                        .withNotificationSettings(
                            new NotificationSettings()
                                .withStatus(EnableStatus.DISABLED)
                                .withTimeInMinutes(1546796808)
                                .withWebhookUrl("mspbpssdfpp")
                                .withEmailRecipient("gt")
                                .withNotificationLocale("yujtvczkcnyx"))
                        .withTargetResourceId("njdxvglnkvxl"));
        model = BinaryData.fromObject(model).toObject(ApplicableScheduleInner.class);
        Assertions.assertEquals("ljfp", model.location());
        Assertions.assertEquals("crmnzhrgmqgjs", model.tags().get("vpqcb"));
        Assertions.assertEquals("hkwfbkgozxwop", model.labVmsShutdown().location());
        Assertions.assertEquals("dpizq", model.labVmsShutdown().tags().get("clnapxbiygnugjkn"));
        Assertions.assertEquals(EnableStatus.ENABLED, model.labVmsShutdown().status());
        Assertions.assertEquals("denxau", model.labVmsShutdown().taskType());
        Assertions.assertEquals("kdk", model.labVmsShutdown().weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("dhlisngwflqqmpi", model.labVmsShutdown().weeklyRecurrence().time());
        Assertions.assertEquals("w", model.labVmsShutdown().dailyRecurrence().time());
        Assertions.assertEquals(578532092, model.labVmsShutdown().hourlyRecurrence().minute());
        Assertions.assertEquals("xiw", model.labVmsShutdown().timeZoneId());
        Assertions.assertEquals(EnableStatus.DISABLED, model.labVmsShutdown().notificationSettings().status());
        Assertions.assertEquals(975807918, model.labVmsShutdown().notificationSettings().timeInMinutes());
        Assertions.assertEquals("asi", model.labVmsShutdown().notificationSettings().webhookUrl());
        Assertions.assertEquals("tmkzjvkviirhgfgr", model.labVmsShutdown().notificationSettings().emailRecipient());
        Assertions.assertEquals("dpgra", model.labVmsShutdown().notificationSettings().notificationLocale());
        Assertions.assertEquals("bglbyvict", model.labVmsShutdown().targetResourceId());
        Assertions.assertEquals("lvoniy", model.labVmsStartup().location());
        Assertions.assertEquals("ubcpzgpxti", model.labVmsStartup().tags().get("hjknidibg"));
        Assertions.assertEquals(EnableStatus.DISABLED, model.labVmsStartup().status());
        Assertions.assertEquals("unfprnjletlxs", model.labVmsStartup().taskType());
        Assertions.assertEquals("do", model.labVmsStartup().weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("knlqwzdvpiwhxqsz", model.labVmsStartup().weeklyRecurrence().time());
        Assertions.assertEquals("aajquhuxylrj", model.labVmsStartup().dailyRecurrence().time());
        Assertions.assertEquals(1469986611, model.labVmsStartup().hourlyRecurrence().minute());
        Assertions.assertEquals("jbmzyospspsh", model.labVmsStartup().timeZoneId());
        Assertions.assertEquals(EnableStatus.DISABLED, model.labVmsStartup().notificationSettings().status());
        Assertions.assertEquals(1546796808, model.labVmsStartup().notificationSettings().timeInMinutes());
        Assertions.assertEquals("mspbpssdfpp", model.labVmsStartup().notificationSettings().webhookUrl());
        Assertions.assertEquals("gt", model.labVmsStartup().notificationSettings().emailRecipient());
        Assertions.assertEquals("yujtvczkcnyx", model.labVmsStartup().notificationSettings().notificationLocale());
        Assertions.assertEquals("njdxvglnkvxl", model.labVmsStartup().targetResourceId());
    }

    // Use "Map.of" if available
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
