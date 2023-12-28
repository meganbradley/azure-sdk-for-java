// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The current status of an async operation. */
@Fluent
public class OperationStatusResult {
    /*
     * Fully qualified ID for the async operation.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name of the async operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /*
     * Percent of the operation that is complete.
     */
    @JsonProperty(value = "percentComplete")
    private Float percentComplete;

    /*
     * The start time of the operation.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time of the operation.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The operations list.
     */
    @JsonProperty(value = "operations")
    private List<OperationStatusResult> operations;

    /*
     * If present, details of the operation error.
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /** Creates an instance of OperationStatusResult class. */
    public OperationStatusResult() {
    }

    /**
     * Get the id property: Fully qualified ID for the async operation.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified ID for the async operation.
     *
     * @param id the id value to set.
     * @return the OperationStatusResult object itself.
     */
    public OperationStatusResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the async operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the async operation.
     *
     * @param name the name value to set.
     * @return the OperationStatusResult object itself.
     */
    public OperationStatusResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     *
     * @param status the status value to set.
     * @return the OperationStatusResult object itself.
     */
    public OperationStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the percentComplete property: Percent of the operation that is complete.
     *
     * @return the percentComplete value.
     */
    public Float percentComplete() {
        return this.percentComplete;
    }

    /**
     * Set the percentComplete property: Percent of the operation that is complete.
     *
     * @param percentComplete the percentComplete value to set.
     * @return the OperationStatusResult object itself.
     */
    public OperationStatusResult withPercentComplete(Float percentComplete) {
        this.percentComplete = percentComplete;
        return this;
    }

    /**
     * Get the startTime property: The start time of the operation.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the operation.
     *
     * @param startTime the startTime value to set.
     * @return the OperationStatusResult object itself.
     */
    public OperationStatusResult withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the operation.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the operation.
     *
     * @param endTime the endTime value to set.
     * @return the OperationStatusResult object itself.
     */
    public OperationStatusResult withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the operations property: The operations list.
     *
     * @return the operations value.
     */
    public List<OperationStatusResult> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: The operations list.
     *
     * @param operations the operations value to set.
     * @return the OperationStatusResult object itself.
     */
    public OperationStatusResult withOperations(List<OperationStatusResult> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Get the error property: If present, details of the operation error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: If present, details of the operation error.
     *
     * @param error the error value to set.
     * @return the OperationStatusResult object itself.
     */
    public OperationStatusResult withError(ManagementError error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property status in model OperationStatusResult"));
        }
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OperationStatusResult.class);
}
