// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.PolicyType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SubProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringPolicy;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SubProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubProtectionPolicy model =
            BinaryData
                .fromString(
                    "{\"policyType\":\"Incremental\",\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"tieringPolicy\":{\"czheyd\":{\"tieringMode\":\"TierRecommended\",\"duration\":201456733,\"durationType\":\"Days\"}}}")
                .toObject(SubProtectionPolicy.class);
        Assertions.assertEquals(PolicyType.INCREMENTAL, model.policyType());
        Assertions.assertEquals(TieringMode.TIER_RECOMMENDED, model.tieringPolicy().get("czheyd").tieringMode());
        Assertions.assertEquals(201456733, model.tieringPolicy().get("czheyd").duration());
        Assertions.assertEquals(RetentionDurationType.DAYS, model.tieringPolicy().get("czheyd").durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubProtectionPolicy model =
            new SubProtectionPolicy()
                .withPolicyType(PolicyType.INCREMENTAL)
                .withSchedulePolicy(new SchedulePolicy())
                .withRetentionPolicy(new RetentionPolicy())
                .withTieringPolicy(
                    mapOf(
                        "czheyd",
                        new TieringPolicy()
                            .withTieringMode(TieringMode.TIER_RECOMMENDED)
                            .withDuration(201456733)
                            .withDurationType(RetentionDurationType.DAYS)));
        model = BinaryData.fromObject(model).toObject(SubProtectionPolicy.class);
        Assertions.assertEquals(PolicyType.INCREMENTAL, model.policyType());
        Assertions.assertEquals(TieringMode.TIER_RECOMMENDED, model.tieringPolicy().get("czheyd").tieringMode());
        Assertions.assertEquals(201456733, model.tieringPolicy().get("czheyd").duration());
        Assertions.assertEquals(RetentionDurationType.DAYS, model.tieringPolicy().get("czheyd").durationType());
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
