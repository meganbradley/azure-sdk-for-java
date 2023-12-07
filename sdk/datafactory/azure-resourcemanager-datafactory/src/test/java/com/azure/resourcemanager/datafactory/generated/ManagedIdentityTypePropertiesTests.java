// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedIdentityTypeProperties;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentityTypeProperties model
            = BinaryData.fromString("{\"resourceId\":\"i\"}").toObject(ManagedIdentityTypeProperties.class);
        Assertions.assertEquals("i", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentityTypeProperties model = new ManagedIdentityTypeProperties().withResourceId("i");
        model = BinaryData.fromObject(model).toObject(ManagedIdentityTypeProperties.class);
        Assertions.assertEquals("i", model.resourceId());
    }
}
