// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkfunction.fluent.models.OperationInner;
import com.azure.resourcemanager.networkfunction.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationInnerTests {
    @Test
    public void testDeserialize() {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"nygj\",\"isDataAction\":true,\"display\":{\"provider\":\"eqsrdeupewnwreit\",\"resource\":\"yflusarhmofc\",\"operation\":\"smy\",\"description\":\"kdtmlxhekuk\"},\"origin\":\"txukcdmp\"}")
                .toObject(OperationInner.class);
        Assertions.assertEquals("nygj", model.name());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals("eqsrdeupewnwreit", model.display().provider());
        Assertions.assertEquals("yflusarhmofc", model.display().resource());
        Assertions.assertEquals("smy", model.display().operation());
        Assertions.assertEquals("kdtmlxhekuk", model.display().description());
        Assertions.assertEquals("txukcdmp", model.origin());
    }

    @Test
    public void testSerialize() {
        OperationInner model =
            new OperationInner()
                .withName("nygj")
                .withIsDataAction(true)
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("eqsrdeupewnwreit")
                        .withResource("yflusarhmofc")
                        .withOperation("smy")
                        .withDescription("kdtmlxhekuk"))
                .withOrigin("txukcdmp");
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals("nygj", model.name());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals("eqsrdeupewnwreit", model.display().provider());
        Assertions.assertEquals("yflusarhmofc", model.display().resource());
        Assertions.assertEquals("smy", model.display().operation());
        Assertions.assertEquals("kdtmlxhekuk", model.display().description());
        Assertions.assertEquals("txukcdmp", model.origin());
    }
}
