// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Rerun tumbling window trigger Parameters.
 */
@Fluent
public final class RerunTumblingWindowTriggerActionParameters {
    /*
     * The start time for the time period for which restatement is initiated. Only UTC time is currently supported.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * The end time for the time period for which restatement is initiated. Only UTC time is currently supported.
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /*
     * The max number of parallel time windows (ready for execution) for which a rerun is triggered.
     */
    @JsonProperty(value = "maxConcurrency", required = true)
    private int maxConcurrency;

    /**
     * Creates an instance of RerunTumblingWindowTriggerActionParameters class.
     */
    public RerunTumblingWindowTriggerActionParameters() {
    }

    /**
     * Get the startTime property: The start time for the time period for which restatement is initiated. Only UTC time
     * is currently supported.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time for the time period for which restatement is initiated. Only UTC time
     * is currently supported.
     * 
     * @param startTime the startTime value to set.
     * @return the RerunTumblingWindowTriggerActionParameters object itself.
     */
    public RerunTumblingWindowTriggerActionParameters setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time for the time period for which restatement is initiated. Only UTC time is
     * currently supported.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time for the time period for which restatement is initiated. Only UTC time is
     * currently supported.
     * 
     * @param endTime the endTime value to set.
     * @return the RerunTumblingWindowTriggerActionParameters object itself.
     */
    public RerunTumblingWindowTriggerActionParameters setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the maxConcurrency property: The max number of parallel time windows (ready for execution) for which a rerun
     * is triggered.
     * 
     * @return the maxConcurrency value.
     */
    public int getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the maxConcurrency property: The max number of parallel time windows (ready for execution) for which a rerun
     * is triggered.
     * 
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the RerunTumblingWindowTriggerActionParameters object itself.
     */
    public RerunTumblingWindowTriggerActionParameters setMaxConcurrency(int maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
}
