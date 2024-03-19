// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SmartDetectionConditionPatch model. */
@Fluent
public final class SmartDetectionConditionPatch {
    /*
     * sensitivity, value range : (0, 100]
     */
    @JsonProperty(value = "sensitivity")
    private Double sensitivity;

    /*
     * detection direction
     */
    @JsonProperty(value = "anomalyDetectorDirection")
    private AnomalyDetectorDirection anomalyDetectorDirection;

    /*
     * The suppressCondition property.
     */
    @JsonProperty(value = "suppressCondition")
    private SuppressConditionPatch suppressCondition;

    /** Creates an instance of SmartDetectionConditionPatch class. */
    public SmartDetectionConditionPatch() {}

    /**
     * Get the sensitivity property: sensitivity, value range : (0, 100].
     *
     * @return the sensitivity value.
     */
    public Double getSensitivity() {
        return this.sensitivity;
    }

    /**
     * Set the sensitivity property: sensitivity, value range : (0, 100].
     *
     * @param sensitivity the sensitivity value to set.
     * @return the SmartDetectionConditionPatch object itself.
     */
    public SmartDetectionConditionPatch setSensitivity(Double sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }

    /**
     * Get the anomalyDetectorDirection property: detection direction.
     *
     * @return the anomalyDetectorDirection value.
     */
    public AnomalyDetectorDirection getAnomalyDetectorDirection() {
        return this.anomalyDetectorDirection;
    }

    /**
     * Set the anomalyDetectorDirection property: detection direction.
     *
     * @param anomalyDetectorDirection the anomalyDetectorDirection value to set.
     * @return the SmartDetectionConditionPatch object itself.
     */
    public SmartDetectionConditionPatch setAnomalyDetectorDirection(AnomalyDetectorDirection anomalyDetectorDirection) {
        this.anomalyDetectorDirection = anomalyDetectorDirection;
        return this;
    }

    /**
     * Get the suppressCondition property: The suppressCondition property.
     *
     * @return the suppressCondition value.
     */
    public SuppressConditionPatch getSuppressCondition() {
        return this.suppressCondition;
    }

    /**
     * Set the suppressCondition property: The suppressCondition property.
     *
     * @param suppressCondition the suppressCondition value to set.
     * @return the SmartDetectionConditionPatch object itself.
     */
    public SmartDetectionConditionPatch setSuppressCondition(SuppressConditionPatch suppressCondition) {
        this.suppressCondition = suppressCondition;
        return this;
    }
}
