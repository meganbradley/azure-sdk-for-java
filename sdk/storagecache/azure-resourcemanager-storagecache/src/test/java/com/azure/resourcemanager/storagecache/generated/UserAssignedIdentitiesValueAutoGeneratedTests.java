// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.UserAssignedIdentitiesValueAutoGenerated;

public final class UserAssignedIdentitiesValueAutoGeneratedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserAssignedIdentitiesValueAutoGenerated model
            = BinaryData.fromString("{\"principalId\":\"nbbelda\",\"clientId\":\"zbaliourqha\"}")
                .toObject(UserAssignedIdentitiesValueAutoGenerated.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserAssignedIdentitiesValueAutoGenerated model = new UserAssignedIdentitiesValueAutoGenerated();
        model = BinaryData.fromObject(model).toObject(UserAssignedIdentitiesValueAutoGenerated.class);
    }
}
