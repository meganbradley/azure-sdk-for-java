// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VmmToVmmNetworkMappingSettings;

public final class VmmToVmmNetworkMappingSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmmToVmmNetworkMappingSettings model =
            BinaryData.fromString("{\"instanceType\":\"VmmToVmm\"}").toObject(VmmToVmmNetworkMappingSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmmToVmmNetworkMappingSettings model = new VmmToVmmNetworkMappingSettings();
        model = BinaryData.fromObject(model).toObject(VmmToVmmNetworkMappingSettings.class);
    }
}
