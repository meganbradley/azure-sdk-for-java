// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterJobInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterJobProperties;

public final class ClusterJobInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterJobInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"jobType\":\"ClusterJobProperties\"},\"id\":\"gx\",\"name\":\"xrslpm\",\"type\":\"twuoegrpkhjwni\"}")
                .toObject(ClusterJobInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterJobInner model = new ClusterJobInner().withProperties(new ClusterJobProperties());
        model = BinaryData.fromObject(model).toObject(ClusterJobInner.class);
    }
}
