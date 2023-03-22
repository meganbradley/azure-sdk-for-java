// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of authorized spacecraft links per ground station and the expiration date of the authorization. */
@Fluent
public final class SpacecraftLink {
    /*
     * Link name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Center Frequency in MHz.
     */
    @JsonProperty(value = "centerFrequencyMHz", required = true)
    private float centerFrequencyMHz;

    /*
     * Bandwidth in MHz.
     */
    @JsonProperty(value = "bandwidthMHz", required = true)
    private float bandwidthMHz;

    /*
     * Direction (Uplink or Downlink).
     */
    @JsonProperty(value = "direction", required = true)
    private Direction direction;

    /*
     * Polarization. e.g. (RHCP, LHCP).
     */
    @JsonProperty(value = "polarization", required = true)
    private Polarization polarization;

    /*
     * Authorized Ground Stations
     */
    @JsonProperty(value = "authorizations", access = JsonProperty.Access.WRITE_ONLY)
    private List<AuthorizedGroundstation> authorizations;

    /** Creates an instance of SpacecraftLink class. */
    public SpacecraftLink() {
    }

    /**
     * Get the name property: Link name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Link name.
     *
     * @param name the name value to set.
     * @return the SpacecraftLink object itself.
     */
    public SpacecraftLink withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the centerFrequencyMHz property: Center Frequency in MHz.
     *
     * @return the centerFrequencyMHz value.
     */
    public float centerFrequencyMHz() {
        return this.centerFrequencyMHz;
    }

    /**
     * Set the centerFrequencyMHz property: Center Frequency in MHz.
     *
     * @param centerFrequencyMHz the centerFrequencyMHz value to set.
     * @return the SpacecraftLink object itself.
     */
    public SpacecraftLink withCenterFrequencyMHz(float centerFrequencyMHz) {
        this.centerFrequencyMHz = centerFrequencyMHz;
        return this;
    }

    /**
     * Get the bandwidthMHz property: Bandwidth in MHz.
     *
     * @return the bandwidthMHz value.
     */
    public float bandwidthMHz() {
        return this.bandwidthMHz;
    }

    /**
     * Set the bandwidthMHz property: Bandwidth in MHz.
     *
     * @param bandwidthMHz the bandwidthMHz value to set.
     * @return the SpacecraftLink object itself.
     */
    public SpacecraftLink withBandwidthMHz(float bandwidthMHz) {
        this.bandwidthMHz = bandwidthMHz;
        return this;
    }

    /**
     * Get the direction property: Direction (Uplink or Downlink).
     *
     * @return the direction value.
     */
    public Direction direction() {
        return this.direction;
    }

    /**
     * Set the direction property: Direction (Uplink or Downlink).
     *
     * @param direction the direction value to set.
     * @return the SpacecraftLink object itself.
     */
    public SpacecraftLink withDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the polarization property: Polarization. e.g. (RHCP, LHCP).
     *
     * @return the polarization value.
     */
    public Polarization polarization() {
        return this.polarization;
    }

    /**
     * Set the polarization property: Polarization. e.g. (RHCP, LHCP).
     *
     * @param polarization the polarization value to set.
     * @return the SpacecraftLink object itself.
     */
    public SpacecraftLink withPolarization(Polarization polarization) {
        this.polarization = polarization;
        return this;
    }

    /**
     * Get the authorizations property: Authorized Ground Stations.
     *
     * @return the authorizations value.
     */
    public List<AuthorizedGroundstation> authorizations() {
        return this.authorizations;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model SpacecraftLink"));
        }
        if (direction() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property direction in model SpacecraftLink"));
        }
        if (polarization() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property polarization in model SpacecraftLink"));
        }
        if (authorizations() != null) {
            authorizations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SpacecraftLink.class);
}
