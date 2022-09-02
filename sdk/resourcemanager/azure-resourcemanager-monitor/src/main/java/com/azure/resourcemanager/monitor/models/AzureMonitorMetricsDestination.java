// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Monitor Metrics destination. */
@Fluent
public class AzureMonitorMetricsDestination {
    /*
     * A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: A friendly name for the destination. This name should be unique across all destinations
     * (regardless of type) within the data collection rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the destination. This name should be unique across all destinations
     * (regardless of type) within the data collection rule.
     *
     * @param name the name value to set.
     * @return the AzureMonitorMetricsDestination object itself.
     */
    public AzureMonitorMetricsDestination withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
