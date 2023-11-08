// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.fluent.models.SolutionMetadataResourceInner;
import com.azure.resourcemanager.selfhelp.models.SolutionMetadataProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SolutionMetadataResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SolutionMetadataResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"solutions\":[{\"solutionId\":\"dtocj\",\"solutionType\":\"Diagnostics\",\"description\":\"pmouexhdz\",\"requiredInputs\":[\"qeojnxqbzvddntw\"]},{\"solutionId\":\"eic\",\"solutionType\":\"Diagnostics\",\"description\":\"pzaoqvuhr\",\"requiredInputs\":[\"fcyddg\"]}]},\"id\":\"jthjqkwpyei\",\"name\":\"xmqci\",\"type\":\"q\"}")
                .toObject(SolutionMetadataResourceInner.class);
        Assertions.assertEquals("dtocj", model.solutions().get(0).solutionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SolutionMetadataResourceInner model =
            new SolutionMetadataResourceInner()
                .withSolutions(
                    Arrays
                        .asList(
                            new SolutionMetadataProperties().withSolutionId("dtocj"),
                            new SolutionMetadataProperties().withSolutionId("eic")));
        model = BinaryData.fromObject(model).toObject(SolutionMetadataResourceInner.class);
        Assertions.assertEquals("dtocj", model.solutions().get(0).solutionId());
    }
}
