// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ExpressRouteConnection list.
 */
@Fluent
public final class ExpressRouteConnectionListInner {
    /*
     * The list of ExpressRoute connections.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteConnectionInner> value;

    /**
     * Creates an instance of ExpressRouteConnectionListInner class.
     */
    public ExpressRouteConnectionListInner() {
    }

    /**
     * Get the value property: The list of ExpressRoute connections.
     * 
     * @return the value value.
     */
    public List<ExpressRouteConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of ExpressRoute connections.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteConnectionListInner object itself.
     */
    public ExpressRouteConnectionListInner withValue(List<ExpressRouteConnectionInner> value) {
        this.value = value;
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
