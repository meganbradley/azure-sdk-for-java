// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobState. */
public final class JobState extends ExpandableStringEnum<JobState> {

    /** The Job is available to have Tasks scheduled. */
    public static final JobState ACTIVE = fromString("active");

    /**
     * A user has requested that the Job be disabled, but the disable operation is still in progress (for example,
     * waiting for Tasks to terminate).
     */
    public static final JobState DISABLING = fromString("disabling");

    /** A user has disabled the Job. No Tasks are running, and no new Tasks will be scheduled. */
    public static final JobState DISABLED = fromString("disabled");

    /** A user has requested that the Job be enabled, but the enable operation is still in progress. */
    public static final JobState ENABLING = fromString("enabling");

    /**
     * The Job is about to complete, either because a Job Manager Task has completed or because the user has terminated
     * the Job, but the terminate operation is still in progress (for example, because Job Release Tasks are running).
     */
    public static final JobState TERMINATING = fromString("terminating");

    /** All Tasks have terminated, and the system will not accept any more Tasks or any further changes to the Job. */
    public static final JobState COMPLETED = fromString("completed");

    /**
     * A user has requested that the Job be deleted, but the delete operation is still in progress (for example, because
     * the system is still terminating running Tasks).
     */
    public static final JobState DELETING = fromString("deleting");

    /**
     * Creates a new instance of JobState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JobState() {}

    /**
     * Creates or finds a JobState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobState.
     */
    @JsonCreator
    public static JobState fromString(String name) {
        return fromString(name, JobState.class);
    }

    /**
     * Gets known JobState values.
     *
     * @return known JobState values.
     */
    public static Collection<JobState> values() {
        return values(JobState.class);
    }
}
