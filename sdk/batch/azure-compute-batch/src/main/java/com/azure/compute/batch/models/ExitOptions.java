// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies how the Batch service responds to a particular exit condition.
 */
@Fluent
public final class ExitOptions {

    /*
     * An action to take on the Job containing the Task, if the Task completes with the given exit condition and the Job's onTaskFailed property is 'performExitOptionsJobAction'. The default is none for exit code 0 and terminate for all other exit conditions. If the Job's onTaskFailed property is noaction, then specifying this property returns an error and the add Task request fails with an invalid property value error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     */
    @Generated
    @JsonProperty(value = "jobAction")
    private BatchJobAction jobAction;

    /*
     * An action that the Batch service performs on Tasks that depend on this Task. Possible values are 'satisfy' (allowing dependent tasks to progress) and 'block' (dependent tasks continue to wait). Batch does not yet support cancellation of dependent tasks.
     */
    @Generated
    @JsonProperty(value = "dependencyAction")
    private DependencyAction dependencyAction;

    /**
     * Creates an instance of ExitOptions class.
     */
    @Generated
    public ExitOptions() {
    }

    /**
     * Get the jobAction property: An action to take on the Job containing the Task, if the Task completes with the
     * given exit condition and the Job's onTaskFailed property is 'performExitOptionsJobAction'. The default is none
     * for exit code 0 and terminate for all other exit conditions. If the Job's onTaskFailed property is noaction, then
     * specifying this property returns an error and the add Task request fails with an invalid property value error; if
     * you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the jobAction value.
     */
    @Generated
    public BatchJobAction getJobAction() {
        return this.jobAction;
    }

    /**
     * Set the jobAction property: An action to take on the Job containing the Task, if the Task completes with the
     * given exit condition and the Job's onTaskFailed property is 'performExitOptionsJobAction'. The default is none
     * for exit code 0 and terminate for all other exit conditions. If the Job's onTaskFailed property is noaction, then
     * specifying this property returns an error and the add Task request fails with an invalid property value error; if
     * you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param jobAction the jobAction value to set.
     * @return the ExitOptions object itself.
     */
    @Generated
    public ExitOptions setJobAction(BatchJobAction jobAction) {
        this.jobAction = jobAction;
        return this;
    }

    /**
     * Get the dependencyAction property: An action that the Batch service performs on Tasks that depend on this Task.
     * Possible values are 'satisfy' (allowing dependent tasks to progress) and 'block' (dependent tasks continue to
     * wait). Batch does not yet support cancellation of dependent tasks.
     *
     * @return the dependencyAction value.
     */
    @Generated
    public DependencyAction getDependencyAction() {
        return this.dependencyAction;
    }

    /**
     * Set the dependencyAction property: An action that the Batch service performs on Tasks that depend on this Task.
     * Possible values are 'satisfy' (allowing dependent tasks to progress) and 'block' (dependent tasks continue to
     * wait). Batch does not yet support cancellation of dependent tasks.
     *
     * @param dependencyAction the dependencyAction value to set.
     * @return the ExitOptions object itself.
     */
    @Generated
    public ExitOptions setDependencyAction(DependencyAction dependencyAction) {
        this.dependencyAction = dependencyAction;
        return this;
    }
}
