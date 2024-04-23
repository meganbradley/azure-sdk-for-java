// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The code and message for an error.
 */
@Fluent
public final class ErrorInfo {
    /*
     * A machine readable error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * A human readable error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * error details.
     */
    @JsonProperty(value = "details")
    private List<ErrorDetail> details;

    /*
     * The code and message for an error.
     * 
     * Inner error details if they exist.
     */
    @JsonProperty(value = "innererror")
    private ErrorInfo innererror;

    /*
     * Additional properties that can be provided on the error info object
     */
    @JsonProperty(value = "additionalProperties")
    private Object additionalProperties;

    /**
     * Creates an instance of ErrorInfo class.
     * 
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @JsonCreator
    public ErrorInfo(@JsonProperty(value = "code", required = true) String code,
        @JsonProperty(value = "message", required = true) String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: A machine readable error code.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human readable error message.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the details property: error details.
     * 
     * @return the details value.
     */
    public List<ErrorDetail> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: error details.
     * 
     * @param details the details value to set.
     * @return the ErrorInfo object itself.
     */
    public ErrorInfo setDetails(List<ErrorDetail> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innererror property: The code and message for an error.
     * 
     * Inner error details if they exist.
     * 
     * @return the innererror value.
     */
    public ErrorInfo getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: The code and message for an error.
     * 
     * Inner error details if they exist.
     * 
     * @param innererror the innererror value to set.
     * @return the ErrorInfo object itself.
     */
    public ErrorInfo setInnererror(ErrorInfo innererror) {
        this.innererror = innererror;
        return this;
    }

    /**
     * Get the additionalProperties property: Additional properties that can be provided on the error info object.
     * 
     * @return the additionalProperties value.
     */
    public Object getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Additional properties that can be provided on the error info object.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the ErrorInfo object itself.
     */
    public ErrorInfo setAdditionalProperties(Object additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
}
