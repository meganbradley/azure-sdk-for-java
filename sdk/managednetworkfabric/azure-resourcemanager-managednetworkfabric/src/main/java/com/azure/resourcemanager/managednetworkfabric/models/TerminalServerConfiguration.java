// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network and credentials configuration currently applied to terminal server. */
@Fluent
public final class TerminalServerConfiguration extends TerminalServerPatchableProperties {
    /*
     * ARM Resource ID used for the NetworkDevice.
     */
    @JsonProperty(value = "networkDeviceId", access = JsonProperty.Access.WRITE_ONLY)
    private String networkDeviceId;

    /*
     * IPv4 Address Prefix.
     */
    @JsonProperty(value = "primaryIpv4Prefix")
    private String primaryIpv4Prefix;

    /*
     * IPv6 Address Prefix.
     */
    @JsonProperty(value = "primaryIpv6Prefix")
    private String primaryIpv6Prefix;

    /*
     * Secondary IPv4 Address Prefix.
     */
    @JsonProperty(value = "secondaryIpv4Prefix")
    private String secondaryIpv4Prefix;

    /*
     * Secondary IPv6 Address Prefix.
     */
    @JsonProperty(value = "secondaryIpv6Prefix")
    private String secondaryIpv6Prefix;

    /** Creates an instance of TerminalServerConfiguration class. */
    public TerminalServerConfiguration() {
    }

    /**
     * Get the networkDeviceId property: ARM Resource ID used for the NetworkDevice.
     *
     * @return the networkDeviceId value.
     */
    public String networkDeviceId() {
        return this.networkDeviceId;
    }

    /**
     * Get the primaryIpv4Prefix property: IPv4 Address Prefix.
     *
     * @return the primaryIpv4Prefix value.
     */
    public String primaryIpv4Prefix() {
        return this.primaryIpv4Prefix;
    }

    /**
     * Set the primaryIpv4Prefix property: IPv4 Address Prefix.
     *
     * @param primaryIpv4Prefix the primaryIpv4Prefix value to set.
     * @return the TerminalServerConfiguration object itself.
     */
    public TerminalServerConfiguration withPrimaryIpv4Prefix(String primaryIpv4Prefix) {
        this.primaryIpv4Prefix = primaryIpv4Prefix;
        return this;
    }

    /**
     * Get the primaryIpv6Prefix property: IPv6 Address Prefix.
     *
     * @return the primaryIpv6Prefix value.
     */
    public String primaryIpv6Prefix() {
        return this.primaryIpv6Prefix;
    }

    /**
     * Set the primaryIpv6Prefix property: IPv6 Address Prefix.
     *
     * @param primaryIpv6Prefix the primaryIpv6Prefix value to set.
     * @return the TerminalServerConfiguration object itself.
     */
    public TerminalServerConfiguration withPrimaryIpv6Prefix(String primaryIpv6Prefix) {
        this.primaryIpv6Prefix = primaryIpv6Prefix;
        return this;
    }

    /**
     * Get the secondaryIpv4Prefix property: Secondary IPv4 Address Prefix.
     *
     * @return the secondaryIpv4Prefix value.
     */
    public String secondaryIpv4Prefix() {
        return this.secondaryIpv4Prefix;
    }

    /**
     * Set the secondaryIpv4Prefix property: Secondary IPv4 Address Prefix.
     *
     * @param secondaryIpv4Prefix the secondaryIpv4Prefix value to set.
     * @return the TerminalServerConfiguration object itself.
     */
    public TerminalServerConfiguration withSecondaryIpv4Prefix(String secondaryIpv4Prefix) {
        this.secondaryIpv4Prefix = secondaryIpv4Prefix;
        return this;
    }

    /**
     * Get the secondaryIpv6Prefix property: Secondary IPv6 Address Prefix.
     *
     * @return the secondaryIpv6Prefix value.
     */
    public String secondaryIpv6Prefix() {
        return this.secondaryIpv6Prefix;
    }

    /**
     * Set the secondaryIpv6Prefix property: Secondary IPv6 Address Prefix.
     *
     * @param secondaryIpv6Prefix the secondaryIpv6Prefix value to set.
     * @return the TerminalServerConfiguration object itself.
     */
    public TerminalServerConfiguration withSecondaryIpv6Prefix(String secondaryIpv6Prefix) {
        this.secondaryIpv6Prefix = secondaryIpv6Prefix;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TerminalServerConfiguration withUsername(String username) {
        super.withUsername(username);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TerminalServerConfiguration withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TerminalServerConfiguration withSerialNumber(String serialNumber) {
        super.withSerialNumber(serialNumber);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
