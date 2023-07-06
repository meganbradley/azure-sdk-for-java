// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A network security group rule to apply to an inbound endpoint. */
@Fluent
public final class NetworkSecurityGroupRule {

    /*
     * Priorities within a Pool must be unique and are evaluated in order of priority.
     * The lower the number the higher the priority. For example, rules could be
     * specified with order numbers of 150, 250, and 350. The rule with the order
     * number of 150 takes precedence over the rule that has an order of 250. Allowed
     * priorities are 150 to 4096. If any reserved or duplicate values are provided
     * the request fails with HTTP status code 400.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * The action that should be taken for a specified IP address, subnet range or tag.
     */
    @JsonProperty(value = "access", required = true)
    private NetworkSecurityGroupRuleAccess access;

    /*
     * Valid values are a single IP address (i.e. 10.10.10.10), IP subnet (i.e.
     * 192.168.1.0/24), default tag, or * (for all addresses).  If any other values
     * are provided the request fails with HTTP status code 400.
     */
    @JsonProperty(value = "sourceAddressPrefix", required = true)
    private String sourceAddressPrefix;

    /*
     * Valid values are '*' (for all ports 0 - 65535), a specific port (i.e. 22), or a
     * port range (i.e. 100-200). The ports must be in the range of 0 to 65535. Each
     * entry in this collection must not overlap any other entry (either a range or an
     * individual port). If any other values are provided the request fails with HTTP
     * status code 400. The default value is '*'.
     */
    @JsonProperty(value = "sourcePortRanges")
    private List<String> sourcePortRanges;

    /**
     * Creates an instance of NetworkSecurityGroupRule class.
     *
     * @param priority the priority value to set.
     * @param access the access value to set.
     * @param sourceAddressPrefix the sourceAddressPrefix value to set.
     */
    @JsonCreator
    public NetworkSecurityGroupRule(
            @JsonProperty(value = "priority", required = true) int priority,
            @JsonProperty(value = "access", required = true) NetworkSecurityGroupRuleAccess access,
            @JsonProperty(value = "sourceAddressPrefix", required = true) String sourceAddressPrefix) {
        this.priority = priority;
        this.access = access;
        this.sourceAddressPrefix = sourceAddressPrefix;
    }

    /**
     * Get the priority property: Priorities within a Pool must be unique and are evaluated in order of priority. The
     * lower the number the higher the priority. For example, rules could be specified with order numbers of 150, 250,
     * and 350. The rule with the order number of 150 takes precedence over the rule that has an order of 250. Allowed
     * priorities are 150 to 4096. If any reserved or duplicate values are provided the request fails with HTTP status
     * code 400.
     *
     * @return the priority value.
     */
    public int getPriority() {
        return this.priority;
    }

    /**
     * Get the access property: The action that should be taken for a specified IP address, subnet range or tag.
     *
     * @return the access value.
     */
    public NetworkSecurityGroupRuleAccess getAccess() {
        return this.access;
    }

    /**
     * Get the sourceAddressPrefix property: Valid values are a single IP address (i.e. 10.10.10.10), IP subnet (i.e.
     * 192.168.1.0/24), default tag, or * (for all addresses). If any other values are provided the request fails with
     * HTTP status code 400.
     *
     * @return the sourceAddressPrefix value.
     */
    public String getSourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Get the sourcePortRanges property: Valid values are '*' (for all ports 0 - 65535), a specific port (i.e. 22), or
     * a port range (i.e. 100-200). The ports must be in the range of 0 to 65535. Each entry in this collection must not
     * overlap any other entry (either a range or an individual port). If any other values are provided the request
     * fails with HTTP status code 400. The default value is '*'.
     *
     * @return the sourcePortRanges value.
     */
    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the sourcePortRanges property: Valid values are '*' (for all ports 0 - 65535), a specific port (i.e. 22), or
     * a port range (i.e. 100-200). The ports must be in the range of 0 to 65535. Each entry in this collection must not
     * overlap any other entry (either a range or an individual port). If any other values are provided the request
     * fails with HTTP status code 400. The default value is '*'.
     *
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the NetworkSecurityGroupRule object itself.
     */
    public NetworkSecurityGroupRule setSourcePortRanges(List<String> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }
}
