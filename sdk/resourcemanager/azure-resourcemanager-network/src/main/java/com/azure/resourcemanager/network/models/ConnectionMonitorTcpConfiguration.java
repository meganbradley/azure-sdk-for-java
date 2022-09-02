// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the TCP configuration. */
@Fluent
public final class ConnectionMonitorTcpConfiguration {
    /*
     * The port to connect to.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * Value indicating whether path evaluation with trace route should be disabled.
     */
    @JsonProperty(value = "disableTraceRoute")
    private Boolean disableTraceRoute;

    /*
     * Destination port behavior.
     */
    @JsonProperty(value = "destinationPortBehavior")
    private DestinationPortBehavior destinationPortBehavior;

    /**
     * Get the port property: The port to connect to.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port to connect to.
     *
     * @param port the port value to set.
     * @return the ConnectionMonitorTcpConfiguration object itself.
     */
    public ConnectionMonitorTcpConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

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
     * @return the ConnectionMonitorTcpConfiguration object itself.
     */
    public ConnectionMonitorTcpConfiguration withDisableTraceRoute(Boolean disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
        return this;
    }

    /**
     * Get the destinationPortBehavior property: Destination port behavior.
     *
     * @return the destinationPortBehavior value.
     */
    public DestinationPortBehavior destinationPortBehavior() {
        return this.destinationPortBehavior;
    }

    /**
     * Set the destinationPortBehavior property: Destination port behavior.
     *
     * @param destinationPortBehavior the destinationPortBehavior value to set.
     * @return the ConnectionMonitorTcpConfiguration object itself.
     */
    public ConnectionMonitorTcpConfiguration withDestinationPortBehavior(
        DestinationPortBehavior destinationPortBehavior) {
        this.destinationPortBehavior = destinationPortBehavior;
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
