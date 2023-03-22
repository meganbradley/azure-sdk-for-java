// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.OperationInner;
import com.azure.resourcemanager.netapp.models.OperationDisplay;
import com.azure.resourcemanager.netapp.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"sarhmofc\",\"display\":{\"provider\":\"my\",\"resource\":\"kdtmlxhekuk\",\"operation\":\"txukcdmp\",\"description\":\"cryuan\"},\"origin\":\"uxzdxtay\",\"properties\":{\"serviceSpecification\":{\"metricSpecifications\":[],\"logSpecifications\":[]}}}")
                .toObject(OperationInner.class);
        Assertions.assertEquals("sarhmofc", model.name());
        Assertions.assertEquals("my", model.display().provider());
        Assertions.assertEquals("kdtmlxhekuk", model.display().resource());
        Assertions.assertEquals("txukcdmp", model.display().operation());
        Assertions.assertEquals("cryuan", model.display().description());
        Assertions.assertEquals("uxzdxtay", model.origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model =
            new OperationInner()
                .withName("sarhmofc")
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("my")
                        .withResource("kdtmlxhekuk")
                        .withOperation("txukcdmp")
                        .withDescription("cryuan"))
                .withOrigin("uxzdxtay")
                .withServiceSpecification(
                    new ServiceSpecification()
                        .withMetricSpecifications(Arrays.asList())
                        .withLogSpecifications(Arrays.asList()));
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals("sarhmofc", model.name());
        Assertions.assertEquals("my", model.display().provider());
        Assertions.assertEquals("kdtmlxhekuk", model.display().resource());
        Assertions.assertEquals("txukcdmp", model.display().operation());
        Assertions.assertEquals("cryuan", model.display().description());
        Assertions.assertEquals("uxzdxtay", model.origin());
    }
}
