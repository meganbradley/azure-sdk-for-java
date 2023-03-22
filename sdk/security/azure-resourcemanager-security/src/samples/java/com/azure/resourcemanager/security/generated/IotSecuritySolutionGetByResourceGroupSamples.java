// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for IotSecuritySolution GetByResourceGroup. */
public final class IotSecuritySolutionGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2019-08-01/examples/IoTSecuritySolutions/GetIoTSecuritySolution.json
     */
    /**
     * Sample code: Get a IoT security solution.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAIoTSecuritySolution(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .iotSecuritySolutions()
            .getByResourceGroupWithResponse("MyGroup", "default", com.azure.core.util.Context.NONE);
    }
}
