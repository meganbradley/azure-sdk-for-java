// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LogicalNetworkStatusProvisioningStatus model. */
@Fluent
public final class LogicalNetworkStatusProvisioningStatus {
    /*
     * The ID of the operation performed on the logical network
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * The status of the operation performed on the logical network [Succeeded, Failed, InProgress]
     */
    @JsonProperty(value = "status")
    private Status status;

    /** Creates an instance of LogicalNetworkStatusProvisioningStatus class. */
    public LogicalNetworkStatusProvisioningStatus() {
    }

    /**
     * Get the operationId property: The ID of the operation performed on the logical network.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The ID of the operation performed on the logical network.
     *
     * @param operationId the operationId value to set.
     * @return the LogicalNetworkStatusProvisioningStatus object itself.
     */
    public LogicalNetworkStatusProvisioningStatus withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the status property: The status of the operation performed on the logical network [Succeeded, Failed,
     * InProgress].
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation performed on the logical network [Succeeded, Failed,
     * InProgress].
     *
     * @param status the status value to set.
     * @return the LogicalNetworkStatusProvisioningStatus object itself.
     */
    public LogicalNetworkStatusProvisioningStatus withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
