// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** TaskState enums. */
public final class TaskState extends ExpandableStringEnum<TaskState> {

    /**
     * The Task is queued and able to run, but is not currently assigned to a Compute Node. A Task enters this state
     * when it is created, when it is enabled after being disabled, or when it is awaiting a retry after a failed run.
     */
    @Generated public static final TaskState ACTIVE = fromString("active");

    /**
     * The Task has been assigned to a Compute Node, but is waiting for a required Job Preparation Task to complete on
     * the Compute Node. If the Job Preparation Task succeeds, the Task will move to running. If the Job Preparation
     * Task fails, the Task will return to active and will be eligible to be assigned to a different Compute Node.
     */
    @Generated public static final TaskState PREPARING = fromString("preparing");

    /**
     * The Task is running on a Compute Node. This includes task-level preparation such as downloading resource files or
     * deploying Packages specified on the Task - it does not necessarily mean that the Task command line has started
     * executing.
     */
    @Generated public static final TaskState RUNNING = fromString("running");

    /**
     * The Task is no longer eligible to run, usually because the Task has finished successfully, or the Task has
     * finished unsuccessfully and has exhausted its retry limit. A Task is also marked as completed if an error
     * occurred launching the Task, or when the Task has been terminated.
     */
    @Generated public static final TaskState COMPLETED = fromString("completed");

    /**
     * Creates a new instance of TaskState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public TaskState() {}

    /**
     * Creates or finds a TaskState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TaskState.
     */
    @Generated
    @JsonCreator
    public static TaskState fromString(String name) {
        return fromString(name, TaskState.class);
    }

    /**
     * Gets known TaskState values.
     *
     * @return known TaskState values.
     */
    @Generated
    public static Collection<TaskState> values() {
        return values(TaskState.class);
    }
}
