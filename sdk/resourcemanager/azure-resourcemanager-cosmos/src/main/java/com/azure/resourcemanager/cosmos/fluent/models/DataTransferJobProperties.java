// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.DataTransferDataSourceSink;
import com.azure.resourcemanager.cosmos.models.DataTransferJobMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The properties of a DataTransfer Job.
 */
@Fluent
public final class DataTransferJobProperties {
    /*
     * Job Name
     */
    @JsonProperty(value = "jobName", access = JsonProperty.Access.WRITE_ONLY)
    private String jobName;

    /*
     * Source DataStore details
     */
    @JsonProperty(value = "source", required = true)
    private DataTransferDataSourceSink source;

    /*
     * Destination DataStore details
     */
    @JsonProperty(value = "destination", required = true)
    private DataTransferDataSourceSink destination;

    /*
     * Job Status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * Processed Count.
     */
    @JsonProperty(value = "processedCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long processedCount;

    /*
     * Total Count.
     */
    @JsonProperty(value = "totalCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalCount;

    /*
     * Last Updated Time (ISO-8601 format).
     */
    @JsonProperty(value = "lastUpdatedUtcTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedUtcTime;

    /*
     * Worker count
     */
    @JsonProperty(value = "workerCount")
    private Integer workerCount;

    /*
     * Error response for Faulted job
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ManagementError error;

    /*
     * Total Duration of Job
     */
    @JsonProperty(value = "duration", access = JsonProperty.Access.WRITE_ONLY)
    private String duration;

    /*
     * Mode of job execution
     */
    @JsonProperty(value = "mode")
    private DataTransferJobMode mode;

    /**
     * Creates an instance of DataTransferJobProperties class.
     */
    public DataTransferJobProperties() {
    }

    /**
     * Get the jobName property: Job Name.
     * 
     * @return the jobName value.
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * Get the source property: Source DataStore details.
     * 
     * @return the source value.
     */
    public DataTransferDataSourceSink source() {
        return this.source;
    }

    /**
     * Set the source property: Source DataStore details.
     * 
     * @param source the source value to set.
     * @return the DataTransferJobProperties object itself.
     */
    public DataTransferJobProperties withSource(DataTransferDataSourceSink source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination property: Destination DataStore details.
     * 
     * @return the destination value.
     */
    public DataTransferDataSourceSink destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Destination DataStore details.
     * 
     * @param destination the destination value to set.
     * @return the DataTransferJobProperties object itself.
     */
    public DataTransferJobProperties withDestination(DataTransferDataSourceSink destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the status property: Job Status.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the processedCount property: Processed Count.
     * 
     * @return the processedCount value.
     */
    public Long processedCount() {
        return this.processedCount;
    }

    /**
     * Get the totalCount property: Total Count.
     * 
     * @return the totalCount value.
     */
    public Long totalCount() {
        return this.totalCount;
    }

    /**
     * Get the lastUpdatedUtcTime property: Last Updated Time (ISO-8601 format).
     * 
     * @return the lastUpdatedUtcTime value.
     */
    public OffsetDateTime lastUpdatedUtcTime() {
        return this.lastUpdatedUtcTime;
    }

    /**
     * Get the workerCount property: Worker count.
     * 
     * @return the workerCount value.
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    /**
     * Set the workerCount property: Worker count.
     * 
     * @param workerCount the workerCount value to set.
     * @return the DataTransferJobProperties object itself.
     */
    public DataTransferJobProperties withWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
        return this;
    }

    /**
     * Get the error property: Error response for Faulted job.
     * 
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Get the duration property: Total Duration of Job.
     * 
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Get the mode property: Mode of job execution.
     * 
     * @return the mode value.
     */
    public DataTransferJobMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Mode of job execution.
     * 
     * @param mode the mode value to set.
     * @return the DataTransferJobProperties object itself.
     */
    public DataTransferJobProperties withMode(DataTransferJobMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property source in model DataTransferJobProperties"));
        } else {
            source().validate();
        }
        if (destination() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property destination in model DataTransferJobProperties"));
        } else {
            destination().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataTransferJobProperties.class);
}
