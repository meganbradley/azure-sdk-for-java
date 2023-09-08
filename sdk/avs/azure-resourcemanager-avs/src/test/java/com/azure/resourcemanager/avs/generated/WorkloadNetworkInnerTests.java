// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkInner;

public final class WorkloadNetworkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkInner model =
            BinaryData
                .fromString("{\"id\":\"wab\",\"name\":\"ets\",\"type\":\"hszhedplvwiwu\"}")
                .toObject(WorkloadNetworkInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkInner model = new WorkloadNetworkInner();
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkInner.class);
    }
}
