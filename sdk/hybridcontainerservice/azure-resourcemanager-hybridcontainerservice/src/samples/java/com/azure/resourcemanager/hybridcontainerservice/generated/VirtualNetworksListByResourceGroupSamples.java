// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

/**
 * Samples for VirtualNetworks ListByResourceGroup.
 */
public final class VirtualNetworksListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2023-11-15-preview/examples/
     * ListVirtualNetworkByResourceGroup.json
     */
    /**
     * Sample code: ListVirtualNetworkByResourceGroup.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listVirtualNetworkByResourceGroup(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.virtualNetworks().listByResourceGroup("test-arcappliance-resgrp", com.azure.core.util.Context.NONE);
    }
}
