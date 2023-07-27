// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.AuthorizeRequest;

/** Samples for Volumes AuthorizeReplication. */
public final class VolumesAuthorizeReplicationSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-11-01/examples/Volumes_AuthorizeReplication.json
     */
    /**
     * Sample code: Volumes_AuthorizeReplication.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesAuthorizeReplication(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .volumes()
            .authorizeReplication(
                "myRG",
                "account1",
                "pool1",
                "volume1",
                new AuthorizeRequest()
                    .withRemoteVolumeResourceId(
                        "/subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/myRemoteRG/providers/Microsoft.NetApp/netAppAccounts/remoteAccount1/capacityPools/remotePool1/volumes/remoteVolume1"),
                com.azure.core.util.Context.NONE);
    }
}
