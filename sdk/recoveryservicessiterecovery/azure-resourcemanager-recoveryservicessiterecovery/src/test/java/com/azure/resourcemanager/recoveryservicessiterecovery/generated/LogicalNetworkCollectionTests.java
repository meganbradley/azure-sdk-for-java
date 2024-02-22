// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.LogicalNetworkInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LogicalNetworkCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LogicalNetworkProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LogicalNetworkCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogicalNetworkCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"friendlyName\":\"j\",\"networkVirtualizationStatus\":\"dxob\",\"logicalNetworkUsage\":\"dxkqpx\",\"logicalNetworkDefinitionsStatus\":\"ajionpimexgstxg\"},\"location\":\"odgmaajrmvdjwz\",\"id\":\"lovmclwhijcoe\",\"name\":\"ctbzaq\",\"type\":\"qsycbkbfkgu\"}],\"nextLink\":\"kexxppof\"}")
            .toObject(LogicalNetworkCollection.class);
        Assertions.assertEquals("j", model.value().get(0).properties().friendlyName());
        Assertions.assertEquals("dxob", model.value().get(0).properties().networkVirtualizationStatus());
        Assertions.assertEquals("dxkqpx", model.value().get(0).properties().logicalNetworkUsage());
        Assertions.assertEquals("ajionpimexgstxg", model.value().get(0).properties().logicalNetworkDefinitionsStatus());
        Assertions.assertEquals("odgmaajrmvdjwz", model.value().get(0).location());
        Assertions.assertEquals("kexxppof", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogicalNetworkCollection model
            = new LogicalNetworkCollection().withValue(Arrays.asList(new LogicalNetworkInner()
                .withProperties(
                    new LogicalNetworkProperties().withFriendlyName("j").withNetworkVirtualizationStatus("dxob")
                        .withLogicalNetworkUsage("dxkqpx").withLogicalNetworkDefinitionsStatus("ajionpimexgstxg"))
                .withLocation("odgmaajrmvdjwz"))).withNextLink("kexxppof");
        model = BinaryData.fromObject(model).toObject(LogicalNetworkCollection.class);
        Assertions.assertEquals("j", model.value().get(0).properties().friendlyName());
        Assertions.assertEquals("dxob", model.value().get(0).properties().networkVirtualizationStatus());
        Assertions.assertEquals("dxkqpx", model.value().get(0).properties().logicalNetworkUsage());
        Assertions.assertEquals("ajionpimexgstxg", model.value().get(0).properties().logicalNetworkDefinitionsStatus());
        Assertions.assertEquals("odgmaajrmvdjwz", model.value().get(0).location());
        Assertions.assertEquals("kexxppof", model.nextLink());
    }
}
