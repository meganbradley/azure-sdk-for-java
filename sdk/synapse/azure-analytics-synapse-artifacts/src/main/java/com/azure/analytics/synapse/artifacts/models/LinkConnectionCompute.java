// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LinkConnectionCompute model.
 */
@Fluent
public final class LinkConnectionCompute {
    /*
     * Compute core count used by the link connection
     */
    @JsonProperty(value = "coreCount")
    private Integer coreCount;

    /*
     * Link connection's compute type
     */
    @JsonProperty(value = "computeType")
    private String computeType;

    /*
     * Link connection's data process interval in minutes
     */
    @JsonProperty(value = "dataProcessIntervalMinutes")
    private Integer dataProcessIntervalMinutes;

    /**
     * Creates an instance of LinkConnectionCompute class.
     */
    public LinkConnectionCompute() {
    }

    /**
     * Get the coreCount property: Compute core count used by the link connection.
     * 
     * @return the coreCount value.
     */
    public Integer getCoreCount() {
        return this.coreCount;
    }

    /**
     * Set the coreCount property: Compute core count used by the link connection.
     * 
     * @param coreCount the coreCount value to set.
     * @return the LinkConnectionCompute object itself.
     */
    public LinkConnectionCompute setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
        return this;
    }

    /**
     * Get the computeType property: Link connection's compute type.
     * 
     * @return the computeType value.
     */
    public String getComputeType() {
        return this.computeType;
    }

    /**
     * Set the computeType property: Link connection's compute type.
     * 
     * @param computeType the computeType value to set.
     * @return the LinkConnectionCompute object itself.
     */
    public LinkConnectionCompute setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * Get the dataProcessIntervalMinutes property: Link connection's data process interval in minutes.
     * 
     * @return the dataProcessIntervalMinutes value.
     */
    public Integer getDataProcessIntervalMinutes() {
        return this.dataProcessIntervalMinutes;
    }

    /**
     * Set the dataProcessIntervalMinutes property: Link connection's data process interval in minutes.
     * 
     * @param dataProcessIntervalMinutes the dataProcessIntervalMinutes value to set.
     * @return the LinkConnectionCompute object itself.
     */
    public LinkConnectionCompute setDataProcessIntervalMinutes(Integer dataProcessIntervalMinutes) {
        this.dataProcessIntervalMinutes = dataProcessIntervalMinutes;
        return this;
    }
}
