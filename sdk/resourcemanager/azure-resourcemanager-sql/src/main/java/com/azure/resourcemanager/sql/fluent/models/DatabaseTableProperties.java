// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.TableTemporalType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database table properties.
 */
@Fluent
public final class DatabaseTableProperties {
    /*
     * The table temporal type.
     */
    @JsonProperty(value = "temporalType")
    private TableTemporalType temporalType;

    /*
     * Whether or not the table is memory optimized.
     */
    @JsonProperty(value = "memoryOptimized")
    private Boolean memoryOptimized;

    /**
     * Creates an instance of DatabaseTableProperties class.
     */
    public DatabaseTableProperties() {
    }

    /**
     * Get the temporalType property: The table temporal type.
     * 
     * @return the temporalType value.
     */
    public TableTemporalType temporalType() {
        return this.temporalType;
    }

    /**
     * Set the temporalType property: The table temporal type.
     * 
     * @param temporalType the temporalType value to set.
     * @return the DatabaseTableProperties object itself.
     */
    public DatabaseTableProperties withTemporalType(TableTemporalType temporalType) {
        this.temporalType = temporalType;
        return this;
    }

    /**
     * Get the memoryOptimized property: Whether or not the table is memory optimized.
     * 
     * @return the memoryOptimized value.
     */
    public Boolean memoryOptimized() {
        return this.memoryOptimized;
    }

    /**
     * Set the memoryOptimized property: Whether or not the table is memory optimized.
     * 
     * @param memoryOptimized the memoryOptimized value to set.
     * @return the DatabaseTableProperties object itself.
     */
    public DatabaseTableProperties withMemoryOptimized(Boolean memoryOptimized) {
        this.memoryOptimized = memoryOptimized;
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
