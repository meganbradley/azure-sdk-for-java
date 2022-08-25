// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.VMScaleSetConvertToSinglePlacementGroupInput;

/** Samples for VirtualMachineScaleSets ConvertToSinglePlacementGroup. */
public final class VirtualMachineScaleSetsConvertToSinglePlacementGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSets_ConvertToSinglePlacementGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSets_ConvertToSinglePlacementGroup_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetsConvertToSinglePlacementGroupMinimumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .convertToSinglePlacementGroupWithResponse(
                "rgcompute", "aaaaaaaaaaaaa", new VMScaleSetConvertToSinglePlacementGroupInput(), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-03-01/examples/virtualMachineScaleSetExamples/VirtualMachineScaleSets_ConvertToSinglePlacementGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSets_ConvertToSinglePlacementGroup_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineScaleSetsConvertToSinglePlacementGroupMaximumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .convertToSinglePlacementGroupWithResponse(
                "rgcompute",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                new VMScaleSetConvertToSinglePlacementGroupInput()
                    .withActivePlacementGroupId("aaaaaaaaaaaaaaaaaaaaaaaaaaa"),
                Context.NONE);
    }
}
