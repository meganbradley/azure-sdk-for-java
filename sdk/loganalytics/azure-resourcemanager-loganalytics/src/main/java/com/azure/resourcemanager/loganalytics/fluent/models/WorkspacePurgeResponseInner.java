// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response containing operationId for a specific purge action. */
@Fluent
public final class WorkspacePurgeResponseInner {
    /*
     * Id to use when querying for status for a particular purge operation.
     */
    @JsonProperty(value = "operationId", required = true)
    private String operationId;

    /**
     * Get the operationId property: Id to use when querying for status for a particular purge operation.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: Id to use when querying for status for a particular purge operation.
     *
     * @param operationId the operationId value to set.
     * @return the WorkspacePurgeResponseInner object itself.
     */
    public WorkspacePurgeResponseInner withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operationId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operationId in model WorkspacePurgeResponseInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkspacePurgeResponseInner.class);
}
