// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The metric counter. */
@Fluent
public final class MetricCounter {
    /*
     * The counter name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The instance from which counter should be collected.
     */
    @JsonProperty(value = "instance")
    private String instance;

    /*
     * The dimension filter.
     */
    @JsonProperty(value = "dimensionFilter")
    private List<MetricDimension> dimensionFilter;

    /*
     * The additional dimensions to be added to metric.
     */
    @JsonProperty(value = "additionalDimensions")
    private List<MetricDimension> additionalDimensions;

    /** Creates an instance of MetricCounter class. */
    public MetricCounter() {
    }

    /**
     * Get the name property: The counter name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The counter name.
     *
     * @param name the name value to set.
     * @return the MetricCounter object itself.
     */
    public MetricCounter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the instance property: The instance from which counter should be collected.
     *
     * @return the instance value.
     */
    public String instance() {
        return this.instance;
    }

    /**
     * Set the instance property: The instance from which counter should be collected.
     *
     * @param instance the instance value to set.
     * @return the MetricCounter object itself.
     */
    public MetricCounter withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    /**
     * Get the dimensionFilter property: The dimension filter.
     *
     * @return the dimensionFilter value.
     */
    public List<MetricDimension> dimensionFilter() {
        return this.dimensionFilter;
    }

    /**
     * Set the dimensionFilter property: The dimension filter.
     *
     * @param dimensionFilter the dimensionFilter value to set.
     * @return the MetricCounter object itself.
     */
    public MetricCounter withDimensionFilter(List<MetricDimension> dimensionFilter) {
        this.dimensionFilter = dimensionFilter;
        return this;
    }

    /**
     * Get the additionalDimensions property: The additional dimensions to be added to metric.
     *
     * @return the additionalDimensions value.
     */
    public List<MetricDimension> additionalDimensions() {
        return this.additionalDimensions;
    }

    /**
     * Set the additionalDimensions property: The additional dimensions to be added to metric.
     *
     * @param additionalDimensions the additionalDimensions value to set.
     * @return the MetricCounter object itself.
     */
    public MetricCounter withAdditionalDimensions(List<MetricDimension> additionalDimensions) {
        this.additionalDimensions = additionalDimensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model MetricCounter"));
        }
        if (dimensionFilter() != null) {
            dimensionFilter().forEach(e -> e.validate());
        }
        if (additionalDimensions() != null) {
            additionalDimensions().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricCounter.class);
}
