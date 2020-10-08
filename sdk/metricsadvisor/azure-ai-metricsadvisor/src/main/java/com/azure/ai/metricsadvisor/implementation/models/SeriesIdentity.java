// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The SeriesIdentity model. */
@Fluent
public final class SeriesIdentity {
    /*
     * dimension specified for series
     */
    @JsonProperty(value = "dimension", required = true)
    private Map<String, String> dimension;

    /**
     * Get the dimension property: dimension specified for series.
     *
     * @return the dimension value.
     */
    public Map<String, String> getDimension() {
        return this.dimension;
    }

    /**
     * Set the dimension property: dimension specified for series.
     *
     * @param dimension the dimension value to set.
     * @return the SeriesIdentity object itself.
     */
    public SeriesIdentity setDimension(Map<String, String> dimension) {
        this.dimension = dimension;
        return this;
    }
}
