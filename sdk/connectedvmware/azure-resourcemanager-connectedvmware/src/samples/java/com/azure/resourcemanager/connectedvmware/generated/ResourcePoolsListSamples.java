// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

/** Samples for ResourcePools List. */
public final class ResourcePoolsListSamples {
    /*
     * x-ms-original-file: specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/stable/2023-10-01/examples/ListResourcePools.json
     */
    /**
     * Sample code: ListResourcePools.
     *
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void listResourcePools(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.resourcePools().list(com.azure.core.util.Context.NONE);
    }
}
