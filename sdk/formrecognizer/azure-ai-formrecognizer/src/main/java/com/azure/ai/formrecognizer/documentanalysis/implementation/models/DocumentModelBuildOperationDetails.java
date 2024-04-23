// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Get Operation response object. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("documentModelBuild")
@Immutable
public final class DocumentModelBuildOperationDetails extends OperationDetails {
    /*
     * Operation result upon success.
     */
    @JsonProperty(value = "result")
    private DocumentModelDetails result;

    /**
     * Creates an instance of DocumentModelBuildOperationDetails class.
     *
     * @param operationId the operationId value to set.
     * @param status the status value to set.
     * @param createdDateTime the createdDateTime value to set.
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @param resourceLocation the resourceLocation value to set.
     */
    @JsonCreator
    private DocumentModelBuildOperationDetails(
            @JsonProperty(value = "operationId", required = true) String operationId,
            @JsonProperty(value = "status", required = true) OperationStatus status,
            @JsonProperty(value = "createdDateTime", required = true) OffsetDateTime createdDateTime,
            @JsonProperty(value = "lastUpdatedDateTime", required = true) OffsetDateTime lastUpdatedDateTime,
            @JsonProperty(value = "resourceLocation", required = true) String resourceLocation) {
        super(operationId, status, createdDateTime, lastUpdatedDateTime, resourceLocation);
    }

    /**
     * Get the result property: Operation result upon success.
     *
     * @return the result value.
     */
    public DocumentModelDetails getResult() {
        return this.result;
    }
}
