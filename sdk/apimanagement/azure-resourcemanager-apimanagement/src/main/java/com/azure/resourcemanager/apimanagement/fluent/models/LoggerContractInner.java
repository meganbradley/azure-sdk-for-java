// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.apimanagement.models.LoggerType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Logger details. */
@Fluent
public final class LoggerContractInner extends ProxyResource {
    /*
     * Logger entity contract properties.
     */
    @JsonProperty(value = "properties")
    private LoggerContractProperties innerProperties;

    /** Creates an instance of LoggerContractInner class. */
    public LoggerContractInner() {
    }

    /**
     * Get the innerProperties property: Logger entity contract properties.
     *
     * @return the innerProperties value.
     */
    private LoggerContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the loggerType property: Logger type.
     *
     * @return the loggerType value.
     */
    public LoggerType loggerType() {
        return this.innerProperties() == null ? null : this.innerProperties().loggerType();
    }

    /**
     * Set the loggerType property: Logger type.
     *
     * @param loggerType the loggerType value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withLoggerType(LoggerType loggerType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoggerContractProperties();
        }
        this.innerProperties().withLoggerType(loggerType);
        return this;
    }

    /**
     * Get the description property: Logger description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Logger description.
     *
     * @param description the description value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoggerContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the credentials property: The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     *
     * @return the credentials value.
     */
    public Map<String, String> credentials() {
        return this.innerProperties() == null ? null : this.innerProperties().credentials();
    }

    /**
     * Set the credentials property: The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     *
     * @param credentials the credentials value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withCredentials(Map<String, String> credentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoggerContractProperties();
        }
        this.innerProperties().withCredentials(credentials);
        return this;
    }

    /**
     * Get the isBuffered property: Whether records are buffered in the logger before publishing. Default is assumed to
     * be true.
     *
     * @return the isBuffered value.
     */
    public Boolean isBuffered() {
        return this.innerProperties() == null ? null : this.innerProperties().isBuffered();
    }

    /**
     * Set the isBuffered property: Whether records are buffered in the logger before publishing. Default is assumed to
     * be true.
     *
     * @param isBuffered the isBuffered value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withIsBuffered(Boolean isBuffered) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoggerContractProperties();
        }
        this.innerProperties().withIsBuffered(isBuffered);
        return this;
    }

    /**
     * Get the resourceId property: Azure Resource Id of a log target (either Azure Event Hub resource or Azure
     * Application Insights resource).
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: Azure Resource Id of a log target (either Azure Event Hub resource or Azure
     * Application Insights resource).
     *
     * @param resourceId the resourceId value to set.
     * @return the LoggerContractInner object itself.
     */
    public LoggerContractInner withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoggerContractProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
