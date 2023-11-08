// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.DevCenterSkuInner;
import com.azure.resourcemanager.devcenter.models.SkuTier;
import org.junit.jupiter.api.Assertions;

public final class DevCenterSkuInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DevCenterSkuInner model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"elmcuvhixbjxyfw\",\"locations\":[\"r\",\"ool\",\"ttpkiwkkbnujrywv\"],\"capabilities\":[{\"name\":\"fpncurdo\",\"value\":\"iithtywu\"},{\"name\":\"cbihwqk\",\"value\":\"dntwjchrdgo\"},{\"name\":\"xum\",\"value\":\"ton\"}],\"name\":\"zj\",\"tier\":\"Basic\",\"size\":\"fdlwg\",\"family\":\"tsbwtovvtgse\",\"capacity\":800109726}")
                .toObject(DevCenterSkuInner.class);
        Assertions.assertEquals("zj", model.name());
        Assertions.assertEquals(SkuTier.BASIC, model.tier());
        Assertions.assertEquals("fdlwg", model.size());
        Assertions.assertEquals("tsbwtovvtgse", model.family());
        Assertions.assertEquals(800109726, model.capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DevCenterSkuInner model =
            new DevCenterSkuInner()
                .withName("zj")
                .withTier(SkuTier.BASIC)
                .withSize("fdlwg")
                .withFamily("tsbwtovvtgse")
                .withCapacity(800109726);
        model = BinaryData.fromObject(model).toObject(DevCenterSkuInner.class);
        Assertions.assertEquals("zj", model.name());
        Assertions.assertEquals(SkuTier.BASIC, model.tier());
        Assertions.assertEquals("fdlwg", model.size());
        Assertions.assertEquals("tsbwtovvtgse", model.family());
        Assertions.assertEquals(800109726, model.capacity());
    }
}
