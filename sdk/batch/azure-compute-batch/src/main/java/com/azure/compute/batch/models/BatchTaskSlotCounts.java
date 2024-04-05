// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TaskSlot counts for a Job.
 */
@Immutable
public final class BatchTaskSlotCounts {

    /*
     * The number of TaskSlots for active Tasks.
     */
    @Generated
    @JsonProperty(value = "active")
    private final int active;

    /*
     * The number of TaskSlots for running Tasks.
     */
    @Generated
    @JsonProperty(value = "running")
    private final int running;

    /*
     * The number of TaskSlots for completed Tasks.
     */
    @Generated
    @JsonProperty(value = "completed")
    private final int completed;

    /*
     * The number of TaskSlots for succeeded Tasks.
     */
    @Generated
    @JsonProperty(value = "succeeded")
    private final int succeeded;

    /*
     * The number of TaskSlots for failed Tasks.
     */
    @Generated
    @JsonProperty(value = "failed")
    private final int failed;

    /**
     * Creates an instance of BatchTaskSlotCounts class.
     *
     * @param active the active value to set.
     * @param running the running value to set.
     * @param completed the completed value to set.
     * @param succeeded the succeeded value to set.
     * @param failed the failed value to set.
     */
    @Generated
    @JsonCreator
    private BatchTaskSlotCounts(@JsonProperty(value = "active") int active,
        @JsonProperty(value = "running") int running, @JsonProperty(value = "completed") int completed,
        @JsonProperty(value = "succeeded") int succeeded, @JsonProperty(value = "failed") int failed) {
        this.active = active;
        this.running = running;
        this.completed = completed;
        this.succeeded = succeeded;
        this.failed = failed;
    }

    /**
     * Get the active property: The number of TaskSlots for active Tasks.
     *
     * @return the active value.
     */
    @Generated
    public int getActive() {
        return this.active;
    }

    /**
     * Get the running property: The number of TaskSlots for running Tasks.
     *
     * @return the running value.
     */
    @Generated
    public int getRunning() {
        return this.running;
    }

    /**
     * Get the completed property: The number of TaskSlots for completed Tasks.
     *
     * @return the completed value.
     */
    @Generated
    public int getCompleted() {
        return this.completed;
    }

    /**
     * Get the succeeded property: The number of TaskSlots for succeeded Tasks.
     *
     * @return the succeeded value.
     */
    @Generated
    public int getSucceeded() {
        return this.succeeded;
    }

    /**
     * Get the failed property: The number of TaskSlots for failed Tasks.
     *
     * @return the failed value.
     */
    @Generated
    public int getFailed() {
        return this.failed;
    }
}
