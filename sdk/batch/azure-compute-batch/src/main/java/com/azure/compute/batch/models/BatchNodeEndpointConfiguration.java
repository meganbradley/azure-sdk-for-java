// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The endpoint configuration for the Compute Node.
 */
@Immutable
public final class BatchNodeEndpointConfiguration {

    /*
     * The list of inbound endpoints that are accessible on the Compute Node.
     */
    @Generated
    @JsonProperty(value = "inboundEndpoints")
    private final List<InboundEndpoint> inboundEndpoints;

    /**
     * Creates an instance of BatchNodeEndpointConfiguration class.
     *
     * @param inboundEndpoints the inboundEndpoints value to set.
     */
    @Generated
    @JsonCreator
    private BatchNodeEndpointConfiguration(
        @JsonProperty(value = "inboundEndpoints") List<InboundEndpoint> inboundEndpoints) {
        this.inboundEndpoints = inboundEndpoints;
    }

    /**
     * Get the inboundEndpoints property: The list of inbound endpoints that are accessible on the Compute Node.
     *
     * @return the inboundEndpoints value.
     */
    @Generated
    public List<InboundEndpoint> getInboundEndpoints() {
        return this.inboundEndpoints;
    }
}
