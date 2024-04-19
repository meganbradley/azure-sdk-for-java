// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyVirtualMachinePoolResourceInner;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolElasticityProfile;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceProperties;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StandbyVirtualMachinePoolResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyVirtualMachinePoolResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":5470433313051888734},\"virtualMachineState\":\"Deallocated\",\"attachedVirtualMachineScaleSetId\":\"vg\",\"provisioningState\":\"Deleting\"},\"location\":\"ymglzufcyz\",\"tags\":{\"s\":\"dbihanufhfcbj\",\"xqhabi\":\"git\"},\"id\":\"pikxwczbyscnpqxu\",\"name\":\"ivyqniwbybrkxvd\",\"type\":\"mjgr\"}")
            .toObject(StandbyVirtualMachinePoolResourceInner.class);
        Assertions.assertEquals("ymglzufcyz", model.location());
        Assertions.assertEquals("dbihanufhfcbj", model.tags().get("s"));
        Assertions.assertEquals(5470433313051888734L, model.properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.DEALLOCATED, model.properties().virtualMachineState());
        Assertions.assertEquals("vg", model.properties().attachedVirtualMachineScaleSetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyVirtualMachinePoolResourceInner model
            = new StandbyVirtualMachinePoolResourceInner().withLocation("ymglzufcyz")
                .withTags(mapOf("s", "dbihanufhfcbj", "xqhabi", "git"))
                .withProperties(new StandbyVirtualMachinePoolResourceProperties()
                    .withElasticityProfile(
                        new StandbyVirtualMachinePoolElasticityProfile().withMaxReadyCapacity(5470433313051888734L))
                    .withVirtualMachineState(VirtualMachineState.DEALLOCATED)
                    .withAttachedVirtualMachineScaleSetId("vg"));
        model = BinaryData.fromObject(model).toObject(StandbyVirtualMachinePoolResourceInner.class);
        Assertions.assertEquals("ymglzufcyz", model.location());
        Assertions.assertEquals("dbihanufhfcbj", model.tags().get("s"));
        Assertions.assertEquals(5470433313051888734L, model.properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.DEALLOCATED, model.properties().virtualMachineState());
        Assertions.assertEquals("vg", model.properties().attachedVirtualMachineScaleSetId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
