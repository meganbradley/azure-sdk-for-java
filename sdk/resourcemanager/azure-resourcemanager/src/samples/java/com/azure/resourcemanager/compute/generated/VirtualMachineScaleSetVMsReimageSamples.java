// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMReimageParameters;

/**
 * Samples for VirtualMachineScaleSetVMs Reimage.
 */
public final class VirtualMachineScaleSetVMsReimageSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_Reimage_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVM_Reimage_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        virtualMachineScaleSetVMReimageMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineScaleSetVMs().reimage("rgcompute",
            "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
            new VirtualMachineScaleSetVMReimageParameters().withTempDisk(true).withForceUpdateOSDiskForEphemeral(true),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_Reimage_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSetVM_Reimage_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        virtualMachineScaleSetVMReimageMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineScaleSetVMs().reimage("rgcompute", "aaaaaaa",
            "aaaaaaaaaaaaa", null, com.azure.core.util.Context.NONE);
    }
}
