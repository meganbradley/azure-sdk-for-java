// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP Prefix Rule properties. */
@Fluent
public final class IpPrefixRule {
    /*
     * Action to be taken on the configuration. Example: Permit | Deny.
     */
    @JsonProperty(value = "action", required = true)
    private CommunityActionTypes action;

    /*
     * Sequence to insert to/delete from existing route. Prefix lists are evaluated starting with the lowest sequence
     * number and continue down the list until a match is made. Once a match is made, the permit or deny statement is
     * applied to that network and the rest of the list is ignored.
     */
    @JsonProperty(value = "sequenceNumber", required = true)
    private long sequenceNumber;

    /*
     * Network Prefix specifying IPv4/IPv6 packets to be permitted or denied. Example: 1.1.1.0/24 |
     * 3FFE:FFFF:0:CD30::/126
     */
    @JsonProperty(value = "networkPrefix", required = true)
    private String networkPrefix;

    /*
     * Specify prefix-list bounds.
     */
    @JsonProperty(value = "condition")
    private Condition condition;

    /*
     * SubnetMaskLength gives the minimum NetworkPrefix length to be matched. Possible values for IPv4 are 1 - 32 .
     * Possible values of IPv6 are 1 - 128.
     */
    @JsonProperty(value = "subnetMaskLength")
    private String subnetMaskLength;

    /** Creates an instance of IpPrefixRule class. */
    public IpPrefixRule() {
    }

    /**
     * Get the action property: Action to be taken on the configuration. Example: Permit | Deny.
     *
     * @return the action value.
     */
    public CommunityActionTypes action() {
        return this.action;
    }

    /**
     * Set the action property: Action to be taken on the configuration. Example: Permit | Deny.
     *
     * @param action the action value to set.
     * @return the IpPrefixRule object itself.
     */
    public IpPrefixRule withAction(CommunityActionTypes action) {
        this.action = action;
        return this;
    }

    /**
     * Get the sequenceNumber property: Sequence to insert to/delete from existing route. Prefix lists are evaluated
     * starting with the lowest sequence number and continue down the list until a match is made. Once a match is made,
     * the permit or deny statement is applied to that network and the rest of the list is ignored.
     *
     * @return the sequenceNumber value.
     */
    public long sequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * Set the sequenceNumber property: Sequence to insert to/delete from existing route. Prefix lists are evaluated
     * starting with the lowest sequence number and continue down the list until a match is made. Once a match is made,
     * the permit or deny statement is applied to that network and the rest of the list is ignored.
     *
     * @param sequenceNumber the sequenceNumber value to set.
     * @return the IpPrefixRule object itself.
     */
    public IpPrefixRule withSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Get the networkPrefix property: Network Prefix specifying IPv4/IPv6 packets to be permitted or denied. Example:
     * 1.1.1.0/24 | 3FFE:FFFF:0:CD30::/126.
     *
     * @return the networkPrefix value.
     */
    public String networkPrefix() {
        return this.networkPrefix;
    }

    /**
     * Set the networkPrefix property: Network Prefix specifying IPv4/IPv6 packets to be permitted or denied. Example:
     * 1.1.1.0/24 | 3FFE:FFFF:0:CD30::/126.
     *
     * @param networkPrefix the networkPrefix value to set.
     * @return the IpPrefixRule object itself.
     */
    public IpPrefixRule withNetworkPrefix(String networkPrefix) {
        this.networkPrefix = networkPrefix;
        return this;
    }

    /**
     * Get the condition property: Specify prefix-list bounds.
     *
     * @return the condition value.
     */
    public Condition condition() {
        return this.condition;
    }

    /**
     * Set the condition property: Specify prefix-list bounds.
     *
     * @param condition the condition value to set.
     * @return the IpPrefixRule object itself.
     */
    public IpPrefixRule withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the subnetMaskLength property: SubnetMaskLength gives the minimum NetworkPrefix length to be matched.
     * Possible values for IPv4 are 1 - 32 . Possible values of IPv6 are 1 - 128.
     *
     * @return the subnetMaskLength value.
     */
    public String subnetMaskLength() {
        return this.subnetMaskLength;
    }

    /**
     * Set the subnetMaskLength property: SubnetMaskLength gives the minimum NetworkPrefix length to be matched.
     * Possible values for IPv4 are 1 - 32 . Possible values of IPv6 are 1 - 128.
     *
     * @param subnetMaskLength the subnetMaskLength value to set.
     * @return the IpPrefixRule object itself.
     */
    public IpPrefixRule withSubnetMaskLength(String subnetMaskLength) {
        this.subnetMaskLength = subnetMaskLength;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property action in model IpPrefixRule"));
        }
        if (networkPrefix() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property networkPrefix in model IpPrefixRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpPrefixRule.class);
}
