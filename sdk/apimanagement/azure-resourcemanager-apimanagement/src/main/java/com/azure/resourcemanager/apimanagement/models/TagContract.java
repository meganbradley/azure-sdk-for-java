// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.TagContractInner;

/** An immutable client-side representation of TagContract. */
public interface TagContract {
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
     * Gets the displayName property: Tag name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.TagContractInner object.
     *
     * @return the inner object.
     */
    TagContractInner innerModel();

    /** The entirety of the TagContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The TagContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the TagContract definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the TagContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of the API Management service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }

        /**
         * The stage of the TagContract definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDisplayName, DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            TagContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            TagContract create(Context context);
        }

        /** The stage of the TagContract definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Tag name..
             *
             * @param displayName Tag name.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }

        /** The stage of the TagContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }

    /**
     * Begins update for the TagContract resource.
     *
     * @return the stage of resource update.
     */
    TagContract.Update update();

    /** The template for TagContract update. */
    interface Update extends UpdateStages.WithDisplayName, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        TagContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        TagContract apply(Context context);
    }

    /** The TagContract update stages. */
    interface UpdateStages {
        /** The stage of the TagContract update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: Tag name..
             *
             * @param displayName Tag name.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }

        /** The stage of the TagContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    TagContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    TagContract refresh(Context context);
}
