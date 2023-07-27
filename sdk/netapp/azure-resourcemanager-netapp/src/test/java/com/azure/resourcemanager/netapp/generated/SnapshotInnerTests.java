// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import org.junit.jupiter.api.Assertions;

public final class SnapshotInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"afcnih\",\"properties\":{\"snapshotId\":\"apnedgfbcvkc\",\"created\":\"2021-06-29T16:35:56Z\",\"provisioningState\":\"keqdcvdrhvoods\"},\"id\":\"tbobz\",\"name\":\"opcjwvnhd\",\"type\":\"d\"}")
                .toObject(SnapshotInner.class);
        Assertions.assertEquals("afcnih", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotInner model = new SnapshotInner().withLocation("afcnih");
        model = BinaryData.fromObject(model).toObject(SnapshotInner.class);
        Assertions.assertEquals("afcnih", model.location());
    }
}
