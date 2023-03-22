// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.BackupPolicyPatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPolicyPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPolicyPatch model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"backupPolicyId\":\"lt\",\"provisioningState\":\"cjvefkdlfo\",\"dailyBackupsToKeep\":1252976241,\"weeklyBackupsToKeep\":1706699033,\"monthlyBackupsToKeep\":1236120195,\"volumesAssigned\":2109908244,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"lpqblylsyxk\",\"backupsCount\":648285682,\"policyEnabled\":false},{\"volumeName\":\"r\",\"backupsCount\":1868480291,\"policyEnabled\":false},{\"volumeName\":\"sdszue\",\"backupsCount\":1236978734,\"policyEnabled\":false},{\"volumeName\":\"f\",\"backupsCount\":1389741266,\"policyEnabled\":false}]},\"location\":\"pnqi\",\"tags\":{\"wyhmlw\":\"nvkjjxdxrbuukzcl\",\"ofncckwyfzqwhxxb\":\"aztz\",\"xzfe\":\"yq\",\"mncwsobqwcsdb\":\"ztppriolxorjalto\"},\"id\":\"wdcfhucqdpfuv\",\"name\":\"lsbjjcanvxbv\",\"type\":\"vudutncor\"}")
                .toObject(BackupPolicyPatch.class);
        Assertions.assertEquals("pnqi", model.location());
        Assertions.assertEquals("nvkjjxdxrbuukzcl", model.tags().get("wyhmlw"));
        Assertions.assertEquals(1252976241, model.dailyBackupsToKeep());
        Assertions.assertEquals(1706699033, model.weeklyBackupsToKeep());
        Assertions.assertEquals(1236120195, model.monthlyBackupsToKeep());
        Assertions.assertEquals(false, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPolicyPatch model =
            new BackupPolicyPatch()
                .withLocation("pnqi")
                .withTags(
                    mapOf(
                        "wyhmlw",
                        "nvkjjxdxrbuukzcl",
                        "ofncckwyfzqwhxxb",
                        "aztz",
                        "xzfe",
                        "yq",
                        "mncwsobqwcsdb",
                        "ztppriolxorjalto"))
                .withDailyBackupsToKeep(1252976241)
                .withWeeklyBackupsToKeep(1706699033)
                .withMonthlyBackupsToKeep(1236120195)
                .withEnabled(false);
        model = BinaryData.fromObject(model).toObject(BackupPolicyPatch.class);
        Assertions.assertEquals("pnqi", model.location());
        Assertions.assertEquals("nvkjjxdxrbuukzcl", model.tags().get("wyhmlw"));
        Assertions.assertEquals(1252976241, model.dailyBackupsToKeep());
        Assertions.assertEquals(1706699033, model.weeklyBackupsToKeep());
        Assertions.assertEquals(1236120195, model.monthlyBackupsToKeep());
        Assertions.assertEquals(false, model.enabled());
    }

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
