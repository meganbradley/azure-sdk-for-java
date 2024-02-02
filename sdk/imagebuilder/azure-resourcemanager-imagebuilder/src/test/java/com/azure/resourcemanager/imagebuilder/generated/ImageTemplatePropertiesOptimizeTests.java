// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplatePropertiesOptimize;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplatePropertiesOptimizeVmBoot;
import com.azure.resourcemanager.imagebuilder.models.VMBootOptimizationState;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplatePropertiesOptimizeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplatePropertiesOptimize model = BinaryData.fromString("{\"vmBoot\":{\"state\":\"Enabled\"}}")
            .toObject(ImageTemplatePropertiesOptimize.class);
        Assertions.assertEquals(VMBootOptimizationState.ENABLED, model.vmBoot().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplatePropertiesOptimize model = new ImageTemplatePropertiesOptimize()
            .withVmBoot(new ImageTemplatePropertiesOptimizeVmBoot().withState(VMBootOptimizationState.ENABLED));
        model = BinaryData.fromObject(model).toObject(ImageTemplatePropertiesOptimize.class);
        Assertions.assertEquals(VMBootOptimizationState.ENABLED, model.vmBoot().state());
    }
}
