// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.UsageInner;
import com.azure.resourcemanager.devcenter.models.UsageName;
import com.azure.resourcemanager.devcenter.models.UsageUnit;
import org.junit.jupiter.api.Assertions;

public final class UsageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UsageInner model =
            BinaryData
                .fromString(
                    "{\"currentValue\":7318897576104257357,\"limit\":4568735292262817818,\"unit\":\"Count\",\"name\":{\"localizedValue\":\"ozbhdmsmlmzq\",\"value\":\"ft\"},\"id\":\"ae\"}")
                .toObject(UsageInner.class);
        Assertions.assertEquals(7318897576104257357L, model.currentValue());
        Assertions.assertEquals(4568735292262817818L, model.limit());
        Assertions.assertEquals(UsageUnit.COUNT, model.unit());
        Assertions.assertEquals("ozbhdmsmlmzq", model.name().localizedValue());
        Assertions.assertEquals("ft", model.name().value());
        Assertions.assertEquals("ae", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UsageInner model =
            new UsageInner()
                .withCurrentValue(7318897576104257357L)
                .withLimit(4568735292262817818L)
                .withUnit(UsageUnit.COUNT)
                .withName(new UsageName().withLocalizedValue("ozbhdmsmlmzq").withValue("ft"))
                .withId("ae");
        model = BinaryData.fromObject(model).toObject(UsageInner.class);
        Assertions.assertEquals(7318897576104257357L, model.currentValue());
        Assertions.assertEquals(4568735292262817818L, model.limit());
        Assertions.assertEquals(UsageUnit.COUNT, model.unit());
        Assertions.assertEquals("ozbhdmsmlmzq", model.name().localizedValue());
        Assertions.assertEquals("ft", model.name().value());
        Assertions.assertEquals("ae", model.id());
    }
}
