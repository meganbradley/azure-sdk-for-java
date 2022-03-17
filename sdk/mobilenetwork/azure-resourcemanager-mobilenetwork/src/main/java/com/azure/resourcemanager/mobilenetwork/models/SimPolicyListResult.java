// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimPolicyInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for SimPolicies API service call. */
@Fluent
public final class SimPolicyListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SimPolicyListResult.class);

    /*
     * A list of SimPolicies.
     */
    @JsonProperty(value = "value")
    private List<SimPolicyInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of SimPolicies.
     *
     * @return the value value.
     */
    public List<SimPolicyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of SimPolicies.
     *
     * @param value the value value to set.
     * @return the SimPolicyListResult object itself.
     */
    public SimPolicyListResult withValue(List<SimPolicyInner> value) {
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
