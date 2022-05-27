// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** scale settings for AML Compute. */
@Fluent
public final class ScaleSettings {
    /*
     * Max number of nodes to use
     */
    @JsonProperty(value = "maxNodeCount", required = true)
    private int maxNodeCount;

    /*
     * Min number of nodes to use
     */
    @JsonProperty(value = "minNodeCount")
    private Integer minNodeCount;

    /*
     * Node Idle Time before scaling down amlCompute. This string needs to be
     * in the RFC Format.
     */
    @JsonProperty(value = "nodeIdleTimeBeforeScaleDown")
    private Duration nodeIdleTimeBeforeScaleDown;

    /**
     * Get the maxNodeCount property: Max number of nodes to use.
     *
     * @return the maxNodeCount value.
     */
    public int maxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Set the maxNodeCount property: Max number of nodes to use.
     *
     * @param maxNodeCount the maxNodeCount value to set.
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withMaxNodeCount(int maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
        return this;
    }

    /**
     * Get the minNodeCount property: Min number of nodes to use.
     *
     * @return the minNodeCount value.
     */
    public Integer minNodeCount() {
        return this.minNodeCount;
    }

    /**
     * Set the minNodeCount property: Min number of nodes to use.
     *
     * @param minNodeCount the minNodeCount value to set.
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
        return this;
    }

    /**
     * Get the nodeIdleTimeBeforeScaleDown property: Node Idle Time before scaling down amlCompute. This string needs to
     * be in the RFC Format.
     *
     * @return the nodeIdleTimeBeforeScaleDown value.
     */
    public Duration nodeIdleTimeBeforeScaleDown() {
        return this.nodeIdleTimeBeforeScaleDown;
    }

    /**
     * Set the nodeIdleTimeBeforeScaleDown property: Node Idle Time before scaling down amlCompute. This string needs to
     * be in the RFC Format.
     *
     * @param nodeIdleTimeBeforeScaleDown the nodeIdleTimeBeforeScaleDown value to set.
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withNodeIdleTimeBeforeScaleDown(Duration nodeIdleTimeBeforeScaleDown) {
        this.nodeIdleTimeBeforeScaleDown = nodeIdleTimeBeforeScaleDown;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
