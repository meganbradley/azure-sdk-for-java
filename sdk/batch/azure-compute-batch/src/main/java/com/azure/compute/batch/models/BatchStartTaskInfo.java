// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Information about a StartTask running on a Compute Node.
 */
@Immutable
public final class BatchStartTaskInfo {

    /*
     * The state of the StartTask on the Compute Node.
     */
    @Generated
    @JsonProperty(value = "state")
    private final BatchStartTaskState state;

    /*
     * The time at which the StartTask started running. This value is reset every time the Task is restarted or retried (that is, this is the most recent time at which the StartTask started running).
     */
    @Generated
    @JsonProperty(value = "startTime")
    private final OffsetDateTime startTime;

    /*
     * The time at which the StartTask stopped running. This is the end time of the most recent run of the StartTask, if that run has completed (even if that run failed and a retry is pending). This element is not present if the StartTask is currently running.
     */
    @Generated
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The exit code of the program specified on the StartTask command line. This property is set only if the StartTask is in the completed state. In general, the exit code for a process reflects the specific convention implemented by the application developer for that process. If you use the exit code value to make decisions in your code, be sure that you know the exit code convention used by the application process. However, if the Batch service terminates the StartTask (due to timeout, or user termination via the API) you may see an operating system-defined exit code.
     */
    @Generated
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /*
     * Information about the container under which the Task is executing. This property is set only if the Task runs in a container context.
     */
    @Generated
    @JsonProperty(value = "containerInfo")
    private BatchTaskContainerExecutionInfo containerInfo;

    /*
     * Information describing the Task failure, if any. This property is set only if the Task is in the completed state and encountered a failure.
     */
    @Generated
    @JsonProperty(value = "failureInfo")
    private BatchTaskFailureInfo failureInfo;

    /*
     * The number of times the Task has been retried by the Batch service. Task application failures (non-zero exit code) are retried, pre-processing errors (the Task could not be run) and file upload errors are not retried. The Batch service will retry the Task up to the limit specified by the constraints.
     */
    @Generated
    @JsonProperty(value = "retryCount")
    private final int retryCount;

    /*
     * The most recent time at which a retry of the Task started running. This element is present only if the Task was retried (i.e. retryCount is nonzero). If present, this is typically the same as startTime, but may be different if the Task has been restarted for reasons other than retry; for example, if the Compute Node was rebooted during a retry, then the startTime is updated but the lastRetryTime is not.
     */
    @Generated
    @JsonProperty(value = "lastRetryTime")
    private OffsetDateTime lastRetryTime;

    /*
     * The result of the Task execution. If the value is 'failed', then the details of the failure can be found in the failureInfo property.
     */
    @Generated
    @JsonProperty(value = "result")
    private BatchTaskExecutionResult result;

    /**
     * Creates an instance of BatchStartTaskInfo class.
     *
     * @param state the state value to set.
     * @param startTime the startTime value to set.
     * @param retryCount the retryCount value to set.
     */
    @Generated
    @JsonCreator
    private BatchStartTaskInfo(@JsonProperty(value = "state") BatchStartTaskState state,
        @JsonProperty(value = "startTime") OffsetDateTime startTime,
        @JsonProperty(value = "retryCount") int retryCount) {
        this.state = state;
        this.startTime = startTime;
        this.retryCount = retryCount;
    }

    /**
     * Get the state property: The state of the StartTask on the Compute Node.
     *
     * @return the state value.
     */
    @Generated
    public BatchStartTaskState getState() {
        return this.state;
    }

    /**
     * Get the startTime property: The time at which the StartTask started running. This value is reset every time the
     * Task is restarted or retried (that is, this is the most recent time at which the StartTask started running).
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The time at which the StartTask stopped running. This is the end time of the most
     * recent run of the StartTask, if that run has completed (even if that run failed and a retry is pending). This
     * element is not present if the StartTask is currently running.
     *
     * @return the endTime value.
     */
    @Generated
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the exitCode property: The exit code of the program specified on the StartTask command line. This property is
     * set only if the StartTask is in the completed state. In general, the exit code for a process reflects the
     * specific convention implemented by the application developer for that process. If you use the exit code value to
     * make decisions in your code, be sure that you know the exit code convention used by the application process.
     * However, if the Batch service terminates the StartTask (due to timeout, or user termination via the API) you may
     * see an operating system-defined exit code.
     *
     * @return the exitCode value.
     */
    @Generated
    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * Get the containerInfo property: Information about the container under which the Task is executing. This property
     * is set only if the Task runs in a container context.
     *
     * @return the containerInfo value.
     */
    @Generated
    public BatchTaskContainerExecutionInfo getContainerInfo() {
        return this.containerInfo;
    }

    /**
     * Get the failureInfo property: Information describing the Task failure, if any. This property is set only if the
     * Task is in the completed state and encountered a failure.
     *
     * @return the failureInfo value.
     */
    @Generated
    public BatchTaskFailureInfo getFailureInfo() {
        return this.failureInfo;
    }

    /**
     * Get the retryCount property: The number of times the Task has been retried by the Batch service. Task application
     * failures (non-zero exit code) are retried, pre-processing errors (the Task could not be run) and file upload
     * errors are not retried. The Batch service will retry the Task up to the limit specified by the constraints.
     *
     * @return the retryCount value.
     */
    @Generated
    public int getRetryCount() {
        return this.retryCount;
    }

    /**
     * Get the lastRetryTime property: The most recent time at which a retry of the Task started running. This element
     * is present only if the Task was retried (i.e. retryCount is nonzero). If present, this is typically the same as
     * startTime, but may be different if the Task has been restarted for reasons other than retry; for example, if the
     * Compute Node was rebooted during a retry, then the startTime is updated but the lastRetryTime is not.
     *
     * @return the lastRetryTime value.
     */
    @Generated
    public OffsetDateTime getLastRetryTime() {
        return this.lastRetryTime;
    }

    /**
     * Get the result property: The result of the Task execution. If the value is 'failed', then the details of the
     * failure can be found in the failureInfo property.
     *
     * @return the result value.
     */
    @Generated
    public BatchTaskExecutionResult getResult() {
        return this.result;
    }
}
