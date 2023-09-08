// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.UnhealthyReplicaInfo;
import org.junit.jupiter.api.Assertions;

public final class UnhealthyReplicaInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UnhealthyReplicaInfo model =
            BinaryData.fromString("{\"availabilityGroupName\":\"ciwwzjuqkhr\"}").toObject(UnhealthyReplicaInfo.class);
        Assertions.assertEquals("ciwwzjuqkhr", model.availabilityGroupName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UnhealthyReplicaInfo model = new UnhealthyReplicaInfo().withAvailabilityGroupName("ciwwzjuqkhr");
        model = BinaryData.fromObject(model).toObject(UnhealthyReplicaInfo.class);
        Assertions.assertEquals("ciwwzjuqkhr", model.availabilityGroupName());
    }
}
