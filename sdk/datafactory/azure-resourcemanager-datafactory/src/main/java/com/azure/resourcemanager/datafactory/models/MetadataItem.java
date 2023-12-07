// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specify the name and value of custom metadata item.
 */
@Fluent
public final class MetadataItem {
    /*
     * Metadata item key name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "name")
    private Object name;

    /*
     * Metadata item value. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Creates an instance of MetadataItem class.
     */
    public MetadataItem() {
    }

    /**
     * Get the name property: Metadata item key name. Type: string (or Expression with resultType string).
     * 
     * @return the name value.
     */
    public Object name() {
        return this.name;
    }

    /**
     * Set the name property: Metadata item key name. Type: string (or Expression with resultType string).
     * 
     * @param name the name value to set.
     * @return the MetadataItem object itself.
     */
    public MetadataItem withName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Metadata item value. Type: string (or Expression with resultType string).
     * 
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Metadata item value. Type: string (or Expression with resultType string).
     * 
     * @param value the value value to set.
     * @return the MetadataItem object itself.
     */
    public MetadataItem withValue(Object value) {
        this.value = value;
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
