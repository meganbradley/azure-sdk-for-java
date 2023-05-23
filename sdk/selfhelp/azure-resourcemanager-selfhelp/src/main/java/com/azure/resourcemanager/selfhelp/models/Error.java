// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Error definition. */
@Fluent
public final class Error {
    /*
     * Service specific error code which serves as the substatus for the HTTP error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Service specific error type which serves as additional context for the error herein.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Description of the error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * An array of additional nested error response info objects, as described by this contract.
     */
    @JsonProperty(value = "details")
    private List<Error> details;

    /** Creates an instance of Error class. */
    public Error() {
    }

    /**
     * Get the code property: Service specific error code which serves as the substatus for the HTTP error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the type property: Service specific error type which serves as additional context for the error herein.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the message property: Description of the error.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the details property: An array of additional nested error response info objects, as described by this
     * contract.
     *
     * @return the details value.
     */
    public List<Error> details() {
        return this.details;
    }

    /**
     * Set the details property: An array of additional nested error response info objects, as described by this
     * contract.
     *
     * @param details the details value to set.
     * @return the Error object itself.
     */
    public Error withDetails(List<Error> details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
