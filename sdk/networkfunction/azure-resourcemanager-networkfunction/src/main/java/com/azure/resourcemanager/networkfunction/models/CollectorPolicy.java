// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkfunction.fluent.models.CollectorPolicyInner;
import java.util.List;

/** An immutable client-side representation of CollectorPolicy. */
public interface CollectorPolicy {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the ingestionPolicy property: Ingestion policies.
     *
     * @return the ingestionPolicy value.
     */
    IngestionPolicyPropertiesFormat ingestionPolicy();

    /**
     * Gets the emissionPolicies property: Emission policies.
     *
     * @return the emissionPolicies value.
     */
    List<EmissionPoliciesPropertiesFormat> emissionPolicies();

    /**
     * Gets the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.networkfunction.fluent.models.CollectorPolicyInner object.
     *
     * @return the inner object.
     */
    CollectorPolicyInner innerModel();

    /** The entirety of the CollectorPolicy definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The CollectorPolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the CollectorPolicy definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CollectorPolicy definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, azureTrafficCollectorName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param azureTrafficCollectorName Azure Traffic Collector name.
             * @return the next definition stage.
             */
            WithCreate withExistingAzureTrafficCollector(String resourceGroupName, String azureTrafficCollectorName);
        }
        /**
         * The stage of the CollectorPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithIngestionPolicy, DefinitionStages.WithEmissionPolicies {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CollectorPolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CollectorPolicy create(Context context);
        }
        /** The stage of the CollectorPolicy definition allowing to specify ingestionPolicy. */
        interface WithIngestionPolicy {
            /**
             * Specifies the ingestionPolicy property: Ingestion policies..
             *
             * @param ingestionPolicy Ingestion policies.
             * @return the next definition stage.
             */
            WithCreate withIngestionPolicy(IngestionPolicyPropertiesFormat ingestionPolicy);
        }
        /** The stage of the CollectorPolicy definition allowing to specify emissionPolicies. */
        interface WithEmissionPolicies {
            /**
             * Specifies the emissionPolicies property: Emission policies..
             *
             * @param emissionPolicies Emission policies.
             * @return the next definition stage.
             */
            WithCreate withEmissionPolicies(List<EmissionPoliciesPropertiesFormat> emissionPolicies);
        }
    }
    /**
     * Begins update for the CollectorPolicy resource.
     *
     * @return the stage of resource update.
     */
    CollectorPolicy.Update update();

    /** The template for CollectorPolicy update. */
    interface Update extends UpdateStages.WithIngestionPolicy, UpdateStages.WithEmissionPolicies {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CollectorPolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CollectorPolicy apply(Context context);
    }
    /** The CollectorPolicy update stages. */
    interface UpdateStages {
        /** The stage of the CollectorPolicy update allowing to specify ingestionPolicy. */
        interface WithIngestionPolicy {
            /**
             * Specifies the ingestionPolicy property: Ingestion policies..
             *
             * @param ingestionPolicy Ingestion policies.
             * @return the next definition stage.
             */
            Update withIngestionPolicy(IngestionPolicyPropertiesFormat ingestionPolicy);
        }
        /** The stage of the CollectorPolicy update allowing to specify emissionPolicies. */
        interface WithEmissionPolicies {
            /**
             * Specifies the emissionPolicies property: Emission policies..
             *
             * @param emissionPolicies Emission policies.
             * @return the next definition stage.
             */
            Update withEmissionPolicies(List<EmissionPoliciesPropertiesFormat> emissionPolicies);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CollectorPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CollectorPolicy refresh(Context context);
}
