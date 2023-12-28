// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeReplicationInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeReplicationProviderSpecificInput;

public final class ResumeReplicationInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResumeReplicationInputProperties model =
            BinaryData
                .fromString(
                    "{\"providerSpecificDetails\":{\"instanceType\":\"ResumeReplicationProviderSpecificInput\"}}")
                .toObject(ResumeReplicationInputProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResumeReplicationInputProperties model =
            new ResumeReplicationInputProperties()
                .withProviderSpecificDetails(new ResumeReplicationProviderSpecificInput());
        model = BinaryData.fromObject(model).toObject(ResumeReplicationInputProperties.class);
    }
}
