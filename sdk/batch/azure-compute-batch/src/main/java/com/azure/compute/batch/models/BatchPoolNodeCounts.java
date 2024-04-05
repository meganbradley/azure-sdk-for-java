// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The number of Compute Nodes in each state for a Pool.
 */
@Immutable
public final class BatchPoolNodeCounts {

    /*
     * The ID of the Pool.
     */
    @Generated
    @JsonProperty(value = "poolId")
    private final String poolId;

    /*
     * The number of dedicated Compute Nodes in each state.
     */
    @Generated
    @JsonProperty(value = "dedicated")
    private BatchNodeCounts dedicated;

    /*
     * The number of Spot/Low-priority Compute Nodes in each state.
     */
    @Generated
    @JsonProperty(value = "lowPriority")
    private BatchNodeCounts lowPriority;

    /**
     * Creates an instance of BatchPoolNodeCounts class.
     *
     * @param poolId the poolId value to set.
     */
    @Generated
    @JsonCreator
    private BatchPoolNodeCounts(@JsonProperty(value = "poolId") String poolId) {
        this.poolId = poolId;
    }

    /**
     * Get the poolId property: The ID of the Pool.
     *
     * @return the poolId value.
     */
    @Generated
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Get the dedicated property: The number of dedicated Compute Nodes in each state.
     *
     * @return the dedicated value.
     */
    @Generated
    public BatchNodeCounts getDedicated() {
        return this.dedicated;
    }

    /**
     * Get the lowPriority property: The number of Spot/Low-priority Compute Nodes in each state.
     *
     * @return the lowPriority value.
     */
    @Generated
    public BatchNodeCounts getLowPriority() {
        return this.lowPriority;
    }
}
