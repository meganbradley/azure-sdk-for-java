// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Nsp configuration with profile information.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationProfile {
    /*
     * Nsp configuration profile name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Access rules version number for nsp profile.
     */
    @JsonProperty(value = "accessRulesVersion")
    private String accessRulesVersion;

    /*
     * List of inbound or outbound access rule setup on the nsp profile.
     */
    @JsonProperty(value = "accessRules")
    private List<NetworkSecurityPerimeterProfileAccessRule> accessRules;

    /*
     * Diagnostic settings version number for nsp profile.
     */
    @JsonProperty(value = "diagnosticSettingsVersion")
    private String diagnosticSettingsVersion;

    /*
     * Enabled log categories for nsp profile.
     */
    @JsonProperty(value = "enabledLogCategories")
    private List<String> enabledLogCategories;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationProfile class.
     */
    public NetworkSecurityPerimeterConfigurationProfile() {
    }

    /**
     * Get the name property: Nsp configuration profile name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Nsp configuration profile name.
     * 
     * @param name the name value to set.
     * @return the NetworkSecurityPerimeterConfigurationProfile object itself.
     */
    public NetworkSecurityPerimeterConfigurationProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the accessRulesVersion property: Access rules version number for nsp profile.
     * 
     * @return the accessRulesVersion value.
     */
    public String accessRulesVersion() {
        return this.accessRulesVersion;
    }

    /**
     * Set the accessRulesVersion property: Access rules version number for nsp profile.
     * 
     * @param accessRulesVersion the accessRulesVersion value to set.
     * @return the NetworkSecurityPerimeterConfigurationProfile object itself.
     */
    public NetworkSecurityPerimeterConfigurationProfile withAccessRulesVersion(String accessRulesVersion) {
        this.accessRulesVersion = accessRulesVersion;
        return this;
    }

    /**
     * Get the accessRules property: List of inbound or outbound access rule setup on the nsp profile.
     * 
     * @return the accessRules value.
     */
    public List<NetworkSecurityPerimeterProfileAccessRule> accessRules() {
        return this.accessRules;
    }

    /**
     * Set the accessRules property: List of inbound or outbound access rule setup on the nsp profile.
     * 
     * @param accessRules the accessRules value to set.
     * @return the NetworkSecurityPerimeterConfigurationProfile object itself.
     */
    public NetworkSecurityPerimeterConfigurationProfile
        withAccessRules(List<NetworkSecurityPerimeterProfileAccessRule> accessRules) {
        this.accessRules = accessRules;
        return this;
    }

    /**
     * Get the diagnosticSettingsVersion property: Diagnostic settings version number for nsp profile.
     * 
     * @return the diagnosticSettingsVersion value.
     */
    public String diagnosticSettingsVersion() {
        return this.diagnosticSettingsVersion;
    }

    /**
     * Set the diagnosticSettingsVersion property: Diagnostic settings version number for nsp profile.
     * 
     * @param diagnosticSettingsVersion the diagnosticSettingsVersion value to set.
     * @return the NetworkSecurityPerimeterConfigurationProfile object itself.
     */
    public NetworkSecurityPerimeterConfigurationProfile
        withDiagnosticSettingsVersion(String diagnosticSettingsVersion) {
        this.diagnosticSettingsVersion = diagnosticSettingsVersion;
        return this;
    }

    /**
     * Get the enabledLogCategories property: Enabled log categories for nsp profile.
     * 
     * @return the enabledLogCategories value.
     */
    public List<String> enabledLogCategories() {
        return this.enabledLogCategories;
    }

    /**
     * Set the enabledLogCategories property: Enabled log categories for nsp profile.
     * 
     * @param enabledLogCategories the enabledLogCategories value to set.
     * @return the NetworkSecurityPerimeterConfigurationProfile object itself.
     */
    public NetworkSecurityPerimeterConfigurationProfile withEnabledLogCategories(List<String> enabledLogCategories) {
        this.enabledLogCategories = enabledLogCategories;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessRules() != null) {
            accessRules().forEach(e -> e.validate());
        }
    }
}
