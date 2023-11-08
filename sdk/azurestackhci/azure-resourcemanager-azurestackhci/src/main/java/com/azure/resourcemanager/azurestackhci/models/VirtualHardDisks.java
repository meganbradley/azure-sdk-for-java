// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.VirtualHardDisksInner;
import java.util.Map;

/** An immutable client-side representation of VirtualHardDisks. */
public interface VirtualHardDisks {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the extendedLocation property: The extendedLocation of the resource.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the blockSizeBytes property: The blockSizeBytes property.
     *
     * @return the blockSizeBytes value.
     */
    Integer blockSizeBytes();

    /**
     * Gets the diskSizeGB property: Size of the disk in GB.
     *
     * @return the diskSizeGB value.
     */
    Long diskSizeGB();

    /**
     * Gets the dynamic property: Boolean for enabling dynamic sizing on the virtual hard disk.
     *
     * @return the dynamic value.
     */
    Boolean dynamic();

    /**
     * Gets the logicalSectorBytes property: The logicalSectorBytes property.
     *
     * @return the logicalSectorBytes value.
     */
    Integer logicalSectorBytes();

    /**
     * Gets the physicalSectorBytes property: The physicalSectorBytes property.
     *
     * @return the physicalSectorBytes value.
     */
    Integer physicalSectorBytes();

    /**
     * Gets the hyperVGeneration property: The hypervisor generation of the Virtual Machine [V1, V2].
     *
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * Gets the diskFileFormat property: The format of the actual VHD file [vhd, vhdx].
     *
     * @return the diskFileFormat value.
     */
    DiskFileFormat diskFileFormat();

    /**
     * Gets the provisioningState property: Provisioning state of the virtual hard disk.
     *
     * @return the provisioningState value.
     */
    ProvisioningStateEnum provisioningState();

    /**
     * Gets the containerId property: Storage ContainerID of the storage container to be used for VHD.
     *
     * @return the containerId value.
     */
    String containerId();

    /**
     * Gets the status property: The observed state of virtual hard disks.
     *
     * @return the status value.
     */
    VirtualHardDiskStatus status();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.azurestackhci.fluent.models.VirtualHardDisksInner object.
     *
     * @return the inner object.
     */
    VirtualHardDisksInner innerModel();

    /** The entirety of the VirtualHardDisks definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The VirtualHardDisks definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualHardDisks definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the VirtualHardDisks definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the VirtualHardDisks definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithBlockSizeBytes,
                DefinitionStages.WithDiskSizeGB,
                DefinitionStages.WithDynamic,
                DefinitionStages.WithLogicalSectorBytes,
                DefinitionStages.WithPhysicalSectorBytes,
                DefinitionStages.WithHyperVGeneration,
                DefinitionStages.WithDiskFileFormat,
                DefinitionStages.WithContainerId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualHardDisks create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualHardDisks create(Context context);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extendedLocation of the resource..
             *
             * @param extendedLocation The extendedLocation of the resource.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify blockSizeBytes. */
        interface WithBlockSizeBytes {
            /**
             * Specifies the blockSizeBytes property: The blockSizeBytes property..
             *
             * @param blockSizeBytes The blockSizeBytes property.
             * @return the next definition stage.
             */
            WithCreate withBlockSizeBytes(Integer blockSizeBytes);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify diskSizeGB. */
        interface WithDiskSizeGB {
            /**
             * Specifies the diskSizeGB property: Size of the disk in GB.
             *
             * @param diskSizeGB Size of the disk in GB.
             * @return the next definition stage.
             */
            WithCreate withDiskSizeGB(Long diskSizeGB);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify dynamic. */
        interface WithDynamic {
            /**
             * Specifies the dynamic property: Boolean for enabling dynamic sizing on the virtual hard disk.
             *
             * @param dynamic Boolean for enabling dynamic sizing on the virtual hard disk.
             * @return the next definition stage.
             */
            WithCreate withDynamic(Boolean dynamic);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify logicalSectorBytes. */
        interface WithLogicalSectorBytes {
            /**
             * Specifies the logicalSectorBytes property: The logicalSectorBytes property..
             *
             * @param logicalSectorBytes The logicalSectorBytes property.
             * @return the next definition stage.
             */
            WithCreate withLogicalSectorBytes(Integer logicalSectorBytes);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify physicalSectorBytes. */
        interface WithPhysicalSectorBytes {
            /**
             * Specifies the physicalSectorBytes property: The physicalSectorBytes property..
             *
             * @param physicalSectorBytes The physicalSectorBytes property.
             * @return the next definition stage.
             */
            WithCreate withPhysicalSectorBytes(Integer physicalSectorBytes);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify hyperVGeneration. */
        interface WithHyperVGeneration {
            /**
             * Specifies the hyperVGeneration property: The hypervisor generation of the Virtual Machine [V1, V2].
             *
             * @param hyperVGeneration The hypervisor generation of the Virtual Machine [V1, V2].
             * @return the next definition stage.
             */
            WithCreate withHyperVGeneration(HyperVGeneration hyperVGeneration);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify diskFileFormat. */
        interface WithDiskFileFormat {
            /**
             * Specifies the diskFileFormat property: The format of the actual VHD file [vhd, vhdx].
             *
             * @param diskFileFormat The format of the actual VHD file [vhd, vhdx].
             * @return the next definition stage.
             */
            WithCreate withDiskFileFormat(DiskFileFormat diskFileFormat);
        }

        /** The stage of the VirtualHardDisks definition allowing to specify containerId. */
        interface WithContainerId {
            /**
             * Specifies the containerId property: Storage ContainerID of the storage container to be used for VHD.
             *
             * @param containerId Storage ContainerID of the storage container to be used for VHD.
             * @return the next definition stage.
             */
            WithCreate withContainerId(String containerId);
        }
    }

    /**
     * Begins update for the VirtualHardDisks resource.
     *
     * @return the stage of resource update.
     */
    VirtualHardDisks.Update update();

    /** The template for VirtualHardDisks update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualHardDisks apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualHardDisks apply(Context context);
    }

    /** The VirtualHardDisks update stages. */
    interface UpdateStages {
        /** The stage of the VirtualHardDisks update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualHardDisks refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualHardDisks refresh(Context context);
}
