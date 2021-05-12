// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.DedicatedCloudNodeInner;
import java.util.Map;
import java.util.UUID;

/** An immutable client-side representation of DedicatedCloudNode. */
public interface DedicatedCloudNode {
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
     * Gets the sku property: Dedicated Cloud Nodes SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the availabilityZoneId property: Availability Zone id, e.g. "az1".
     *
     * @return the availabilityZoneId value.
     */
    String availabilityZoneId();

    /**
     * Gets the availabilityZoneName property: Availability Zone name, e.g. "Availability Zone 1".
     *
     * @return the availabilityZoneName value.
     */
    String availabilityZoneName();

    /**
     * Gets the cloudRackName property: VMWare Cloud Rack Name.
     *
     * @return the cloudRackName value.
     */
    String cloudRackName();

    /**
     * Gets the created property: date time the resource was created.
     *
     * @return the created value.
     */
    Object created();

    /**
     * Gets the nodesCount property: count of nodes to create.
     *
     * @return the nodesCount value.
     */
    Integer nodesCount();

    /**
     * Gets the placementGroupId property: Placement Group id, e.g. "n1".
     *
     * @return the placementGroupId value.
     */
    String placementGroupId();

    /**
     * Gets the placementGroupName property: Placement Name, e.g. "Placement Group 1".
     *
     * @return the placementGroupName value.
     */
    String placementGroupName();

    /**
     * Gets the privateCloudId property: Private Cloud Id.
     *
     * @return the privateCloudId value.
     */
    String privateCloudId();

    /**
     * Gets the privateCloudName property: Resource Pool Name.
     *
     * @return the privateCloudName value.
     */
    String privateCloudName();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the purchaseId property: purchase id.
     *
     * @return the purchaseId value.
     */
    UUID purchaseId();

    /**
     * Gets the status property: Node status, indicates is private cloud set up on this node or not.
     *
     * @return the status value.
     */
    NodeStatus status();

    /**
     * Gets the vmwareClusterName property: VMWare Cluster Name.
     *
     * @return the vmwareClusterName value.
     */
    String vmwareClusterName();

    /**
     * Gets the idPropertiesSkuDescriptionId property: SKU's id.
     *
     * @return the idPropertiesSkuDescriptionId value.
     */
    String idPropertiesSkuDescriptionId();

    /**
     * Gets the namePropertiesSkuDescriptionName property: SKU's name.
     *
     * @return the namePropertiesSkuDescriptionName value.
     */
    String namePropertiesSkuDescriptionName();

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
     * Gets the inner com.azure.resourcemanager.vmwarecloudsimple.fluent.models.DedicatedCloudNodeInner object.
     *
     * @return the inner object.
     */
    DedicatedCloudNodeInner innerModel();

    /** The entirety of the DedicatedCloudNode definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DedicatedCloudNode definition stages. */
    interface DefinitionStages {
        /** The first stage of the DedicatedCloudNode definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify location. */
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
        /** The stage of the DedicatedCloudNode definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the DedicatedCloudNode definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithAvailabilityZoneId,
                DefinitionStages.WithNodesCount,
                DefinitionStages.WithPlacementGroupId,
                DefinitionStages.WithPurchaseId,
                DefinitionStages.WithIdPropertiesSkuDescriptionId,
                DefinitionStages.WithNamePropertiesSkuDescriptionName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DedicatedCloudNode create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DedicatedCloudNode create(Context context);
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Dedicated Cloud Nodes SKU.
             *
             * @param sku Dedicated Cloud Nodes SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify availabilityZoneId. */
        interface WithAvailabilityZoneId {
            /**
             * Specifies the availabilityZoneId property: Availability Zone id, e.g. "az1".
             *
             * @param availabilityZoneId Availability Zone id, e.g. "az1".
             * @return the next definition stage.
             */
            WithCreate withAvailabilityZoneId(String availabilityZoneId);
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify nodesCount. */
        interface WithNodesCount {
            /**
             * Specifies the nodesCount property: count of nodes to create.
             *
             * @param nodesCount count of nodes to create.
             * @return the next definition stage.
             */
            WithCreate withNodesCount(Integer nodesCount);
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify placementGroupId. */
        interface WithPlacementGroupId {
            /**
             * Specifies the placementGroupId property: Placement Group id, e.g. "n1".
             *
             * @param placementGroupId Placement Group id, e.g. "n1".
             * @return the next definition stage.
             */
            WithCreate withPlacementGroupId(String placementGroupId);
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify purchaseId. */
        interface WithPurchaseId {
            /**
             * Specifies the purchaseId property: purchase id.
             *
             * @param purchaseId purchase id.
             * @return the next definition stage.
             */
            WithCreate withPurchaseId(UUID purchaseId);
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify idPropertiesSkuDescriptionId. */
        interface WithIdPropertiesSkuDescriptionId {
            /**
             * Specifies the idPropertiesSkuDescriptionId property: SKU's id.
             *
             * @param idPropertiesSkuDescriptionId SKU's id.
             * @return the next definition stage.
             */
            WithCreate withIdPropertiesSkuDescriptionId(String idPropertiesSkuDescriptionId);
        }
        /** The stage of the DedicatedCloudNode definition allowing to specify namePropertiesSkuDescriptionName. */
        interface WithNamePropertiesSkuDescriptionName {
            /**
             * Specifies the namePropertiesSkuDescriptionName property: SKU's name.
             *
             * @param namePropertiesSkuDescriptionName SKU's name.
             * @return the next definition stage.
             */
            WithCreate withNamePropertiesSkuDescriptionName(String namePropertiesSkuDescriptionName);
        }
    }
    /**
     * Begins update for the DedicatedCloudNode resource.
     *
     * @return the stage of resource update.
     */
    DedicatedCloudNode.Update update();

    /** The template for DedicatedCloudNode update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DedicatedCloudNode apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DedicatedCloudNode apply(Context context);
    }
    /** The DedicatedCloudNode update stages. */
    interface UpdateStages {
        /** The stage of the DedicatedCloudNode update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags key:value pairs.
             *
             * @param tags The tags key:value pairs.
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
    DedicatedCloudNode refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DedicatedCloudNode refresh(Context context);
}
