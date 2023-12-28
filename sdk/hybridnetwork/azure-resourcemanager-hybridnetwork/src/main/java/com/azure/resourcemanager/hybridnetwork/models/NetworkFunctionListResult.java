// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for network function API service call.
 */
@Fluent
public final class NetworkFunctionListResult {
    /*
     * A list of network function resources in a subscription or resource group.
     */
    @JsonProperty(value = "value")
    private List<NetworkFunctionInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of NetworkFunctionListResult class.
     */
    public NetworkFunctionListResult() {
    }

    /**
     * Get the value property: A list of network function resources in a subscription or resource group.
     * 
     * @return the value value.
     */
    public List<NetworkFunctionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of network function resources in a subscription or resource group.
     * 
     * @param value the value value to set.
     * @return the NetworkFunctionListResult object itself.
     */
    public NetworkFunctionListResult withValue(List<NetworkFunctionInner> value) {
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
