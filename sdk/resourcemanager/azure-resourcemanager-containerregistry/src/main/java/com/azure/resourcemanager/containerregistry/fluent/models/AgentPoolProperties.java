// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.models.OS;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of agent pool.
 */
@Fluent
public final class AgentPoolProperties {
    /*
     * The count of agent machine
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * The Tier of agent machine
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * The OS of agent machine
     */
    @JsonProperty(value = "os")
    private OS os;

    /*
     * The Virtual Network Subnet Resource Id of the agent machine
     */
    @JsonProperty(value = "virtualNetworkSubnetResourceId")
    private String virtualNetworkSubnetResourceId;

    /*
     * The provisioning state of this agent pool
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of AgentPoolProperties class.
     */
    public AgentPoolProperties() {
    }

    /**
     * Get the count property: The count of agent machine.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: The count of agent machine.
     * 
     * @param count the count value to set.
     * @return the AgentPoolProperties object itself.
     */
    public AgentPoolProperties withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the tier property: The Tier of agent machine.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The Tier of agent machine.
     * 
     * @param tier the tier value to set.
     * @return the AgentPoolProperties object itself.
     */
    public AgentPoolProperties withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the os property: The OS of agent machine.
     * 
     * @return the os value.
     */
    public OS os() {
        return this.os;
    }

    /**
     * Set the os property: The OS of agent machine.
     * 
     * @param os the os value to set.
     * @return the AgentPoolProperties object itself.
     */
    public AgentPoolProperties withOs(OS os) {
        this.os = os;
        return this;
    }

    /**
     * Get the virtualNetworkSubnetResourceId property: The Virtual Network Subnet Resource Id of the agent machine.
     * 
     * @return the virtualNetworkSubnetResourceId value.
     */
    public String virtualNetworkSubnetResourceId() {
        return this.virtualNetworkSubnetResourceId;
    }

    /**
     * Set the virtualNetworkSubnetResourceId property: The Virtual Network Subnet Resource Id of the agent machine.
     * 
     * @param virtualNetworkSubnetResourceId the virtualNetworkSubnetResourceId value to set.
     * @return the AgentPoolProperties object itself.
     */
    public AgentPoolProperties withVirtualNetworkSubnetResourceId(String virtualNetworkSubnetResourceId) {
        this.virtualNetworkSubnetResourceId = virtualNetworkSubnetResourceId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of this agent pool.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
