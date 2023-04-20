// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters used for checking whether a resource name is available. */
@Fluent
public final class CheckNameAvailabilityParameters {
    /*
     * The name to check for availability.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The resource type to check for name availability.
     */
    @JsonProperty(value = "type", required = true)
    private ConfigurationResourceType type;

    /** Creates an instance of CheckNameAvailabilityParameters class. */
    public CheckNameAvailabilityParameters() {
    }

    /**
     * Get the name property: The name to check for availability.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name to check for availability.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type to check for name availability.
     *
     * @return the type value.
     */
    public ConfigurationResourceType type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type to check for name availability.
     *
     * @param type the type value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withType(ConfigurationResourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model CheckNameAvailabilityParameters"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property type in model CheckNameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckNameAvailabilityParameters.class);
}
