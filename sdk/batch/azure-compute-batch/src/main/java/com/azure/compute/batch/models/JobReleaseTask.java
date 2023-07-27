// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/**
 * The Job Release Task runs when the Job ends, because of one of the following: The user calls the Terminate Job API,
 * or the Delete Job API while the Job is still active, the Job's maximum wall clock time constraint is reached, and the
 * Job is still active, or the Job's Job Manager Task completed, and the Job is configured to terminate when the Job
 * Manager completes. The Job Release Task runs on each Node where Tasks of the Job have run and the Job Preparation
 * Task ran and completed. If you reimage a Node after it has run the Job Preparation Task, and the Job ends without any
 * further Tasks of the Job running on that Node (and hence the Job Preparation Task does not re-run), then the Job
 * Release Task does not run on that Compute Node. If a Node reboots while the Job Release Task is still running, the
 * Job Release Task runs again when the Compute Node starts up. The Job is not marked as complete until all Job Release
 * Tasks have completed. The Job Release Task runs in the background. It does not occupy a scheduling slot; that is, it
 * does not count towards the taskSlotsPerNode limit specified on the Pool.
 */
@Fluent
public final class JobReleaseTask {

    /*
     * The ID can contain any combination of alphanumeric characters including hyphens and underscores and cannot
     * contain more than 64 characters. If you do not specify this property, the Batch service assigns a default value
     * of 'jobrelease'. No other Task in the Job can have the same ID as the Job Release Task. If you try to submit a
     * Task with the same id, the Batch service rejects the request with error code TaskIdSameAsJobReleaseTask; if you
     * are calling the REST API directly, the HTTP status code is 409 (Conflict).
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The command line does not run under a shell, and therefore cannot take
     * advantage of shell features such as environment variable expansion. If you want
     * to take advantage of such features, you should invoke the shell in the command
     * line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c
     * MyCommand" in Linux. If the command line refers to file paths, it should use a
     * relative path (relative to the Task working directory), or use the Batch
     * provided environment variable
     * (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     */
    @Generated
    @JsonProperty(value = "commandLine")
    private String commandLine;

    /*
     * When this is specified, all directories recursively below the
     * AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are
     * mapped into the container, all Task environment variables are mapped into the
     * container, and the Task command line is executed in the container. Files
     * produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be
     * reflected to the host disk, meaning that Batch file APIs will not be able to
     * access those files.
     */
    @Generated
    @JsonProperty(value = "containerSettings")
    private TaskContainerSettings containerSettings;

    /*
     * Files listed under this element are located in the Task's working directory.
     */
    @Generated
    @JsonProperty(value = "resourceFiles")
    private List<ResourceFile> resourceFiles;

    /*
     * A list of environment variable settings for the Job Release Task.
     */
    @Generated
    @JsonProperty(value = "environmentSettings")
    private List<EnvironmentSetting> environmentSettings;

    /*
     * The maximum elapsed time that the Job Release Task may run on a given Compute
     * Node, measured from the time the Task starts. If the Task does not complete
     * within the time limit, the Batch service terminates it. The default value is 15
     * minutes. You may not specify a timeout longer than 15 minutes. If you do, the
     * Batch service rejects it with an error; if you are calling the REST API
     * directly, the HTTP status code is 400 (Bad Request).
     */
    @Generated
    @JsonProperty(value = "maxWallClockTime")
    private Duration maxWallClockTime;

    /*
     * The default is 7 days, i.e. the Task directory will be retained for 7 days
     * unless the Compute Node is removed or the Job is deleted.
     */
    @Generated
    @JsonProperty(value = "retentionTime")
    private Duration retentionTime;

    /*
     * If omitted, the Task runs as a non-administrative user unique to the Task.
     */
    @Generated
    @JsonProperty(value = "userIdentity")
    private UserIdentity userIdentity;

    /**
     * Creates an instance of JobReleaseTask class.
     *
     * @param commandLine the commandLine value to set.
     */
    @Generated
    @JsonCreator
    public JobReleaseTask(@JsonProperty(value = "commandLine") String commandLine) {
        this.commandLine = commandLine;
    }

