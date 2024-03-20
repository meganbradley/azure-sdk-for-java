// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines parameters for tcp connection pooling.
 */
@Fluent
public final class TcpConnectionPool {
    /*
     * Maximum number of tcp connections allowed
     */
    @JsonProperty(value = "maxConnections")
    private Integer maxConnections;

    /**
     * Creates an instance of TcpConnectionPool class.
     */
    public TcpConnectionPool() {
    }

    /**
     * Get the maxConnections property: Maximum number of tcp connections allowed.
     * 
     * @return the maxConnections value.
     */
    public Integer maxConnections() {
        return this.maxConnections;
    }

    /**
     * Set the maxConnections property: Maximum number of tcp connections allowed.
     * 
     * @param maxConnections the maxConnections value to set.
     * @return the TcpConnectionPool object itself.
     */
    public TcpConnectionPool withMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
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
