// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.cosmos.fluent.models.GraphResourceGetResultsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List operation response, that contains the Graph resource and their properties.
 */
@Immutable
public final class GraphResourcesListResult {
    /*
     * List of Graph resource and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<GraphResourceGetResultsInner> value;

    /**
     * Creates an instance of GraphResourcesListResult class.
     */
    public GraphResourcesListResult() {
    }

    /**
     * Get the value property: List of Graph resource and their properties.
     * 
     * @return the value value.
     */
    public List<GraphResourceGetResultsInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
