// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Full backup operation. */
@Fluent
public final class FullBackupOperation {
    /*
     * Status of the backup operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The status details of backup operation.
     */
    @JsonProperty(value = "statusDetails")
    private String statusDetails;

    /*
     * Error encountered, if any, during the full backup operation.
     */
    @JsonProperty(value = "error")
    private Error error;

    /*
     * The start time of the backup operation in UTC
     */
    @JsonProperty(value = "startTime")
    private Long startTime;

    /*
     * The end time of the backup operation in UTC
     */
    @JsonProperty(value = "endTime")
    private Long endTime;

    /*
     * Identifier for the full backup operation.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /*
     * The Azure blob storage container Uri which contains the full backup
     */
    @JsonProperty(value = "azureStorageBlobContainerUri")
    private String azureStorageBlobContainerUri;

    /** Creates an instance of FullBackupOperation class. */
    public FullBackupOperation() {}

    /**
     * Get the status property: Status of the backup operation.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the backup operation.
     *
     * @param status the status value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails property: The status details of backup operation.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails property: The status details of backup operation.
     *
     * @param statusDetails the statusDetails value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Get the error property: Error encountered, if any, during the full backup operation.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: Error encountered, if any, during the full backup operation.
     *
     * @param error the error value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the startTime property: The start time of the backup operation in UTC.
     *
     * @return the startTime value.
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the backup operation in UTC.
     *
     * @param startTime the startTime value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the backup operation in UTC.
     *
     * @return the endTime value.
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the backup operation in UTC.
     *
     * @param endTime the endTime value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the jobId property: Identifier for the full backup operation.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: Identifier for the full backup operation.
     *
     * @param jobId the jobId value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the azureStorageBlobContainerUri property: The Azure blob storage container Uri which contains the full
     * backup.
     *
     * @return the azureStorageBlobContainerUri value.
     */
    public String getAzureStorageBlobContainerUri() {
        return this.azureStorageBlobContainerUri;
    }

    /**
     * Set the azureStorageBlobContainerUri property: The Azure blob storage container Uri which contains the full
     * backup.
     *
     * @param azureStorageBlobContainerUri the azureStorageBlobContainerUri value to set.
     * @return the FullBackupOperation object itself.
     */
    public FullBackupOperation setAzureStorageBlobContainerUri(String azureStorageBlobContainerUri) {
        this.azureStorageBlobContainerUri = azureStorageBlobContainerUri;
        return this;
    }
}
