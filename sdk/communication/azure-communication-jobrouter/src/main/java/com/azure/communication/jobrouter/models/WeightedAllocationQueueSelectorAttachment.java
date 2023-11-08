// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes multiple sets of queue selectors, of which one will be selected and attached according to a weighting. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("weighted-allocation-queue-selector")
@Immutable
public final class WeightedAllocationQueueSelectorAttachment extends QueueSelectorAttachment {

    /*
     * A collection of percentage based weighted allocations.
     */
    @Generated
    @JsonProperty(value = "allocations")
    private List<QueueWeightedAllocation> allocations;

    /**
     * Creates an instance of WeightedAllocationQueueSelectorAttachment class.
     *
     * @param allocations the allocations value to set.
     */
    @Generated
    @JsonCreator
    public WeightedAllocationQueueSelectorAttachment(
            @JsonProperty(value = "allocations") List<QueueWeightedAllocation> allocations) {
        this.allocations = allocations;
    }

    /**
     * Get the allocations property: A collection of percentage based weighted allocations.
     *
     * @return the allocations value.
     */
    @Generated
    public List<QueueWeightedAllocation> getAllocations() {
        return this.allocations;
    }
}
