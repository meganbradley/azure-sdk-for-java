// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Task and TaskSlot counts for a Job. */
@Immutable
public final class TaskCountsResult {

    /*
     * The number of Tasks per state.
     */
    @Generated
    @JsonProperty(value = "taskCounts")
    private TaskCounts taskCounts;

    /*
     * The number of TaskSlots required by Tasks per state.
     */
    @Generated
    @JsonProperty(value = "taskSlotCounts")
    private TaskSlotCounts taskSlotCounts;

    /**
     * Creates an instance of TaskCountsResult class.
     *
     * @param taskCounts the taskCounts value to set.
     * @param taskSlotCounts the taskSlotCounts value to set.
     */
    @Generated
    @JsonCreator
    private TaskCountsResult(
            @JsonProperty(value = "taskCounts") TaskCounts taskCounts,
            @JsonProperty(value = "taskSlotCounts") TaskSlotCounts taskSlotCounts) {
        this.taskCounts = taskCounts;
        this.taskSlotCounts = taskSlotCounts;
    }

    /**
     * Get the taskCounts property: The number of Tasks per state.
     *
     * @return the taskCounts value.
     */
    @Generated
    public TaskCounts getTaskCounts() {
        return this.taskCounts;
    }

    /**
     * Get the taskSlotCounts property: The number of TaskSlots required by Tasks per state.
     *
     * @return the taskSlotCounts value.
     */
    @Generated
    public TaskSlotCounts getTaskSlotCounts() {
        return this.taskSlotCounts;
    }
}
