// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayRuleInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of InternetGatewayRule. */
public interface InternetGatewayRule {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the ruleProperties property: Rules for the InternetGateways.
     *
     * @return the ruleProperties value.
     */
    RuleProperties ruleProperties();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the internetGatewayIds property: List of Internet Gateway resource Id.
     *
     * @return the internetGatewayIds value.
     */
    List<String> internetGatewayIds();

    /**
     * Gets the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    String annotation();

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
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayRuleInner object.
     *
     * @return the inner object.
     */
    InternetGatewayRuleInner innerModel();

    /** The entirety of the InternetGatewayRule definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithRuleProperties,
            DefinitionStages.WithCreate {
    }

    /** The InternetGatewayRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the InternetGatewayRule definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the InternetGatewayRule definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the InternetGatewayRule definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithRuleProperties withExistingResourceGroup(String resourceGroupName);
        }

        /** The stage of the InternetGatewayRule definition allowing to specify ruleProperties. */
        interface WithRuleProperties {
            /**
             * Specifies the ruleProperties property: Rules for the InternetGateways.
             *
             * @param ruleProperties Rules for the InternetGateways.
             * @return the next definition stage.
             */
            WithCreate withRuleProperties(RuleProperties ruleProperties);
        }

        /**
         * The stage of the InternetGatewayRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithAnnotation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            InternetGatewayRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            InternetGatewayRule create(Context context);
        }

        /** The stage of the InternetGatewayRule definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the InternetGatewayRule definition allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            WithCreate withAnnotation(String annotation);
        }
    }

    /**
     * Begins update for the InternetGatewayRule resource.
     *
     * @return the stage of resource update.
     */
    InternetGatewayRule.Update update();

    /** The template for InternetGatewayRule update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        InternetGatewayRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        InternetGatewayRule apply(Context context);
    }

    /** The InternetGatewayRule update stages. */
    interface UpdateStages {
        /** The stage of the InternetGatewayRule update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
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
    InternetGatewayRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    InternetGatewayRule refresh(Context context);
}
