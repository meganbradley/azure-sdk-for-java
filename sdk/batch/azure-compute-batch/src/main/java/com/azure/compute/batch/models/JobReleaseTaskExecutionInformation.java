// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Contains information about the execution of a Job Release Task on a Compute Node. */
@Immutable
public final class JobReleaseTaskExecutionInformation {

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
     * The current state of the Job Release Task on the Compute Node.
     */
    @JsonProperty(value = "state", required = true)
    private JobReleaseTaskState state;

    /*
     * The root directory of the Job Release Task on the Compute Node. You can use
     * this path to retrieve files created by the Task, such as log files.
     */
    @JsonProperty(value = "taskRootDirectory")
    private String taskRootDirectory;

    /*
     * The URL to the root directory of the Job Release Task on the Compute Node.
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
     * If the value is 'failed', then the details of the failure can be found in the
     * failureInfo property.
     */
    @JsonProperty(value = "result")
    private TaskExecutionResult result;

    /**
     * Creates an instance of JobReleaseTaskExecutionInformation class.
     *
     * @param startTime the startTime value to set.
     * @param state the state value to set.
     */
    @JsonCreator
    private JobReleaseTaskExecutionInformation(
            @JsonProperty(value = "startTime", required = true) OffsetDateTime startTime,
            @JsonProperty(value = "state", required = true) JobReleaseTaskState state) {
        this.startTime = startTime;
        this.state = state;
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
     * Get the state property: The current state of the Job Release Task on the Compute Node.
     *
     * @return the state value.
     */
    public JobReleaseTaskState getState() {
        return this.state;
    }

    /**
     * Get the taskRootDirectory property: The root directory of the Job Release Task on the Compute Node. You can use
     * this path to retrieve files created by the Task, such as log files.
     *
     * @return the taskRootDirectory value.
     */
    public String getTaskRootDirectory() {
        return this.taskRootDirectory;
    }

    /**
     * Get the taskRootDirectoryUrl property: The URL to the root directory of the Job Release Task on the Compute Node.
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
     * Get the result property: If the value is 'failed', then the details of the failure can be found in the
     * failureInfo property.
     *
     * @return the result value.
     */
    public TaskExecutionResult getResult() {
        return this.result;
    }
}
