// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.relay.fluent.models.HybridConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the list hybrid connection operation. */
@Fluent
public final class HybridConnectionListResult {
    /*
     * Result of the list hybrid connections.
     */
    @JsonProperty(value = "value")
    private List<HybridConnectionInner> value;

    /*
     * Link to the next set of results. Not empty if value contains incomplete
     * list hybrid connection operation.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the list hybrid connections.
     *
     * @return the value value.
     */
    public List<HybridConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the list hybrid connections.
     *
     * @param value the value value to set.
     * @return the HybridConnectionListResult object itself.
     */
    public HybridConnectionListResult withValue(List<HybridConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if value contains incomplete list hybrid
     * connection operation.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if value contains incomplete list hybrid
     * connection operation.
     *
     * @param nextLink the nextLink value to set.
     * @return the HybridConnectionListResult object itself.
     */
    public HybridConnectionListResult withNextLink(String nextLink) {
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
