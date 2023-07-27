// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Model that represents the Capability properties model. */
@Immutable
public final class CapabilityProperties {
    /*
     * String of the Publisher that this Capability extends.
     */
    @JsonProperty(value = "publisher", access = JsonProperty.Access.WRITE_ONLY)
    private String publisher;

    /*
     * String of the Target Type that this Capability extends.
     */
    @JsonProperty(value = "targetType", access = JsonProperty.Access.WRITE_ONLY)
    private String targetType;

    /*
     * Localized string of the description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * URL to retrieve JSON schema of the Capability parameters.
     */
    @JsonProperty(value = "parametersSchema", access = JsonProperty.Access.WRITE_ONLY)
    private String parametersSchema;

    /*
     * String of the URN for this Capability Type.
     */
    @JsonProperty(value = "urn", access = JsonProperty.Access.WRITE_ONLY)
    private String urn;

    /** Creates an instance of CapabilityProperties class. */
    public CapabilityProperties() {
    }

    /**
     * Get the publisher property: String of the Publisher that this Capability extends.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Get the targetType property: String of the Target Type that this Capability extends.
     *
     * @return the targetType value.
     */
    public String targetType() {
        return this.targetType;
    }

    /**
     * Get the description property: Localized string of the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the parametersSchema property: URL to retrieve JSON schema of the Capability parameters.
     *
     * @return the parametersSchema value.
     */
    public String parametersSchema() {
        return this.parametersSchema;
    }

    /**
     * Get the urn property: String of the URN for this Capability Type.
     *
     * @return the urn value.
     */
    public String urn() {
        return this.urn;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
