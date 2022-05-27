// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.ArcSettingInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ArcSetting. */
public interface ArcSetting {
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
     * Gets the systemData property: System data of ArcSetting resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the ArcSetting proxy resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the arcInstanceResourceGroup property: The resource group that hosts the Arc agents, ie. Hybrid Compute
     * Machine resources.
     *
     * @return the arcInstanceResourceGroup value.
     */
    String arcInstanceResourceGroup();

    /**
     * Gets the arcApplicationClientId property: App id of arc AAD identity.
     *
     * @return the arcApplicationClientId value.
     */
    String arcApplicationClientId();

    /**
     * Gets the arcApplicationTenantId property: Tenant id of arc AAD identity.
     *
     * @return the arcApplicationTenantId value.
     */
    String arcApplicationTenantId();

    /**
     * Gets the arcServicePrincipalObjectId property: Object id of arc AAD service principal.
     *
     * @return the arcServicePrincipalObjectId value.
     */
    String arcServicePrincipalObjectId();

    /**
     * Gets the arcApplicationObjectId property: Object id of arc AAD identity.
     *
     * @return the arcApplicationObjectId value.
     */
    String arcApplicationObjectId();

    /**
     * Gets the aggregateState property: Aggregate state of Arc agent across the nodes in this HCI cluster.
     *
     * @return the aggregateState value.
     */
    ArcSettingAggregateState aggregateState();

    /**
     * Gets the perNodeDetails property: State of Arc agent in each of the nodes.
     *
     * @return the perNodeDetails value.
     */
    List<PerNodeState> perNodeDetails();

    /**
     * Gets the connectivityProperties property: contains connectivity related configuration for ARC resources.
     *
     * @return the connectivityProperties value.
     */
    Object connectivityProperties();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.azurestackhci.fluent.models.ArcSettingInner object.
     *
     * @return the inner object.
     */
    ArcSettingInner innerModel();

    /** The entirety of the ArcSetting definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ArcSetting definition stages. */
    interface DefinitionStages {
        /** The first stage of the ArcSetting definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ArcSetting definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param clusterName The name of the cluster.
             * @return the next definition stage.
             */
            WithCreate withExistingCluster(String resourceGroupName, String clusterName);
        }
        /**
         * The stage of the ArcSetting definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithArcInstanceResourceGroup,
                DefinitionStages.WithArcApplicationClientId,
                DefinitionStages.WithArcApplicationTenantId,
                DefinitionStages.WithArcServicePrincipalObjectId,
                DefinitionStages.WithArcApplicationObjectId,
                DefinitionStages.WithConnectivityProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ArcSetting create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ArcSetting create(Context context);
        }
        /** The stage of the ArcSetting definition allowing to specify arcInstanceResourceGroup. */
        interface WithArcInstanceResourceGroup {
            /**
             * Specifies the arcInstanceResourceGroup property: The resource group that hosts the Arc agents, ie. Hybrid
             * Compute Machine resources..
             *
             * @param arcInstanceResourceGroup The resource group that hosts the Arc agents, ie. Hybrid Compute Machine
             *     resources.
             * @return the next definition stage.
             */
            WithCreate withArcInstanceResourceGroup(String arcInstanceResourceGroup);
        }
        /** The stage of the ArcSetting definition allowing to specify arcApplicationClientId. */
        interface WithArcApplicationClientId {
            /**
             * Specifies the arcApplicationClientId property: App id of arc AAD identity..
             *
             * @param arcApplicationClientId App id of arc AAD identity.
             * @return the next definition stage.
             */
            WithCreate withArcApplicationClientId(String arcApplicationClientId);
        }
        /** The stage of the ArcSetting definition allowing to specify arcApplicationTenantId. */
        interface WithArcApplicationTenantId {
            /**
             * Specifies the arcApplicationTenantId property: Tenant id of arc AAD identity..
             *
             * @param arcApplicationTenantId Tenant id of arc AAD identity.
             * @return the next definition stage.
             */
            WithCreate withArcApplicationTenantId(String arcApplicationTenantId);
        }
        /** The stage of the ArcSetting definition allowing to specify arcServicePrincipalObjectId. */
        interface WithArcServicePrincipalObjectId {
            /**
             * Specifies the arcServicePrincipalObjectId property: Object id of arc AAD service principal..
             *
             * @param arcServicePrincipalObjectId Object id of arc AAD service principal.
             * @return the next definition stage.
             */
            WithCreate withArcServicePrincipalObjectId(String arcServicePrincipalObjectId);
        }
        /** The stage of the ArcSetting definition allowing to specify arcApplicationObjectId. */
        interface WithArcApplicationObjectId {
            /**
             * Specifies the arcApplicationObjectId property: Object id of arc AAD identity..
             *
             * @param arcApplicationObjectId Object id of arc AAD identity.
             * @return the next definition stage.
             */
            WithCreate withArcApplicationObjectId(String arcApplicationObjectId);
        }
        /** The stage of the ArcSetting definition allowing to specify connectivityProperties. */
        interface WithConnectivityProperties {
            /**
             * Specifies the connectivityProperties property: contains connectivity related configuration for ARC
             * resources.
             *
             * @param connectivityProperties contains connectivity related configuration for ARC resources.
             * @return the next definition stage.
             */
            WithCreate withConnectivityProperties(Object connectivityProperties);
        }
    }
    /**
     * Begins update for the ArcSetting resource.
     *
     * @return the stage of resource update.
     */
    ArcSetting.Update update();

    /** The template for ArcSetting update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithConnectivityProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ArcSetting apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ArcSetting apply(Context context);
    }
    /** The ArcSetting update stages. */
    interface UpdateStages {
        /** The stage of the ArcSetting update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ArcSetting update allowing to specify connectivityProperties. */
        interface WithConnectivityProperties {
            /**
             * Specifies the connectivityProperties property: contains connectivity related configuration for ARC
             * resources.
             *
             * @param connectivityProperties contains connectivity related configuration for ARC resources.
             * @return the next definition stage.
             */
            Update withConnectivityProperties(Object connectivityProperties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ArcSetting refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ArcSetting refresh(Context context);

    /**
     * Generate password for arc settings.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    PasswordCredential generatePassword();

    /**
     * Generate password for arc settings.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<PasswordCredential> generatePasswordWithResponse(Context context);

    /**
     * Create Aad identity for arc settings.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return arcIdentity details.
     */
    ArcIdentityResponse createIdentity();

    /**
     * Create Aad identity for arc settings.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return arcIdentity details.
     */
    ArcIdentityResponse createIdentity(Context context);
}
