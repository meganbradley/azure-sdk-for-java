// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.SimpleFilter;
import com.azure.resourcemanager.chaos.models.SimpleFilterParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SimpleFilterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimpleFilter model =
            BinaryData
                .fromString(
                    "{\"type\":\"Simple\",\"parameters\":{\"zones\":[\"ckw\",\"fz\",\"whxxbuyqax\",\"feqztppriol\"]}}")
                .toObject(SimpleFilter.class);
        Assertions.assertEquals("ckw", model.parameters().zones().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimpleFilter model =
            new SimpleFilter()
                .withParameters(
                    new SimpleFilterParameters().withZones(Arrays.asList("ckw", "fz", "whxxbuyqax", "feqztppriol")));
        model = BinaryData.fromObject(model).toObject(SimpleFilter.class);
        Assertions.assertEquals("ckw", model.parameters().zones().get(0));
    }
}
