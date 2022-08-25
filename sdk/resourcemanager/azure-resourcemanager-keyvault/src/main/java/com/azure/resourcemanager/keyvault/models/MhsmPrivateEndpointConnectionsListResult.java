// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.keyvault.fluent.models.MhsmPrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of private endpoint connections associated with a managed HSM Pools. */
@Fluent
public final class MhsmPrivateEndpointConnectionsListResult {
    /*
     * The private endpoint connection associated with a managed HSM Pools.
     */
    @JsonProperty(value = "value")
    private List<MhsmPrivateEndpointConnectionInner> value;

    /*
     * The URL to get the next set of managed HSM Pools.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The private endpoint connection associated with a managed HSM Pools.
     *
     * @return the value value.
     */
    public List<MhsmPrivateEndpointConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The private endpoint connection associated with a managed HSM Pools.
     *
     * @param value the value value to set.
     * @return the MhsmPrivateEndpointConnectionsListResult object itself.
     */
    public MhsmPrivateEndpointConnectionsListResult withValue(List<MhsmPrivateEndpointConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of managed HSM Pools.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of managed HSM Pools.
     *
     * @param nextLink the nextLink value to set.
     * @return the MhsmPrivateEndpointConnectionsListResult object itself.
     */
    public MhsmPrivateEndpointConnectionsListResult withNextLink(String nextLink) {
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
