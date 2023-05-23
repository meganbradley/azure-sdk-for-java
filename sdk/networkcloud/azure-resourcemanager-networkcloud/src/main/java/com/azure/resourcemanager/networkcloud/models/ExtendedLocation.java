// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ExtendedLocation represents the Azure custom location where the resource will be created. */
@Fluent
public final class ExtendedLocation {
    /*
     * The resource ID of the extended location on which the resource will be created.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The extended location type, for example, CustomLocation.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /** Creates an instance of ExtendedLocation class. */
    public ExtendedLocation() {
    }

    /**
     * Get the name property: The resource ID of the extended location on which the resource will be created.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource ID of the extended location on which the resource will be created.
     *
     * @param name the name value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The extended location type, for example, CustomLocation.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The extended location type, for example, CustomLocation.
     *
     * @param type the type value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withType(String type) {
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
                    new IllegalArgumentException("Missing required property name in model ExtendedLocation"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ExtendedLocation"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExtendedLocation.class);
}
