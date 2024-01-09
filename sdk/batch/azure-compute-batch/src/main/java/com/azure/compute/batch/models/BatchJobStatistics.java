// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/**
 * Resource usage statistics for a Job.
 */
@Immutable
public final class BatchJobStatistics {

    /*
     * The URL of the statistics.
     */
    @Generated
    @JsonProperty(value = "url")
    private String url;

    /*
     * The start time of the time range covered by the statistics.
     */
    @Generated
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The time at which the statistics were last updated. All statistics are limited to the range between startTime
     * and lastUpdateTime.
     */
    @Generated
    @JsonProperty(value = "lastUpdateTime")
    private OffsetDateTime lastUpdateTime;

    /*
     * The total user mode CPU time (summed across all cores and all Compute Nodes) consumed by all Tasks in the Job.
     */
    @Generated
    @JsonProperty(value = "userCPUTime")
    private Duration userCPUTime;

    /*
     * The total kernel mode CPU time (summed across all cores and all Compute Nodes) consumed by all Tasks in the Job.
     */
    @Generated
    @JsonProperty(value = "kernelCPUTime")
    private Duration kernelCPUTime;

    /*
     * The total wall clock time of all Tasks in the Job. The wall clock time is the elapsed time from when the Task
     * started running on a Compute Node to when it finished (or to the last time the statistics were updated, if the
     * Task had not finished by then). If a Task was retried, this includes the wall clock time of all the Task
     * retries.
     */
    @Generated
    @JsonProperty(value = "wallClockTime")
    private Duration wallClockTime;

    /*
     * The total number of disk read operations made by all Tasks in the Job.
     */
    @Generated
    @JsonProperty(value = "readIOps")
    private int readIOps;

    /*
     * The total number of disk write operations made by all Tasks in the Job.
     */
    @Generated
    @JsonProperty(value = "writeIOps")
    private int writeIOps;

    /*
     * The total amount of data in GiB read from disk by all Tasks in the Job.
     */
    @Generated
    @JsonProperty(value = "readIOGiB")
    private double readIOGiB;

    /*
     * The total amount of data in GiB written to disk by all Tasks in the Job.
     */
    @Generated
    @JsonProperty(value = "writeIOGiB")
    private double writeIOGiB;

    /*
     * The total number of Tasks successfully completed in the Job during the given time range. A Task completes
     * successfully if it returns exit code 0.
     */
    @Generated
    @JsonProperty(value = "numSucceededTasks")
    private int numSucceededTasks;

    /*
     * The total number of Tasks in the Job that failed during the given time range. A Task fails if it exhausts its
     * maximum retry count without returning exit code 0.
     */
    @Generated
    @JsonProperty(value = "numFailedTasks")
    private int numFailedTasks;

    /*
     * The total number of retries on all the Tasks in the Job during the given time range.
     */
    @Generated
    @JsonProperty(value = "numTaskRetries")
    private int numTaskRetries;

    /*
     * The total wait time of all Tasks in the Job. The wait time for a Task is defined as the elapsed time between the
     * creation of the Task and the start of Task execution. (If the Task is retried due to failures, the wait time is
     * the time to the most recent Task execution.) This value is only reported in the Account lifetime statistics; it
     * is not included in the Job statistics.
     */
    @Generated
    @JsonProperty(value = "waitTime")
    private Duration waitTime;

    /**
     * Creates an instance of BatchJobStatistics class.
     *
     * @param url the url value to set.
     * @param startTime the startTime value to set.
     * @param lastUpdateTime the lastUpdateTime value to set.
     * @param userCPUTime the userCPUTime value to set.
     * @param kernelCPUTime the kernelCPUTime value to set.
     * @param wallClockTime the wallClockTime value to set.
     * @param readIOps the readIOps value to set.
     * @param writeIOps the writeIOps value to set.
     * @param readIOGiB the readIOGiB value to set.
     * @param writeIOGiB the writeIOGiB value to set.
     * @param numSucceededTasks the numSucceededTasks value to set.
     * @param numFailedTasks the numFailedTasks value to set.
     * @param numTaskRetries the numTaskRetries value to set.
     * @param waitTime the waitTime value to set.
     */
    @Generated
    @JsonCreator
    private BatchJobStatistics(@JsonProperty(value = "url") String url,
        @JsonProperty(value = "startTime") OffsetDateTime startTime,
        @JsonProperty(value = "lastUpdateTime") OffsetDateTime lastUpdateTime,
        @JsonProperty(value = "userCPUTime") Duration userCPUTime,
        @JsonProperty(value = "kernelCPUTime") Duration kernelCPUTime,
        @JsonProperty(value = "wallClockTime") Duration wallClockTime, @JsonProperty(value = "readIOps") int readIOps,
        @JsonProperty(value = "writeIOps") int writeIOps, @JsonProperty(value = "readIOGiB") double readIOGiB,
        @JsonProperty(value = "writeIOGiB") double writeIOGiB,
        @JsonProperty(value = "numSucceededTasks") int numSucceededTasks,
        @JsonProperty(value = "numFailedTasks") int numFailedTasks,
        @JsonProperty(value = "numTaskRetries") int numTaskRetries,
        @JsonProperty(value = "waitTime") Duration waitTime) {
        this.url = url;
        this.startTime = startTime;
        this.lastUpdateTime = lastUpdateTime;
        this.userCPUTime = userCPUTime;
        this.kernelCPUTime = kernelCPUTime;
        this.wallClockTime = wallClockTime;
        this.readIOps = readIOps;
        this.writeIOps = writeIOps;
        this.readIOGiB = readIOGiB;
        this.writeIOGiB = writeIOGiB;
        this.numSucceededTasks = numSucceededTasks;
        this.numFailedTasks = numFailedTasks;
        this.numTaskRetries = numTaskRetries;
        this.waitTime = waitTime;
    }

