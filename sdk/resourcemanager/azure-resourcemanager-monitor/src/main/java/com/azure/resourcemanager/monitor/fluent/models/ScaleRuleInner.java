// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.models.MetricTrigger;
import com.azure.resourcemanager.monitor.models.ScaleAction;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A rule that provide the triggers and parameters for the scaling action.
 */
@Fluent
public final class ScaleRuleInner {
    /*
     * the trigger that results in a scaling action.
     */
    @JsonProperty(value = "metricTrigger", required = true)
    private MetricTrigger metricTrigger;

    /*
     * the parameters for the scaling action.
     */
    @JsonProperty(value = "scaleAction", required = true)
    private ScaleAction scaleAction;

    /**
     * Creates an instance of ScaleRuleInner class.
     */
    public ScaleRuleInner() {
    }

    /**
     * Get the metricTrigger property: the trigger that results in a scaling action.
     * 
     * @return the metricTrigger value.
     */
    public MetricTrigger metricTrigger() {
        return this.metricTrigger;
    }

    /**
     * Set the metricTrigger property: the trigger that results in a scaling action.
     * 
     * @param metricTrigger the metricTrigger value to set.
     * @return the ScaleRuleInner object itself.
     */
    public ScaleRuleInner withMetricTrigger(MetricTrigger metricTrigger) {
        this.metricTrigger = metricTrigger;
        return this;
    }

    /**
     * Get the scaleAction property: the parameters for the scaling action.
     * 
     * @return the scaleAction value.
     */
    public ScaleAction scaleAction() {
        return this.scaleAction;
    }

    /**
     * Set the scaleAction property: the parameters for the scaling action.
     * 
     * @param scaleAction the scaleAction value to set.
     * @return the ScaleRuleInner object itself.
     */
    public ScaleRuleInner withScaleAction(ScaleAction scaleAction) {
        this.scaleAction = scaleAction;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricTrigger() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property metricTrigger in model ScaleRuleInner"));
        } else {
            metricTrigger().validate();
        }
        if (scaleAction() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property scaleAction in model ScaleRuleInner"));
        } else {
            scaleAction().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScaleRuleInner.class);
}
