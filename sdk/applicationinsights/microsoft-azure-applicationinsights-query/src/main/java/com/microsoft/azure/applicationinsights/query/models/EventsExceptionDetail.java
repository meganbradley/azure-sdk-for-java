/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Exception details.
 */
public class EventsExceptionDetail {
    /**
     * The severity level of the exception detail.
     */
    @JsonProperty(value = "severityLevel")
    private String severityLevel;

    /**
     * The outer ID of the exception detail.
     */
    @JsonProperty(value = "outerId")
    private String outerId;

    /**
     * The message of the exception detail.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The type of the exception detail.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The ID of the exception detail.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The parsed stack.
     */
    @JsonProperty(value = "parsedStack")
    private List<EventsExceptionDetailsParsedStack> parsedStack;

    /**
     * Get the severity level of the exception detail.
     *
     * @return the severityLevel value
     */
    public String severityLevel() {
        return this.severityLevel;
    }

    /**
     * Set the severity level of the exception detail.
     *
     * @param severityLevel the severityLevel value to set
     * @return the EventsExceptionDetail object itself.
     */
    public EventsExceptionDetail withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * Get the outer ID of the exception detail.
     *
     * @return the outerId value
     */
    public String outerId() {
        return this.outerId;
    }

    /**
     * Set the outer ID of the exception detail.
     *
     * @param outerId the outerId value to set
     * @return the EventsExceptionDetail object itself.
     */
    public EventsExceptionDetail withOuterId(String outerId) {
        this.outerId = outerId;
        return this;
    }

    /**
     * Get the message of the exception detail.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message of the exception detail.
     *
     * @param message the message value to set
     * @return the EventsExceptionDetail object itself.
     */
    public EventsExceptionDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the type of the exception detail.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the exception detail.
     *
     * @param type the type value to set
     * @return the EventsExceptionDetail object itself.
     */
    public EventsExceptionDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the ID of the exception detail.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the exception detail.
     *
     * @param id the id value to set
     * @return the EventsExceptionDetail object itself.
     */
    public EventsExceptionDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the parsed stack.
     *
     * @return the parsedStack value
     */
    public List<EventsExceptionDetailsParsedStack> parsedStack() {
        return this.parsedStack;
    }

    /**
     * Set the parsed stack.
     *
     * @param parsedStack the parsedStack value to set
     * @return the EventsExceptionDetail object itself.
     */
    public EventsExceptionDetail withParsedStack(List<EventsExceptionDetailsParsedStack> parsedStack) {
        this.parsedStack = parsedStack;
        return this;
    }

}
