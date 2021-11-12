// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.GlobalReachConnectionInner;

/** An immutable client-side representation of GlobalReachConnection. */
public interface GlobalReachConnection {
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
     * Gets the provisioningState property: The state of the ExpressRoute Circuit Authorization provisioning.
     *
     * @return the provisioningState value.
     */
    GlobalReachConnectionProvisioningState provisioningState();

    /**
     * Gets the addressPrefix property: The network used for global reach carved out from the original network block
     * provided for the private cloud.
     *
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * Gets the authorizationKey property: Authorization key from the peer express route used for the global reach
     * connection.
     *
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * Gets the circuitConnectionStatus property: The connection status of the global reach connection.
     *
     * @return the circuitConnectionStatus value.
     */
    GlobalReachConnectionStatus circuitConnectionStatus();

    /**
     * Gets the peerExpressRouteCircuit property: Identifier of the ExpressRoute Circuit to peer with in the global
     * reach connection.
     *
     * @return the peerExpressRouteCircuit value.
     */
    String peerExpressRouteCircuit();

    /**
     * Gets the expressRouteId property: The ID of the Private Cloud's ExpressRoute Circuit that is participating in the
     * global reach connection.
     *
     * @return the expressRouteId value.
     */
    String expressRouteId();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.GlobalReachConnectionInner object.
     *
     * @return the inner object.
     */
    GlobalReachConnectionInner innerModel();

    /** The entirety of the GlobalReachConnection definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The GlobalReachConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the GlobalReachConnection definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the GlobalReachConnection definition allowing to specify parent resource. */
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
         * The stage of the GlobalReachConnection definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAuthorizationKey,
                DefinitionStages.WithPeerExpressRouteCircuit,
                DefinitionStages.WithExpressRouteId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GlobalReachConnection create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GlobalReachConnection create(Context context);
        }
        /** The stage of the GlobalReachConnection definition allowing to specify authorizationKey. */
        interface WithAuthorizationKey {
            /**
             * Specifies the authorizationKey property: Authorization key from the peer express route used for the
             * global reach connection.
             *
             * @param authorizationKey Authorization key from the peer express route used for the global reach
             *     connection.
             * @return the next definition stage.
             */
            WithCreate withAuthorizationKey(String authorizationKey);
        }
        /** The stage of the GlobalReachConnection definition allowing to specify peerExpressRouteCircuit. */
        interface WithPeerExpressRouteCircuit {
            /**
             * Specifies the peerExpressRouteCircuit property: Identifier of the ExpressRoute Circuit to peer with in
             * the global reach connection.
             *
             * @param peerExpressRouteCircuit Identifier of the ExpressRoute Circuit to peer with in the global reach
             *     connection.
             * @return the next definition stage.
             */
            WithCreate withPeerExpressRouteCircuit(String peerExpressRouteCircuit);
        }
        /** The stage of the GlobalReachConnection definition allowing to specify expressRouteId. */
        interface WithExpressRouteId {
            /**
             * Specifies the expressRouteId property: The ID of the Private Cloud's ExpressRoute Circuit that is
             * participating in the global reach connection.
             *
             * @param expressRouteId The ID of the Private Cloud's ExpressRoute Circuit that is participating in the
             *     global reach connection.
             * @return the next definition stage.
             */
            WithCreate withExpressRouteId(String expressRouteId);
        }
    }
    /**
     * Begins update for the GlobalReachConnection resource.
     *
     * @return the stage of resource update.
     */
    GlobalReachConnection.Update update();

    /** The template for GlobalReachConnection update. */
    interface Update
        extends UpdateStages.WithAuthorizationKey,
            UpdateStages.WithPeerExpressRouteCircuit,
            UpdateStages.WithExpressRouteId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GlobalReachConnection apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GlobalReachConnection apply(Context context);
    }
    /** The GlobalReachConnection update stages. */
    interface UpdateStages {
        /** The stage of the GlobalReachConnection update allowing to specify authorizationKey. */
        interface WithAuthorizationKey {
            /**
             * Specifies the authorizationKey property: Authorization key from the peer express route used for the
             * global reach connection.
             *
             * @param authorizationKey Authorization key from the peer express route used for the global reach
             *     connection.
             * @return the next definition stage.
             */
            Update withAuthorizationKey(String authorizationKey);
        }
        /** The stage of the GlobalReachConnection update allowing to specify peerExpressRouteCircuit. */
        interface WithPeerExpressRouteCircuit {
            /**
             * Specifies the peerExpressRouteCircuit property: Identifier of the ExpressRoute Circuit to peer with in
             * the global reach connection.
             *
             * @param peerExpressRouteCircuit Identifier of the ExpressRoute Circuit to peer with in the global reach
             *     connection.
             * @return the next definition stage.
             */
            Update withPeerExpressRouteCircuit(String peerExpressRouteCircuit);
        }
        /** The stage of the GlobalReachConnection update allowing to specify expressRouteId. */
        interface WithExpressRouteId {
            /**
             * Specifies the expressRouteId property: The ID of the Private Cloud's ExpressRoute Circuit that is
             * participating in the global reach connection.
             *
             * @param expressRouteId The ID of the Private Cloud's ExpressRoute Circuit that is participating in the
             *     global reach connection.
             * @return the next definition stage.
             */
            Update withExpressRouteId(String expressRouteId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    GlobalReachConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GlobalReachConnection refresh(Context context);
}
