// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMobilityServiceRequestProperties;
import org.junit.jupiter.api.Assertions;

public final class UpdateMobilityServiceRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateMobilityServiceRequestProperties model =
            BinaryData
                .fromString("{\"runAsAccountId\":\"tsttktlahbq\"}")
                .toObject(UpdateMobilityServiceRequestProperties.class);
        Assertions.assertEquals("tsttktlahbq", model.runAsAccountId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateMobilityServiceRequestProperties model =
            new UpdateMobilityServiceRequestProperties().withRunAsAccountId("tsttktlahbq");
        model = BinaryData.fromObject(model).toObject(UpdateMobilityServiceRequestProperties.class);
        Assertions.assertEquals("tsttktlahbq", model.runAsAccountId());
    }
}
