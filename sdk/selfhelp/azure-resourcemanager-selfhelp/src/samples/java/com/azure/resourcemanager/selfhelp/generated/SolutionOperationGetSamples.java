// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

/**
 * Samples for SolutionOperation Get.
 */
public final class SolutionOperationGetSamples {
    /*
     * x-ms-original-file:
     * specification/help/resource-manager/Microsoft.Help/preview/2023-09-01-preview/examples/Solution_Get.json
     */
    /**
     * Sample code: Solution_Get.
     * 
     * @param manager Entry point to SelfHelpManager.
     */
    public static void solutionGet(com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager.solutionOperations().getWithResponse(
            "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
            "SolutionResource1", com.azure.core.util.Context.NONE);
    }
}
