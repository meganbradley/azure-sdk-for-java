// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.AzureFirewallNetworkRuleCollectionPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network rule collection resource. */
@Fluent
public final class AzureFirewallNetworkRuleCollection extends SubResource {
    /*
     * Properties of the azure firewall network rule collection.
     */
    @JsonProperty(value = "properties")
    private AzureFirewallNetworkRuleCollectionPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Properties of the azure firewall network rule collection.
     *
     * @return the innerProperties value.
     */
    private AzureFirewallNetworkRuleCollectionPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within the Azure firewall. This name can be used
     * to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the Azure firewall. This name can be used
     * to access the resource.
     *
     * @param name the name value to set.
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFirewallNetworkRuleCollection withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the priority property: Priority of the network rule collection resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority of the network rule collection resource.
     *
     * @param priority the priority value to set.
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallNetworkRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the action property: The action type of a rule collection.
     *
     * @return the action value.
     */
    public AzureFirewallRCAction action() {
        return this.innerProperties() == null ? null : this.innerProperties().action();
    }

    /**
     * Set the action property: The action type of a rule collection.
     *
     * @param action the action value to set.
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withAction(AzureFirewallRCAction action) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallNetworkRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withAction(action);
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a network rule collection.
     *
     * @return the rules value.
     */
    public List<AzureFirewallNetworkRule> rules() {
        return this.innerProperties() == null ? null : this.innerProperties().rules();
    }

    /**
     * Set the rules property: Collection of rules used by a network rule collection.
     *
     * @param rules the rules value to set.
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withRules(List<AzureFirewallNetworkRule> rules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallNetworkRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withRules(rules);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network rule collection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
