// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessPolicyInner;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessRequestInner;
import java.util.List;

/**
 * An immutable client-side representation of JitNetworkAccessPolicy.
 */
public interface JitNetworkAccessPolicy {
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
     * Gets the kind property: Kind of the resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the location property: Location where the resource is stored.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the virtualMachines property: Configurations for Microsoft.Compute/virtualMachines resource type.
     * 
     * @return the virtualMachines value.
     */
    List<JitNetworkAccessPolicyVirtualMachine> virtualMachines();

    /**
     * Gets the requests property: The requests property.
     * 
     * @return the requests value.
     */
    List<JitNetworkAccessRequest> requests();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the Just-in-Time policy.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

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
     * Gets the inner com.azure.resourcemanager.security.fluent.models.JitNetworkAccessPolicyInner object.
     * 
     * @return the inner object.
     */
    JitNetworkAccessPolicyInner innerModel();

    /**
     * The entirety of the JitNetworkAccessPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithVirtualMachines, DefinitionStages.WithCreate {
    }

    /**
     * The JitNetworkAccessPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the JitNetworkAccessPolicy definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the JitNetworkAccessPolicy definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, ascLocation.
             * 
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             * insensitive.
             * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
             * locations.
             * @return the next definition stage.
             */
            WithVirtualMachines withExistingLocation(String resourceGroupName, String ascLocation);
        }

        /**
         * The stage of the JitNetworkAccessPolicy definition allowing to specify virtualMachines.
         */
        interface WithVirtualMachines {
            /**
             * Specifies the virtualMachines property: Configurations for Microsoft.Compute/virtualMachines resource
             * type..
             * 
             * @param virtualMachines Configurations for Microsoft.Compute/virtualMachines resource type.
             * @return the next definition stage.
             */
            WithCreate withVirtualMachines(List<JitNetworkAccessPolicyVirtualMachine> virtualMachines);
        }

        /**
         * The stage of the JitNetworkAccessPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithKind, DefinitionStages.WithRequests {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            JitNetworkAccessPolicy create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            JitNetworkAccessPolicy create(Context context);
        }

        /**
         * The stage of the JitNetworkAccessPolicy definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of the resource.
             * 
             * @param kind Kind of the resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the JitNetworkAccessPolicy definition allowing to specify requests.
         */
        interface WithRequests {
            /**
             * Specifies the requests property: The requests property..
             * 
             * @param requests The requests property.
             * @return the next definition stage.
             */
            WithCreate withRequests(List<JitNetworkAccessRequestInner> requests);
        }
    }

    /**
     * Begins update for the JitNetworkAccessPolicy resource.
     * 
     * @return the stage of resource update.
     */
    JitNetworkAccessPolicy.Update update();

    /**
     * The template for JitNetworkAccessPolicy update.
     */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithVirtualMachines, UpdateStages.WithRequests {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        JitNetworkAccessPolicy apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        JitNetworkAccessPolicy apply(Context context);
    }

    /**
     * The JitNetworkAccessPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the JitNetworkAccessPolicy update allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of the resource.
             * 
             * @param kind Kind of the resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the JitNetworkAccessPolicy update allowing to specify virtualMachines.
         */
        interface WithVirtualMachines {
            /**
             * Specifies the virtualMachines property: Configurations for Microsoft.Compute/virtualMachines resource
             * type..
             * 
             * @param virtualMachines Configurations for Microsoft.Compute/virtualMachines resource type.
             * @return the next definition stage.
             */
            Update withVirtualMachines(List<JitNetworkAccessPolicyVirtualMachine> virtualMachines);
        }

        /**
         * The stage of the JitNetworkAccessPolicy update allowing to specify requests.
         */
        interface WithRequests {
            /**
             * Specifies the requests property: The requests property..
             * 
             * @param requests The requests property.
             * @return the next definition stage.
             */
            Update withRequests(List<JitNetworkAccessRequestInner> requests);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    JitNetworkAccessPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    JitNetworkAccessPolicy refresh(Context context);
}
