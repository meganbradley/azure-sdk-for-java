// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.AddonInner;

/** An immutable client-side representation of Addon. */
public interface Addon {
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
     * Gets the properties property: The properties of an addon resource.
     *
     * @return the properties value.
     */
    AddonProperties properties();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.AddonInner object.
     *
     * @return the inner object.
     */
    AddonInner innerModel();

    /** The entirety of the Addon definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The Addon definition stages. */
    interface DefinitionStages {
        /** The first stage of the Addon definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the Addon definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, privateCloudName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param privateCloudName The name of the private cloud.
             * @return the next definition stage.
             */
            WithCreate withExistingPrivateCloud(String resourceGroupName, String privateCloudName);
        }

        /**
         * The stage of the Addon definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Addon create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Addon create(Context context);
        }

        /** The stage of the Addon definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties of an addon resource.
             *
             * @param properties The properties of an addon resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(AddonProperties properties);
        }
    }

    /**
     * Begins update for the Addon resource.
     *
     * @return the stage of resource update.
     */
    Addon.Update update();

    /** The template for Addon update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Addon apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Addon apply(Context context);
    }

    /** The Addon update stages. */
    interface UpdateStages {
        /** The stage of the Addon update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties of an addon resource.
             *
             * @param properties The properties of an addon resource.
             * @return the next definition stage.
             */
            Update withProperties(AddonProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Addon refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Addon refresh(Context context);
}
