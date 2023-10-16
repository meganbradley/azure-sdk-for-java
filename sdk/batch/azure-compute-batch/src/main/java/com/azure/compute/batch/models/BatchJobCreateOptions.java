// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Options for creating an Azure Batch Job. */
@Fluent
public final class BatchJobCreateOptions {

    /*
     * A string that uniquely identifies the Job within the Account. The ID can contain any combination of alphanumeric
     * characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is
     * case-preserving and case-insensitive (that is, you may not have two IDs within an Account that differ only by
     * case).
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The display name for the Job. The display name need not be unique and can contain any Unicode characters up to a
     * maximum length of 1024.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Whether Tasks in the Job can define dependencies on each other. The default is false.
     */
    @Generated
    @JsonProperty(value = "usesTaskDependencies")
    private Boolean usesTaskDependencies;

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
    private JobConstraints constraints;

    /*
     * Details of a Job Manager Task to be launched when the Job is started. If the Job does not specify a Job Manager
     * Task, the user must explicitly add Tasks to the Job. If the Job does specify a Job Manager Task, the Batch
     * service creates the Job Manager Task when the Job is created, and will try to schedule the Job Manager Task
     * before scheduling other Tasks in the Job. The Job Manager Task's typical purpose is to control and/or monitor
     * Job execution, for example by deciding what additional Tasks to run, determining when the work is complete, etc.
     * (However, a Job Manager Task is not restricted to these activities - it is a fully-fledged Task in the system
     * and perform whatever actions are required for the Job.) For example, a Job Manager Task might download a file
     * specified as a parameter, analyze the contents of that file and submit additional Tasks based on those contents.
     */
    @Generated
    @JsonProperty(value = "jobManagerTask")
    private JobManagerTask jobManagerTask;

    /*
     * The Job Preparation Task. If a Job has a Job Preparation Task, the Batch service will run the Job Preparation
     * Task on a Node before starting any Tasks of that Job on that Compute Node.
     */
    @Generated
    @JsonProperty(value = "jobPreparationTask")
    private JobPreparationTask jobPreparationTask;

    /*
     * The Job Release Task. A Job Release Task cannot be specified without also specifying a Job Preparation Task for
     * the Job. The Batch service runs the Job Release Task on the Nodes that have run the Job Preparation Task. The
     * primary purpose of the Job Release Task is to undo changes to Compute Nodes made by the Job Preparation Task.
     * Example activities include deleting local files, or shutting down services that were started as part of Job
     * preparation.
     */
    @Generated
    @JsonProperty(value = "jobReleaseTask")
    private JobReleaseTask jobReleaseTask;

    /*
     * The list of common environment variable settings. These environment variables are set for all Tasks in the Job
     * (including the Job Manager, Job Preparation and Job Release Tasks). Individual Tasks can override an environment
     * setting specified here by specifying the same setting name with a different value.
     */
    @Generated
    @JsonProperty(value = "commonEnvironmentSettings")
    private List<EnvironmentSetting> commonEnvironmentSettings;

    /*
     * The Pool on which the Batch service runs the Job's Tasks.
     */
    @Generated
    @JsonProperty(value = "poolInfo")
    private PoolInformation poolInfo;

    /*
     * The action the Batch service should take when all Tasks in the Job are in the completed state. Note that if a
     * Job contains no Tasks, then all Tasks are considered complete. This option is therefore most commonly used with
     * a Job Manager task; if you want to use automatic Job termination without a Job Manager, you should initially set
     * onAllTasksComplete to noaction and update the Job properties to set onAllTasksComplete to terminatejob once you
     * have finished adding Tasks. The default is noaction.
     */
    @Generated
    @JsonProperty(value = "onAllTasksComplete")
    private OnAllTasksComplete onAllTasksComplete;

    /*
     * The action the Batch service should take when any Task in the Job fails. A Task is considered to have failed if
     * has a failureInfo. A failureInfo is set if the Task completes with a non-zero exit code after exhausting its
     * retry count, or if there was an error starting the Task, for example due to a resource file download error. The
     * default is noaction.
     */
    @Generated
    @JsonProperty(value = "onTaskFailure")
    private OnTaskFailure onTaskFailure;

    /*
     * The network configuration for the Job.
     */
    @Generated
    @JsonProperty(value = "networkConfiguration")
    private JobNetworkConfiguration networkConfiguration;

