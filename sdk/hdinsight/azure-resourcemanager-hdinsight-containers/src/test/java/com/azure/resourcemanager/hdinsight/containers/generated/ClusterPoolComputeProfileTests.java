// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolComputeProfile;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolComputeProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolComputeProfile model =
            BinaryData.fromString("{\"vmSize\":\"hiv\",\"count\":1846033}").toObject(ClusterPoolComputeProfile.class);
        Assertions.assertEquals("hiv", model.vmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolComputeProfile model = new ClusterPoolComputeProfile().withVmSize("hiv");
        model = BinaryData.fromObject(model).toObject(ClusterPoolComputeProfile.class);
        Assertions.assertEquals("hiv", model.vmSize());
    }
}
