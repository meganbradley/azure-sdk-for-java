// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The state of managed private endpoint connection.
 */
@Immutable
public final class ManagedPrivateEndpointConnectionState {
    /*
     * The approval/rejection status of managed private endpoint connection.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedPrivateEndpointConnectionStatus status;

    /*
     * Gets or sets the reason for approval/rejection of the connection.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Creates an instance of ManagedPrivateEndpointConnectionState class.
     */
    public ManagedPrivateEndpointConnectionState() {
    }

    /**
     * Get the status property: The approval/rejection status of managed private endpoint connection.
     * 
     * @return the status value.
     */
    public ManagedPrivateEndpointConnectionStatus status() {
        return this.status;
    }

    /**
     * Get the description property: Gets or sets the reason for approval/rejection of the connection.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
