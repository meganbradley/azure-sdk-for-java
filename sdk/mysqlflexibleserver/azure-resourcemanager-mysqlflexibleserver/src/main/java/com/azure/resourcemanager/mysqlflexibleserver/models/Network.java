// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network related properties of a server. */
@Fluent
public final class Network {
    /*
     * Whether or not public network access is allowed for this server. Value
     * is 'Disabled' when server has VNet integration.
     */
    @JsonProperty(value = "publicNetworkAccess", access = JsonProperty.Access.WRITE_ONLY)
    private EnableStatusEnum publicNetworkAccess;

    /*
     * Delegated subnet resource id used to setup vnet for a server.
     */
    @JsonProperty(value = "delegatedSubnetResourceId")
    private String delegatedSubnetResourceId;

    /*
     * Private DNS zone resource id.
     */
    @JsonProperty(value = "privateDnsZoneResourceId")
    private String privateDnsZoneResourceId;

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * 'Disabled' when server has VNet integration.
     *
     * @return the publicNetworkAccess value.
     */
    public EnableStatusEnum publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Get the delegatedSubnetResourceId property: Delegated subnet resource id used to setup vnet for a server.
     *
     * @return the delegatedSubnetResourceId value.
     */
    public String delegatedSubnetResourceId() {
        return this.delegatedSubnetResourceId;
    }

    /**
     * Set the delegatedSubnetResourceId property: Delegated subnet resource id used to setup vnet for a server.
     *
     * @param delegatedSubnetResourceId the delegatedSubnetResourceId value to set.
     * @return the Network object itself.
     */
    public Network withDelegatedSubnetResourceId(String delegatedSubnetResourceId) {
        this.delegatedSubnetResourceId = delegatedSubnetResourceId;
        return this;
    }

    /**
     * Get the privateDnsZoneResourceId property: Private DNS zone resource id.
     *
     * @return the privateDnsZoneResourceId value.
     */
    public String privateDnsZoneResourceId() {
        return this.privateDnsZoneResourceId;
    }

    /**
     * Set the privateDnsZoneResourceId property: Private DNS zone resource id.
     *
     * @param privateDnsZoneResourceId the privateDnsZoneResourceId value to set.
     * @return the Network object itself.
     */
    public Network withPrivateDnsZoneResourceId(String privateDnsZoneResourceId) {
        this.privateDnsZoneResourceId = privateDnsZoneResourceId;
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
