// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is used to express the source of an input schema mapping for a single target field in the Event Grid Event
 * schema. This is currently used in the mappings for the 'id', 'topic' and 'eventtime' properties. This represents a
 * field in the input event schema.
 */
@Fluent
public final class JsonField {
    /*
     * Name of a field in the input event schema that's to be used as the source of a mapping.
     */
    @JsonProperty(value = "sourceField")
    private String sourceField;

    /** Creates an instance of JsonField class. */
    public JsonField() {
    }

    /**
     * Get the sourceField property: Name of a field in the input event schema that's to be used as the source of a
     * mapping.
     *
     * @return the sourceField value.
     */
    public String sourceField() {
        return this.sourceField;
    }

    /**
     * Set the sourceField property: Name of a field in the input event schema that's to be used as the source of a
     * mapping.
     *
     * @param sourceField the sourceField value to set.
     * @return the JsonField object itself.
     */
    public JsonField withSourceField(String sourceField) {
        this.sourceField = sourceField;
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
