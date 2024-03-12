// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.astro.models.LiftrBaseUserDetailsUpdate;
import org.junit.jupiter.api.Assertions;

public final class LiftrBaseUserDetailsUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiftrBaseUserDetailsUpdate model = BinaryData.fromString(
            "{\"firstName\":\"bonqvpkvlrxnjeas\",\"lastName\":\"pheoflokeyy\",\"emailAddress\":\"nj\",\"upn\":\"lwtgrhpdj\",\"phoneNumber\":\"umasxazjpq\"}")
            .toObject(LiftrBaseUserDetailsUpdate.class);
        Assertions.assertEquals("bonqvpkvlrxnjeas", model.firstName());
        Assertions.assertEquals("pheoflokeyy", model.lastName());
        Assertions.assertEquals("nj", model.emailAddress());
        Assertions.assertEquals("lwtgrhpdj", model.upn());
        Assertions.assertEquals("umasxazjpq", model.phoneNumber());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiftrBaseUserDetailsUpdate model = new LiftrBaseUserDetailsUpdate().withFirstName("bonqvpkvlrxnjeas")
            .withLastName("pheoflokeyy").withEmailAddress("nj").withUpn("lwtgrhpdj").withPhoneNumber("umasxazjpq");
        model = BinaryData.fromObject(model).toObject(LiftrBaseUserDetailsUpdate.class);
        Assertions.assertEquals("bonqvpkvlrxnjeas", model.firstName());
        Assertions.assertEquals("pheoflokeyy", model.lastName());
        Assertions.assertEquals("nj", model.emailAddress());
        Assertions.assertEquals("lwtgrhpdj", model.upn());
        Assertions.assertEquals("umasxazjpq", model.phoneNumber());
    }
}
