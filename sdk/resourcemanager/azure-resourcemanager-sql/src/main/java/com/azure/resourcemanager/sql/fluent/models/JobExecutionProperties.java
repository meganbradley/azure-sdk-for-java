// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.JobExecutionLifecycle;
import com.azure.resourcemanager.sql.models.JobExecutionTarget;
import com.azure.resourcemanager.sql.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Properties for an Azure SQL Database Elastic job execution.
 */
@Fluent
public final class JobExecutionProperties {
    /*
     * The job version number.
     */
    @JsonProperty(value = "jobVersion", access = JsonProperty.Access.WRITE_ONLY)
    private Integer jobVersion;

    /*
     * The job step name.
     */
    @JsonProperty(value = "stepName", access = JsonProperty.Access.WRITE_ONLY)
    private String stepName;

    /*
     * The job step id.
     */
    @JsonProperty(value = "stepId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer stepId;

    /*
     * The unique identifier of the job execution.
     */
    @JsonProperty(value = "jobExecutionId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID jobExecutionId;

    /*
     * The detailed state of the job execution.
     */
    @JsonProperty(value = "lifecycle", access = JsonProperty.Access.WRITE_ONLY)
    private JobExecutionLifecycle lifecycle;

    /*
     * The ARM provisioning state of the job execution.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The time that the job execution was created.
     */
    @JsonProperty(value = "createTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createTime;

    /*
     * The time that the job execution started.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The time that the job execution completed.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * Number of times the job execution has been attempted.
     */
    @JsonProperty(value = "currentAttempts")
    private Integer currentAttempts;

    /*
     * Start time of the current attempt.
     */
    @JsonProperty(value = "currentAttemptStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime currentAttemptStartTime;

    /*
     * The last status or error message.
     */
    @JsonProperty(value = "lastMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String lastMessage;

    /*
     * The target that this execution is executed on.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private JobExecutionTarget target;

    /**
     * Creates an instance of JobExecutionProperties class.
     */
    public JobExecutionProperties() {
    }

    /**
     * Get the jobVersion property: The job version number.
     * 
     * @return the jobVersion value.
     */
    public Integer jobVersion() {
        return this.jobVersion;
    }

    /**
     * Get the stepName property: The job step name.
     * 
     * @return the stepName value.
     */
    public String stepName() {
        return this.stepName;
    }

    /**
     * Get the stepId property: The job step id.
     * 
     * @return the stepId value.
     */
    public Integer stepId() {
        return this.stepId;
    }

    /**
     * Get the jobExecutionId property: The unique identifier of the job execution.
     * 
     * @return the jobExecutionId value.
     */
    public UUID jobExecutionId() {
        return this.jobExecutionId;
    }

    /**
     * Get the lifecycle property: The detailed state of the job execution.
     * 
     * @return the lifecycle value.
     */
    public JobExecutionLifecycle lifecycle() {
        return this.lifecycle;
    }

    /**
     * Get the provisioningState property: The ARM provisioning state of the job execution.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createTime property: The time that the job execution was created.
     * 
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.createTime;
    }

    /**
     * Get the startTime property: The time that the job execution started.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The time that the job execution completed.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the currentAttempts property: Number of times the job execution has been attempted.
     * 
     * @return the currentAttempts value.
     */
    public Integer currentAttempts() {
        return this.currentAttempts;
    }

    /**
     * Set the currentAttempts property: Number of times the job execution has been attempted.
     * 
     * @param currentAttempts the currentAttempts value to set.
     * @return the JobExecutionProperties object itself.
     */
    public JobExecutionProperties withCurrentAttempts(Integer currentAttempts) {
        this.currentAttempts = currentAttempts;
        return this;
    }

    /**
     * Get the currentAttemptStartTime property: Start time of the current attempt.
     * 
     * @return the currentAttemptStartTime value.
     */
    public OffsetDateTime currentAttemptStartTime() {
        return this.currentAttemptStartTime;
    }

    /**
     * Get the lastMessage property: The last status or error message.
     * 
     * @return the lastMessage value.
     */
    public String lastMessage() {
        return this.lastMessage;
    }

    /**
     * Get the target property: The target that this execution is executed on.
     * 
     * @return the target value.
     */
    public JobExecutionTarget target() {
        return this.target;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (target() != null) {
            target().validate();
        }
    }
}