    /**
     * Get the url property: The URL of the statistics.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the startTime property: The start time of the time range covered by the statistics.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the lastUpdateTime property: The time at which the statistics were last updated. All statistics are limited
     * to the range between startTime and lastUpdateTime.
     *
     * @return the lastUpdateTime value.
     */
    @Generated
    public OffsetDateTime getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Get the userCPUTime property: The total user mode CPU time (summed across all cores and all Compute Nodes)
     * consumed by all Tasks in the Job.
     *
     * @return the userCPUTime value.
     */
    @Generated
    public Duration getUserCPUTime() {
        return this.userCPUTime;
    }

    /**
     * Get the kernelCPUTime property: The total kernel mode CPU time (summed across all cores and all Compute Nodes)
     * consumed by all Tasks in the Job.
     *
     * @return the kernelCPUTime value.
     */
    @Generated
    public Duration getKernelCPUTime() {
        return this.kernelCPUTime;
    }

    /**
     * Get the wallClockTime property: The total wall clock time of all Tasks in the Job. The wall clock time is the
     * elapsed time from when the Task started running on a Compute Node to when it finished (or to the last time the
     * statistics were updated, if the Task had not finished by then). If a Task was retried, this includes the wall
     * clock time of all the Task retries.
     *
     * @return the wallClockTime value.
     */
    @Generated
    public Duration getWallClockTime() {
        return this.wallClockTime;
    }

    /**
     * Get the readIOps property: The total number of disk read operations made by all Tasks in the Job.
     *
     * @return the readIOps value.
     */
    @Generated
    public int getReadIOps() {
        return this.readIOps;
    }

    /**
     * Get the writeIOps property: The total number of disk write operations made by all Tasks in the Job.
     *
     * @return the writeIOps value.
     */
    @Generated
    public int getWriteIOps() {
        return this.writeIOps;
    }

    /**
     * Get the readIOGiB property: The total amount of data in GiB read from disk by all Tasks in the Job.
     *
     * @return the readIOGiB value.
     */
    @Generated
    public double getReadIOGiB() {
        return this.readIOGiB;
    }

    /**
     * Get the writeIOGiB property: The total amount of data in GiB written to disk by all Tasks in the Job.
     *
     * @return the writeIOGiB value.
     */
    @Generated
    public double getWriteIOGiB() {
        return this.writeIOGiB;
    }

    /**
     * Get the numSucceededTasks property: The total number of Tasks successfully completed in the Job during the given
     * time range. A Task completes successfully if it returns exit code 0.
     *
     * @return the numSucceededTasks value.
     */
    @Generated
    public int getNumSucceededTasks() {
        return this.numSucceededTasks;
    }

    /**
     * Get the numFailedTasks property: The total number of Tasks in the Job that failed during the given time range. A
     * Task fails if it exhausts its maximum retry count without returning exit code 0.
     *
     * @return the numFailedTasks value.
     */
    @Generated
    public int getNumFailedTasks() {
        return this.numFailedTasks;
    }

    /**
     * Get the numTaskRetries property: The total number of retries on all the Tasks in the Job during the given time
     * range.
     *
     * @return the numTaskRetries value.
     */
    @Generated
    public int getNumTaskRetries() {
        return this.numTaskRetries;
    }

    /**
     * Get the waitTime property: The total wait time of all Tasks in the Job. The wait time for a Task is defined as
     * the elapsed time between the creation of the Task and the start of Task execution. (If the Task is retried due
     * to failures, the wait time is the time to the most recent Task execution.) This value is only reported in the
     * Account lifetime statistics; it is not included in the Job statistics.
     *
     * @return the waitTime value.
     */
    @Generated
    public Duration getWaitTime() {
        return this.waitTime;
    }
}
