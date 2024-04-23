// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.AssessmentModeTypes;
import com.azure.resourcemanager.hybridcompute.models.OSProfileWindowsConfiguration;
import com.azure.resourcemanager.hybridcompute.models.PatchModeTypes;
import org.junit.jupiter.api.Assertions;

public final class OSProfileWindowsConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OSProfileWindowsConfiguration model = BinaryData
            .fromString("{\"patchSettings\":{\"assessmentMode\":\"ImageDefault\",\"patchMode\":\"AutomaticByOS\"}}")
            .toObject(OSProfileWindowsConfiguration.class);
        Assertions.assertEquals(AssessmentModeTypes.IMAGE_DEFAULT, model.assessmentMode());
        Assertions.assertEquals(PatchModeTypes.AUTOMATIC_BY_OS, model.patchMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OSProfileWindowsConfiguration model
            = new OSProfileWindowsConfiguration().withAssessmentMode(AssessmentModeTypes.IMAGE_DEFAULT)
                .withPatchMode(PatchModeTypes.AUTOMATIC_BY_OS);
        model = BinaryData.fromObject(model).toObject(OSProfileWindowsConfiguration.class);
        Assertions.assertEquals(AssessmentModeTypes.IMAGE_DEFAULT, model.assessmentMode());
        Assertions.assertEquals(PatchModeTypes.AUTOMATIC_BY_OS, model.patchMode());
    }
}
