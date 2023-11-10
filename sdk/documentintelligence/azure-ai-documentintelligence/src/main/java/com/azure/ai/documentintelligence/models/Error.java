// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The error object.
 */
@Immutable
public final class Error {
    /*
     * One of a server-defined set of error codes.
     */
    @Generated
    @JsonProperty(value = "code")
    private String code;

    /*
     * A human-readable representation of the error.
     */
    @Generated
    @JsonProperty(value = "message")
    private String message;

    /*
     * The target of the error.
     */
    @Generated
    @JsonProperty(value = "target")
    private String target;

    /*
     * An array of details about specific errors that led to this reported error.
     */
    @Generated
    @JsonProperty(value = "details")
    private List<Error> details;

    /*
     * An object containing more specific information than the current object about the error.
     */
    @Generated
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Creates an instance of Error class.
     * 
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Generated
    @JsonCreator
    private Error(@JsonProperty(value = "code") String code, @JsonProperty(value = "message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: One of a server-defined set of error codes.
     * 
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     * 
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: The target of the error.
     * 
     * @return the target value.
     */
    @Generated
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details property: An array of details about specific errors that led to this reported error.
     * 
     * @return the details value.
     */
    @Generated
    public List<Error> getDetails() {
        return this.details;
    }

    /**
     * Get the innererror property: An object containing more specific information than the current object about the
     * error.
     * 
     * @return the innererror value.
     */
    @Generated
    public InnerError getInnererror() {
        return this.innererror;
    }
}
