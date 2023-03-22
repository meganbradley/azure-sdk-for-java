// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of availability zones shared by the subscriptions. */
@Fluent
public final class AvailabilityZonePeers {
    /*
     * The availabilityZone.
     */
    @JsonProperty(value = "availabilityZone", access = JsonProperty.Access.WRITE_ONLY)
    private String availabilityZone;

    /*
     * Details of shared availability zone.
     */
    @JsonProperty(value = "peers")
    private List<Peers> peers;

    /** Creates an instance of AvailabilityZonePeers class. */
    public AvailabilityZonePeers() {
    }

    /**
     * Get the availabilityZone property: The availabilityZone.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Get the peers property: Details of shared availability zone.
     *
     * @return the peers value.
     */
    public List<Peers> peers() {
        return this.peers;
    }

    /**
     * Set the peers property: Details of shared availability zone.
     *
     * @param peers the peers value to set.
     * @return the AvailabilityZonePeers object itself.
     */
    public AvailabilityZonePeers withPeers(List<Peers> peers) {
        this.peers = peers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (peers() != null) {
            peers().forEach(e -> e.validate());
        }
    }
}
