// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ExposureControlBatchResponseInner;
import com.azure.resourcemanager.datafactory.fluent.models.ExposureControlResponseInner;
import java.util.Arrays;

public final class ExposureControlBatchResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExposureControlBatchResponseInner model = BinaryData.fromString(
            "{\"exposureControlResponses\":[{\"featureName\":\"ez\",\"value\":\"shxmzsbbzoggigrx\"},{\"featureName\":\"ur\",\"value\":\"xxjnspydptk\"}]}")
            .toObject(ExposureControlBatchResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExposureControlBatchResponseInner model = new ExposureControlBatchResponseInner().withExposureControlResponses(
            Arrays.asList(new ExposureControlResponseInner(), new ExposureControlResponseInner()));
        model = BinaryData.fromObject(model).toObject(ExposureControlBatchResponseInner.class);
    }
}
