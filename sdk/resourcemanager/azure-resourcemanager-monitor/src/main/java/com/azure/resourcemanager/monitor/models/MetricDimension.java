// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies a metric dimension. */
@Fluent
public final class MetricDimension {
    /*
     * Name of the dimension.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * the dimension operator. Only 'Include' and 'Exclude' are supported
     */
    @JsonProperty(value = "operator", required = true)
    private String operator;

    /*
     * list of dimension values.
     */
    @JsonProperty(value = "values", required = true)
    private List<String> values;

    /**
     * Get the name property: Name of the dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the dimension.
     *
     * @param name the name value to set.
     * @return the MetricDimension object itself.
     */
    public MetricDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the operator property: the dimension operator. Only 'Include' and 'Exclude' are supported.
     *
     * @return the operator value.
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set the operator property: the dimension operator. Only 'Include' and 'Exclude' are supported.
     *
     * @param operator the operator value to set.
     * @return the MetricDimension object itself.
     */
    public MetricDimension withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: list of dimension values.
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: list of dimension values.
     *
     * @param values the values value to set.
     * @return the MetricDimension object itself.
     */
    public MetricDimension withValues(List<String> values) {
        this.values = values;
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
                    new IllegalArgumentException("Missing required property name in model MetricDimension"));
        }
        if (operator() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operator in model MetricDimension"));
        }
        if (values() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property values in model MetricDimension"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricDimension.class);
}
