// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workflow parameters.
 */
@Fluent
public class WorkflowParameter {
    /*
     * The type.
     */
    @JsonProperty(value = "type")
    private ParameterType type;

    /*
     * The value.
     */
    @JsonProperty(value = "value")
    private Object value;

    /*
     * The metadata.
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /*
     * The description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of WorkflowParameter class.
     */
    public WorkflowParameter() {
    }

    /**
     * Get the type property: The type.
     * 
     * @return the type value.
     */
    public ParameterType type() {
        return this.type;
    }

    /**
     * Set the type property: The type.
     * 
     * @param type the type value to set.
     * @return the WorkflowParameter object itself.
     */
    public WorkflowParameter withType(ParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: The value.
     * 
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: The value.
     * 
     * @param value the value value to set.
     * @return the WorkflowParameter object itself.
     */
    public WorkflowParameter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the metadata property: The metadata.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the WorkflowParameter object itself.
     */
    public WorkflowParameter withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the description property: The description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description.
     * 
     * @param description the description value to set.
     * @return the WorkflowParameter object itself.
     */
    public WorkflowParameter withDescription(String description) {
        this.description = description;
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
