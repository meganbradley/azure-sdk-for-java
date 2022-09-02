// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Declaration of a custom stream. */
@Fluent
public final class StreamDeclaration {
    /*
     * List of columns used by data in this stream.
     */
    @JsonProperty(value = "columns")
    private List<ColumnDefinition> columns;

    /**
     * Get the columns property: List of columns used by data in this stream.
     *
     * @return the columns value.
     */
    public List<ColumnDefinition> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: List of columns used by data in this stream.
     *
     * @param columns the columns value to set.
     * @return the StreamDeclaration object itself.
     */
    public StreamDeclaration withColumns(List<ColumnDefinition> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (columns() != null) {
            columns().forEach(e -> e.validate());
        }
    }
}
