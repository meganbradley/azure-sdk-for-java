// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.Sku;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"ovvqfovljxywsu\",\"sku\":{\"name\":\"yrs\",\"tier\":\"Standard\",\"size\":\"tgadgvraeaen\",\"family\":\"nzar\",\"capacity\":1854977873},\"capacity\":{\"minimum\":1397845425,\"maximum\":1309534736,\"default\":2001921074,\"allowedValues\":[398350813,216133532,1905366329,2115532997],\"scaleType\":\"Manual\"}}")
                .toObject(Sku.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku();
        model = BinaryData.fromObject(model).toObject(Sku.class);
    }
}
