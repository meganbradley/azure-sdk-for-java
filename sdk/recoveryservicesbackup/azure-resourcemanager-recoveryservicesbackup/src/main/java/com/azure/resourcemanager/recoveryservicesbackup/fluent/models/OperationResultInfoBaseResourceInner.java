// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicesbackup.models.HttpStatusCode;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationResultInfoBase;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationWorkerResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Base class for operation result info.
 */
@Fluent
public final class OperationResultInfoBaseResourceInner extends OperationWorkerResponse {
    /*
     * OperationResultInfoBaseResource operation
     */
    @JsonProperty(value = "operation")
    private OperationResultInfoBase operation;

    /**
     * Creates an instance of OperationResultInfoBaseResourceInner class.
     */
    public OperationResultInfoBaseResourceInner() {
    }

    /**
     * Get the operation property: OperationResultInfoBaseResource operation.
     * 
     * @return the operation value.
     */
    public OperationResultInfoBase operation() {
        return this.operation;
    }

    /**
     * Set the operation property: OperationResultInfoBaseResource operation.
     * 
     * @param operation the operation value to set.
     * @return the OperationResultInfoBaseResourceInner object itself.
     */
    public OperationResultInfoBaseResourceInner withOperation(OperationResultInfoBase operation) {
        this.operation = operation;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationResultInfoBaseResourceInner withStatusCode(HttpStatusCode statusCode) {
        super.withStatusCode(statusCode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationResultInfoBaseResourceInner withHeaders(Map<String, List<String>> headers) {
        super.withHeaders(headers);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (operation() != null) {
            operation().validate();
        }
    }
}
