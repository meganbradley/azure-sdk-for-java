// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.ComputeNodeDeallocationOption;
import com.azure.resourcemanager.batch.models.FixedScaleSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class FixedScaleSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FixedScaleSettings model =
            BinaryData
                .fromString(
                    "{\"resizeTimeout\":\"PT217H3M52S\",\"targetDedicatedNodes\":22179172,\"targetLowPriorityNodes\":2101794539,\"nodeDeallocationOption\":\"Requeue\"}")
                .toObject(FixedScaleSettings.class);
        Assertions.assertEquals(Duration.parse("PT217H3M52S"), model.resizeTimeout());
        Assertions.assertEquals(22179172, model.targetDedicatedNodes());
        Assertions.assertEquals(2101794539, model.targetLowPriorityNodes());
        Assertions.assertEquals(ComputeNodeDeallocationOption.REQUEUE, model.nodeDeallocationOption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FixedScaleSettings model =
            new FixedScaleSettings()
                .withResizeTimeout(Duration.parse("PT217H3M52S"))
                .withTargetDedicatedNodes(22179172)
                .withTargetLowPriorityNodes(2101794539)
                .withNodeDeallocationOption(ComputeNodeDeallocationOption.REQUEUE);
        model = BinaryData.fromObject(model).toObject(FixedScaleSettings.class);
        Assertions.assertEquals(Duration.parse("PT217H3M52S"), model.resizeTimeout());
        Assertions.assertEquals(22179172, model.targetDedicatedNodes());
        Assertions.assertEquals(2101794539, model.targetLowPriorityNodes());
        Assertions.assertEquals(ComputeNodeDeallocationOption.REQUEUE, model.nodeDeallocationOption());
    }
}
