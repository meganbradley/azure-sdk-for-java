// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A single automation scope.
 */
@Fluent
public final class AutomationScope {
    /*
     * The resources scope description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The resources scope path. Can be the subscription on which the automation is defined on or a resource group
     * under that subscription (fully qualified Azure resource IDs).
     */
    @JsonProperty(value = "scopePath")
    private String scopePath;

    /**
     * Creates an instance of AutomationScope class.
     */
    public AutomationScope() {
    }

    /**
     * Get the description property: The resources scope description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The resources scope description.
     * 
     * @param description the description value to set.
     * @return the AutomationScope object itself.
     */
    public AutomationScope withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the scopePath property: The resources scope path. Can be the subscription on which the automation is defined
     * on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
     * @return the scopePath value.
     */
    public String scopePath() {
        return this.scopePath;
    }

    /**
     * Set the scopePath property: The resources scope path. Can be the subscription on which the automation is defined
     * on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
     * @param scopePath the scopePath value to set.
     * @return the AutomationScope object itself.
     */
    public AutomationScope withScopePath(String scopePath) {
        this.scopePath = scopePath;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
