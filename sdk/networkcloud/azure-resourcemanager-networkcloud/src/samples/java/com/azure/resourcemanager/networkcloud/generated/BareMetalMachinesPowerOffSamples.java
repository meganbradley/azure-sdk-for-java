// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.BareMetalMachinePowerOffParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineSkipShutdown;

/** Samples for BareMetalMachines PowerOff. */
public final class BareMetalMachinesPowerOffSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/BareMetalMachines_PowerOff.json
     */
    /**
     * Sample code: Power off bare metal machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void powerOffBareMetalMachine(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachines()
            .powerOff(
                "resourceGroupName",
                "bareMetalMachineName",
                new BareMetalMachinePowerOffParameters().withSkipShutdown(BareMetalMachineSkipShutdown.TRUE),
                com.azure.core.util.Context.NONE);
    }
}
