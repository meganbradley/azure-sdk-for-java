// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a overridable value that can be passed to a task template. */
@Fluent
public final class SetValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SetValue.class);

    /*
     * The name of the overridable value.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The overridable value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Flag to indicate whether the value represents a secret or not.
     */
    @JsonProperty(value = "isSecret")
    private Boolean isSecret;

    /**
     * Get the name property: The name of the overridable value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the overridable value.
     *
     * @param name the name value to set.
     * @return the SetValue object itself.
     */
    public SetValue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The overridable value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The overridable value.
     *
     * @param value the value value to set.
     * @return the SetValue object itself.
     */
    public SetValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the isSecret property: Flag to indicate whether the value represents a secret or not.
     *
     * @return the isSecret value.
     */
    public Boolean isSecret() {
        return this.isSecret;
    }

    /**
     * Set the isSecret property: Flag to indicate whether the value represents a secret or not.
     *
     * @param isSecret the isSecret value to set.
     * @return the SetValue object itself.
     */
    public SetValue withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model SetValue"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property value in model SetValue"));
        }
    }
}
