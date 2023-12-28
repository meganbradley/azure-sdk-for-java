// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerRegistrationProperties;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class PartnerRegistrationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerRegistrationProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Updating\",\"partnerRegistrationImmutableId\":\"554e60ca-1d44-433a-afcd-22c6d5b85a71\"}")
            .toObject(PartnerRegistrationProperties.class);
        Assertions.assertEquals(UUID.fromString("554e60ca-1d44-433a-afcd-22c6d5b85a71"),
            model.partnerRegistrationImmutableId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerRegistrationProperties model = new PartnerRegistrationProperties()
            .withPartnerRegistrationImmutableId(UUID.fromString("554e60ca-1d44-433a-afcd-22c6d5b85a71"));
        model = BinaryData.fromObject(model).toObject(PartnerRegistrationProperties.class);
        Assertions.assertEquals(UUID.fromString("554e60ca-1d44-433a-afcd-22c6d5b85a71"),
            model.partnerRegistrationImmutableId());
    }
}
