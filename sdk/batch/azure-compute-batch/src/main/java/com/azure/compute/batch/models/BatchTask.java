// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Batch will retry Tasks when a recovery operation is triggered on a Node. Examples of recovery operations include (but
 * are not limited to) when an unhealthy Node is rebooted or a Compute Node disappeared due to host failure. Retries due
 * to recovery operations are independent of and are not counted against the maxTaskRetryCount. Even if the
 * maxTaskRetryCount is 0, an internal retry due to a recovery operation may occur. Because of this, all Tasks should be
 * idempotent. This means Tasks need to tolerate being interrupted and restarted without causing any corruption or
 * duplicate data. The best practice for long running Tasks is to use some form of checkpointing.
 */
@Fluent
public final class BatchTask {

    /*
     * A string that uniquely identifies the Task within the Job. The ID can contain any combination of alphanumeric
     * characters including hyphens and underscores, and cannot contain more than 64 characters.
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * A display name for the Task. The display name need not be unique and can contain any Unicode characters up to a
     * maximum length of 1024.
     */
    @Generated
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The URL of the Task.
     */
    @Generated
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * The ETag of the Task. This is an opaque string. You can use it to detect whether the Task has changed between
     * requests. In particular, you can be pass the ETag when updating a Task to specify that your changes should take
     * effect only if nobody else has modified the Task in the meantime.
     */
    @Generated
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String eTag;

    /*
     * The last modified time of the Task.
     */
    @Generated
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The creation time of the Task.
     */
    @Generated
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * How the Batch service should respond when the Task completes.
     */
    @Generated
    @JsonProperty(value = "exitConditions", access = JsonProperty.Access.WRITE_ONLY)
    private ExitConditions exitConditions;

    /*
     * The current state of the Task.
     */
    @Generated
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private BatchTaskState state;

