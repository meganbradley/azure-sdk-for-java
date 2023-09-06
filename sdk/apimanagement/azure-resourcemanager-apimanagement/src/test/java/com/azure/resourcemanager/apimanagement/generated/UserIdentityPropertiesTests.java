// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.UserIdentityProperties;
import org.junit.jupiter.api.Assertions;

public final class UserIdentityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserIdentityProperties model =
            BinaryData
                .fromString("{\"principalId\":\"m\",\"clientId\":\"scauwazcgwdfr\"}")
                .toObject(UserIdentityProperties.class);
        Assertions.assertEquals("m", model.principalId());
        Assertions.assertEquals("scauwazcgwdfr", model.clientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserIdentityProperties model = new UserIdentityProperties().withPrincipalId("m").withClientId("scauwazcgwdfr");
        model = BinaryData.fromObject(model).toObject(UserIdentityProperties.class);
        Assertions.assertEquals("m", model.principalId());
        Assertions.assertEquals("scauwazcgwdfr", model.clientId());
    }
}