    /*
     * A list of name-value pairs associated with the Job as metadata. The Batch service does not assign any meaning to
     * metadata; it is solely for the use of user code.
     */
    @Generated
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Creates an instance of BatchJobCreateOptions class.
     *
     * @param id the id value to set.
     * @param poolInfo the poolInfo value to set.
     */
    @Generated
    @JsonCreator
    public BatchJobCreateOptions(
            @JsonProperty(value = "id") String id, @JsonProperty(value = "poolInfo") PoolInformation poolInfo) {
        this.id = id;
        this.poolInfo = poolInfo;
    }

    /**
     * Get the id property: A string that uniquely identifies the Job within the Account. The ID can contain any
     * combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64
     * characters. The ID is case-preserving and case-insensitive (that is, you may not have two IDs within an Account
     * that differ only by case).
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name for the Job. The display name need not be unique and can contain
     * any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the Job. The display name need not be unique and can contain
     * any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
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
     * Set the usesTaskDependencies property: Whether Tasks in the Job can define dependencies on each other. The
     * default is false.
     *
     * @param usesTaskDependencies the usesTaskDependencies value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setUsesTaskDependencies(Boolean usesTaskDependencies) {
        this.usesTaskDependencies = usesTaskDependencies;
        return this;
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
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setPriority(Integer priority) {
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
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setAllowTaskPreemption(Boolean allowTaskPreemption) {
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
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setMaxParallelTasks(Integer maxParallelTasks) {
        this.maxParallelTasks = maxParallelTasks;
        return this;
    }

    /**
     * Get the constraints property: The execution constraints for the Job.
     *
     * @return the constraints value.
     */
    @Generated
    public JobConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * Set the constraints property: The execution constraints for the Job.
     *
     * @param constraints the constraints value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setConstraints(JobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the jobManagerTask property: Details of a Job Manager Task to be launched when the Job is started. If the Job
     * does not specify a Job Manager Task, the user must explicitly add Tasks to the Job. If the Job does specify a Job
     * Manager Task, the Batch service creates the Job Manager Task when the Job is created, and will try to schedule
     * the Job Manager Task before scheduling other Tasks in the Job. The Job Manager Task's typical purpose is to
     * control and/or monitor Job execution, for example by deciding what additional Tasks to run, determining when the
     * work is complete, etc. (However, a Job Manager Task is not restricted to these activities - it is a fully-fledged
     * Task in the system and perform whatever actions are required for the Job.) For example, a Job Manager Task might
     * download a file specified as a parameter, analyze the contents of that file and submit additional Tasks based on
     * those contents.
     *
     * @return the jobManagerTask value.
     */
    @Generated
    public JobManagerTask getJobManagerTask() {
        return this.jobManagerTask;
    }

    /**
     * Set the jobManagerTask property: Details of a Job Manager Task to be launched when the Job is started. If the Job
     * does not specify a Job Manager Task, the user must explicitly add Tasks to the Job. If the Job does specify a Job
     * Manager Task, the Batch service creates the Job Manager Task when the Job is created, and will try to schedule
     * the Job Manager Task before scheduling other Tasks in the Job. The Job Manager Task's typical purpose is to
     * control and/or monitor Job execution, for example by deciding what additional Tasks to run, determining when the
     * work is complete, etc. (However, a Job Manager Task is not restricted to these activities - it is a fully-fledged
     * Task in the system and perform whatever actions are required for the Job.) For example, a Job Manager Task might
     * download a file specified as a parameter, analyze the contents of that file and submit additional Tasks based on
     * those contents.
     *
     * @param jobManagerTask the jobManagerTask value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setJobManagerTask(JobManagerTask jobManagerTask) {
        this.jobManagerTask = jobManagerTask;
        return this;
    }

    /**
     * Get the jobPreparationTask property: The Job Preparation Task. If a Job has a Job Preparation Task, the Batch
     * service will run the Job Preparation Task on a Node before starting any Tasks of that Job on that Compute Node.
     *
     * @return the jobPreparationTask value.
     */
    @Generated
    public JobPreparationTask getJobPreparationTask() {
        return this.jobPreparationTask;
    }

    /**
     * Set the jobPreparationTask property: The Job Preparation Task. If a Job has a Job Preparation Task, the Batch
     * service will run the Job Preparation Task on a Node before starting any Tasks of that Job on that Compute Node.
     *
     * @param jobPreparationTask the jobPreparationTask value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setJobPreparationTask(JobPreparationTask jobPreparationTask) {
        this.jobPreparationTask = jobPreparationTask;
        return this;
    }

    /**
     * Get the jobReleaseTask property: The Job Release Task. A Job Release Task cannot be specified without also
     * specifying a Job Preparation Task for the Job. The Batch service runs the Job Release Task on the Nodes that have
     * run the Job Preparation Task. The primary purpose of the Job Release Task is to undo changes to Compute Nodes
     * made by the Job Preparation Task. Example activities include deleting local files, or shutting down services that
     * were started as part of Job preparation.
     *
     * @return the jobReleaseTask value.
     */
    @Generated
    public JobReleaseTask getJobReleaseTask() {
        return this.jobReleaseTask;
    }

    /**
     * Set the jobReleaseTask property: The Job Release Task. A Job Release Task cannot be specified without also
     * specifying a Job Preparation Task for the Job. The Batch service runs the Job Release Task on the Nodes that have
     * run the Job Preparation Task. The primary purpose of the Job Release Task is to undo changes to Compute Nodes
     * made by the Job Preparation Task. Example activities include deleting local files, or shutting down services that
     * were started as part of Job preparation.
     *
     * @param jobReleaseTask the jobReleaseTask value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setJobReleaseTask(JobReleaseTask jobReleaseTask) {
        this.jobReleaseTask = jobReleaseTask;
        return this;
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
     * Set the commonEnvironmentSettings property: The list of common environment variable settings. These environment
     * variables are set for all Tasks in the Job (including the Job Manager, Job Preparation and Job Release Tasks).
     * Individual Tasks can override an environment setting specified here by specifying the same setting name with a
     * different value.
     *
     * @param commonEnvironmentSettings the commonEnvironmentSettings value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setCommonEnvironmentSettings(List<EnvironmentSetting> commonEnvironmentSettings) {
        this.commonEnvironmentSettings = commonEnvironmentSettings;
        return this;
    }

    /**
     * Get the poolInfo property: The Pool on which the Batch service runs the Job's Tasks.
     *
     * @return the poolInfo value.
     */
    @Generated
    public PoolInformation getPoolInfo() {
        return this.poolInfo;
    }

    /**
     * Get the onAllTasksComplete property: The action the Batch service should take when all Tasks in the Job are in
     * the completed state. Note that if a Job contains no Tasks, then all Tasks are considered complete. This option is
     * therefore most commonly used with a Job Manager task; if you want to use automatic Job termination without a Job
     * Manager, you should initially set onAllTasksComplete to noaction and update the Job properties to set
     * onAllTasksComplete to terminatejob once you have finished adding Tasks. The default is noaction.
     *
     * @return the onAllTasksComplete value.
     */
    @Generated
    public OnAllTasksComplete getOnAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set the onAllTasksComplete property: The action the Batch service should take when all Tasks in the Job are in
     * the completed state. Note that if a Job contains no Tasks, then all Tasks are considered complete. This option is
     * therefore most commonly used with a Job Manager task; if you want to use automatic Job termination without a Job
     * Manager, you should initially set onAllTasksComplete to noaction and update the Job properties to set
     * onAllTasksComplete to terminatejob once you have finished adding Tasks. The default is noaction.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setOnAllTasksComplete(OnAllTasksComplete onAllTasksComplete) {
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
    public OnTaskFailure getOnTaskFailure() {
        return this.onTaskFailure;
    }

    /**
     * Set the onTaskFailure property: The action the Batch service should take when any Task in the Job fails. A Task
     * is considered to have failed if has a failureInfo. A failureInfo is set if the Task completes with a non-zero
     * exit code after exhausting its retry count, or if there was an error starting the Task, for example due to a
     * resource file download error. The default is noaction.
     *
     * @param onTaskFailure the onTaskFailure value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setOnTaskFailure(OnTaskFailure onTaskFailure) {
        this.onTaskFailure = onTaskFailure;
        return this;
    }

    /**
     * Get the networkConfiguration property: The network configuration for the Job.
     *
     * @return the networkConfiguration value.
     */
    @Generated
    public JobNetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration property: The network configuration for the Job.
     *
     * @param networkConfiguration the networkConfiguration value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setNetworkConfiguration(JobNetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the Job as metadata. The Batch service does
     * not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A list of name-value pairs associated with the Job as metadata. The Batch service does
     * not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set.
     * @return the BatchJobCreateOptions object itself.
     */
    @Generated
    public BatchJobCreateOptions setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }
}
