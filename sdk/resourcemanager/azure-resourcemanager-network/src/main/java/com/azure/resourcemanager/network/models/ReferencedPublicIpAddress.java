// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference to a public IP address.
 */
@Fluent
public final class ReferencedPublicIpAddress {
    /*
     * The PublicIPAddress Reference.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of ReferencedPublicIpAddress class.
     */
    public ReferencedPublicIpAddress() {
    }

    /**
     * Get the id property: The PublicIPAddress Reference.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The PublicIPAddress Reference.
     * 
     * @param id the id value to set.
     * @return the ReferencedPublicIpAddress object itself.
     */
    public ReferencedPublicIpAddress withId(String id) {
        this.id = id;
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
