// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network-specific rules that determine how the search service can be reached. */
@Fluent
public final class NetworkRuleSet {
    /*
     * A list of IP restriction rules used for an IP firewall. Any IPs that do not match the rules are blocked by the
     * firewall. These rules are only applied when the 'publicNetworkAccess' of the search service is 'enabled'.
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /** Creates an instance of NetworkRuleSet class. */
    public NetworkRuleSet() {
    }

    /**
     * Get the ipRules property: A list of IP restriction rules used for an IP firewall. Any IPs that do not match the
     * rules are blocked by the firewall. These rules are only applied when the 'publicNetworkAccess' of the search
     * service is 'enabled'.
     *
     * @return the ipRules value.
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: A list of IP restriction rules used for an IP firewall. Any IPs that do not match the
     * rules are blocked by the firewall. These rules are only applied when the 'publicNetworkAccess' of the search
     * service is 'enabled'.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
    }
}
