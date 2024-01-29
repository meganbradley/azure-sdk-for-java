// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.ExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.ExtendedLocationTypes;
import org.junit.jupiter.api.Assertions;

public final class ExtendedLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtendedLocation model
            = BinaryData.fromString("{\"type\":\"CustomLocation\",\"name\":\"f\"}").toObject(ExtendedLocation.class);
        Assertions.assertEquals(ExtendedLocationTypes.CUSTOM_LOCATION, model.type());
        Assertions.assertEquals("f", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtendedLocation model = new ExtendedLocation().withType(ExtendedLocationTypes.CUSTOM_LOCATION).withName("f");
        model = BinaryData.fromObject(model).toObject(ExtendedLocation.class);
        Assertions.assertEquals(ExtendedLocationTypes.CUSTOM_LOCATION, model.type());
        Assertions.assertEquals("f", model.name());
    }
}
