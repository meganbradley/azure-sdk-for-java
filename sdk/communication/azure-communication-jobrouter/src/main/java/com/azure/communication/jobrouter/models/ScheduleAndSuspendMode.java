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
import java.time.OffsetDateTime;

/**
 * Describes a matching mode used for scheduling jobs to be queued at a future time. At the specified time, matching
 * worker to a job will not start automatically.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("schedule-and-suspend")
@Immutable
public final class ScheduleAndSuspendMode extends JobMatchingMode {

    /*
     * Scheduled time.
     */
    @Generated
    @JsonProperty(value = "scheduleAt")
    private OffsetDateTime scheduleAt;

    /**
     * Creates an instance of ScheduleAndSuspendMode class.
     *
     * @param scheduleAt the scheduleAt value to set.
     */
    @Generated
    @JsonCreator
    public ScheduleAndSuspendMode(@JsonProperty(value = "scheduleAt") OffsetDateTime scheduleAt) {
        this.scheduleAt = scheduleAt;
    }

    /**
     * Get the scheduleAt property: Scheduled time.
     *
     * @return the scheduleAt value.
     */
    @Generated
    public OffsetDateTime getScheduleAt() {
        return this.scheduleAt;
    }
}
