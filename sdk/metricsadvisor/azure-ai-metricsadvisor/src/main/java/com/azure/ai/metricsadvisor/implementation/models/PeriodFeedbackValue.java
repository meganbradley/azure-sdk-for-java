// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.ai.metricsadvisor.models.PeriodType;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PeriodFeedbackValue model. */
@Fluent
public final class PeriodFeedbackValue {
    /*
     * the type of setting period
     */
    @JsonProperty(value = "periodType", required = true)
    private PeriodType periodType;

    /*
     * the number of intervals a period contains, when no period set to 0
     */
    @JsonProperty(value = "periodValue", required = true)
    private int periodValue;

    /**
     * Get the periodType property: the type of setting period.
     *
     * @return the periodType value.
     */
    public PeriodType getPeriodType() {
        return this.periodType;
    }

    /**
     * Set the periodType property: the type of setting period.
     *
     * @param periodType the periodType value to set.
     * @return the PeriodFeedbackValue object itself.
     */
    public PeriodFeedbackValue setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * Get the periodValue property: the number of intervals a period contains, when no period set to 0.
     *
     * @return the periodValue value.
     */
    public int getPeriodValue() {
        return this.periodValue;
    }

    /**
     * Set the periodValue property: the number of intervals a period contains, when no period set to 0.
     *
     * @param periodValue the periodValue value to set.
     * @return the PeriodFeedbackValue object itself.
     */
    public PeriodFeedbackValue setPeriodValue(int periodValue) {
        this.periodValue = periodValue;
        return this;
    }
}
