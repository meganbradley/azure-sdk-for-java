// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metricsbatch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Represents a metric value.
 */
@Fluent
public final class MetricValue {
    /*
     * The timestamp for the metric value in ISO 8601 format.
     */
    @JsonProperty(value = "timeStamp", required = true)
    private OffsetDateTime timeStamp;

    /*
     * The average value in the time range.
     */
    @JsonProperty(value = "average")
    private Double average;

    /*
     * The least value in the time range.
     */
    @JsonProperty(value = "minimum")
    private Double minimum;

    /*
     * The greatest value in the time range.
     */
    @JsonProperty(value = "maximum")
    private Double maximum;

    /*
     * The sum of all of the values in the time range.
     */
    @JsonProperty(value = "total")
    private Double total;

    /*
     * The number of samples in the time range. Can be used to determine the number of values that contributed to the
     * average value.
     */
    @JsonProperty(value = "count")
    private Double count;

    /**
     * Creates an instance of MetricValue class.
     * 
     * @param timeStamp the timeStamp value to set.
     */
    @JsonCreator
    public MetricValue(@JsonProperty(value = "timeStamp", required = true) OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Get the timeStamp property: The timestamp for the metric value in ISO 8601 format.
     * 
     * @return the timeStamp value.
     */
    public OffsetDateTime getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * Get the average property: The average value in the time range.
     * 
     * @return the average value.
     */
    public Double getAverage() {
        return this.average;
    }

    /**
     * Set the average property: The average value in the time range.
     * 
     * @param average the average value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * Get the minimum property: The least value in the time range.
     * 
     * @return the minimum value.
     */
    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: The least value in the time range.
     * 
     * @param minimum the minimum value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: The greatest value in the time range.
     * 
     * @return the maximum value.
     */
    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: The greatest value in the time range.
     * 
     * @param maximum the maximum value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the total property: The sum of all of the values in the time range.
     * 
     * @return the total value.
     */
    public Double getTotal() {
        return this.total;
    }

    /**
     * Set the total property: The sum of all of the values in the time range.
     * 
     * @param total the total value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Get the count property: The number of samples in the time range. Can be used to determine the number of values
     * that contributed to the average value.
     * 
     * @return the count value.
     */
    public Double getCount() {
        return this.count;
    }

    /**
     * Set the count property: The number of samples in the time range. Can be used to determine the number of values
     * that contributed to the average value.
     * 
     * @param count the count value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setCount(Double count) {
        this.count = count;
        return this;
    }
}
