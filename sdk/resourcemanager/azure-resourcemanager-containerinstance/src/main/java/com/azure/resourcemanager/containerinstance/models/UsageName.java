// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The name object of the resource. */
@Immutable
public final class UsageName {
    /*
     * The name of the resource
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /*
     * The localized name of the resource
     */
    @JsonProperty(value = "localizedValue", access = JsonProperty.Access.WRITE_ONLY)
    private String localizedValue;

    /** Creates an instance of UsageName class. */
    public UsageName() {
    }

    /**
     * Get the value property: The name of the resource.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the localizedValue property: The localized name of the resource.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
