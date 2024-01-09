// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Batch will retry Tasks when a recovery operation is triggered on a Node.
 * Examples of recovery operations include (but are not limited to) when an
 * unhealthy Node is rebooted or a Compute Node disappeared due to host failure.
 * Retries due to recovery operations are independent of and are not counted
 * against the maxTaskRetryCount. Even if the maxTaskRetryCount is 0, an internal
 * retry due to a recovery operation may occur. Because of this, all Tasks should
 * be idempotent. This means Tasks need to tolerate being interrupted and
 * restarted without causing any corruption or duplicate data. The best practice
 * for long running Tasks is to use some form of checkpointing. In some cases the
 * StartTask may be re-run even though the Compute Node was not rebooted. Special
 * care should be taken to avoid StartTasks which create breakaway process or
 * install/launch services from the StartTask working directory, as this will
 * block Batch from being able to re-run the StartTask.
 */
@Fluent
public final class BatchStartTask {

    /*
     * The command line of the StartTask. The command line does not run under a shell, and therefore cannot take
     * advantage of shell features such as environment variable expansion. If you want to take advantage of such
     * features, you should invoke the shell in the command line, for example using "cmd /c MyCommand" in Windows or
     * "/bin/sh -c MyCommand" in Linux. If the command line refers to file paths, it should use a relative path
     * (relative to the Task working directory), or use the Batch provided environment variable
     * (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     */
    @Generated
    @JsonProperty(value = "commandLine")
    private String commandLine;

    /*
     * The settings for the container under which the StartTask runs. When this is specified, all directories
     * recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into
     * the container, all Task environment variables are mapped into the container, and the Task command line is
     * executed in the container. Files produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be
     * reflected to the host disk, meaning that Batch file APIs will not be able to access those files.
     */
    @Generated
    @JsonProperty(value = "containerSettings")
    private BatchTaskContainerSettings containerSettings;

    /*
     * A list of files that the Batch service will download to the Compute Node before running the command line. There
     * is a maximum size for the list of resource files. When the max size is exceeded, the request will fail and the
     * response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be
     * reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers. Files listed
     * under this element are located in the Task's working directory.
     */
    @Generated
    @JsonProperty(value = "resourceFiles")
    private List<ResourceFile> resourceFiles;

    /*
     * A list of environment variable settings for the StartTask.
     */
    @Generated
    @JsonProperty(value = "environmentSettings")
    private List<EnvironmentSetting> environmentSettings;

    /*
     * The user identity under which the StartTask runs. If omitted, the Task runs as a non-administrative user unique
     * to the Task.
     */
    @Generated
    @JsonProperty(value = "userIdentity")
    private UserIdentity userIdentity;

    /*
     * The maximum number of times the Task may be retried. The Batch service retries a Task if its exit code is
     * nonzero. Note that this value specifically controls the number of retries. The Batch service will try the Task
     * once, and may then retry up to this limit. For example, if the maximum retry count is 3, Batch tries the Task up
     * to 4 times (one initial try and 3 retries). If the maximum retry count is 0, the Batch service does not retry
     * the Task. If the maximum retry count is -1, the Batch service retries the Task without limit, however this is
     * not recommended for a start task or any task. The default value is 0 (no retries).
     */
    @Generated
    @JsonProperty(value = "maxTaskRetryCount")
    private Integer maxTaskRetryCount;

    /*
     * Whether the Batch service should wait for the StartTask to complete successfully (that is, to exit with exit
     * code 0) before scheduling any Tasks on the Compute Node. If true and the StartTask fails on a Node, the Batch
     * service retries the StartTask up to its maximum retry count (maxTaskRetryCount). If the Task has still not
     * completed successfully after all retries, then the Batch service marks the Node unusable, and will not schedule
     * Tasks to it. This condition can be detected via the Compute Node state and failure info details. If false, the
     * Batch service will not wait for the StartTask to complete. In this case, other Tasks can start executing on the
     * Compute Node while the StartTask is still running; and even if the StartTask fails, new Tasks will continue to
     * be scheduled on the Compute Node. The default is true.
     */
    @Generated
    @JsonProperty(value = "waitForSuccess")
    private Boolean waitForSuccess;

