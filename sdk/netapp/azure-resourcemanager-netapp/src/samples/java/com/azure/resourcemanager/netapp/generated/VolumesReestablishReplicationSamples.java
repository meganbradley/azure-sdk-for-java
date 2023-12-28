// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.ReestablishReplicationRequest;

/**
 * Samples for Volumes ReestablishReplication.
 */
public final class VolumesReestablishReplicationSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/preview/2023-05-01-preview/examples/
     * Volumes_ReestablishReplication.json
     */
    /**
     * Sample code: Volumes_ReestablishReplication.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesReestablishReplication(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes().reestablishReplication("myRG", "account1", "pool1", "volume1",
            new ReestablishReplicationRequest().withSourceVolumeId(
                "/subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/mySourceRG/providers/Microsoft.NetApp/netAppAccounts/sourceAccount1/capacityPools/sourcePool1/volumes/sourceVolume1"),
            com.azure.core.util.Context.NONE);
    }
}
