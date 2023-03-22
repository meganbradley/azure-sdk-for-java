// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

/** Samples for VirtualMachineImageTemplates GetRunOutput. */
public final class VirtualMachineImageTemplatesGetRunOutputSamples {
    /*
     * x-ms-original-file: specification/imagebuilder/resource-manager/Microsoft.VirtualMachineImages/stable/2022-07-01/examples/GetRunOutput.json
     */
    /**
     * Sample code: Retrieve single runOutput.
     *
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void retrieveSingleRunOutput(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager
            .virtualMachineImageTemplates()
            .getRunOutputWithResponse(
                "myResourceGroup", "myImageTemplate", "myManagedImageOutput", com.azure.core.util.Context.NONE);
    }
}