    /**
     * Creates an instance of BatchStartTask class.
     *
     * @param commandLine the commandLine value to set.
     */
    @Generated
    @JsonCreator
    public BatchStartTask(@JsonProperty(value = "commandLine") String commandLine) {
        this.commandLine = commandLine;
    }

    /**
     * Get the commandLine property: The command line of the StartTask. The command line does not run under a shell,
     * and therefore cannot take advantage of shell features such as environment variable expansion. If you want to
     * take advantage of such features, you should invoke the shell in the command line, for example using "cmd /c
     * MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If the command line refers to file paths, it should
     * use a relative path (relative to the Task working directory), or use the Batch provided environment variable
     * (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     *
     * @return the commandLine value.
     */
    @Generated
    public String getCommandLine() {
        return this.commandLine;
    }

    /**
     * Get the containerSettings property: The settings for the container under which the StartTask runs. When this is
     * specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on
     * the node) are mapped into the container, all Task environment variables are mapped into the container, and the
     * Task command line is executed in the container. Files produced in the container outside of
     * AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk, meaning that Batch file APIs will not be able to
     * access those files.
     *
     * @return the containerSettings value.
     */
    @Generated
    public BatchTaskContainerSettings getContainerSettings() {
        return this.containerSettings;
    }

    /**
     * Set the containerSettings property: The settings for the container under which the StartTask runs. When this is
     * specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on
     * the node) are mapped into the container, all Task environment variables are mapped into the container, and the
     * Task command line is executed in the container. Files produced in the container outside of
     * AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk, meaning that Batch file APIs will not be able to
     * access those files.
     *
     * @param containerSettings the containerSettings value to set.
     * @return the BatchStartTask object itself.
     */
    @Generated
    public BatchStartTask setContainerSettings(BatchTaskContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get the resourceFiles property: A list of files that the Batch service will download to the Compute Node before
     * running the command line. There is a maximum size for the list of resource files. When the max size is
     * exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the
     * collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application
     * Packages, or Docker Containers. Files listed under this element are located in the Task's working directory.
     *
     * @return the resourceFiles value.
     */
    @Generated
    public List<ResourceFile> getResourceFiles() {
        return this.resourceFiles;
    }

    /**
     * Set the resourceFiles property: A list of files that the Batch service will download to the Compute Node before
     * running the command line. There is a maximum size for the list of resource files. When the max size is
     * exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the
     * collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application
     * Packages, or Docker Containers. Files listed under this element are located in the Task's working directory.
     *
     * @param resourceFiles the resourceFiles value to set.
     * @return the BatchStartTask object itself.
     */
    @Generated
    public BatchStartTask setResourceFiles(List<ResourceFile> resourceFiles) {
        this.resourceFiles = resourceFiles;
        return this;
    }

    /**
     * Get the environmentSettings property: A list of environment variable settings for the StartTask.
     *
     * @return the environmentSettings value.
     */
    @Generated
    public List<EnvironmentSetting> getEnvironmentSettings() {
        return this.environmentSettings;
    }

    /**
     * Set the environmentSettings property: A list of environment variable settings for the StartTask.
     *
     * @param environmentSettings the environmentSettings value to set.
     * @return the BatchStartTask object itself.
     */
    @Generated
    public BatchStartTask setEnvironmentSettings(List<EnvironmentSetting> environmentSettings) {
        this.environmentSettings = environmentSettings;
        return this;
    }

    /**
     * Get the userIdentity property: The user identity under which the StartTask runs. If omitted, the Task runs as a
     * non-administrative user unique to the Task.
     *
     * @return the userIdentity value.
     */
    @Generated
    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /**
     * Set the userIdentity property: The user identity under which the StartTask runs. If omitted, the Task runs as a
     * non-administrative user unique to the Task.
     *
     * @param userIdentity the userIdentity value to set.
     * @return the BatchStartTask object itself.
     */
    @Generated
    public BatchStartTask setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
        return this;
    }

