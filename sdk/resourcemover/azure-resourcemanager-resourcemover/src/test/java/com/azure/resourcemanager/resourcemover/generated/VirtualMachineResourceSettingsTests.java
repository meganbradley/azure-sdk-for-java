// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.TargetAvailabilityZone;
import com.azure.resourcemanager.resourcemover.models.VirtualMachineResourceSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VirtualMachineResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualMachineResourceSettings model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"Microsoft.Compute/virtualMachines\",\"tags\":{\"azyxoegukg\":\"ldngkpoci\",\"mrbpizcdrqj\":\"npiucgygevqznty\",\"yhxdeoejzicwi\":\"dpydn\"},\"userManagedIdentities\":[\"ttgzfbis\",\"cbkhajdeyeamdph\"],\"targetAvailabilityZone\":\"NA\",\"targetVmSize\":\"pbuxwgipwhon\",\"targetAvailabilitySetId\":\"kgshwa\",\"targetResourceName\":\"ixzbinjeputtmryw\",\"targetResourceGroupName\":\"zoqftiyqzrnkcqvy\"}")
                .toObject(VirtualMachineResourceSettings.class);
        Assertions.assertEquals("ixzbinjeputtmryw", model.targetResourceName());
        Assertions.assertEquals("zoqftiyqzrnkcqvy", model.targetResourceGroupName());
        Assertions.assertEquals("ldngkpoci", model.tags().get("azyxoegukg"));
        Assertions.assertEquals("ttgzfbis", model.userManagedIdentities().get(0));
        Assertions.assertEquals(TargetAvailabilityZone.NA, model.targetAvailabilityZone());
        Assertions.assertEquals("pbuxwgipwhon", model.targetVmSize());
        Assertions.assertEquals("kgshwa", model.targetAvailabilitySetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualMachineResourceSettings model =
            new VirtualMachineResourceSettings()
                .withTargetResourceName("ixzbinjeputtmryw")
                .withTargetResourceGroupName("zoqftiyqzrnkcqvy")
                .withTags(mapOf("azyxoegukg", "ldngkpoci", "mrbpizcdrqj", "npiucgygevqznty", "yhxdeoejzicwi", "dpydn"))
                .withUserManagedIdentities(Arrays.asList("ttgzfbis", "cbkhajdeyeamdph"))
                .withTargetAvailabilityZone(TargetAvailabilityZone.NA)
                .withTargetVmSize("pbuxwgipwhon")
                .withTargetAvailabilitySetId("kgshwa");
        model = BinaryData.fromObject(model).toObject(VirtualMachineResourceSettings.class);
        Assertions.assertEquals("ixzbinjeputtmryw", model.targetResourceName());
        Assertions.assertEquals("zoqftiyqzrnkcqvy", model.targetResourceGroupName());
        Assertions.assertEquals("ldngkpoci", model.tags().get("azyxoegukg"));
        Assertions.assertEquals("ttgzfbis", model.userManagedIdentities().get(0));
        Assertions.assertEquals(TargetAvailabilityZone.NA, model.targetAvailabilityZone());
        Assertions.assertEquals("pbuxwgipwhon", model.targetVmSize());
        Assertions.assertEquals("kgshwa", model.targetAvailabilitySetId());
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
