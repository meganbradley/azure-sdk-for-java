// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An Azure Batch Job.
 */
@Fluent
public final class BatchJob {

    /*
     * A string that uniquely identifies the Job within the Account. The ID is case-preserving and case-insensitive
     * (that is, you may not have two IDs within an Account that differ only by case).
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The display name for the Job.
     */
    @Generated
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Whether Tasks in the Job can define dependencies on each other. The default is false.
     */
    @Generated
    @JsonProperty(value = "usesTaskDependencies", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean usesTaskDependencies;

    /*
     * The URL of the Job.
     */
    @Generated
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * The ETag of the Job. This is an opaque string. You can use it to detect whether the Job has changed between
     * requests. In particular, you can be pass the ETag when updating a Job to specify that your changes should take
     * effect only if nobody else has modified the Job in the meantime.
     */
    @Generated
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String eTag;

    /*
     * The last modified time of the Job. This is the last time at which the Job level data, such as the Job state or
     * priority, changed. It does not factor in task-level changes such as adding new Tasks or Tasks changing state.
     */
    @Generated
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The creation time of the Job.
     */
    @Generated
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The current state of the Job.
     */
    @Generated
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private BatchJobState state;

    /*
     * The time at which the Job entered its current state.
     */
    @Generated
    @JsonProperty(value = "stateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime stateTransitionTime;

    /*
     * The previous state of the Job. This property is not set if the Job is in its initial Active state.
     */
    @Generated
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private BatchJobState previousState;

    /*
     * The time at which the Job entered its previous state. This property is not set if the Job is in its initial
     * Active state.
     */
    @Generated
    @JsonProperty(value = "previousStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime previousStateTransitionTime;

    /*
     * The priority of the Job. Priority values can range from -1000 to 1000, with -1000 being the lowest priority and
     * 1000 being the highest priority. The default value is 0.
     */
    @Generated
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Whether Tasks in this job can be preempted by other high priority jobs. If the value is set to True, other high
     * priority jobs submitted to the system will take precedence and will be able requeue tasks from this job. You can
     * update a job's allowTaskPreemption after it has been created using the update job API.
     */
    @Generated
    @JsonProperty(value = "allowTaskPreemption")
    private Boolean allowTaskPreemption;

    /*
     * The maximum number of tasks that can be executed in parallel for the job. The value of maxParallelTasks must be
     * -1 or greater than 0 if specified. If not specified, the default value is -1, which means there's no limit to
     * the number of tasks that can be run at once. You can update a job's maxParallelTasks after it has been created
     * using the update job API.
     */
    @Generated
    @JsonProperty(value = "maxParallelTasks")
    private Integer maxParallelTasks;

    /*
     * The execution constraints for the Job.
     */
    @Generated
    @JsonProperty(value = "constraints")
    private BatchJobConstraints constraints;

    /*
     * Details of a Job Manager Task to be launched when the Job is started.
     */
    @Generated
    @JsonProperty(value = "jobManagerTask", access = JsonProperty.Access.WRITE_ONLY)
    private BatchJobManagerTask jobManagerTask;

    /*
     * The Job Preparation Task. The Job Preparation Task is a special Task run on each Compute Node before any other
     * Task of the Job.
     */
    @Generated
    @JsonProperty(value = "jobPreparationTask", access = JsonProperty.Access.WRITE_ONLY)
    private BatchJobPreparationTask jobPreparationTask;

    /*
     * The Job Release Task. The Job Release Task is a special Task run at the end of the Job on each Compute Node that
     * has run any other Task of the Job.
     */
    @Generated
    @JsonProperty(value = "jobReleaseTask", access = JsonProperty.Access.WRITE_ONLY)
    private BatchJobReleaseTask jobReleaseTask;

    /*
     * The list of common environment variable settings. These environment variables are set for all Tasks in the Job
     * (including the Job Manager, Job Preparation and Job Release Tasks). Individual Tasks can override an environment
     * setting specified here by specifying the same setting name with a different value.
     */
    @Generated
    @JsonProperty(value = "commonEnvironmentSettings", access = JsonProperty.Access.WRITE_ONLY)
    private List<EnvironmentSetting> commonEnvironmentSettings;

    /*
     * The Pool settings associated with the Job.
     */
    @Generated
    @JsonProperty(value = "poolInfo")
    private BatchPoolInfo poolInfo;

    /*
     * The action the Batch service should take when all Tasks in the Job are in the completed state. The default is
     * noaction.
     */
    @Generated
    @JsonProperty(value = "onAllTasksComplete")
    private OnAllBatchTasksComplete onAllTasksComplete;

    /*
     * The action the Batch service should take when any Task in the Job fails. A Task is considered to have failed if
     * has a failureInfo. A failureInfo is set if the Task completes with a non-zero exit code after exhausting its
     * retry count, or if there was an error starting the Task, for example due to a resource file download error. The
     * default is noaction.
     */
    @Generated
    @JsonProperty(value = "onTaskFailure", access = JsonProperty.Access.WRITE_ONLY)
    private OnBatchTaskFailure onTaskFailure;

    /*
     * The network configuration for the Job.
     */
    @Generated
    @JsonProperty(value = "networkConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private BatchJobNetworkConfiguration networkConfiguration;

    /*
     * A list of name-value pairs associated with the Job as metadata. The Batch service does not assign any meaning to
     * metadata; it is solely for the use of user code.
     */
    @Generated
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /*
     * The execution information for the Job.
     */
    @Generated
    @JsonProperty(value = "executionInfo", access = JsonProperty.Access.WRITE_ONLY)
    private BatchJobExecutionInfo executionInfo;

    /*
     * Resource usage statistics for the entire lifetime of the Job. This property is populated only if the CloudJob
     * was retrieved with an expand clause including the 'stats' attribute; otherwise it is null. The statistics may
     * not be immediately available. The Batch service performs periodic roll-up of statistics. The typical delay is
     * about 30 minutes.
     */
    @Generated
    @JsonProperty(value = "stats", access = JsonProperty.Access.WRITE_ONLY)
    private BatchJobStatistics stats;

    /**
     * Creates an instance of BatchJob class.
     *
     * @param poolInfo the poolInfo value to set.
     */
    @Generated
    @JsonCreator
    public BatchJob(@JsonProperty(value = "poolInfo") BatchPoolInfo poolInfo) {
        this.poolInfo = poolInfo;
    }

    /**
     * Get the id property: A string that uniquely identifies the Job within the Account. The ID is case-preserving and
     * case-insensitive (that is, you may not have two IDs within an Account that differ only by case).
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name for the Job.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the usesTaskDependencies property: Whether Tasks in the Job can define dependencies on each other. The
     * default is false.
     *
     * @return the usesTaskDependencies value.
     */
    @Generated
    public Boolean isUsesTaskDependencies() {
        return this.usesTaskDependencies;
    }

    /**
     * Get the url property: The URL of the Job.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the eTag property: The ETag of the Job. This is an opaque string. You can use it to detect whether the Job
     * has changed between requests. In particular, you can be pass the ETag when updating a Job to specify that your
     * changes should take effect only if nobody else has modified the Job in the meantime.
     *
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Get the lastModified property: The last modified time of the Job. This is the last time at which the Job level
     * data, such as the Job state or priority, changed. It does not factor in task-level changes such as adding new
     * Tasks or Tasks changing state.
     *
     * @return the lastModified value.
     */
    @Generated
    public OffsetDateTime getLastModified() {
        return this.lastModified;
    }

    /**
     * Get the creationTime property: The creation time of the Job.
     *
     * @return the creationTime value.
     */
    @Generated
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the state property: The current state of the Job.
     *
     * @return the state value.
     */
    @Generated
    public BatchJobState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the Job entered its current state.
     *
     * @return the stateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the previousState property: The previous state of the Job. This property is not set if the Job is in its
     * initial Active state.
     *
     * @return the previousState value.
     */
    @Generated
    public BatchJobState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: The time at which the Job entered its previous state. This
     * property is not set if the Job is in its initial Active state.
     *
     * @return the previousStateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getPreviousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Get the priority property: The priority of the Job. Priority values can range from -1000 to 1000, with -1000
     * being the lowest priority and 1000 being the highest priority. The default value is 0.
     *
     * @return the priority value.
     */
    @Generated
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority of the Job. Priority values can range from -1000 to 1000, with -1000
     * being the lowest priority and 1000 being the highest priority. The default value is 0.
     *
     * @param priority the priority value to set.
     * @return the BatchJob object itself.
     */
    @Generated
    public BatchJob setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the allowTaskPreemption property: Whether Tasks in this job can be preempted by other high priority jobs. If
     * the value is set to True, other high priority jobs submitted to the system will take precedence and will be able
     * requeue tasks from this job. You can update a job's allowTaskPreemption after it has been created using the
     * update job API.
     *
     * @return the allowTaskPreemption value.
     */
    @Generated
    public Boolean isAllowTaskPreemption() {
        return this.allowTaskPreemption;
    }

    /**
     * Set the allowTaskPreemption property: Whether Tasks in this job can be preempted by other high priority jobs. If
     * the value is set to True, other high priority jobs submitted to the system will take precedence and will be able
     * requeue tasks from this job. You can update a job's allowTaskPreemption after it has been created using the
     * update job API.
     *
     * @param allowTaskPreemption the allowTaskPreemption value to set.
     * @return the BatchJob object itself.
     */
    @Generated
    public BatchJob setAllowTaskPreemption(Boolean allowTaskPreemption) {
        this.allowTaskPreemption = allowTaskPreemption;
        return this;
    }

    /**
     * Get the maxParallelTasks property: The maximum number of tasks that can be executed in parallel for the job. The
     * value of maxParallelTasks must be -1 or greater than 0 if specified. If not specified, the default value is -1,
     * which means there's no limit to the number of tasks that can be run at once. You can update a job's
     * maxParallelTasks after it has been created using the update job API.
     *
     * @return the maxParallelTasks value.
     */
    @Generated
    public Integer getMaxParallelTasks() {
        return this.maxParallelTasks;
    }

    /**
     * Set the maxParallelTasks property: The maximum number of tasks that can be executed in parallel for the job. The
     * value of maxParallelTasks must be -1 or greater than 0 if specified. If not specified, the default value is -1,
     * which means there's no limit to the number of tasks that can be run at once. You can update a job's
     * maxParallelTasks after it has been created using the update job API.
     *
     * @param maxParallelTasks the maxParallelTasks value to set.
     * @return the BatchJob object itself.
     */
    @Generated
    public BatchJob setMaxParallelTasks(Integer maxParallelTasks) {
        this.maxParallelTasks = maxParallelTasks;
        return this;
    }

    /**
     * Get the constraints property: The execution constraints for the Job.
     *
     * @return the constraints value.
     */
    @Generated
    public BatchJobConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * Set the constraints property: The execution constraints for the Job.
     *
     * @param constraints the constraints value to set.
     * @return the BatchJob object itself.
     */
    @Generated
    public BatchJob setConstraints(BatchJobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the jobManagerTask property: Details of a Job Manager Task to be launched when the Job is started.
     *
     * @return the jobManagerTask value.
     */
    @Generated
    public BatchJobManagerTask getJobManagerTask() {
        return this.jobManagerTask;
    }

    /**
     * Get the jobPreparationTask property: The Job Preparation Task. The Job Preparation Task is a special Task run on
     * each Compute Node before any other Task of the Job.
     *
     * @return the jobPreparationTask value.
     */
    @Generated
    public BatchJobPreparationTask getJobPreparationTask() {
        return this.jobPreparationTask;
    }

    /**
     * Get the jobReleaseTask property: The Job Release Task. The Job Release Task is a special Task run at the end of
     * the Job on each Compute Node that has run any other Task of the Job.
     *
     * @return the jobReleaseTask value.
     */
    @Generated
    public BatchJobReleaseTask getJobReleaseTask() {
        return this.jobReleaseTask;
    }

    /**
     * Get the commonEnvironmentSettings property: The list of common environment variable settings. These environment
     * variables are set for all Tasks in the Job (including the Job Manager, Job Preparation and Job Release Tasks).
     * Individual Tasks can override an environment setting specified here by specifying the same setting name with a
     * different value.
     *
     * @return the commonEnvironmentSettings value.
     */
    @Generated
    public List<EnvironmentSetting> getCommonEnvironmentSettings() {
        return this.commonEnvironmentSettings;
    }

    /**
     * Get the poolInfo property: The Pool settings associated with the Job.
     *
     * @return the poolInfo value.
     */
    @Generated
    public BatchPoolInfo getPoolInfo() {
        return this.poolInfo;
    }

    /**
     * Set the poolInfo property: Specifies how a Job should be assigned to a Pool.
     *
     * @param poolInfo the poolInfo value to set.
     * @return the BatchJob object itself.
     */
    public BatchJob setPoolInfo(BatchPoolInfo poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    /**
     * Get the onAllTasksComplete property: The action the Batch service should take when all Tasks in the Job are in
     * the completed state. The default is noaction.
     *
     * @return the onAllTasksComplete value.
     */
    @Generated
    public OnAllBatchTasksComplete getOnAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set the onAllTasksComplete property: The action the Batch service should take when all Tasks in the Job are in
     * the completed state. The default is noaction.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set.
     * @return the BatchJob object itself.
     */
    @Generated
    public BatchJob setOnAllTasksComplete(OnAllBatchTasksComplete onAllTasksComplete) {
        this.onAllTasksComplete = onAllTasksComplete;
        return this;
    }

    /**
     * Get the onTaskFailure property: The action the Batch service should take when any Task in the Job fails. A Task
     * is considered to have failed if has a failureInfo. A failureInfo is set if the Task completes with a non-zero
     * exit code after exhausting its retry count, or if there was an error starting the Task, for example due to a
     * resource file download error. The default is noaction.
     *
     * @return the onTaskFailure value.
     */
    @Generated
    public OnBatchTaskFailure getOnTaskFailure() {
        return this.onTaskFailure;
    }

    /**
     * Get the networkConfiguration property: The network configuration for the Job.
     *
     * @return the networkConfiguration value.
     */
    @Generated
    public BatchJobNetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the Job as metadata. The Batch service
     * does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A list of name-value pairs associated with the Job as metadata. The Batch service
     * does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set.
     * @return the BatchJob object itself.
     */
    @Generated
    public BatchJob setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the executionInfo property: The execution information for the Job.
     *
     * @return the executionInfo value.
     */
    @Generated
    public BatchJobExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    /**
     * Get the stats property: Resource usage statistics for the entire lifetime of the Job. This property is populated
     * only if the CloudJob was retrieved with an expand clause including the 'stats' attribute; otherwise it is null.
     * The statistics may not be immediately available. The Batch service performs periodic roll-up of statistics. The
     * typical delay is about 30 minutes.
     *
     * @return the stats value.
     */
    @Generated
    public BatchJobStatistics getStats() {
        return this.stats;
    }
}
