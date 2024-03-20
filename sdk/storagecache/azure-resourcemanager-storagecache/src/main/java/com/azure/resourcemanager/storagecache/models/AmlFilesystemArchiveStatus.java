// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The status of the archive.
 */
@Immutable
public final class AmlFilesystemArchiveStatus {
    /*
     * The state of the archive operation
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private ArchiveStatusType state;

    /*
     * The time of the last completed archive operation
     */
    @JsonProperty(value = "lastCompletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastCompletionTime;

    /*
     * The time the latest archive operation started
     */
    @JsonProperty(value = "lastStartedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastStartedTime;

    /*
     * The completion percentage of the archive operation
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * Server-defined error code for the archive operation
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private String errorCode;

    /*
     * Server-defined error message for the archive operation
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Creates an instance of AmlFilesystemArchiveStatus class.
     */
    public AmlFilesystemArchiveStatus() {
    }

    /**
     * Get the state property: The state of the archive operation.
     * 
     * @return the state value.
     */
    public ArchiveStatusType state() {
        return this.state;
    }

    /**
     * Get the lastCompletionTime property: The time of the last completed archive operation.
     * 
     * @return the lastCompletionTime value.
     */
    public OffsetDateTime lastCompletionTime() {
        return this.lastCompletionTime;
    }

    /**
     * Get the lastStartedTime property: The time the latest archive operation started.
     * 
     * @return the lastStartedTime value.
     */
    public OffsetDateTime lastStartedTime() {
        return this.lastStartedTime;
    }

    /**
     * Get the percentComplete property: The completion percentage of the archive operation.
     * 
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the errorCode property: Server-defined error code for the archive operation.
     * 
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorMessage property: Server-defined error message for the archive operation.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
