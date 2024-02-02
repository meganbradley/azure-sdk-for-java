// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

/**
 * Samples for Triggers ListByImageTemplate.
 */
public final class TriggersListByImageTemplateSamples {
    /*
     * x-ms-original-file:
     * specification/imagebuilder/resource-manager/Microsoft.VirtualMachineImages/stable/2023-07-01/examples/
     * ListTriggers.json
     */
    /**
     * Sample code: List triggers by image template.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void listTriggersByImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.triggers().listByImageTemplate("myResourceGroup", "myImageTemplate", com.azure.core.util.Context.NONE);
    }
}
