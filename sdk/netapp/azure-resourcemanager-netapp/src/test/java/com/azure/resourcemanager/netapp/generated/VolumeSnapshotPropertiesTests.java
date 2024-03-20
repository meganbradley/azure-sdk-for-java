// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.VolumeSnapshotProperties;
import org.junit.jupiter.api.Assertions;

public final class VolumeSnapshotPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeSnapshotProperties model
            = BinaryData.fromString("{\"snapshotPolicyId\":\"p\"}").toObject(VolumeSnapshotProperties.class);
        Assertions.assertEquals("p", model.snapshotPolicyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeSnapshotProperties model = new VolumeSnapshotProperties().withSnapshotPolicyId("p");
        model = BinaryData.fromObject(model).toObject(VolumeSnapshotProperties.class);
        Assertions.assertEquals("p", model.snapshotPolicyId());
    }
}
