// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for DiskAccesses Delete.
 */
public final class DiskAccessesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskAccessExamples/
     * DiskAccess_Delete.json
     */
    /**
     * Sample code: Delete a disk access resource.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteADiskAccessResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDiskAccesses().delete("myResourceGroup", "myDiskAccess",
            com.azure.core.util.Context.NONE);
    }
}
