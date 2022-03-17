// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.Context;

/** Samples for Sims ListByResourceGroup. */
public final class SimsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/preview/2022-01-01-preview/examples/SimListByResourceGroup.json
     */
    /**
     * Sample code: List sims in a resource group.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void listSimsInAResourceGroup(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.sims().listByResourceGroup("rg1", Context.NONE);
    }
}
