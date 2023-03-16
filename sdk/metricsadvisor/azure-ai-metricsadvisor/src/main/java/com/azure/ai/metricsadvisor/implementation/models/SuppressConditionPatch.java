// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SuppressConditionPatch model. */
@Fluent
public final class SuppressConditionPatch {
    /*
     * min point number, value range : [1, +∞)
     */
    @JsonProperty(value = "minNumber")
    private Integer minNumber;

    /*
     * min point ratio, value range : (0, 100]
     */
    @JsonProperty(value = "minRatio")
    private Double minRatio;

    /**
     * Get the minNumber property: min point number, value range : [1, +∞).
     *
     * @return the minNumber value.
     */
    public Integer getMinNumber() {
        return this.minNumber;
    }

    /**
     * Set the minNumber property: min point number, value range : [1, +∞).
     *
     * @param minNumber the minNumber value to set.
     * @return the SuppressConditionPatch object itself.
     */
    public SuppressConditionPatch setMinNumber(Integer minNumber) {
        this.minNumber = minNumber;
        return this;
    }

    /**
     * Get the minRatio property: min point ratio, value range : (0, 100].
     *
     * @return the minRatio value.
     */
    public Double getMinRatio() {
        return this.minRatio;
    }

    /**
     * Set the minRatio property: min point ratio, value range : (0, 100].
     *
     * @param minRatio the minRatio value to set.
     * @return the SuppressConditionPatch object itself.
     */
    public SuppressConditionPatch setMinRatio(Double minRatio) {
        this.minRatio = minRatio;
        return this;
    }
}
