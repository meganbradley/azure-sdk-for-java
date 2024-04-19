// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.QuotaUsageInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.NameProperty;
import org.junit.jupiter.api.Assertions;

public final class QuotaUsageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaUsageInner model = BinaryData.fromString(
            "{\"name\":{\"value\":\"tylbfpncurdoiw\",\"localizedValue\":\"thtywub\"},\"limit\":3048231352847216987,\"unit\":\"wqknfdn\",\"currentValue\":4775969019661520867,\"id\":\"rdgoihxumw\"}")
            .toObject(QuotaUsageInner.class);
        Assertions.assertEquals("tylbfpncurdoiw", model.name().value());
        Assertions.assertEquals("thtywub", model.name().localizedValue());
        Assertions.assertEquals(3048231352847216987L, model.limit());
        Assertions.assertEquals("wqknfdn", model.unit());
        Assertions.assertEquals(4775969019661520867L, model.currentValue());
        Assertions.assertEquals("rdgoihxumw", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaUsageInner model = new QuotaUsageInner()
            .withName(new NameProperty().withValue("tylbfpncurdoiw").withLocalizedValue("thtywub"))
            .withLimit(3048231352847216987L)
            .withUnit("wqknfdn")
            .withCurrentValue(4775969019661520867L)
            .withId("rdgoihxumw");
        model = BinaryData.fromObject(model).toObject(QuotaUsageInner.class);
        Assertions.assertEquals("tylbfpncurdoiw", model.name().value());
        Assertions.assertEquals("thtywub", model.name().localizedValue());
        Assertions.assertEquals(3048231352847216987L, model.limit());
        Assertions.assertEquals("wqknfdn", model.unit());
        Assertions.assertEquals(4775969019661520867L, model.currentValue());
        Assertions.assertEquals("rdgoihxumw", model.id());
    }
}
