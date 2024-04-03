// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterVersionInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterVersionProperties;
import org.junit.jupiter.api.Assertions;

public final class ClusterVersionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterVersionInner model = BinaryData.fromString(
            "{\"properties\":{\"clusterType\":\"v\",\"clusterVersion\":\"k\",\"ossVersion\":\"lqwjygvjayvblm\",\"clusterPoolVersion\":\"k\",\"isPreview\":true,\"components\":[{\"name\":\"vyhgs\",\"version\":\"byrqufeg\"}]},\"id\":\"vwz\",\"name\":\"bnhlmc\",\"type\":\"l\"}")
            .toObject(ClusterVersionInner.class);
        Assertions.assertEquals("v", model.properties().clusterType());
        Assertions.assertEquals("k", model.properties().clusterVersion());
        Assertions.assertEquals("lqwjygvjayvblm", model.properties().ossVersion());
        Assertions.assertEquals("k", model.properties().clusterPoolVersion());
        Assertions.assertEquals(true, model.properties().isPreview());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterVersionInner model = new ClusterVersionInner()
            .withProperties(new ClusterVersionProperties().withClusterType("v").withClusterVersion("k")
                .withOssVersion("lqwjygvjayvblm").withClusterPoolVersion("k").withIsPreview(true));
        model = BinaryData.fromObject(model).toObject(ClusterVersionInner.class);
        Assertions.assertEquals("v", model.properties().clusterType());
        Assertions.assertEquals("k", model.properties().clusterVersion());
        Assertions.assertEquals("lqwjygvjayvblm", model.properties().ossVersion());
        Assertions.assertEquals("k", model.properties().clusterPoolVersion());
        Assertions.assertEquals(true, model.properties().isPreview());
    }
}