    /**
     * Get the id property: The ID can contain any combination of alphanumeric characters including hyphens and
     * underscores and cannot contain more than 64 characters. If you do not specify this property, the Batch service
     * assigns a default value of 'jobrelease'. No other Task in the Job can have the same ID as the Job Release Task.
     * If you try to submit a Task with the same id, the Batch service rejects the request with error code
     * TaskIdSameAsJobReleaseTask; if you are calling the REST API directly, the HTTP status code is 409 (Conflict).
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ID can contain any combination of alphanumeric characters including hyphens and
     * underscores and cannot contain more than 64 characters. If you do not specify this property, the Batch service
     * assigns a default value of 'jobrelease'. No other Task in the Job can have the same ID as the Job Release Task.
     * If you try to submit a Task with the same id, the Batch service rejects the request with error code
     * TaskIdSameAsJobReleaseTask; if you are calling the REST API directly, the HTTP status code is 409 (Conflict).
     *
     * @param id the id value to set.
     * @return the JobReleaseTask object itself.
     */
    @Generated
    public JobReleaseTask setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the commandLine property: The command line does not run under a shell, and therefore cannot take advantage of
     * shell features such as environment variable expansion. If you want to take advantage of such features, you should
     * invoke the shell in the command line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand"
     * in Linux. If the command line refers to file paths, it should use a relative path (relative to the Task working
     * directory), or use the Batch provided environment variable
     * (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     *
     * @return the commandLine value.
     */
    @Generated
    public String getCommandLine() {
        return this.commandLine;
    }

    /**
     * Get the containerSettings property: When this is specified, all directories recursively below the
     * AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all Task
     * environment variables are mapped into the container, and the Task command line is executed in the container.
     * Files produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk,
     * meaning that Batch file APIs will not be able to access those files.
     *
     * @return the containerSettings value.
     */
    @Generated
    public TaskContainerSettings getContainerSettings() {
        return this.containerSettings;
    }

    /**
     * Set the containerSettings property: When this is specified, all directories recursively below the
     * AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all Task
     * environment variables are mapped into the container, and the Task command line is executed in the container.
     * Files produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk,
     * meaning that Batch file APIs will not be able to access those files.
     *
     * @param containerSettings the containerSettings value to set.
     * @return the JobReleaseTask object itself.
     */
    @Generated
    public JobReleaseTask setContainerSettings(TaskContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get the resourceFiles property: Files listed under this element are located in the Task's working directory.
     *
     * @return the resourceFiles value.
     */
    @Generated
    public List<ResourceFile> getResourceFiles() {
        return this.resourceFiles;
    }

    /**
     * Set the resourceFiles property: Files listed under this element are located in the Task's working directory.
     *
     * @param resourceFiles the resourceFiles value to set.
     * @return the JobReleaseTask object itself.
     */
    @Generated
    public JobReleaseTask setResourceFiles(List<ResourceFile> resourceFiles) {
        this.resourceFiles = resourceFiles;
        return this;
    }

    /**
     * Get the environmentSettings property: A list of environment variable settings for the Job Release Task.
     *
     * @return the environmentSettings value.
     */
    @Generated
    public List<EnvironmentSetting> getEnvironmentSettings() {
        return this.environmentSettings;
    }

    /**
     * Set the environmentSettings property: A list of environment variable settings for the Job Release Task.
     *
     * @param environmentSettings the environmentSettings value to set.
     * @return the JobReleaseTask object itself.
     */
    @Generated
    public JobReleaseTask setEnvironmentSettings(List<EnvironmentSetting> environmentSettings) {
        this.environmentSettings = environmentSettings;
        return this;
    }

    /**
     * Get the maxWallClockTime property: The maximum elapsed time that the Job Release Task may run on a given Compute
     * Node, measured from the time the Task starts. If the Task does not complete within the time limit, the Batch
     * service terminates it. The default value is 15 minutes. You may not specify a timeout longer than 15 minutes. If
     * you do, the Batch service rejects it with an error; if you are calling the REST API directly, the HTTP status
     * code is 400 (Bad Request).
     *
     * @return the maxWallClockTime value.
     */
    @Generated
    public Duration getMaxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set the maxWallClockTime property: The maximum elapsed time that the Job Release Task may run on a given Compute
     * Node, measured from the time the Task starts. If the Task does not complete within the time limit, the Batch
     * service terminates it. The default value is 15 minutes. You may not specify a timeout longer than 15 minutes. If
     * you do, the Batch service rejects it with an error; if you are calling the REST API directly, the HTTP status
     * code is 400 (Bad Request).
     *
     * @param maxWallClockTime the maxWallClockTime value to set.
     * @return the JobReleaseTask object itself.
     */
    @Generated
    public JobReleaseTask setMaxWallClockTime(Duration maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
        return this;
    }

    /**
     * Get the retentionTime property: The default is 7 days, i.e. the Task directory will be retained for 7 days unless
     * the Compute Node is removed or the Job is deleted.
     *
     * @return the retentionTime value.
     */
    @Generated
    public Duration getRetentionTime() {
        return this.retentionTime;
    }

    /**
     * Set the retentionTime property: The default is 7 days, i.e. the Task directory will be retained for 7 days unless
     * the Compute Node is removed or the Job is deleted.
     *
     * @param retentionTime the retentionTime value to set.
     * @return the JobReleaseTask object itself.
     */
    @Generated
    public JobReleaseTask setRetentionTime(Duration retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * Get the userIdentity property: If omitted, the Task runs as a non-administrative user unique to the Task.
     *
     * @return the userIdentity value.
     */
    @Generated
    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /**
     * Set the userIdentity property: If omitted, the Task runs as a non-administrative user unique to the Task.
     *
     * @param userIdentity the userIdentity value to set.
     * @return the JobReleaseTask object itself.
     */
    @Generated
    public JobReleaseTask setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
        return this;
    }
}
