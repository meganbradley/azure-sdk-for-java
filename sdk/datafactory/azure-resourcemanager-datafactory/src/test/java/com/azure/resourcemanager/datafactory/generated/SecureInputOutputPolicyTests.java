// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SecureInputOutputPolicy;
import org.junit.jupiter.api.Assertions;

public final class SecureInputOutputPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecureInputOutputPolicy model = BinaryData.fromString("{\"secureInput\":true,\"secureOutput\":false}")
            .toObject(SecureInputOutputPolicy.class);
        Assertions.assertEquals(true, model.secureInput());
        Assertions.assertEquals(false, model.secureOutput());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecureInputOutputPolicy model = new SecureInputOutputPolicy().withSecureInput(true).withSecureOutput(false);
        model = BinaryData.fromObject(model).toObject(SecureInputOutputPolicy.class);
        Assertions.assertEquals(true, model.secureInput());
        Assertions.assertEquals(false, model.secureOutput());
    }
}
