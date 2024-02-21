// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitArpTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListArpTable associated with the Express Route Circuits API.
 */
@Fluent
public final class ExpressRouteCircuitsArpTableListResultInner {
    /*
     * A list of the ARP tables.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitArpTable> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ExpressRouteCircuitsArpTableListResultInner class.
     */
    public ExpressRouteCircuitsArpTableListResultInner() {
    }

    /**
     * Get the value property: A list of the ARP tables.
     * 
     * @return the value value.
     */
    public List<ExpressRouteCircuitArpTable> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of the ARP tables.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteCircuitsArpTableListResultInner object itself.
     */
    public ExpressRouteCircuitsArpTableListResultInner withValue(List<ExpressRouteCircuitArpTable> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteCircuitsArpTableListResultInner object itself.
     */
    public ExpressRouteCircuitsArpTableListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
