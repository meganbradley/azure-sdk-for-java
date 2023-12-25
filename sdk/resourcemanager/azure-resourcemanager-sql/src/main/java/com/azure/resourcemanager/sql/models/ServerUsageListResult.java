// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.fluent.models.ServerUsageInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents the response to a list server metrics request.
 */
@Fluent
public final class ServerUsageListResult {
    /*
     * The list of server metrics for the server.
     */
    @JsonProperty(value = "value", required = true)
    private List<ServerUsageInner> value;

    /**
     * Creates an instance of ServerUsageListResult class.
     */
    public ServerUsageListResult() {
    }

    /**
     * Get the value property: The list of server metrics for the server.
     * 
     * @return the value value.
     */
    public List<ServerUsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of server metrics for the server.
     * 
     * @param value the value value to set.
     * @return the ServerUsageListResult object itself.
     */
    public ServerUsageListResult withValue(List<ServerUsageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model ServerUsageListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerUsageListResult.class);
}
