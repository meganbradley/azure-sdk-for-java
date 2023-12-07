// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for KubeEnvironments ListByResourceGroup.
 */
public final class KubeEnvironmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/KubeEnvironments_ListByResourceGroup.
     * json
     */
    /**
     * Sample code: List kube environments by resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listKubeEnvironmentsByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getKubeEnvironments().listByResourceGroup("examplerg",
            com.azure.core.util.Context.NONE);
    }
}
