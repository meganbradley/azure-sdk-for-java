// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionDefinitionGroupInner;
import java.util.Map;

/**
 * An immutable client-side representation of NetworkFunctionDefinitionGroup.
 */
public interface NetworkFunctionDefinitionGroup {
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
     * Gets the properties property: Network function definition group properties.
     * 
     * @return the properties value.
     */
    NetworkFunctionDefinitionGroupPropertiesFormat properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionDefinitionGroupInner object.
     * 
     * @return the inner object.
     */
    NetworkFunctionDefinitionGroupInner innerModel();

    /**
     * The entirety of the NetworkFunctionDefinitionGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The NetworkFunctionDefinitionGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the NetworkFunctionDefinitionGroup definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the NetworkFunctionDefinitionGroup definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the NetworkFunctionDefinitionGroup definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, publisherName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param publisherName The name of the publisher.
             * @return the next definition stage.
             */
            WithCreate withExistingPublisher(String resourceGroupName, String publisherName);
        }

        /**
         * The stage of the NetworkFunctionDefinitionGroup definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            NetworkFunctionDefinitionGroup create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkFunctionDefinitionGroup create(Context context);
        }

        /**
         * The stage of the NetworkFunctionDefinitionGroup definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the NetworkFunctionDefinitionGroup definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Network function definition group properties..
             * 
             * @param properties Network function definition group properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(NetworkFunctionDefinitionGroupPropertiesFormat properties);
        }
    }

    /**
     * Begins update for the NetworkFunctionDefinitionGroup resource.
     * 
     * @return the stage of resource update.
     */
    NetworkFunctionDefinitionGroup.Update update();

    /**
     * The template for NetworkFunctionDefinitionGroup update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        NetworkFunctionDefinitionGroup apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkFunctionDefinitionGroup apply(Context context);
    }

    /**
     * The NetworkFunctionDefinitionGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the NetworkFunctionDefinitionGroup update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
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
    NetworkFunctionDefinitionGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkFunctionDefinitionGroup refresh(Context context);
}
