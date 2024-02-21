// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.RouteMapInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of RouteMaps and a URL nextLink to get the next set of results.
 */
@Fluent
public final class ListRouteMapsResult {
    /*
     * List of RouteMaps.
     */
    @JsonProperty(value = "value")
    private List<RouteMapInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ListRouteMapsResult class.
     */
    public ListRouteMapsResult() {
    }

    /**
     * Get the value property: List of RouteMaps.
     * 
     * @return the value value.
     */
    public List<RouteMapInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of RouteMaps.
     * 
     * @param value the value value to set.
     * @return the ListRouteMapsResult object itself.
     */
    public ListRouteMapsResult withValue(List<RouteMapInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListRouteMapsResult object itself.
     */
    public ListRouteMapsResult withNextLink(String nextLink) {
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
