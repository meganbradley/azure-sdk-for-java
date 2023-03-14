// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** The PeriodFeedback model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "feedbackType")
@JsonTypeName("Period")
@Fluent
public final class PeriodFeedback extends MetricFeedback {
    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private PeriodFeedbackValue value;

    /** Creates an instance of PeriodFeedback class. */
    public PeriodFeedback() {}

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public PeriodFeedbackValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the PeriodFeedback object itself.
     */
    public PeriodFeedback setValue(PeriodFeedbackValue value) {
        this.value = value;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PeriodFeedback setMetricId(UUID metricId) {
        super.setMetricId(metricId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PeriodFeedback setDimensionFilter(FeedbackDimensionFilter dimensionFilter) {
        super.setDimensionFilter(dimensionFilter);
        return this;
    }
}
