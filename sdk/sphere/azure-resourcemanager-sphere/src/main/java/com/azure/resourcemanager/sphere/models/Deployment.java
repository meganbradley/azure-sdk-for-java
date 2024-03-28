// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sphere.fluent.models.DeploymentInner;

/**
 * An immutable client-side representation of Deployment.
 */
public interface Deployment {
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
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    DeploymentProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.sphere.fluent.models.DeploymentInner object.
     * 
     * @return the inner object.
     */
    DeploymentInner innerModel();

    /**
     * The entirety of the Deployment definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Deployment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Deployment definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Deployment definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, catalogName, productName, deviceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param catalogName Name of catalog.
             * @param productName Name of product.
             * @param deviceGroupName Name of device group.
             * @return the next definition stage.
             */
            WithCreate withExistingDeviceGroup(String resourceGroupName, String catalogName, String productName,
                String deviceGroupName);
        }

        /**
         * The stage of the Deployment definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Deployment create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Deployment create(Context context);
        }

        /**
         * The stage of the Deployment definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(DeploymentProperties properties);
        }
    }

    /**
     * Begins update for the Deployment resource.
     * 
     * @return the stage of resource update.
     */
    Deployment.Update update();

    /**
     * The template for Deployment update.
     */
    interface Update {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Deployment apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Deployment apply(Context context);
    }

    /**
     * The Deployment update stages.
     */
    interface UpdateStages {
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Deployment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Deployment refresh(Context context);
}
