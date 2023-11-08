// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.ClusterInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Cluster. */
public interface Cluster {
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
     * Gets the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the sku property: The sku properties.
     *
     * @return the sku value.
     */
    ClusterSku sku();

    /**
     * Gets the clusterId property: The ID associated with the cluster.
     *
     * @return the clusterId value.
     */
    String clusterId();

    /**
     * Gets the provisioningState property: The provisioning state of the cluster.
     *
     * @return the provisioningState value.
     */
    ClusterEntityStatus provisioningState();

    /**
     * Gets the isDoubleEncryptionEnabled property: Configures whether cluster will use double encryption. This Property
     * can not be modified after cluster creation. Default value is 'true'.
     *
     * @return the isDoubleEncryptionEnabled value.
     */
    Boolean isDoubleEncryptionEnabled();

    /**
     * Gets the isAvailabilityZonesEnabled property: Sets whether the cluster will support availability zones. This can
     * be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be
     * modified after cluster creation. Default value is 'true' if region supports Availability Zones.
     *
     * @return the isAvailabilityZonesEnabled value.
     */
    Boolean isAvailabilityZonesEnabled();

    /**
     * Gets the billingType property: The cluster's billing type.
     *
     * @return the billingType value.
     */
    BillingType billingType();

    /**
     * Gets the keyVaultProperties property: The associated key properties.
     *
     * @return the keyVaultProperties value.
     */
    KeyVaultProperties keyVaultProperties();

    /**
     * Gets the lastModifiedDate property: The last time the cluster was updated.
     *
     * @return the lastModifiedDate value.
     */
    String lastModifiedDate();

    /**
     * Gets the createdDate property: The cluster creation time.
     *
     * @return the createdDate value.
     */
    String createdDate();

    /**
     * Gets the associatedWorkspaces property: The list of Log Analytics workspaces associated with the cluster.
     *
     * @return the associatedWorkspaces value.
     */
    List<AssociatedWorkspace> associatedWorkspaces();

    /**
     * Gets the capacityReservationProperties property: Additional properties for capacity reservation.
     *
     * @return the capacityReservationProperties value.
     */
    CapacityReservationProperties capacityReservationProperties();

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
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.ClusterInner object.
     *
     * @return the inner object.
     */
    ClusterInner innerModel();

    /** The entirety of the Cluster definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The Cluster definition stages. */
    interface DefinitionStages {
        /** The first stage of the Cluster definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the Cluster definition allowing to specify location. */
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

        /** The stage of the Cluster definition allowing to specify parent resource. */
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
         * The stage of the Cluster definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithSku,
                DefinitionStages.WithIsDoubleEncryptionEnabled,
                DefinitionStages.WithIsAvailabilityZonesEnabled,
                DefinitionStages.WithBillingType,
                DefinitionStages.WithKeyVaultProperties,
                DefinitionStages.WithAssociatedWorkspaces,
                DefinitionStages.WithCapacityReservationProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Cluster create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Cluster create(Context context);
        }

        /** The stage of the Cluster definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the Cluster definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }

        /** The stage of the Cluster definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku properties..
             *
             * @param sku The sku properties.
             * @return the next definition stage.
             */
            WithCreate withSku(ClusterSku sku);
        }

        /** The stage of the Cluster definition allowing to specify isDoubleEncryptionEnabled. */
        interface WithIsDoubleEncryptionEnabled {
            /**
             * Specifies the isDoubleEncryptionEnabled property: Configures whether cluster will use double encryption.
             * This Property can not be modified after cluster creation. Default value is 'true'.
             *
             * @param isDoubleEncryptionEnabled Configures whether cluster will use double encryption. This Property can
             *     not be modified after cluster creation. Default value is 'true'.
             * @return the next definition stage.
             */
            WithCreate withIsDoubleEncryptionEnabled(Boolean isDoubleEncryptionEnabled);
        }

        /** The stage of the Cluster definition allowing to specify isAvailabilityZonesEnabled. */
        interface WithIsAvailabilityZonesEnabled {
            /**
             * Specifies the isAvailabilityZonesEnabled property: Sets whether the cluster will support availability
             * zones. This can be set as true only in regions where Azure Data Explorer support Availability Zones. This
             * Property can not be modified after cluster creation. Default value is 'true' if region supports
             * Availability Zones..
             *
             * @param isAvailabilityZonesEnabled Sets whether the cluster will support availability zones. This can be
             *     set as true only in regions where Azure Data Explorer support Availability Zones. This Property can
             *     not be modified after cluster creation. Default value is 'true' if region supports Availability
             *     Zones.
             * @return the next definition stage.
             */
            WithCreate withIsAvailabilityZonesEnabled(Boolean isAvailabilityZonesEnabled);
        }

        /** The stage of the Cluster definition allowing to specify billingType. */
        interface WithBillingType {
            /**
             * Specifies the billingType property: The cluster's billing type..
             *
             * @param billingType The cluster's billing type.
             * @return the next definition stage.
             */
            WithCreate withBillingType(BillingType billingType);
        }

        /** The stage of the Cluster definition allowing to specify keyVaultProperties. */
        interface WithKeyVaultProperties {
            /**
             * Specifies the keyVaultProperties property: The associated key properties..
             *
             * @param keyVaultProperties The associated key properties.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultProperties(KeyVaultProperties keyVaultProperties);
        }

        /** The stage of the Cluster definition allowing to specify associatedWorkspaces. */
        interface WithAssociatedWorkspaces {
            /**
             * Specifies the associatedWorkspaces property: The list of Log Analytics workspaces associated with the
             * cluster.
             *
             * @param associatedWorkspaces The list of Log Analytics workspaces associated with the cluster.
             * @return the next definition stage.
             */
            WithCreate withAssociatedWorkspaces(List<AssociatedWorkspace> associatedWorkspaces);
        }

        /** The stage of the Cluster definition allowing to specify capacityReservationProperties. */
        interface WithCapacityReservationProperties {
            /**
             * Specifies the capacityReservationProperties property: Additional properties for capacity reservation.
             *
             * @param capacityReservationProperties Additional properties for capacity reservation.
             * @return the next definition stage.
             */
            WithCreate withCapacityReservationProperties(CapacityReservationProperties capacityReservationProperties);
        }
    }

    /**
     * Begins update for the Cluster resource.
     *
     * @return the stage of resource update.
     */
    Cluster.Update update();

    /** The template for Cluster update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithSku,
            UpdateStages.WithKeyVaultProperties,
            UpdateStages.WithBillingType {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Cluster apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Cluster apply(Context context);
    }

    /** The Cluster update stages. */
    interface UpdateStages {
        /** The stage of the Cluster update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the Cluster update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }

        /** The stage of the Cluster update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku properties..
             *
             * @param sku The sku properties.
             * @return the next definition stage.
             */
            Update withSku(ClusterSku sku);
        }

        /** The stage of the Cluster update allowing to specify keyVaultProperties. */
        interface WithKeyVaultProperties {
            /**
             * Specifies the keyVaultProperties property: The associated key properties..
             *
             * @param keyVaultProperties The associated key properties.
             * @return the next definition stage.
             */
            Update withKeyVaultProperties(KeyVaultProperties keyVaultProperties);
        }

        /** The stage of the Cluster update allowing to specify billingType. */
        interface WithBillingType {
            /**
             * Specifies the billingType property: The cluster's billing type..
             *
             * @param billingType The cluster's billing type.
             * @return the next definition stage.
             */
            Update withBillingType(BillingType billingType);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Cluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Cluster refresh(Context context);
}
