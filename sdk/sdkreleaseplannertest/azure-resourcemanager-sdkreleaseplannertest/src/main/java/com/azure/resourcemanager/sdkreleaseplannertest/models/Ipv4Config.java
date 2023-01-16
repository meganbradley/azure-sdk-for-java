// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details related to the IPv4 address configuration. */
@Immutable
public final class Ipv4Config {
    /*
     * The IPv4 address of the network adapter.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /*
     * The IPv4 subnet of the network adapter.
     */
    @JsonProperty(value = "subnet", access = JsonProperty.Access.WRITE_ONLY)
    private String subnet;

    /*
     * The IPv4 gateway of the network adapter.
     */
    @JsonProperty(value = "gateway", access = JsonProperty.Access.WRITE_ONLY)
    private String gateway;

    /** Creates an instance of Ipv4Config class. */
    public Ipv4Config() {
    }

    /**
     * Get the ipAddress property: The IPv4 address of the network adapter.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the subnet property: The IPv4 subnet of the network adapter.
     *
     * @return the subnet value.
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Get the gateway property: The IPv4 gateway of the network adapter.
     *
     * @return the gateway value.
     */
    public String gateway() {
        return this.gateway;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
