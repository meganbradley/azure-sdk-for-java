// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.SkuListInner;

public final class SkuListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuListInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"resourceType\":\"klxubyja\",\"sku\":{\"name\":\"mmfblcqcuubgqib\",\"tier\":\"Free\",\"size\":\"metttwgd\",\"family\":\"qxihhrmooi\",\"capacity\":1309261520},\"capacity\":{\"minimum\":1524776028,\"maximum\":783149271,\"default\":1964101220,\"allowedValues\":[814674558,1341869205,2081194366],\"scaleType\":\"Automatic\"}},{\"resourceType\":\"petogebjox\",\"sku\":{\"name\":\"hvnh\",\"tier\":\"Standard\",\"size\":\"q\",\"family\":\"kzjcjbtrgae\",\"capacity\":1032283606},\"capacity\":{\"minimum\":1534669686,\"maximum\":279366719,\"default\":105700990,\"allowedValues\":[1344524900,1668662925,480275151],\"scaleType\":\"Automatic\"}}],\"nextLink\":\"kxzt\"}")
                .toObject(SkuListInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuListInner model = new SkuListInner();
        model = BinaryData.fromObject(model).toObject(SkuListInner.class);
    }
}