    /**
     * Get the maxTaskRetryCount property: The maximum number of times the Task may be retried. The Batch service
     * retries a Task if its exit code is nonzero. Note that this value specifically controls the number of retries.
     * The Batch service will try the Task once, and may then retry up to this limit. For example, if the maximum retry
     * count is 3, Batch tries the Task up to 4 times (one initial try and 3 retries). If the maximum retry count is 0,
     * the Batch service does not retry the Task. If the maximum retry count is -1, the Batch service retries the Task
     * without limit, however this is not recommended for a start task or any task. The default value is 0 (no
     * retries).
     *
     * @return the maxTaskRetryCount value.
     */
    @Generated
    public Integer getMaxTaskRetryCount() {
        return this.maxTaskRetryCount;
    }

    /**
     * Set the maxTaskRetryCount property: The maximum number of times the Task may be retried. The Batch service
     * retries a Task if its exit code is nonzero. Note that this value specifically controls the number of retries.
     * The Batch service will try the Task once, and may then retry up to this limit. For example, if the maximum retry
     * count is 3, Batch tries the Task up to 4 times (one initial try and 3 retries). If the maximum retry count is 0,
     * the Batch service does not retry the Task. If the maximum retry count is -1, the Batch service retries the Task
     * without limit, however this is not recommended for a start task or any task. The default value is 0 (no
     * retries).
     *
     * @param maxTaskRetryCount the maxTaskRetryCount value to set.
     * @return the BatchStartTask object itself.
     */
    @Generated
    public BatchStartTask setMaxTaskRetryCount(Integer maxTaskRetryCount) {
        this.maxTaskRetryCount = maxTaskRetryCount;
        return this;
    }

    /**
     * Get the waitForSuccess property: Whether the Batch service should wait for the StartTask to complete
     * successfully (that is, to exit with exit code 0) before scheduling any Tasks on the Compute Node. If true and
     * the StartTask fails on a Node, the Batch service retries the StartTask up to its maximum retry count
     * (maxTaskRetryCount). If the Task has still not completed successfully after all retries, then the Batch service
     * marks the Node unusable, and will not schedule Tasks to it. This condition can be detected via the Compute Node
     * state and failure info details. If false, the Batch service will not wait for the StartTask to complete. In this
     * case, other Tasks can start executing on the Compute Node while the StartTask is still running; and even if the
     * StartTask fails, new Tasks will continue to be scheduled on the Compute Node. The default is true.
     *
     * @return the waitForSuccess value.
     */
    @Generated
    public Boolean isWaitForSuccess() {
        return this.waitForSuccess;
    }

    /**
     * Set the waitForSuccess property: Whether the Batch service should wait for the StartTask to complete
     * successfully (that is, to exit with exit code 0) before scheduling any Tasks on the Compute Node. If true and
     * the StartTask fails on a Node, the Batch service retries the StartTask up to its maximum retry count
     * (maxTaskRetryCount). If the Task has still not completed successfully after all retries, then the Batch service
     * marks the Node unusable, and will not schedule Tasks to it. This condition can be detected via the Compute Node
     * state and failure info details. If false, the Batch service will not wait for the StartTask to complete. In this
     * case, other Tasks can start executing on the Compute Node while the StartTask is still running; and even if the
     * StartTask fails, new Tasks will continue to be scheduled on the Compute Node. The default is true.
     *
     * @param waitForSuccess the waitForSuccess value to set.
     * @return the BatchStartTask object itself.
     */
    @Generated
    public BatchStartTask setWaitForSuccess(Boolean waitForSuccess) {
        this.waitForSuccess = waitForSuccess;
        return this;
    }
}
