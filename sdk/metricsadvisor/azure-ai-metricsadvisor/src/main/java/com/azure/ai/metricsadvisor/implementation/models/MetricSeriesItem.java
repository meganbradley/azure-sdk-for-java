// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** The MetricSeriesItem model. */
@Immutable
public final class MetricSeriesItem {
    /*
     * metric unique id
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID metricId;

    /*
     * dimension name and value pair
     */
    @JsonProperty(value = "dimension", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> dimension;

    /** Creates an instance of MetricSeriesItem class. */
    public MetricSeriesItem() {}

    /**
     * Get the metricId property: metric unique id.
     *
     * @return the metricId value.
     */
    public UUID getMetricId() {
        return this.metricId;
    }

    /**
     * Get the dimension property: dimension name and value pair.
     *
     * @return the dimension value.
     */
    public Map<String, String> getDimension() {
        return this.dimension;
    }
}
