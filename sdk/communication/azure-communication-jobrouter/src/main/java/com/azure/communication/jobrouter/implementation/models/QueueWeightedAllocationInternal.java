// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Contains the weight percentage and queue selectors to be applied if selected for weighted distributions.
 */
@Immutable
public final class QueueWeightedAllocationInternal {

    /*
     * The percentage of this weight, expressed as a fraction of 1.
     */
    @Generated
    @JsonProperty(value = "weight")
    private double weight;

    /*
     * A collection of queue selectors that will be applied if this allocation is selected.
     */
    @Generated
    @JsonProperty(value = "queueSelectors")
    private List<RouterQueueSelectorInternal> queueSelectors;

    /**
     * Creates an instance of QueueWeightedAllocationInternal class.
     *
     * @param weight the weight value to set.
     * @param queueSelectors the queueSelectors value to set.
     */
    @Generated
    @JsonCreator
    public QueueWeightedAllocationInternal(@JsonProperty(value = "weight") double weight,
        @JsonProperty(value = "queueSelectors") List<RouterQueueSelectorInternal> queueSelectors) {
        this.weight = weight;
        this.queueSelectors = queueSelectors;
    }

    /**
     * Get the weight property: The percentage of this weight, expressed as a fraction of 1.
     *
     * @return the weight value.
     */
    @Generated
    public double getWeight() {
        return this.weight;
    }

    /**
     * Get the queueSelectors property: A collection of queue selectors that will be applied if this allocation is
     * selected.
     *
     * @return the queueSelectors value.
     */
    @Generated
    public List<RouterQueueSelectorInternal> getQueueSelectors() {
        return this.queueSelectors;
    }
}
