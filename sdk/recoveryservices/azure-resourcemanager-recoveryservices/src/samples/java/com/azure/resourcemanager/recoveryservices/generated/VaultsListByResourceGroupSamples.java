// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

/** Samples for Vaults ListByResourceGroup. */
public final class VaultsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-02-01/examples/ListResources.json
     */
    /**
     * Sample code: List of Recovery Services Resources in ResourceGroup.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void listOfRecoveryServicesResourcesInResourceGroup(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .vaults()
            .listByResourceGroup("Default-RecoveryServices-ResourceGroup", com.azure.core.util.Context.NONE);
    }
}
