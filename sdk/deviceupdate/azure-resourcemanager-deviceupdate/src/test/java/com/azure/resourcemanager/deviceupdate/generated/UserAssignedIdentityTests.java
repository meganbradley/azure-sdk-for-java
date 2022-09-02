// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.UserAssignedIdentity;
import org.junit.jupiter.api.Test;

public final class UserAssignedIdentityTests {
    @Test
    public void testDeserialize() {
        UserAssignedIdentity model = BinaryData.fromString("{}").toObject(UserAssignedIdentity.class);
    }

    @Test
    public void testSerialize() {
        UserAssignedIdentity model = new UserAssignedIdentity();
        model = BinaryData.fromObject(model).toObject(UserAssignedIdentity.class);
    }
}
