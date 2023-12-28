// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RenewCertificateInputProperties;
import org.junit.jupiter.api.Assertions;

public final class RenewCertificateInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RenewCertificateInputProperties model =
            BinaryData.fromString("{\"renewCertificateType\":\"glu\"}").toObject(RenewCertificateInputProperties.class);
        Assertions.assertEquals("glu", model.renewCertificateType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RenewCertificateInputProperties model = new RenewCertificateInputProperties().withRenewCertificateType("glu");
        model = BinaryData.fromObject(model).toObject(RenewCertificateInputProperties.class);
        Assertions.assertEquals("glu", model.renewCertificateType());
    }
}
