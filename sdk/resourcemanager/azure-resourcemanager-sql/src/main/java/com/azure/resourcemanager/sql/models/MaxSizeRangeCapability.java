// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The maximum size range capability.
 */
@Fluent
public final class MaxSizeRangeCapability {
    /*
     * Minimum value.
     */
    @JsonProperty(value = "minValue", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability minValue;

    /*
     * Maximum value.
     */
    @JsonProperty(value = "maxValue", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability maxValue;

    /*
     * Scale/step size for discrete values between the minimum value and the maximum value.
     */
    @JsonProperty(value = "scaleSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability scaleSize;

    /*
     * Size of transaction log.
     */
    @JsonProperty(value = "logSize", access = JsonProperty.Access.WRITE_ONLY)
    private LogSizeCapability logSize;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Creates an instance of MaxSizeRangeCapability class.
     */
    public MaxSizeRangeCapability() {
    }

    /**
     * Get the minValue property: Minimum value.
     * 
     * @return the minValue value.
     */
    public MaxSizeCapability minValue() {
        return this.minValue;
    }

    /**
     * Get the maxValue property: Maximum value.
     * 
     * @return the maxValue value.
     */
    public MaxSizeCapability maxValue() {
        return this.maxValue;
    }

    /**
     * Get the scaleSize property: Scale/step size for discrete values between the minimum value and the maximum value.
     * 
     * @return the scaleSize value.
     */
    public MaxSizeCapability scaleSize() {
        return this.scaleSize;
    }

    /**
     * Get the logSize property: Size of transaction log.
     * 
     * @return the logSize value.
     */
    public LogSizeCapability logSize() {
        return this.logSize;
    }

    /**
     * Get the status property: The status of the capability.
     * 
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being available.
     * 
     * @param reason the reason value to set.
     * @return the MaxSizeRangeCapability object itself.
     */
    public MaxSizeRangeCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (minValue() != null) {
            minValue().validate();
        }
        if (maxValue() != null) {
            maxValue().validate();
        }
        if (scaleSize() != null) {
            scaleSize().validate();
        }
        if (logSize() != null) {
            logSize().validate();
        }
    }
}
