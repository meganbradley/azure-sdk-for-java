// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.VolumeInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Volume. */
public interface Volume {
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
     * Gets the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
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
     * Gets the attachedTo property: The list of resource IDs that attach the volume. It may include virtual machines
     * and Hybrid AKS clusters.
     *
     * @return the attachedTo value.
     */
    List<String> attachedTo();

    /**
     * Gets the detailedStatus property: The more detailed status of the volume.
     *
     * @return the detailedStatus value.
     */
    VolumeDetailedStatus detailedStatus();

    /**
     * Gets the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    String detailedStatusMessage();

    /**
     * Gets the provisioningState property: The provisioning state of the volume.
     *
     * @return the provisioningState value.
     */
    VolumeProvisioningState provisioningState();

    /**
     * Gets the serialNumber property: The unique identifier of the volume.
     *
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * Gets the sizeMiB property: The size of the allocation for this volume in Mebibytes.
     *
     * @return the sizeMiB value.
     */
    long sizeMiB();

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
     * Gets the inner com.azure.resourcemanager.networkcloud.fluent.models.VolumeInner object.
     *
     * @return the inner object.
     */
    VolumeInner innerModel();

    /** The entirety of the Volume definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithExtendedLocation,
            DefinitionStages.WithSizeMiB,
            DefinitionStages.WithCreate {
    }
    /** The Volume definition stages. */
    interface DefinitionStages {
        /** The first stage of the Volume definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Volume definition allowing to specify location. */
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
        /** The stage of the Volume definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithExtendedLocation withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Volume definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: ExtendedLocation represents the Azure custom location where the
             * resource will be created.
             *
             * <p>The extended location of the cluster associated with the resource..
             *
             * @param extendedLocation ExtendedLocation represents the Azure custom location where the resource will be
             *     created.
             *     <p>The extended location of the cluster associated with the resource.
             * @return the next definition stage.
             */
            WithSizeMiB withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the Volume definition allowing to specify sizeMiB. */
        interface WithSizeMiB {
            /**
             * Specifies the sizeMiB property: The size of the allocation for this volume in Mebibytes..
             *
             * @param sizeMiB The size of the allocation for this volume in Mebibytes.
             * @return the next definition stage.
             */
            WithCreate withSizeMiB(long sizeMiB);
        }
        /**
         * The stage of the Volume definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Volume create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Volume create(Context context);
        }
        /** The stage of the Volume definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the Volume resource.
     *
     * @return the stage of resource update.
     */
    Volume.Update update();

    /** The template for Volume update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Volume apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Volume apply(Context context);
    }
    /** The Volume update stages. */
    interface UpdateStages {
        /** The stage of the Volume update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The Azure resource tags that will replace the existing ones..
             *
             * @param tags The Azure resource tags that will replace the existing ones.
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
    Volume refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Volume refresh(Context context);
}
