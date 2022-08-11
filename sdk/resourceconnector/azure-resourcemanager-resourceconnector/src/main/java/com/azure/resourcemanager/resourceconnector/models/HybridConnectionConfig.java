// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the REP (rendezvous endpoint) and “Listener” access token from notification service (NS). */
@Immutable
public final class HybridConnectionConfig {
    /*
     * Timestamp when this token will be expired.
     */
    @JsonProperty(value = "expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private Long expirationTime;

    /*
     * Name of the connection
     */
    @JsonProperty(value = "hybridConnectionName", access = JsonProperty.Access.WRITE_ONLY)
    private String hybridConnectionName;

    /*
     * Name of the notification service.
     */
    @JsonProperty(value = "relay", access = JsonProperty.Access.WRITE_ONLY)
    private String relay;

    /*
     * Listener access token
     */
    @JsonProperty(value = "token", access = JsonProperty.Access.WRITE_ONLY)
    private String token;

    /**
     * Get the expirationTime property: Timestamp when this token will be expired.
     *
     * @return the expirationTime value.
     */
    public Long expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get the hybridConnectionName property: Name of the connection.
     *
     * @return the hybridConnectionName value.
     */
    public String hybridConnectionName() {
        return this.hybridConnectionName;
    }

    /**
     * Get the relay property: Name of the notification service.
     *
     * @return the relay value.
     */
    public String relay() {
        return this.relay;
    }

    /**
     * Get the token property: Listener access token.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
