// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.Architecture;
import com.azure.resourcemanager.compute.models.DiskUpdate;
import com.azure.resourcemanager.compute.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.models.SupportedCapabilities;

/**
 * Samples for Disks Update.
 */
public final class DisksUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_ToAddArchitecture.json
     */
    /**
     * Sample code: Update a managed disk to add architecture.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToAddArchitecture(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks()
            .update("myResourceGroup", "myDisk",
                new DiskUpdate()
                    .withSupportedCapabilities(new SupportedCapabilities().withArchitecture(Architecture.ARM64)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_DisableBursting.json
     */
    /**
     * Sample code: Update a managed disk to disable bursting.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToDisableBursting(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().update("myResourceGroup", "myDisk",
            new DiskUpdate().withBurstingEnabled(false), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_AddPurchasePlan.json
     */
    /**
     * Sample code: Update a managed disk to add purchase plan.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToAddPurchasePlan(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks()
            .update("myResourceGroup", "myDisk",
                new DiskUpdate().withPurchasePlan(new PurchasePlanAutoGenerated().withName("myPurchasePlanName")
                    .withPublisher("myPurchasePlanPublisher").withProduct("myPurchasePlanProduct")
                    .withPromotionCode("fakeTokenPlaceholder")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_ChangeTier.json
     */
    /**
     * Sample code: Update a managed disk to change tier.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskToChangeTier(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().update("myResourceGroup", "myDisk",
            new DiskUpdate().withTier("P30"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_CreateOrUpdate_BurstingEnabled.json
     */
    /**
     * Sample code: Create or update a bursting enabled managed disk.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateABurstingEnabledManagedDisk(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().update("myResourceGroup", "myDisk",
            new DiskUpdate().withDiskSizeGB(1024).withBurstingEnabled(true), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_AddSupportsHibernation.json
     */
    /**
     * Sample code: Update a managed disk to add supportsHibernation.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        updateAManagedDiskToAddSupportsHibernation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().update("myResourceGroup", "myDisk",
            new DiskUpdate().withSupportsHibernation(true), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_RemoveDiskAccess.json
     */
    /**
     * Sample code: Update managed disk to remove disk access resource association.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        updateManagedDiskToRemoveDiskAccessResourceAssociation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().update("myResourceGroup", "myDisk",
            new DiskUpdate().withNetworkAccessPolicy(NetworkAccessPolicy.ALLOW_ALL), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_AddDiskControllerTypes.json
     */
    /**
     * Sample code: Update a managed disk with diskControllerTypes.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateAManagedDiskWithDiskControllerTypes(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().update("myResourceGroup", "myDisk",
            new DiskUpdate().withSupportedCapabilities(new SupportedCapabilities().withDiskControllerTypes("SCSI")),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_AddAcceleratedNetworking.json
     */
    /**
     * Sample code: Update a managed disk to add accelerated networking.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        updateAManagedDiskToAddAcceleratedNetworking(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().update("myResourceGroup", "myDisk",
            new DiskUpdate().withSupportedCapabilities(new SupportedCapabilities().withAcceleratedNetwork(false)),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/diskExamples/
     * Disk_Update_DisableOptimizedForFrequentAttach.json
     */
    /**
     * Sample code: Update a managed disk to disable optimizedForFrequentAttach.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        updateAManagedDiskToDisableOptimizedForFrequentAttach(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getDisks().update("myResourceGroup", "myDisk",
            new DiskUpdate().withOptimizedForFrequentAttach(false), com.azure.core.util.Context.NONE);
    }
}
