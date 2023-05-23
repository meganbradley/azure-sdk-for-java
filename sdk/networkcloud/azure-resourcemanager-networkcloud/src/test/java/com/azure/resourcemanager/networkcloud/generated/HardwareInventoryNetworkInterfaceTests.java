// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.HardwareInventoryNetworkInterface;

public final class HardwareInventoryNetworkInterfaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HardwareInventoryNetworkInterface model =
            BinaryData
                .fromString(
                    "{\"linkStatus\":\"nhutjeltmrldhugj\",\"macAddress\":\"datqxhocdgeabl\",\"name\":\"huticndvkao\",\"networkInterfaceId\":\"yiftyhxhuro\"}")
                .toObject(HardwareInventoryNetworkInterface.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HardwareInventoryNetworkInterface model = new HardwareInventoryNetworkInterface();
        model = BinaryData.fromObject(model).toObject(HardwareInventoryNetworkInterface.class);
    }
}
