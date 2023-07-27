// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.ComputeIsolationProperties;
import org.junit.jupiter.api.Assertions;

public final class ComputeIsolationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComputeIsolationProperties model =
            BinaryData
                .fromString("{\"enableComputeIsolation\":false,\"hostSku\":\"nrjawgqwg\"}")
                .toObject(ComputeIsolationProperties.class);
        Assertions.assertEquals(false, model.enableComputeIsolation());
        Assertions.assertEquals("nrjawgqwg", model.hostSku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComputeIsolationProperties model =
            new ComputeIsolationProperties().withEnableComputeIsolation(false).withHostSku("nrjawgqwg");
        model = BinaryData.fromObject(model).toObject(ComputeIsolationProperties.class);
        Assertions.assertEquals(false, model.enableComputeIsolation());
        Assertions.assertEquals("nrjawgqwg", model.hostSku());
    }
}
