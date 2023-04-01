// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/**
 * The schedule according to which Jobs will be created. All times are fixed respective to UTC and are not impacted by
 * daylight saving time.
 */
@Fluent
public final class Schedule {
    /*
     * If you do not specify a doNotRunUntil time, the schedule becomes ready to
     * create Jobs immediately.
     */
    @JsonProperty(value = "doNotRunUntil")
    private OffsetDateTime doNotRunUntil;

    /*
     * If you do not specify a doNotRunAfter time, and you are creating a recurring
     * Job Schedule, the Job Schedule will remain active until you explicitly
     * terminate it.
     */
    @JsonProperty(value = "doNotRunAfter")
    private OffsetDateTime doNotRunAfter;

    /*
     * If a Job is not created within the startWindow interval, then the 'opportunity'
     * is lost; no Job will be created until the next recurrence of the schedule. If
     * the schedule is recurring, and the startWindow is longer than the recurrence
     * interval, then this is equivalent to an infinite startWindow, because the Job
     * that is 'due' in one recurrenceInterval is not carried forward into the next
     * recurrence interval. The default is infinite. The minimum value is 1 minute. If
     * you specify a lower value, the Batch service rejects the schedule with an
     * error; if you are calling the REST API directly, the HTTP status code is 400
     * (Bad Request).
     */
    @JsonProperty(value = "startWindow")
    private Duration startWindow;

    /*
     * Because a Job Schedule can have at most one active Job under it at any given
     * time, if it is time to create a new Job under a Job Schedule, but the previous
     * Job is still running, the Batch service will not create the new Job until the
     * previous Job finishes. If the previous Job does not finish within the
     * startWindow period of the new recurrenceInterval, then no new Job will be
     * scheduled for that interval. For recurring Jobs, you should normally specify a
     * jobManagerTask in the jobSpecification. If you do not use jobManagerTask, you
     * will need an external process to monitor when Jobs are created, add Tasks to
     * the Jobs and terminate the Jobs ready for the next recurrence. The default is
     * that the schedule does not recur: one Job is created, within the startWindow
     * after the doNotRunUntil time, and the schedule is complete as soon as that Job
     * finishes. The minimum value is 1 minute. If you specify a lower value, the
     * Batch service rejects the schedule with an error; if you are calling the REST
     * API directly, the HTTP status code is 400 (Bad Request).
     */
    @JsonProperty(value = "recurrenceInterval")
    private Duration recurrenceInterval;

    /** Creates an instance of Schedule class. */
    public Schedule() {}

    /**
     * Get the doNotRunUntil property: If you do not specify a doNotRunUntil time, the schedule becomes ready to create
     * Jobs immediately.
     *
     * @return the doNotRunUntil value.
     */
    public OffsetDateTime getDoNotRunUntil() {
        return this.doNotRunUntil;
    }

    /**
     * Set the doNotRunUntil property: If you do not specify a doNotRunUntil time, the schedule becomes ready to create
     * Jobs immediately.
     *
     * @param doNotRunUntil the doNotRunUntil value to set.
     * @return the Schedule object itself.
     */
    public Schedule setDoNotRunUntil(OffsetDateTime doNotRunUntil) {
        this.doNotRunUntil = doNotRunUntil;
        return this;
    }

    /**
     * Get the doNotRunAfter property: If you do not specify a doNotRunAfter time, and you are creating a recurring Job
     * Schedule, the Job Schedule will remain active until you explicitly terminate it.
     *
     * @return the doNotRunAfter value.
     */
    public OffsetDateTime getDoNotRunAfter() {
        return this.doNotRunAfter;
    }

    /**
     * Set the doNotRunAfter property: If you do not specify a doNotRunAfter time, and you are creating a recurring Job
     * Schedule, the Job Schedule will remain active until you explicitly terminate it.
     *
     * @param doNotRunAfter the doNotRunAfter value to set.
     * @return the Schedule object itself.
     */
    public Schedule setDoNotRunAfter(OffsetDateTime doNotRunAfter) {
        this.doNotRunAfter = doNotRunAfter;
        return this;
    }

    /**
     * Get the startWindow property: If a Job is not created within the startWindow interval, then the 'opportunity' is
     * lost; no Job will be created until the next recurrence of the schedule. If the schedule is recurring, and the
     * startWindow is longer than the recurrence interval, then this is equivalent to an infinite startWindow, because
     * the Job that is 'due' in one recurrenceInterval is not carried forward into the next recurrence interval. The
     * default is infinite. The minimum value is 1 minute. If you specify a lower value, the Batch service rejects the
     * schedule with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the startWindow value.
     */
    public Duration getStartWindow() {
        return this.startWindow;
    }

    /**
     * Set the startWindow property: If a Job is not created within the startWindow interval, then the 'opportunity' is
     * lost; no Job will be created until the next recurrence of the schedule. If the schedule is recurring, and the
     * startWindow is longer than the recurrence interval, then this is equivalent to an infinite startWindow, because
     * the Job that is 'due' in one recurrenceInterval is not carried forward into the next recurrence interval. The
     * default is infinite. The minimum value is 1 minute. If you specify a lower value, the Batch service rejects the
     * schedule with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param startWindow the startWindow value to set.
     * @return the Schedule object itself.
     */
    public Schedule setStartWindow(Duration startWindow) {
        this.startWindow = startWindow;
        return this;
    }

    /**
     * Get the recurrenceInterval property: Because a Job Schedule can have at most one active Job under it at any given
     * time, if it is time to create a new Job under a Job Schedule, but the previous Job is still running, the Batch
     * service will not create the new Job until the previous Job finishes. If the previous Job does not finish within
     * the startWindow period of the new recurrenceInterval, then no new Job will be scheduled for that interval. For
     * recurring Jobs, you should normally specify a jobManagerTask in the jobSpecification. If you do not use
     * jobManagerTask, you will need an external process to monitor when Jobs are created, add Tasks to the Jobs and
     * terminate the Jobs ready for the next recurrence. The default is that the schedule does not recur: one Job is
     * created, within the startWindow after the doNotRunUntil time, and the schedule is complete as soon as that Job
     * finishes. The minimum value is 1 minute. If you specify a lower value, the Batch service rejects the schedule
     * with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the recurrenceInterval value.
     */
    public Duration getRecurrenceInterval() {
        return this.recurrenceInterval;
    }

    /**
     * Set the recurrenceInterval property: Because a Job Schedule can have at most one active Job under it at any given
     * time, if it is time to create a new Job under a Job Schedule, but the previous Job is still running, the Batch
     * service will not create the new Job until the previous Job finishes. If the previous Job does not finish within
     * the startWindow period of the new recurrenceInterval, then no new Job will be scheduled for that interval. For
     * recurring Jobs, you should normally specify a jobManagerTask in the jobSpecification. If you do not use
     * jobManagerTask, you will need an external process to monitor when Jobs are created, add Tasks to the Jobs and
     * terminate the Jobs ready for the next recurrence. The default is that the schedule does not recur: one Job is
     * created, within the startWindow after the doNotRunUntil time, and the schedule is complete as soon as that Job
     * finishes. The minimum value is 1 minute. If you specify a lower value, the Batch service rejects the schedule
     * with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param recurrenceInterval the recurrenceInterval value to set.
     * @return the Schedule object itself.
     */
    public Schedule setRecurrenceInterval(Duration recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
        return this;
    }
}
