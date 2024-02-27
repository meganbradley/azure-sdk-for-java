// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Details about operation related to metrics.
 */
@Fluent
public final class MetricSpecification {
    /*
     * The name of the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized display name of the metric.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the metric.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * The unit that the metric is measured in.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The type of metric aggregation.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * Support metric aggregation type.
     */
    @JsonProperty(value = "supportedAggregationTypes")
    private List<MetricAggregationType> supportedAggregationTypes;

    /*
     * Type of metrics.
     */
    @JsonProperty(value = "metricClass")
    private String metricClass;

    /*
     * Dimensions of the metric
     */
    @JsonProperty(value = "dimensions")
    private List<MetricDimension> dimensions;

    /**
     * Creates an instance of MetricSpecification class.
     */
    public MetricSpecification() {
    }

    /**
     * Get the name property: The name of the metric.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     * 
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized display name of the metric.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized display name of the metric.
     * 
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: The description of the metric.
     * 
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: The description of the metric.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: The unit that the metric is measured in.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit that the metric is measured in.
     * 
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: The type of metric aggregation.
     * 
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: The type of metric aggregation.
     * 
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the supportedAggregationTypes property: Support metric aggregation type.
     * 
     * @return the supportedAggregationTypes value.
     */
    public List<MetricAggregationType> supportedAggregationTypes() {
        return this.supportedAggregationTypes;
    }

    /**
     * Set the supportedAggregationTypes property: Support metric aggregation type.
     * 
     * @param supportedAggregationTypes the supportedAggregationTypes value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportedAggregationTypes(List<MetricAggregationType> supportedAggregationTypes) {
        this.supportedAggregationTypes = supportedAggregationTypes;
        return this;
    }

    /**
     * Get the metricClass property: Type of metrics.
     * 
     * @return the metricClass value.
     */
    public String metricClass() {
        return this.metricClass;
    }

    /**
     * Set the metricClass property: Type of metrics.
     * 
     * @param metricClass the metricClass value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withMetricClass(String metricClass) {
        this.metricClass = metricClass;
        return this;
    }

    /**
     * Get the dimensions property: Dimensions of the metric.
     * 
     * @return the dimensions value.
     */
    public List<MetricDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Dimensions of the metric.
     * 
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<MetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
