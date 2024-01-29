// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Validation message object.
 */
@Fluent
public final class ValidationMessage {
    /*
     * Severity of validation message
     */
    @JsonProperty(value = "state")
    private ValidationState state;

    /*
     * Validation message string
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Creates an instance of ValidationMessage class.
     */
    public ValidationMessage() {
    }

    /**
     * Get the state property: Severity of validation message.
     * 
     * @return the state value.
     */
    public ValidationState state() {
        return this.state;
    }

    /**
     * Set the state property: Severity of validation message.
     * 
     * @param state the state value to set.
     * @return the ValidationMessage object itself.
     */
    public ValidationMessage withState(ValidationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the message property: Validation message string.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Validation message string.
     * 
     * @param message the message value to set.
     * @return the ValidationMessage object itself.
     */
    public ValidationMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
