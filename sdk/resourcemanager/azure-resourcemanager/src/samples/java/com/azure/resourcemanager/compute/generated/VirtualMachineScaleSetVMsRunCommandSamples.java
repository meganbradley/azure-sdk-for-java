// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.RunCommandInput;
import java.util.Arrays;

/** Samples for VirtualMachineScaleSetVMs RunCommand. */
public final class VirtualMachineScaleSetVMsRunCommandSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/runCommandExamples/VirtualMachineScaleSetVMRunCommand.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVMs_RunCommand.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetVMsRunCommand(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSetVMs()
            .runCommand(
                "myResourceGroup",
                "myVirtualMachineScaleSet",
                "0",
                new RunCommandInput()
                    .withCommandId("RunPowerShellScript")
                    .withScript(Arrays.asList("Write-Host Hello World!")),
                Context.NONE);
    }
}
