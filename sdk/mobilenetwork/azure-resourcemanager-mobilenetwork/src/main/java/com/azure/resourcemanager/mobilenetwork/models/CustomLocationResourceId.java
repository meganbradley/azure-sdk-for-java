// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference to an Azure Arc custom location resource.
 */
@Fluent
public final class CustomLocationResourceId {
    /*
     * Azure Arc custom location resource ID.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Creates an instance of CustomLocationResourceId class.
     */
    public CustomLocationResourceId() {
    }

    /**
     * Get the id property: Azure Arc custom location resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Azure Arc custom location resource ID.
     * 
     * @param id the id value to set.
     * @return the CustomLocationResourceId object itself.
     */
    public CustomLocationResourceId withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property id in model CustomLocationResourceId"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomLocationResourceId.class);
}
