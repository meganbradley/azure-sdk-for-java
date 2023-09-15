// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The matching mode to be applied to this job.
 *
 * <p>Supported types:
 *
 * <p>QueueAndMatchMode: Used when matching worker to a job is required to be done right after job is queued.
 * ScheduleAndSuspendMode: Used for scheduling jobs to be queued at a future time. At specified time, matching of a
 * worker to the job will not start automatically. SuspendMode: Used when matching workers to a job needs to be
 * suspended.
 */
@Fluent
public final class JobMatchingMode {
    /*
     * Discriminator value used to differentiate between supported matching mode types.
     */
    @Generated
    @JsonProperty(value = "modeType")
    private JobMatchModeType modeType;

    /*
     * Describes a matching mode where matching worker to a job is automatically
     * started after job is queued successfully.
     */
    @Generated
    @JsonProperty(value = "queueAndMatchMode")
    private Object queueAndMatchMode;

    /*
     * Describes a matching mode used for scheduling jobs to be queued at a future
     * time.
     * At the specified time, matching worker to a job will not start
     * automatically.
     */
    @Generated
    @JsonProperty(value = "scheduleAndSuspendMode")
    private ScheduleAndSuspendMode scheduleAndSuspendMode;

    /*
     * Describes a matching mode where matching worker to a job is suspended.
     */
    @Generated
    @JsonProperty(value = "suspendMode")
    private Object suspendMode;

    /** Creates an instance of JobMatchingMode class. */
    @Generated
    public JobMatchingMode() {}

    /**
     * Get the modeType property: Discriminator value used to differentiate between supported matching mode types.
     *
     * @return the modeType value.
     */
    @Generated
    public JobMatchModeType getModeType() {
        return this.modeType;
    }

    /**
     * Set the modeType property: Discriminator value used to differentiate between supported matching mode types.
     *
     * @param modeType the modeType value to set.
     * @return the JobMatchingMode object itself.
     */
    @Generated
    public JobMatchingMode setModeType(JobMatchModeType modeType) {
        this.modeType = modeType;
        return this;
    }

    /**
     * Get the queueAndMatchMode property: Describes a matching mode where matching worker to a job is automatically
     * started after job is queued successfully.
     *
     * @return the queueAndMatchMode value.
     */
    @Generated
    public Object getQueueAndMatchMode() {
        return this.queueAndMatchMode;
    }

    /**
     * Set the queueAndMatchMode property: Describes a matching mode where matching worker to a job is automatically
     * started after job is queued successfully.
     *
     * @param queueAndMatchMode the queueAndMatchMode value to set.
     * @return the JobMatchingMode object itself.
     */
    @Generated
    public JobMatchingMode setQueueAndMatchMode(Object queueAndMatchMode) {
        this.queueAndMatchMode = queueAndMatchMode;
        return this;
    }

    /**
     * Get the scheduleAndSuspendMode property: Describes a matching mode used for scheduling jobs to be queued at a
     * future time. At the specified time, matching worker to a job will not start automatically.
     *
     * @return the scheduleAndSuspendMode value.
     */
    @Generated
    public ScheduleAndSuspendMode getScheduleAndSuspendMode() {
        return this.scheduleAndSuspendMode;
    }

    /**
     * Set the scheduleAndSuspendMode property: Describes a matching mode used for scheduling jobs to be queued at a
     * future time. At the specified time, matching worker to a job will not start automatically.
     *
     * @param scheduleAndSuspendMode the scheduleAndSuspendMode value to set.
     * @return the JobMatchingMode object itself.
     */
    @Generated
    public JobMatchingMode setScheduleAndSuspendMode(ScheduleAndSuspendMode scheduleAndSuspendMode) {
        this.scheduleAndSuspendMode = scheduleAndSuspendMode;
        return this;
    }

    /**
     * Get the suspendMode property: Describes a matching mode where matching worker to a job is suspended.
     *
     * @return the suspendMode value.
     */
    @Generated
    public Object getSuspendMode() {
        return this.suspendMode;
    }

    /**
     * Set the suspendMode property: Describes a matching mode where matching worker to a job is suspended.
     *
     * @param suspendMode the suspendMode value to set.
     * @return the JobMatchingMode object itself.
     */
    @Generated
    public JobMatchingMode setSuspendMode(Object suspendMode) {
        this.suspendMode = suspendMode;
        return this;
    }
}
