// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for Datastores List. */
public final class DatastoresListSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2021-12-01/examples/Datastores_List.json
     */
    /**
     * Sample code: Datastores_List.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void datastoresList(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.datastores().list("group1", "cloud1", "cluster1", Context.NONE);
    }
}
