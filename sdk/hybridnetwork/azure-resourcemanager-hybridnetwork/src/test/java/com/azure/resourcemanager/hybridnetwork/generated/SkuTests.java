// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.Sku;
import com.azure.resourcemanager.hybridnetwork.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model = BinaryData.fromString("{\"name\":\"Standard\",\"tier\":\"Basic\"}").toObject(Sku.class);
        Assertions.assertEquals(SkuName.STANDARD, model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku().withName(SkuName.STANDARD);
        model = BinaryData.fromObject(model).toObject(Sku.class);
        Assertions.assertEquals(SkuName.STANDARD, model.name());
    }
}
