// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.JobStepAction;
import com.azure.resourcemanager.sql.models.JobStepExecutionOptions;
import com.azure.resourcemanager.sql.models.JobStepOutput;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A job step.
 */
@Fluent
public final class JobStepInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private JobStepProperties innerProperties;

    /**
     * Creates an instance of JobStepInner class.
     */
    public JobStepInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private JobStepProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the stepId property: The job step's index within the job. If not specified when creating the job step, it
     * will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     * @return the stepId value.
     */
    public Integer stepId() {
        return this.innerProperties() == null ? null : this.innerProperties().stepId();
    }

    /**
     * Set the stepId property: The job step's index within the job. If not specified when creating the job step, it
     * will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     * @param stepId the stepId value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withStepId(Integer stepId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobStepProperties();
        }
        this.innerProperties().withStepId(stepId);
        return this;
    }

    /**
     * Get the targetGroup property: The resource ID of the target group that the job step will be executed on.
     * 
     * @return the targetGroup value.
     */
    public String targetGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().targetGroup();
    }

    /**
     * Set the targetGroup property: The resource ID of the target group that the job step will be executed on.
     * 
     * @param targetGroup the targetGroup value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withTargetGroup(String targetGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobStepProperties();
        }
        this.innerProperties().withTargetGroup(targetGroup);
        return this;
    }

    /**
     * Get the credential property: The resource ID of the job credential that will be used to connect to the targets.
     * 
     * @return the credential value.
     */
    public String credential() {
        return this.innerProperties() == null ? null : this.innerProperties().credential();
    }

    /**
     * Set the credential property: The resource ID of the job credential that will be used to connect to the targets.
     * 
     * @param credential the credential value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withCredential(String credential) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobStepProperties();
        }
        this.innerProperties().withCredential(credential);
        return this;
    }

    /**
     * Get the action property: The action payload of the job step.
     * 
     * @return the action value.
     */
    public JobStepAction action() {
        return this.innerProperties() == null ? null : this.innerProperties().action();
    }

    /**
     * Set the action property: The action payload of the job step.
     * 
     * @param action the action value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withAction(JobStepAction action) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobStepProperties();
        }
        this.innerProperties().withAction(action);
        return this;
    }

    /**
     * Get the output property: Output destination properties of the job step.
     * 
     * @return the output value.
     */
    public JobStepOutput output() {
        return this.innerProperties() == null ? null : this.innerProperties().output();
    }

    /**
     * Set the output property: Output destination properties of the job step.
     * 
     * @param output the output value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withOutput(JobStepOutput output) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobStepProperties();
        }
        this.innerProperties().withOutput(output);
        return this;
    }

    /**
     * Get the executionOptions property: Execution options for the job step.
     * 
     * @return the executionOptions value.
     */
    public JobStepExecutionOptions executionOptions() {
        return this.innerProperties() == null ? null : this.innerProperties().executionOptions();
    }

    /**
     * Set the executionOptions property: Execution options for the job step.
     * 
     * @param executionOptions the executionOptions value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withExecutionOptions(JobStepExecutionOptions executionOptions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JobStepProperties();
        }
        this.innerProperties().withExecutionOptions(executionOptions);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
