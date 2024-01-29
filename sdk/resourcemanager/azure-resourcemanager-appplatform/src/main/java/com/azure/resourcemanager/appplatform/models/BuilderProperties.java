// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * KPack Builder properties payload.
 */
@Fluent
public final class BuilderProperties {
    /*
     * Builder provision status.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private BuilderProvisioningState provisioningState;

    /*
     * Builder cluster stack property.
     */
    @JsonProperty(value = "stack")
    private StackProperties stack;

    /*
     * Builder buildpack groups.
     */
    @JsonProperty(value = "buildpackGroups")
    private List<BuildpacksGroupProperties> buildpackGroups;

    /**
     * Creates an instance of BuilderProperties class.
     */
    public BuilderProperties() {
    }

    /**
     * Get the provisioningState property: Builder provision status.
     * 
     * @return the provisioningState value.
     */
    public BuilderProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the stack property: Builder cluster stack property.
     * 
     * @return the stack value.
     */
    public StackProperties stack() {
        return this.stack;
    }

    /**
     * Set the stack property: Builder cluster stack property.
     * 
     * @param stack the stack value to set.
     * @return the BuilderProperties object itself.
     */
    public BuilderProperties withStack(StackProperties stack) {
        this.stack = stack;
        return this;
    }

    /**
     * Get the buildpackGroups property: Builder buildpack groups.
     * 
     * @return the buildpackGroups value.
     */
    public List<BuildpacksGroupProperties> buildpackGroups() {
        return this.buildpackGroups;
    }

    /**
     * Set the buildpackGroups property: Builder buildpack groups.
     * 
     * @param buildpackGroups the buildpackGroups value to set.
     * @return the BuilderProperties object itself.
     */
    public BuilderProperties withBuildpackGroups(List<BuildpacksGroupProperties> buildpackGroups) {
        this.buildpackGroups = buildpackGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stack() != null) {
            stack().validate();
        }
        if (buildpackGroups() != null) {
            buildpackGroups().forEach(e -> e.validate());
        }
    }
}
