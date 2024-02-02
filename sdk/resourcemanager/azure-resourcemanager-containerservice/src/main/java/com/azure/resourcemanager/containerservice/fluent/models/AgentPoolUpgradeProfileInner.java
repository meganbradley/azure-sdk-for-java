// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.AgentPoolUpgradeProfilePropertiesUpgradesItem;
import com.azure.resourcemanager.containerservice.models.OSType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of available upgrades for an agent pool.
 */
@Fluent
public final class AgentPoolUpgradeProfileInner {
    /*
     * The ID of the agent pool upgrade profile.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the agent pool upgrade profile.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The type of the agent pool upgrade profile.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The properties of the agent pool upgrade profile.
     */
    @JsonProperty(value = "properties", required = true)
    private AgentPoolUpgradeProfileProperties innerProperties = new AgentPoolUpgradeProfileProperties();

    /**
     * Creates an instance of AgentPoolUpgradeProfileInner class.
     */
    public AgentPoolUpgradeProfileInner() {
    }

    /**
     * Get the id property: The ID of the agent pool upgrade profile.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the agent pool upgrade profile.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the agent pool upgrade profile.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: The properties of the agent pool upgrade profile.
     * 
     * @return the innerProperties value.
     */
    private AgentPoolUpgradeProfileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     * 
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesVersion();
    }

    /**
     * Set the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     * 
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withKubernetesVersion(String kubernetesVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolUpgradeProfileProperties();
        }
        this.innerProperties().withKubernetesVersion(kubernetesVersion);
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     * @return the osType value.
     */
    public OSType osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     * @param osType the osType value to set.
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withOsType(OSType osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolUpgradeProfileProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the upgrades property: List of orchestrator types and versions available for upgrade.
     * 
     * @return the upgrades value.
     */
    public List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades() {
        return this.innerProperties() == null ? null : this.innerProperties().upgrades();
    }

    /**
     * Set the upgrades property: List of orchestrator types and versions available for upgrade.
     * 
     * @param upgrades the upgrades value to set.
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withUpgrades(List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolUpgradeProfileProperties();
        }
        this.innerProperties().withUpgrades(upgrades);
        return this;
    }

    /**
     * Get the latestNodeImageVersion property: The latest AKS supported node image version.
     * 
     * @return the latestNodeImageVersion value.
     */
    public String latestNodeImageVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().latestNodeImageVersion();
    }

    /**
     * Set the latestNodeImageVersion property: The latest AKS supported node image version.
     * 
     * @param latestNodeImageVersion the latestNodeImageVersion value to set.
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withLatestNodeImageVersion(String latestNodeImageVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolUpgradeProfileProperties();
        }
        this.innerProperties().withLatestNodeImageVersion(latestNodeImageVersion);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model AgentPoolUpgradeProfileInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AgentPoolUpgradeProfileInner.class);
}
