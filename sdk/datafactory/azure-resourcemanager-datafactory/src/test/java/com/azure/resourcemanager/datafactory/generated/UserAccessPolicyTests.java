// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.UserAccessPolicy;
import org.junit.jupiter.api.Assertions;

public final class UserAccessPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserAccessPolicy model = BinaryData.fromString(
            "{\"permissions\":\"fkbey\",\"accessResourcePath\":\"wrmjmwvvjektc\",\"profileName\":\"enhwlrs\",\"startTime\":\"rzpwvlqdqgbiq\",\"expireTime\":\"ihkaetcktvfc\"}")
            .toObject(UserAccessPolicy.class);
        Assertions.assertEquals("fkbey", model.permissions());
        Assertions.assertEquals("wrmjmwvvjektc", model.accessResourcePath());
        Assertions.assertEquals("enhwlrs", model.profileName());
        Assertions.assertEquals("rzpwvlqdqgbiq", model.startTime());
        Assertions.assertEquals("ihkaetcktvfc", model.expireTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserAccessPolicy model = new UserAccessPolicy().withPermissions("fkbey")
            .withAccessResourcePath("wrmjmwvvjektc")
            .withProfileName("enhwlrs")
            .withStartTime("rzpwvlqdqgbiq")
            .withExpireTime("ihkaetcktvfc");
        model = BinaryData.fromObject(model).toObject(UserAccessPolicy.class);
        Assertions.assertEquals("fkbey", model.permissions());
        Assertions.assertEquals("wrmjmwvvjektc", model.accessResourcePath());
        Assertions.assertEquals("enhwlrs", model.profileName());
        Assertions.assertEquals("rzpwvlqdqgbiq", model.startTime());
        Assertions.assertEquals("ihkaetcktvfc", model.expireTime());
    }
}
