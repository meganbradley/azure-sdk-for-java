// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** JobAction enums. */
public final class JobAction extends ExpandableStringEnum<JobAction> {

    /** Take no action. */
    @Generated public static final JobAction NONE = fromString("none");

    /** Disable the Job. This is equivalent to calling the disable Job API, with a disableTasks value of requeue. */
    @Generated public static final JobAction DISABLE = fromString("disable");

    /** Terminate the Job. The terminateReason in the Job's executionInfo is set to "TaskFailed". */
    @Generated public static final JobAction TERMINATE = fromString("terminate");

    /**
     * Creates a new instance of JobAction value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public JobAction() {}

    /**
     * Creates or finds a JobAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobAction.
     */
    @Generated
    @JsonCreator
    public static JobAction fromString(String name) {
        return fromString(name, JobAction.class);
    }

    /**
     * Gets known JobAction values.
     *
     * @return known JobAction values.
     */
    @Generated
    public static Collection<JobAction> values() {
        return values(JobAction.class);
    }
}
