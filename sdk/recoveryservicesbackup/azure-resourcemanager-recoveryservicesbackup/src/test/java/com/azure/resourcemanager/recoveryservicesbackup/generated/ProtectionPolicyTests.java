// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectionPolicy model = BinaryData.fromString(
            "{\"backupManagementType\":\"ProtectionPolicy\",\"protectedItemsCount\":624396177,\"resourceGuardOperationRequests\":[\"eojnabc\"]}")
            .toObject(ProtectionPolicy.class);
        Assertions.assertEquals(624396177, model.protectedItemsCount());
        Assertions.assertEquals("eojnabc", model.resourceGuardOperationRequests().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectionPolicy model = new ProtectionPolicy().withProtectedItemsCount(624396177)
            .withResourceGuardOperationRequests(Arrays.asList("eojnabc"));
        model = BinaryData.fromObject(model).toObject(ProtectionPolicy.class);
        Assertions.assertEquals(624396177, model.protectedItemsCount());
        Assertions.assertEquals("eojnabc", model.resourceGuardOperationRequests().get(0));
    }
}
