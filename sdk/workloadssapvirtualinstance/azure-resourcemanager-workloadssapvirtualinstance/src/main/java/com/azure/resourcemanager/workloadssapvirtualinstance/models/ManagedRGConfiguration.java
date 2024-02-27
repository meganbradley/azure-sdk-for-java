// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed resource group configuration.
 */
@Fluent
public final class ManagedRGConfiguration {
    /*
     * Managed resource group name
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of ManagedRGConfiguration class.
     */
    public ManagedRGConfiguration() {
    }

    /**
     * Get the name property: Managed resource group name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Managed resource group name.
     * 
     * @param name the name value to set.
     * @return the ManagedRGConfiguration object itself.
     */
    public ManagedRGConfiguration withName(String name) {
        this.name = name;
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
