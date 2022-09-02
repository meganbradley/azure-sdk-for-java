// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the ICMP configuration. */
@Fluent
public final class ConnectionMonitorIcmpConfiguration {
    /*
     * Value indicating whether path evaluation with trace route should be disabled.
     */
    @JsonProperty(value = "disableTraceRoute")
    private Boolean disableTraceRoute;

    /**
     * Get the disableTraceRoute property: Value indicating whether path evaluation with trace route should be disabled.
     *
     * @return the disableTraceRoute value.
     */
    public Boolean disableTraceRoute() {
        return this.disableTraceRoute;
    }

    /**
     * Set the disableTraceRoute property: Value indicating whether path evaluation with trace route should be disabled.
     *
     * @param disableTraceRoute the disableTraceRoute value to set.
     * @return the ConnectionMonitorIcmpConfiguration object itself.
     */
    public ConnectionMonitorIcmpConfiguration withDisableTraceRoute(Boolean disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
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
