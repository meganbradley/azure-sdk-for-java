// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageAzureV2PolicyDetails;
import org.junit.jupiter.api.Assertions;

public final class InMageAzureV2PolicyDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageAzureV2PolicyDetails model = BinaryData.fromString(
            "{\"instanceType\":\"InMageAzureV2\",\"crashConsistentFrequencyInMinutes\":699440843,\"recoveryPointThresholdInMinutes\":1580992750,\"recoveryPointHistory\":893679063,\"appConsistentFrequencyInMinutes\":710111101,\"multiVmSyncStatus\":\"tlh\"}")
            .toObject(InMageAzureV2PolicyDetails.class);
        Assertions.assertEquals(699440843, model.crashConsistentFrequencyInMinutes());
        Assertions.assertEquals(1580992750, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(893679063, model.recoveryPointHistory());
        Assertions.assertEquals(710111101, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals("tlh", model.multiVmSyncStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageAzureV2PolicyDetails model
            = new InMageAzureV2PolicyDetails().withCrashConsistentFrequencyInMinutes(699440843)
                .withRecoveryPointThresholdInMinutes(1580992750).withRecoveryPointHistory(893679063)
                .withAppConsistentFrequencyInMinutes(710111101).withMultiVmSyncStatus("tlh");
        model = BinaryData.fromObject(model).toObject(InMageAzureV2PolicyDetails.class);
        Assertions.assertEquals(699440843, model.crashConsistentFrequencyInMinutes());
        Assertions.assertEquals(1580992750, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(893679063, model.recoveryPointHistory());
        Assertions.assertEquals(710111101, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals("tlh", model.multiVmSyncStatus());
    }
}
