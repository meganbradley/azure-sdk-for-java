// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Contains information about the execution of a Job Preparation Task on a Compute Node. */
@Immutable
public final class JobPreparationTaskExecutionInformation {

    /*
     * If the Task has been restarted or retried, this is the most recent time at
     * which the Task started running.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * This property is set only if the Task is in the Completed state.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The current state of the Job Preparation Task on the Compute Node.
     */
    @JsonProperty(value = "state", required = true)
    private JobPreparationTaskState state;

    /*
     * The root directory of the Job Preparation Task on the Compute Node. You can use
     * this path to retrieve files created by the Task, such as log files.
     */
    @JsonProperty(value = "taskRootDirectory")
    private String taskRootDirectory;

    /*
     * The URL to the root directory of the Job Preparation Task on the Compute Node.
     */
    @JsonProperty(value = "taskRootDirectoryUrl")
    private String taskRootDirectoryUrl;

    /*
     * This parameter is returned only if the Task is in the completed state. The exit
     * code for a process reflects the specific convention implemented by the
     * application developer for that process. If you use the exit code value to make
     * decisions in your code, be sure that you know the exit code convention used by
     * the application process. Note that the exit code may also be generated by the
     * Compute Node operating system, such as when a process is forcibly terminated.
     */
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /*
     * This property is set only if the Task runs in a container context.
     */
    @JsonProperty(value = "containerInfo")
    private TaskContainerExecutionInformation containerInfo;

    /*
     * This property is set only if the Task is in the completed state and encountered
     * a failure.
     */
    @JsonProperty(value = "failureInfo")
    private TaskFailureInformation failureInfo;

    /*
     * Task application failures (non-zero exit code) are retried, pre-processing
     * errors (the Task could not be run) and file upload errors are not retried. The
     * Batch service will retry the Task up to the limit specified by the constraints.
     */
    @JsonProperty(value = "retryCount", required = true)
    private int retryCount;

    /*
     * This property is set only if the Task was retried (i.e. retryCount is nonzero).
     * If present, this is typically the same as startTime, but may be different if
     * the Task has been restarted for reasons other than retry; for example, if the
     * Compute Node was rebooted during a retry, then the startTime is updated but the
     * lastRetryTime is not.
     */
    @JsonProperty(value = "lastRetryTime")
    private OffsetDateTime lastRetryTime;

    /*
     * If the value is 'failed', then the details of the failure can be found in the
     * failureInfo property.
     */
    @JsonProperty(value = "result")
    private TaskExecutionResult result;

    /**
     * Creates an instance of JobPreparationTaskExecutionInformation class.
     *
     * @param startTime the startTime value to set.
     * @param state the state value to set.
     * @param retryCount the retryCount value to set.
     */
    @JsonCreator
    private JobPreparationTaskExecutionInformation(
            @JsonProperty(value = "startTime", required = true) OffsetDateTime startTime,
            @JsonProperty(value = "state", required = true) JobPreparationTaskState state,
            @JsonProperty(value = "retryCount", required = true) int retryCount) {
        this.startTime = startTime;
        this.state = state;
        this.retryCount = retryCount;
    }

    /**
     * Get the startTime property: If the Task has been restarted or retried, this is the most recent time at which the
     * Task started running.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: This property is set only if the Task is in the Completed state.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the state property: The current state of the Job Preparation Task on the Compute Node.
     *
     * @return the state value.
     */
    public JobPreparationTaskState getState() {
        return this.state;
    }

    /**
     * Get the taskRootDirectory property: The root directory of the Job Preparation Task on the Compute Node. You can
     * use this path to retrieve files created by the Task, such as log files.
     *
     * @return the taskRootDirectory value.
     */
    public String getTaskRootDirectory() {
        return this.taskRootDirectory;
    }

    /**
     * Get the taskRootDirectoryUrl property: The URL to the root directory of the Job Preparation Task on the Compute
     * Node.
     *
     * @return the taskRootDirectoryUrl value.
     */
    public String getTaskRootDirectoryUrl() {
        return this.taskRootDirectoryUrl;
    }

    /**
     * Get the exitCode property: This parameter is returned only if the Task is in the completed state. The exit code
     * for a process reflects the specific convention implemented by the application developer for that process. If you
     * use the exit code value to make decisions in your code, be sure that you know the exit code convention used by
     * the application process. Note that the exit code may also be generated by the Compute Node operating system, such
     * as when a process is forcibly terminated.
     *
     * @return the exitCode value.
     */
    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * Get the containerInfo property: This property is set only if the Task runs in a container context.
     *
     * @return the containerInfo value.
     */
    public TaskContainerExecutionInformation getContainerInfo() {
        return this.containerInfo;
    }

    /**
     * Get the failureInfo property: This property is set only if the Task is in the completed state and encountered a
     * failure.
     *
     * @return the failureInfo value.
     */
    public TaskFailureInformation getFailureInfo() {
        return this.failureInfo;
    }

    /**
     * Get the retryCount property: Task application failures (non-zero exit code) are retried, pre-processing errors
     * (the Task could not be run) and file upload errors are not retried. The Batch service will retry the Task up to
     * the limit specified by the constraints.
     *
     * @return the retryCount value.
     */
    public int getRetryCount() {
        return this.retryCount;
    }

    /**
     * Get the lastRetryTime property: This property is set only if the Task was retried (i.e. retryCount is nonzero).
     * If present, this is typically the same as startTime, but may be different if the Task has been restarted for
     * reasons other than retry; for example, if the Compute Node was rebooted during a retry, then the startTime is
     * updated but the lastRetryTime is not.
     *
     * @return the lastRetryTime value.
     */
    public OffsetDateTime getLastRetryTime() {
        return this.lastRetryTime;
    }

    /**
     * Get the result property: If the value is 'failed', then the details of the failure can be found in the
     * failureInfo property.
     *
     * @return the result value.
     */
    public TaskExecutionResult getResult() {
        return this.result;
    }
}
