// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The status detail properties of the connected registry.
 */
@Immutable
public final class StatusDetailProperties {
    /*
     * The component of the connected registry corresponding to the status.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The code of the status.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The description of the status.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The timestamp of the status.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * The correlation ID of the status.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * Creates an instance of StatusDetailProperties class.
     */
    public StatusDetailProperties() {
    }

    /**
     * Get the type property: The component of the connected registry corresponding to the status.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the code property: The code of the status.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the description property: The description of the status.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the timestamp property: The timestamp of the status.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the correlationId property: The correlation ID of the status.
     * 
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
