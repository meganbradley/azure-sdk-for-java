// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.RecoveryServicesProviderInner;

/**
 * An immutable client-side representation of RecoveryServicesProvider.
 */
public interface RecoveryServicesProvider {
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
     * Gets the properties property: Provider properties.
     * 
     * @return the properties value.
     */
    RecoveryServicesProviderProperties properties();

    /**
     * Gets the location property: Resource Location.
     * 
     * @return the location value.
     */
    String location();

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
     * Gets the inner com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.RecoveryServicesProviderInner
     * object.
     * 
     * @return the inner object.
     */
    RecoveryServicesProviderInner innerModel();

    /**
     * The entirety of the RecoveryServicesProvider definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * The RecoveryServicesProvider definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the RecoveryServicesProvider definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the RecoveryServicesProvider definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceName, resourceGroupName, fabricName.
             * 
             * @param resourceName The name of the recovery services vault.
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @param fabricName Fabric name.
             * @return the next definition stage.
             */
            WithProperties withExistingReplicationFabric(String resourceName, String resourceGroupName,
                String fabricName);
        }

        /**
         * The stage of the RecoveryServicesProvider definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties of an add provider request..
             * 
             * @param properties The properties of an add provider request.
             * @return the next definition stage.
             */
            WithCreate withProperties(AddRecoveryServicesProviderInputProperties properties);
        }

        /**
         * The stage of the RecoveryServicesProvider definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            RecoveryServicesProvider create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RecoveryServicesProvider create(Context context);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    RecoveryServicesProvider refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RecoveryServicesProvider refresh(Context context);

    /**
     * Refresh details from the recovery services provider.
     * 
     * The operation to refresh the information from the recovery services provider.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider details.
     */
    RecoveryServicesProvider refreshProvider();

    /**
     * Refresh details from the recovery services provider.
     * 
     * The operation to refresh the information from the recovery services provider.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider details.
     */
    RecoveryServicesProvider refreshProvider(Context context);

    /**
     * Deletes provider from fabric. Note: Deleting provider for any fabric other than SingleHost is unsupported. To
     * maintain backward compatibility for released clients the object "deleteRspInput" is used (if the object is empty
     * we assume that it is old client and continue the old behavior).
     * 
     * The operation to removes/delete(unregister) a recovery services provider from the vault.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete();

    /**
     * Deletes provider from fabric. Note: Deleting provider for any fabric other than SingleHost is unsupported. To
     * maintain backward compatibility for released clients the object "deleteRspInput" is used (if the object is empty
     * we assume that it is old client and continue the old behavior).
     * 
     * The operation to removes/delete(unregister) a recovery services provider from the vault.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(Context context);
}
