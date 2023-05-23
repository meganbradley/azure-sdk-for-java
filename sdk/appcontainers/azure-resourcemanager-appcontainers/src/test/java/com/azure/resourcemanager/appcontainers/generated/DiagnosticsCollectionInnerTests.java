// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsCollectionInner;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsProperties;
import java.util.Arrays;

public final class DiagnosticsCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsCollectionInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"dataset\":[]},\"id\":\"bylyrfgia\",\"name\":\"tcojocqwo\",\"type\":\"fnzjvusfzldm\"}],\"nextLink\":\"uxylfsbtkadpy\"}")
                .toObject(DiagnosticsCollectionInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsCollectionInner model =
            new DiagnosticsCollectionInner()
                .withValue(
                    Arrays
                        .asList(
                            new DiagnosticsInner()
                                .withProperties(new DiagnosticsProperties().withDataset(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(DiagnosticsCollectionInner.class);
    }
}
