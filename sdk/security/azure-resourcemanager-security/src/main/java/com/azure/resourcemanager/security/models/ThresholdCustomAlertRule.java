// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A custom alert rule that checks if a value (depends on the custom alert type) is within the given range.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "ruleType",
    defaultImpl = ThresholdCustomAlertRule.class)
@JsonTypeName("ThresholdCustomAlertRule")
@JsonSubTypes({ @JsonSubTypes.Type(name = "TimeWindowCustomAlertRule", value = TimeWindowCustomAlertRule.class) })
@Fluent
public class ThresholdCustomAlertRule extends CustomAlertRule {
    /*
     * The minimum threshold.
     */
    @JsonProperty(value = "minThreshold", required = true)
    private int minThreshold;

    /*
     * The maximum threshold.
     */
    @JsonProperty(value = "maxThreshold", required = true)
    private int maxThreshold;

    /**
     * Creates an instance of ThresholdCustomAlertRule class.
     */
    public ThresholdCustomAlertRule() {
    }

    /**
     * Get the minThreshold property: The minimum threshold.
     * 
     * @return the minThreshold value.
     */
    public int minThreshold() {
        return this.minThreshold;
    }

    /**
     * Set the minThreshold property: The minimum threshold.
     * 
     * @param minThreshold the minThreshold value to set.
     * @return the ThresholdCustomAlertRule object itself.
     */
    public ThresholdCustomAlertRule withMinThreshold(int minThreshold) {
        this.minThreshold = minThreshold;
        return this;
    }

    /**
     * Get the maxThreshold property: The maximum threshold.
     * 
     * @return the maxThreshold value.
     */
    public int maxThreshold() {
        return this.maxThreshold;
    }

    /**
     * Set the maxThreshold property: The maximum threshold.
     * 
     * @param maxThreshold the maxThreshold value to set.
     * @return the ThresholdCustomAlertRule object itself.
     */
    public ThresholdCustomAlertRule withMaxThreshold(int maxThreshold) {
        this.maxThreshold = maxThreshold;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThresholdCustomAlertRule withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
