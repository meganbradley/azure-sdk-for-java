// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.AdministrativeCredentials;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineReplaceParameters;

/** Samples for BareMetalMachines Replace. */
public final class BareMetalMachinesReplaceSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/BareMetalMachines_Replace.json
     */
    /**
     * Sample code: Replace bare metal machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void replaceBareMetalMachine(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachines()
            .replace(
                "resourceGroupName",
                "bareMetalMachineName",
                new BareMetalMachineReplaceParameters()
                    .withBmcCredentials(
                        new AdministrativeCredentials().withPassword("fakeTokenPlaceholder").withUsername("bmcuser"))
                    .withBmcMacAddress("00:00:4f:00:57:ad")
                    .withBootMacAddress("00:00:4e:00:58:af")
                    .withMachineName("name")
                    .withSerialNumber("BM1219XXX"),
                com.azure.core.util.Context.NONE);
    }
}
