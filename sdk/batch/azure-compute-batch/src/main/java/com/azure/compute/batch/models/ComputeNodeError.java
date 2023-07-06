// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An error encountered by a Compute Node. */
@Immutable
public final class ComputeNodeError {

    /*
     * An identifier for the Compute Node error. Codes are invariant and are intended
     * to be consumed programmatically.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * A message describing the Compute Node error, intended to be suitable for
     * display in a user interface.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The list of additional error details related to the Compute Node error.
     */
    @JsonProperty(value = "errorDetails")
    private List<NameValuePair> errorDetails;

    /** Creates an instance of ComputeNodeError class. */
    private ComputeNodeError() {}

    /**
     * Get the code property: An identifier for the Compute Node error. Codes are invariant and are intended to be
     * consumed programmatically.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A message describing the Compute Node error, intended to be suitable for display in a
     * user interface.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the errorDetails property: The list of additional error details related to the Compute Node error.
     *
     * @return the errorDetails value.
     */
    public List<NameValuePair> getErrorDetails() {
        return this.errorDetails;
    }
}
