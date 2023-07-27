// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.communication.phonenumbers.CodeCoverageAnnotation.Generated;
import com.azure.communication.phonenumbers.models.PhoneNumberOperationStatus;
import com.azure.communication.phonenumbers.models.PhoneNumberOperationType;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PhoneNumberRawOperation model. */
@Fluent
@Generated
public final class PhoneNumberRawOperation {
    /*
     * The type of operation, e.g. Search
     */
    @JsonProperty(value = "operationType", required = true)
    private PhoneNumberOperationType operationType;

    /*
     * Status of operation.
     */
    @JsonProperty(value = "status", required = true)
    private PhoneNumberOperationStatus status;

    /*
     * URL for retrieving the result of the operation, if any.
     */
    @JsonProperty(value = "resourceLocation")
    private String resourceLocation;

    /*
     * The date that the operation was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime createdDateTime;

    /*
     * The Communication Services error.
     */
    @JsonProperty(value = "error")
    private CommunicationError error;

    /*
     * Id of operation.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The most recent date that the operation was changed.
     */
    @JsonProperty(value = "lastActionDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastActionDateTime;

    /**
     * Get the operationType property: The type of operation, e.g. Search.
     *
     * @return the operationType value.
     */
    public PhoneNumberOperationType getOperationType() {
        return this.operationType;
    }

    /**
     * Set the operationType property: The type of operation, e.g. Search.
     *
     * @param operationType the operationType value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setOperationType(PhoneNumberOperationType operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Get the status property: Status of operation.
     *
     * @return the status value.
     */
    public PhoneNumberOperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of operation.
     *
     * @param status the status value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setStatus(PhoneNumberOperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the resourceLocation property: URL for retrieving the result of the operation, if any.
     *
     * @return the resourceLocation value.
     */
    public String getResourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: URL for retrieving the result of the operation, if any.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get the createdDateTime property: The date that the operation was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The date that the operation was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the error property: The Communication Services error.
     *
     * @return the error value.
     */
    public CommunicationError getError() {
        return this.error;
    }

    /**
     * Set the error property: The Communication Services error.
     *
     * @param error the error value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setError(CommunicationError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the id property: Id of operation.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Id of operation.
     *
     * @param id the id value to set.
     * @return the PhoneNumberRawOperation object itself.
     */
    public PhoneNumberRawOperation setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the lastActionDateTime property: The most recent date that the operation was changed.
     *
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
}
