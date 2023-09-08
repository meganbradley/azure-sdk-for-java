// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.NameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class NameAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameAvailabilityRequest model =
            BinaryData.fromString("{\"name\":\"fvm\"}").toObject(NameAvailabilityRequest.class);
        Assertions.assertEquals("fvm", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameAvailabilityRequest model = new NameAvailabilityRequest().withName("fvm");
        model = BinaryData.fromObject(model).toObject(NameAvailabilityRequest.class);
        Assertions.assertEquals("fvm", model.name());
    }
}
