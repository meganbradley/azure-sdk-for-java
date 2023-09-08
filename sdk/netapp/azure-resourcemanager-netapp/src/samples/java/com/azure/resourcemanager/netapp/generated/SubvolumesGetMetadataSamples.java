// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/** Samples for Subvolumes GetMetadata. */
public final class SubvolumesGetMetadataSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-11-01/examples/Subvolumes_Metadata.json
     */
    /**
     * Sample code: Subvolumes_Metadata.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void subvolumesMetadata(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .subvolumes()
            .getMetadata("myRG", "account1", "pool1", "volume1", "subvolume1", com.azure.core.util.Context.NONE);
    }
}
