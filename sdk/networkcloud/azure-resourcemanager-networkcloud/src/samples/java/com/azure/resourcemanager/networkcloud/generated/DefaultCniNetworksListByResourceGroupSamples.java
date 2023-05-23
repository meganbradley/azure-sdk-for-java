// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for DefaultCniNetworks ListByResourceGroup. */
public final class DefaultCniNetworksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/DefaultCniNetworks_ListByResourceGroup.json
     */
    /**
     * Sample code: List default CNI networks for resource group.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listDefaultCNINetworksForResourceGroup(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.defaultCniNetworks().listByResourceGroup("resourceGroupName", com.azure.core.util.Context.NONE);
    }
}
