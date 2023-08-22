// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents the result of an individual indexer execution. */
@Immutable
public final class IndexerExecutionResult {
    /*
     * The outcome of this indexer execution.
     */
    @JsonProperty(value = "status", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private IndexerExecutionStatus status;

    /*
     * The error message indicating the top-level error, if any.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /*
     * The start time of this indexer execution.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The end time of this indexer execution, if the execution has already completed.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * The item-level indexing errors.
     */
    @JsonProperty(value = "errors", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchIndexerError> errors;

    /*
     * The item-level indexing warnings.
     */
    @JsonProperty(value = "warnings", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchIndexerWarning> warnings;

    /*
     * The number of items that were processed during this indexer execution. This includes both successfully processed
     * items and items where indexing was attempted but failed.
     */
    @JsonProperty(value = "itemsProcessed", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int itemCount;

    /*
     * The number of items that failed to be indexed during this indexer execution.
     */
    @JsonProperty(value = "itemsFailed", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int failedItemCount;

    /*
     * Change tracking state with which an indexer execution started.
     */
    @JsonProperty(value = "initialTrackingState", access = JsonProperty.Access.WRITE_ONLY)
    private String initialTrackingState;

    /*
     * Change tracking state with which an indexer execution finished.
     */
    @JsonProperty(value = "finalTrackingState", access = JsonProperty.Access.WRITE_ONLY)
    private String finalTrackingState;

    /**
     * Creates an instance of IndexerExecutionResult class.
     *
     * @param status the status value to set.
     * @param errors the errors value to set.
     * @param warnings the warnings value to set.
     * @param itemCount the itemCount value to set.
     * @param failedItemCount the failedItemCount value to set.
     */
    @JsonCreator
    public IndexerExecutionResult(
            @JsonProperty(value = "status", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    IndexerExecutionStatus status,
            @JsonProperty(value = "errors", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SearchIndexerError> errors,
            @JsonProperty(value = "warnings", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SearchIndexerWarning> warnings,
            @JsonProperty(value = "itemsProcessed", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    int itemCount,
            @JsonProperty(value = "itemsFailed", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    int failedItemCount) {
        this.status = status;
        this.errors = errors;
        this.warnings = warnings;
        this.itemCount = itemCount;
        this.failedItemCount = failedItemCount;
    }

    /**
     * Get the status property: The outcome of this indexer execution.
     *
     * @return the status value.
     */
    public IndexerExecutionStatus getStatus() {
        return this.status;
    }

    /**
     * Get the errorMessage property: The error message indicating the top-level error, if any.
     *
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the startTime property: The start time of this indexer execution.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of this indexer execution, if the execution has already completed.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the errors property: The item-level indexing errors.
     *
     * @return the errors value.
     */
    public List<SearchIndexerError> getErrors() {
        return this.errors;
    }

    /**
     * Get the warnings property: The item-level indexing warnings.
     *
     * @return the warnings value.
     */
    public List<SearchIndexerWarning> getWarnings() {
        return this.warnings;
    }

    /**
     * Get the itemCount property: The number of items that were processed during this indexer execution. This includes
     * both successfully processed items and items where indexing was attempted but failed.
     *
     * @return the itemCount value.
     */
    public int getItemCount() {
        return this.itemCount;
    }

    /**
     * Get the failedItemCount property: The number of items that failed to be indexed during this indexer execution.
     *
     * @return the failedItemCount value.
     */
    public int getFailedItemCount() {
        return this.failedItemCount;
    }

    /**
     * Get the initialTrackingState property: Change tracking state with which an indexer execution started.
     *
     * @return the initialTrackingState value.
     */
    public String getInitialTrackingState() {
        return this.initialTrackingState;
    }

    /**
     * Get the finalTrackingState property: Change tracking state with which an indexer execution finished.
     *
     * @return the finalTrackingState value.
     */
    public String getFinalTrackingState() {
        return this.finalTrackingState;
    }
}
