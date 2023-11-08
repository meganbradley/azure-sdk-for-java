// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner;
import com.azure.resourcemanager.netapp.models.BackupPoliciesList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPoliciesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPoliciesList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"etag\":\"ofncckwyfzqwhxxb\",\"properties\":{\"backupPolicyId\":\"qa\",\"provisioningState\":\"feqztppriol\",\"dailyBackupsToKeep\":621148688,\"weeklyBackupsToKeep\":1270431726,\"monthlyBackupsToKeep\":929982715,\"volumesAssigned\":1321856720,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"obqwcsdbnwdcfh\",\"backupsCount\":1589501712,\"policyEnabled\":true},{\"volumeName\":\"uvglsbjjcanvx\",\"backupsCount\":235845887,\"policyEnabled\":false},{\"volumeName\":\"utncorm\",\"backupsCount\":1945766703,\"policyEnabled\":false}]},\"location\":\"cofudflvkgjub\",\"tags\":{\"nqntorudsgsahm\":\"nnqvsa\",\"rauwjuetaebu\":\"yc\",\"dmovsm\":\"u\"},\"id\":\"l\",\"name\":\"wabm\",\"type\":\"oefki\"}]}")
                .toObject(BackupPoliciesList.class);
        Assertions.assertEquals("cofudflvkgjub", model.value().get(0).location());
        Assertions.assertEquals("nnqvsa", model.value().get(0).tags().get("nqntorudsgsahm"));
        Assertions.assertEquals(621148688, model.value().get(0).dailyBackupsToKeep());
        Assertions.assertEquals(1270431726, model.value().get(0).weeklyBackupsToKeep());
        Assertions.assertEquals(929982715, model.value().get(0).monthlyBackupsToKeep());
        Assertions.assertEquals(false, model.value().get(0).enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPoliciesList model =
            new BackupPoliciesList()
                .withValue(
                    Arrays
                        .asList(
                            new BackupPolicyInner()
                                .withLocation("cofudflvkgjub")
                                .withTags(mapOf("nqntorudsgsahm", "nnqvsa", "rauwjuetaebu", "yc", "dmovsm", "u"))
                                .withDailyBackupsToKeep(621148688)
                                .withWeeklyBackupsToKeep(1270431726)
                                .withMonthlyBackupsToKeep(929982715)
                                .withEnabled(false)));
        model = BinaryData.fromObject(model).toObject(BackupPoliciesList.class);
        Assertions.assertEquals("cofudflvkgjub", model.value().get(0).location());
        Assertions.assertEquals("nnqvsa", model.value().get(0).tags().get("nqntorudsgsahm"));
        Assertions.assertEquals(621148688, model.value().get(0).dailyBackupsToKeep());
        Assertions.assertEquals(1270431726, model.value().get(0).weeklyBackupsToKeep());
        Assertions.assertEquals(929982715, model.value().get(0).monthlyBackupsToKeep());
        Assertions.assertEquals(false, model.value().get(0).enabled());
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
