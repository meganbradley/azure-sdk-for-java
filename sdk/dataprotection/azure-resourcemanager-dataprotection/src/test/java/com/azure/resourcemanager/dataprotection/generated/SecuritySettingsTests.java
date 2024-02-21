// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ImmutabilitySettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilityState;
import com.azure.resourcemanager.dataprotection.models.SecuritySettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteSettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteState;
import org.junit.jupiter.api.Assertions;

public final class SecuritySettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecuritySettings model = BinaryData.fromString(
            "{\"softDeleteSettings\":{\"state\":\"Off\",\"retentionDurationInDays\":86.02980488274106},\"immutabilitySettings\":{\"state\":\"Unlocked\"}}")
            .toObject(SecuritySettings.class);
        Assertions.assertEquals(SoftDeleteState.OFF, model.softDeleteSettings().state());
        Assertions.assertEquals(86.02980488274106D, model.softDeleteSettings().retentionDurationInDays());
        Assertions.assertEquals(ImmutabilityState.UNLOCKED, model.immutabilitySettings().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecuritySettings model = new SecuritySettings()
            .withSoftDeleteSettings(
                new SoftDeleteSettings().withState(SoftDeleteState.OFF).withRetentionDurationInDays(86.02980488274106D))
            .withImmutabilitySettings(new ImmutabilitySettings().withState(ImmutabilityState.UNLOCKED));
        model = BinaryData.fromObject(model).toObject(SecuritySettings.class);
        Assertions.assertEquals(SoftDeleteState.OFF, model.softDeleteSettings().state());
        Assertions.assertEquals(86.02980488274106D, model.softDeleteSettings().retentionDurationInDays());
        Assertions.assertEquals(ImmutabilityState.UNLOCKED, model.immutabilitySettings().state());
    }
}
