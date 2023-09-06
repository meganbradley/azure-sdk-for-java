// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.SamplingSettings;
import com.azure.resourcemanager.apimanagement.models.SamplingType;
import org.junit.jupiter.api.Assertions;

public final class SamplingSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SamplingSettings model =
            BinaryData
                .fromString("{\"samplingType\":\"fixed\",\"percentage\":56.419827218878694}")
                .toObject(SamplingSettings.class);
        Assertions.assertEquals(SamplingType.FIXED, model.samplingType());
        Assertions.assertEquals(56.419827218878694D, model.percentage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SamplingSettings model =
            new SamplingSettings().withSamplingType(SamplingType.FIXED).withPercentage(56.419827218878694D);
        model = BinaryData.fromObject(model).toObject(SamplingSettings.class);
        Assertions.assertEquals(SamplingType.FIXED, model.samplingType());
        Assertions.assertEquals(56.419827218878694D, model.percentage());
    }
}
