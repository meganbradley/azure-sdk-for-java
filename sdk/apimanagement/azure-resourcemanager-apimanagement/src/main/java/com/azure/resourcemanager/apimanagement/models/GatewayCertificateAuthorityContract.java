// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayCertificateAuthorityContractInner;

/** An immutable client-side representation of GatewayCertificateAuthorityContract. */
public interface GatewayCertificateAuthorityContract {
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
     * Gets the isTrusted property: Determines whether certificate authority is trusted.
     *
     * @return the isTrusted value.
     */
    Boolean isTrusted();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.GatewayCertificateAuthorityContractInner
     * object.
     *
     * @return the inner object.
     */
    GatewayCertificateAuthorityContractInner innerModel();

    /** The entirety of the GatewayCertificateAuthorityContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The GatewayCertificateAuthorityContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the GatewayCertificateAuthorityContract definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the GatewayCertificateAuthorityContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName, gatewayId.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of the API Management service.
             * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service
             *     instance. Must not have value 'managed'.
             * @return the next definition stage.
             */
            WithCreate withExistingGateway(String resourceGroupName, String serviceName, String gatewayId);
        }

        /**
         * The stage of the GatewayCertificateAuthorityContract definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithIsTrusted, DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GatewayCertificateAuthorityContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GatewayCertificateAuthorityContract create(Context context);
        }

        /** The stage of the GatewayCertificateAuthorityContract definition allowing to specify isTrusted. */
        interface WithIsTrusted {
            /**
             * Specifies the isTrusted property: Determines whether certificate authority is trusted..
             *
             * @param isTrusted Determines whether certificate authority is trusted.
             * @return the next definition stage.
             */
            WithCreate withIsTrusted(Boolean isTrusted);
        }

        /** The stage of the GatewayCertificateAuthorityContract definition allowing to specify ifMatch. */
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
     * Begins update for the GatewayCertificateAuthorityContract resource.
     *
     * @return the stage of resource update.
     */
    GatewayCertificateAuthorityContract.Update update();

    /** The template for GatewayCertificateAuthorityContract update. */
    interface Update extends UpdateStages.WithIsTrusted, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GatewayCertificateAuthorityContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GatewayCertificateAuthorityContract apply(Context context);
    }

    /** The GatewayCertificateAuthorityContract update stages. */
    interface UpdateStages {
        /** The stage of the GatewayCertificateAuthorityContract update allowing to specify isTrusted. */
        interface WithIsTrusted {
            /**
             * Specifies the isTrusted property: Determines whether certificate authority is trusted..
             *
             * @param isTrusted Determines whether certificate authority is trusted.
             * @return the next definition stage.
             */
            Update withIsTrusted(Boolean isTrusted);
        }

        /** The stage of the GatewayCertificateAuthorityContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
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
    GatewayCertificateAuthorityContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GatewayCertificateAuthorityContract refresh(Context context);
}
