// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Information about an Azure Batch subtask.
 */
@Immutable
public final class BatchSubtask {

    /*
     * The ID of the subtask.
     */
    @Generated
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * Information about the Compute Node on which the subtask ran.
     */
    @Generated
    @JsonProperty(value = "nodeInfo")
    private BatchNodeInfo nodeInfo;

    /*
     * The time at which the subtask started running. If the subtask has been restarted or retried, this is the most
     * recent time at which the subtask started running.
     */
    @Generated
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The time at which the subtask completed. This property is set only if the subtask is in the Completed state.
     */
    @Generated
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The exit code of the program specified on the subtask command line. This property is set only if the subtask is
     * in the completed state. In general, the exit code for a process reflects the specific convention implemented by
     * the application developer for that process. If you use the exit code value to make decisions in your code, be
     * sure that you know the exit code convention used by the application process. However, if the Batch service
     * terminates the subtask (due to timeout, or user termination via the API) you may see an operating system-defined
     * exit code.
     */
    @Generated
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /*
     * Information about the container under which the Task is executing. This property is set only if the Task runs in
     * a container context.
     */
    @Generated
    @JsonProperty(value = "containerInfo")
    private BatchTaskContainerExecutionInfo containerInfo;

    /*
     * Information describing the Task failure, if any. This property is set only if the Task is in the completed state
     * and encountered a failure.
     */
    @Generated
    @JsonProperty(value = "failureInfo")
    private BatchTaskFailureInfo failureInfo;

    /*
     * The current state of the subtask.
     */
    @Generated
    @JsonProperty(value = "state")
    private BatchSubtaskState state;

    /*
     * The time at which the subtask entered its current state.
     */
    @Generated
    @JsonProperty(value = "stateTransitionTime")
    private OffsetDateTime stateTransitionTime;

    /*
     * The previous state of the subtask. This property is not set if the subtask is in its initial running state.
     */
    @Generated
    @JsonProperty(value = "previousState")
    private BatchSubtaskState previousState;

    /*
     * The time at which the subtask entered its previous state. This property is not set if the subtask is in its
     * initial running state.
     */
    @Generated
    @JsonProperty(value = "previousStateTransitionTime")
    private OffsetDateTime previousStateTransitionTime;

    /*
     * The result of the Task execution. If the value is 'failed', then the details of the failure can be found in the
     * failureInfo property.
     */
    @Generated
    @JsonProperty(value = "result")
    private BatchTaskExecutionResult result;

    /**
     * Creates an instance of BatchSubtask class.
     */
    @Generated
    private BatchSubtask() {
    }

    /**
     * Get the id property: The ID of the subtask.
     *
     * @return the id value.
     */
    @Generated
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the nodeInfo property: Information about the Compute Node on which the subtask ran.
     *
     * @return the nodeInfo value.
     */
    @Generated
    public BatchNodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    /**
     * Get the startTime property: The time at which the subtask started running. If the subtask has been restarted or
     * retried, this is the most recent time at which the subtask started running.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The time at which the subtask completed. This property is set only if the subtask is
     * in the Completed state.
     *
     * @return the endTime value.
     */
    @Generated
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the exitCode property: The exit code of the program specified on the subtask command line. This property is
     * set only if the subtask is in the completed state. In general, the exit code for a process reflects the specific
     * convention implemented by the application developer for that process. If you use the exit code value to make
     * decisions in your code, be sure that you know the exit code convention used by the application process. However,
     * if the Batch service terminates the subtask (due to timeout, or user termination via the API) you may see an
     * operating system-defined exit code.
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
     * Get the state property: The current state of the subtask.
     *
     * @return the state value.
     */
    @Generated
    public BatchSubtaskState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the subtask entered its current state.
     *
     * @return the stateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the previousState property: The previous state of the subtask. This property is not set if the subtask is in
     * its initial running state.
     *
     * @return the previousState value.
     */
    @Generated
    public BatchSubtaskState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: The time at which the subtask entered its previous state. This
     * property is not set if the subtask is in its initial running state.
     *
     * @return the previousStateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getPreviousStateTransitionTime() {
        return this.previousStateTransitionTime;
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
