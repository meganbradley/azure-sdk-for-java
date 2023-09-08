// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.CapacityPool;

/** Samples for Pools Update. */
public final class PoolsUpdateSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-11-01/examples/Pools_Update.json
     */
    /**
     * Sample code: Pools_Update.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void poolsUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        CapacityPool resource =
            manager.pools().getWithResponse("myRG", "account1", "pool1", com.azure.core.util.Context.NONE).getValue();
        resource.update().apply();
    }
}
