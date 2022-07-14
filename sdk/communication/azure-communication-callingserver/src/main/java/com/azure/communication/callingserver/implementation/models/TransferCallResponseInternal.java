// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TransferCallResponseInternal model. */
@Fluent
public final class TransferCallResponseInternal {
    /*
     * The operation id.
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * The status of the operation
     */
    @JsonProperty(value = "status", required = true)
    private CallingOperationStatusDto status;

    /*
     * The operation context provided by client.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * The result info for the operation.
     */
    @JsonProperty(value = "resultDetails")
    private CallingOperationResultDetailsInternal resultDetails;

    /**
     * Get the operationId property: The operation id.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The operation id.
     *
     * @param operationId the operationId value to set.
     * @return the TransferCallResponseInternal object itself.
     */
    public TransferCallResponseInternal setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public CallingOperationStatusDto getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the TransferCallResponseInternal object itself.
     */
    public TransferCallResponseInternal setStatus(CallingOperationStatusDto status) {
        this.status = status;
        return this;
    }

    /**
     * Get the operationContext property: The operation context provided by client.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context provided by client.
     *
     * @param operationContext the operationContext value to set.
     * @return the TransferCallResponseInternal object itself.
     */
    public TransferCallResponseInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the resultDetails property: The result info for the operation.
     *
     * @return the resultDetails value.
     */
    public CallingOperationResultDetailsInternal getResultDetails() {
        return this.resultDetails;
    }

    /**
     * Set the resultDetails property: The result info for the operation.
     *
     * @param resultDetails the resultDetails value to set.
     * @return the TransferCallResponseInternal object itself.
     */
    public TransferCallResponseInternal setResultDetails(CallingOperationResultDetailsInternal resultDetails) {
        this.resultDetails = resultDetails;
        return this;
    }
}
