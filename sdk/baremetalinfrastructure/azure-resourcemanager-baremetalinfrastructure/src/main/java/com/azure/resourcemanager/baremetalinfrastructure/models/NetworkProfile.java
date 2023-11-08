// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies the network settings for the Azure Bare Metal Instance disks. */
@Fluent
public final class NetworkProfile {
    /*
     * Specifies the network interfaces for the Azure Bare Metal Instance.
     */
    @JsonProperty(value = "networkInterfaces")
    private List<NetworkInterface> networkInterfaces;

    /*
     * Specifies the circuit id for connecting to express route.
     */
    @JsonProperty(value = "circuitId", access = JsonProperty.Access.WRITE_ONLY)
    private String circuitId;

    /** Creates an instance of NetworkProfile class. */
    public NetworkProfile() {
    }

    /**
     * Get the networkInterfaces property: Specifies the network interfaces for the Azure Bare Metal Instance.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces property: Specifies the network interfaces for the Azure Bare Metal Instance.
     *
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * Get the circuitId property: Specifies the circuit id for connecting to express route.
     *
     * @return the circuitId value.
     */
    public String circuitId() {
        return this.circuitId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
    }
}
