// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type used for update operations of the DataType.
 */
@Fluent
public final class DataTypeUpdate {
    /*
     * The updatable properties of the DataType.
     */
    @JsonProperty(value = "properties")
    private DataTypeUpdateProperties properties;

    /**
     * Creates an instance of DataTypeUpdate class.
     */
    public DataTypeUpdate() {
    }

    /**
     * Get the properties property: The updatable properties of the DataType.
     * 
     * @return the properties value.
     */
    public DataTypeUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The updatable properties of the DataType.
     * 
     * @param properties the properties value to set.
     * @return the DataTypeUpdate object itself.
     */
    public DataTypeUpdate withProperties(DataTypeUpdateProperties properties) {
        this.properties = properties;
        return this;
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
