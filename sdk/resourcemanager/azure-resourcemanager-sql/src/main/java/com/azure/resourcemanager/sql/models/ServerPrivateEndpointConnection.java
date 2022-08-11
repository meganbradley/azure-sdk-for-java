// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private endpoint connection under a server. */
@Immutable
public final class ServerPrivateEndpointConnection {
    /*
     * Resource ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Private endpoint connection properties
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointConnectionPropertiesAutoGenerated properties;

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the properties property: Private endpoint connection properties.
     *
     * @return the properties value.
     */
    public PrivateEndpointConnectionPropertiesAutoGenerated properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
