// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Run notebook snapshot response. */
@Fluent
public final class RunNotebookSnapshotResponse {
    /*
     * Response message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Run notebook snapshot result.
     */
    @JsonProperty(value = "result")
    private RunNotebookSnapshotResult result;

    /** Creates an instance of RunNotebookSnapshotResponse class. */
    public RunNotebookSnapshotResponse() {}

    /**
     * Get the message property: Response message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the result property: Run notebook snapshot result.
     *
     * @return the result value.
     */
    public RunNotebookSnapshotResult getResult() {
        return this.result;
    }

    /**
     * Set the result property: Run notebook snapshot result.
     *
     * @param result the result value to set.
     * @return the RunNotebookSnapshotResponse object itself.
     */
    public RunNotebookSnapshotResponse setResult(RunNotebookSnapshotResult result) {
        this.result = result;
        return this;
    }
}
