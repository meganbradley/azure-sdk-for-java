// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SubtaskState. */
public final class SubtaskState extends ExpandableStringEnum<SubtaskState> {

    /**
     * The Task has been assigned to a Compute Node, but is waiting for a required Job Preparation Task to complete on
     * the Compute Node. If the Job Preparation Task succeeds, the Task will move to running. If the Job Preparation
     * Task fails, the Task will return to active and will be eligible to be assigned to a different Compute Node.
     */
    public static final SubtaskState PREPARING = fromString("preparing");

    /**
     * The Task is running on a Compute Node. This includes task-level preparation such as downloading resource files or
     * deploying Packages specified on the Task - it does not necessarily mean that the Task command line has started
     * executing.
     */
    public static final SubtaskState RUNNING = fromString("running");

    /**
     * The Task is no longer eligible to run, usually because the Task has finished successfully, or the Task has
     * finished unsuccessfully and has exhausted its retry limit. A Task is also marked as completed if an error
     * occurred launching the Task, or when the Task has been terminated.
     */
    public static final SubtaskState COMPLETED = fromString("completed");

    /**
     * Creates a new instance of SubtaskState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SubtaskState() {}

    /**
     * Creates or finds a SubtaskState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SubtaskState.
     */
    @JsonCreator
    public static SubtaskState fromString(String name) {
        return fromString(name, SubtaskState.class);
    }

    /**
     * Gets known SubtaskState values.
     *
     * @return known SubtaskState values.
     */
    public static Collection<SubtaskState> values() {
        return values(SubtaskState.class);
    }
}