    /*
     * The time at which the Task entered its current state.
     */
    @Generated
    @JsonProperty(value = "stateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime stateTransitionTime;

    /*
     * The previous state of the Task. This property is not set if the Task is in its initial Active state.
     */
    @Generated
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private BatchTaskState previousState;

    /*
     * The time at which the Task entered its previous state. This property is not set if the Task is in its initial
     * Active state.
     */
    @Generated
    @JsonProperty(value = "previousStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime previousStateTransitionTime;

    /*
     * The command line of the Task. For multi-instance Tasks, the command line is executed as the primary Task, after
     * the primary Task and all subtasks have finished executing the coordination command line. The command line does
     * not run under a shell, and therefore cannot take advantage of shell features such as environment variable
     * expansion. If you want to take advantage of such features, you should invoke the shell in the command line, for
     * example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If the command line refers to
     * file paths, it should use a relative path (relative to the Task working directory), or use the Batch provided
     * environment variable (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     */
    @Generated
    @JsonProperty(value = "commandLine", access = JsonProperty.Access.WRITE_ONLY)
    private String commandLine;

    /*
     * The settings for the container under which the Task runs. If the Pool that will run this Task has
     * containerConfiguration set, this must be set as well. If the Pool that will run this Task doesn't have
     * containerConfiguration set, this must not be set. When this is specified, all directories recursively below the
     * AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all Task
     * environment variables are mapped into the container, and the Task command line is executed in the container.
     * Files produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be reflected to the host disk,
     * meaning that Batch file APIs will not be able to access those files.
     */
    @Generated
    @JsonProperty(value = "containerSettings", access = JsonProperty.Access.WRITE_ONLY)
    private BatchTaskContainerSettings containerSettings;

    /*
     * A list of files that the Batch service will download to the Compute Node before running the command line. For
     * multi-instance Tasks, the resource files will only be downloaded to the Compute Node on which the primary Task
     * is executed. There is a maximum size for the list of resource files.  When the max size is exceeded, the request
     * will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of
     * ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker
     * Containers.
     */
    @Generated
    @JsonProperty(value = "resourceFiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceFile> resourceFiles;

    /*
     * A list of files that the Batch service will upload from the Compute Node after running the command line. For
     * multi-instance Tasks, the files will only be uploaded from the Compute Node on which the primary Task is
     * executed.
     */
    @Generated
    @JsonProperty(value = "outputFiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<OutputFile> outputFiles;

    /*
     * A list of environment variable settings for the Task.
     */
    @Generated
    @JsonProperty(value = "environmentSettings", access = JsonProperty.Access.WRITE_ONLY)
    private List<EnvironmentSetting> environmentSettings;

    /*
     * A locality hint that can be used by the Batch service to select a Compute Node on which to start the new Task.
     */
    @Generated
    @JsonProperty(value = "affinityInfo", access = JsonProperty.Access.WRITE_ONLY)
    private AffinityInfo affinityInfo;

    /*
     * The execution constraints that apply to this Task.
     */
    @Generated
    @JsonProperty(value = "constraints")
    private BatchTaskConstraints constraints;

    /*
     * The number of scheduling slots that the Task requires to run. The default is 1. A Task can only be scheduled to
     * run on a compute node if the node has enough free scheduling slots available. For multi-instance Tasks, this
     * must be 1.
     */
    @Generated
    @JsonProperty(value = "requiredSlots", access = JsonProperty.Access.WRITE_ONLY)
    private Integer requiredSlots;

    /*
     * The user identity under which the Task runs. If omitted, the Task runs as a non-administrative user unique to
     * the Task.
     */
    @Generated
    @JsonProperty(value = "userIdentity", access = JsonProperty.Access.WRITE_ONLY)
    private UserIdentity userIdentity;

    /*
     * Information about the execution of the Task.
     */
    @Generated
    @JsonProperty(value = "executionInfo", access = JsonProperty.Access.WRITE_ONLY)
    private BatchTaskExecutionInfo executionInfo;

    /*
     * Information about the Compute Node on which the Task ran.
     */
    @Generated
    @JsonProperty(value = "nodeInfo", access = JsonProperty.Access.WRITE_ONLY)
    private BatchNodeInfo nodeInfo;

    /*
     * An object that indicates that the Task is a multi-instance Task, and contains information about how to run the
     * multi-instance Task.
     */
    @Generated
    @JsonProperty(value = "multiInstanceSettings", access = JsonProperty.Access.WRITE_ONLY)
    private MultiInstanceSettings multiInstanceSettings;

    /*
     * Resource usage statistics for the Task.
     */
    @Generated
    @JsonProperty(value = "stats", access = JsonProperty.Access.WRITE_ONLY)
    private BatchTaskStatistics stats;

    /*
     * The Tasks that this Task depends on. This Task will not be scheduled until all Tasks that it depends on have
     * completed successfully. If any of those Tasks fail and exhaust their retry counts, this Task will never be
     * scheduled.
     */
    @Generated
    @JsonProperty(value = "dependsOn", access = JsonProperty.Access.WRITE_ONLY)
    private BatchTaskDependencies dependsOn;

    /*
     * A list of Packages that the Batch service will deploy to the Compute Node before running the command line.
     * Application packages are downloaded and deployed to a shared directory, not the Task working directory.
     * Therefore, if a referenced package is already on the Node, and is up to date, then it is not re-downloaded; the
     * existing copy on the Compute Node is used. If a referenced Package cannot be installed, for example because the
     * package has been deleted or because download failed, the Task fails.
     */
    @Generated
    @JsonProperty(value = "applicationPackageReferences", access = JsonProperty.Access.WRITE_ONLY)
    private List<BatchApplicationPackageReference> applicationPackageReferences;

    /*
     * The settings for an authentication token that the Task can use to perform Batch service operations. If this
     * property is set, the Batch service provides the Task with an authentication token which can be used to
     * authenticate Batch service operations without requiring an Account access key. The token is provided via the
     * AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The operations that the Task can carry out using the token
     * depend on the settings. For example, a Task can request Job permissions in order to add other Tasks to the Job,
     * or check the status of the Job or of other Tasks under the Job.
     */
    @Generated
    @JsonProperty(value = "authenticationTokenSettings", access = JsonProperty.Access.WRITE_ONLY)
    private AuthenticationTokenSettings authenticationTokenSettings;

    /** Creates an instance of BatchTask class. */
    @Generated
    public BatchTask() {}

    /**
     * Get the id property: A string that uniquely identifies the Task within the Job. The ID can contain any
     * combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64
     * characters.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: A display name for the Task. The display name need not be unique and can contain
     * any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the url property: The URL of the Task.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the eTag property: The ETag of the Task. This is an opaque string. You can use it to detect whether the Task
     * has changed between requests. In particular, you can be pass the ETag when updating a Task to specify that your
     * changes should take effect only if nobody else has modified the Task in the meantime.
     *
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Get the lastModified property: The last modified time of the Task.
     *
     * @return the lastModified value.
     */
    @Generated
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }

    /**
     * Get the creationTime property: The creation time of the Task.
     *
     * @return the creationTime value.
     */
    @Generated
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the exitConditions property: How the Batch service should respond when the Task completes.
     *
     * @return the exitConditions value.
     */
    @Generated
    public ExitConditions getExitConditions() {
        return this.exitConditions;
    }

    /**
     * Get the state property: The current state of the Task.
     *
     * @return the state value.
     */
    @Generated
    public BatchTaskState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the Task entered its current state.
     *
     * @return the stateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the previousState property: The previous state of the Task. This property is not set if the Task is in its
     * initial Active state.
     *
     * @return the previousState value.
     */
    @Generated
    public BatchTaskState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: The time at which the Task entered its previous state. This
     * property is not set if the Task is in its initial Active state.
     *
     * @return the previousStateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getPreviousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Get the commandLine property: The command line of the Task. For multi-instance Tasks, the command line is
     * executed as the primary Task, after the primary Task and all subtasks have finished executing the coordination
     * command line. The command line does not run under a shell, and therefore cannot take advantage of shell features
     * such as environment variable expansion. If you want to take advantage of such features, you should invoke the
     * shell in the command line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If
     * the command line refers to file paths, it should use a relative path (relative to the Task working directory), or
     * use the Batch provided environment variable
     * (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     *
     * @return the commandLine value.
     */
    @Generated
    public String getCommandLine() {
        return this.commandLine;
    }

    /**
     * Get the containerSettings property: The settings for the container under which the Task runs. If the Pool that
     * will run this Task has containerConfiguration set, this must be set as well. If the Pool that will run this Task
     * doesn't have containerConfiguration set, this must not be set. When this is specified, all directories
     * recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into
     * the container, all Task environment variables are mapped into the container, and the Task command line is
     * executed in the container. Files produced in the container outside of AZ_BATCH_NODE_ROOT_DIR might not be
     * reflected to the host disk, meaning that Batch file APIs will not be able to access those files.
     *
     * @return the containerSettings value.
     */
    @Generated
    public BatchTaskContainerSettings getContainerSettings() {
        return this.containerSettings;
    }

    /**
     * Get the resourceFiles property: A list of files that the Batch service will download to the Compute Node before
     * running the command line. For multi-instance Tasks, the resource files will only be downloaded to the Compute
     * Node on which the primary Task is executed. There is a maximum size for the list of resource files. When the max
     * size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this
     * occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files,
     * Application Packages, or Docker Containers.
     *
     * @return the resourceFiles value.
     */
    @Generated
    public List<ResourceFile> getResourceFiles() {
        return this.resourceFiles;
    }

    /**
     * Get the outputFiles property: A list of files that the Batch service will upload from the Compute Node after
     * running the command line. For multi-instance Tasks, the files will only be uploaded from the Compute Node on
     * which the primary Task is executed.
     *
     * @return the outputFiles value.
     */
    @Generated
    public List<OutputFile> getOutputFiles() {
        return this.outputFiles;
    }

    /**
     * Get the environmentSettings property: A list of environment variable settings for the Task.
     *
     * @return the environmentSettings value.
     */
    @Generated
    public List<EnvironmentSetting> getEnvironmentSettings() {
        return this.environmentSettings;
    }

    /**
     * Get the affinityInfo property: A locality hint that can be used by the Batch service to select a Compute Node on
     * which to start the new Task.
     *
     * @return the affinityInfo value.
     */
    @Generated
    public AffinityInfo getAffinityInfo() {
        return this.affinityInfo;
    }

    /**
     * Get the constraints property: The execution constraints that apply to this Task.
     *
     * @return the constraints value.
     */
    @Generated
    public BatchTaskConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * Set the constraints property: The execution constraints that apply to this Task.
     *
     * @param constraints the constraints value to set.
     * @return the BatchTask object itself.
     */
    @Generated
    public BatchTask setConstraints(BatchTaskConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the requiredSlots property: The number of scheduling slots that the Task requires to run. The default is 1. A
     * Task can only be scheduled to run on a compute node if the node has enough free scheduling slots available. For
     * multi-instance Tasks, this must be 1.
     *
     * @return the requiredSlots value.
     */
    @Generated
    public Integer getRequiredSlots() {
        return this.requiredSlots;
    }

    /**
     * Get the userIdentity property: The user identity under which the Task runs. If omitted, the Task runs as a
     * non-administrative user unique to the Task.
     *
     * @return the userIdentity value.
     */
    @Generated
    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /**
     * Get the executionInfo property: Information about the execution of the Task.
     *
     * @return the executionInfo value.
     */
    @Generated
    public BatchTaskExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    /**
     * Get the nodeInfo property: Information about the Compute Node on which the Task ran.
     *
     * @return the nodeInfo value.
     */
    @Generated
    public BatchNodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    /**
     * Get the multiInstanceSettings property: An object that indicates that the Task is a multi-instance Task, and
     * contains information about how to run the multi-instance Task.
     *
     * @return the multiInstanceSettings value.
     */
    @Generated
    public MultiInstanceSettings getMultiInstanceSettings() {
        return this.multiInstanceSettings;
    }

    /**
     * Get the stats property: Resource usage statistics for the Task.
     *
     * @return the stats value.
     */
    @Generated
    public BatchTaskStatistics getStats() {
        return this.stats;
    }

    /**
     * Get the dependsOn property: The Tasks that this Task depends on. This Task will not be scheduled until all Tasks
     * that it depends on have completed successfully. If any of those Tasks fail and exhaust their retry counts, this
     * Task will never be scheduled.
     *
     * @return the dependsOn value.
     */
    @Generated
    public BatchTaskDependencies getDependsOn() {
        return this.dependsOn;
    }

    /**
     * Get the applicationPackageReferences property: A list of Packages that the Batch service will deploy to the
     * Compute Node before running the command line. Application packages are downloaded and deployed to a shared
     * directory, not the Task working directory. Therefore, if a referenced package is already on the Node, and is up
     * to date, then it is not re-downloaded; the existing copy on the Compute Node is used. If a referenced Package
     * cannot be installed, for example because the package has been deleted or because download failed, the Task fails.
     *
     * @return the applicationPackageReferences value.
     */
    @Generated
    public List<BatchApplicationPackageReference> getApplicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Get the authenticationTokenSettings property: The settings for an authentication token that the Task can use to
     * perform Batch service operations. If this property is set, the Batch service provides the Task with an
     * authentication token which can be used to authenticate Batch service operations without requiring an Account
     * access key. The token is provided via the AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The operations that
     * the Task can carry out using the token depend on the settings. For example, a Task can request Job permissions in
     * order to add other Tasks to the Job, or check the status of the Job or of other Tasks under the Job.
     *
     * @return the authenticationTokenSettings value.
     */
    @Generated
    public AuthenticationTokenSettings getAuthenticationTokenSettings() {
        return this.authenticationTokenSettings;
    }
}
