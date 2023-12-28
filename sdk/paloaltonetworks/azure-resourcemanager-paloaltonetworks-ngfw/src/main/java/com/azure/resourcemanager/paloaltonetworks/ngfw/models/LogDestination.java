// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Log Destination.
 */
@Fluent
public final class LogDestination {
    /*
     * Storage account configurations
     */
    @JsonProperty(value = "storageConfigurations")
    private StorageAccount storageConfigurations;

    /*
     * Event Hub configurations
     */
    @JsonProperty(value = "eventHubConfigurations")
    private EventHub eventHubConfigurations;

    /*
     * Monitor Log configurations
     */
    @JsonProperty(value = "monitorConfigurations")
    private MonitorLog monitorConfigurations;

    /**
     * Creates an instance of LogDestination class.
     */
    public LogDestination() {
    }

    /**
     * Get the storageConfigurations property: Storage account configurations.
     * 
     * @return the storageConfigurations value.
     */
    public StorageAccount storageConfigurations() {
        return this.storageConfigurations;
    }

    /**
     * Set the storageConfigurations property: Storage account configurations.
     * 
     * @param storageConfigurations the storageConfigurations value to set.
     * @return the LogDestination object itself.
     */
    public LogDestination withStorageConfigurations(StorageAccount storageConfigurations) {
        this.storageConfigurations = storageConfigurations;
        return this;
    }

    /**
     * Get the eventHubConfigurations property: Event Hub configurations.
     * 
     * @return the eventHubConfigurations value.
     */
    public EventHub eventHubConfigurations() {
        return this.eventHubConfigurations;
    }

    /**
     * Set the eventHubConfigurations property: Event Hub configurations.
     * 
     * @param eventHubConfigurations the eventHubConfigurations value to set.
     * @return the LogDestination object itself.
     */
    public LogDestination withEventHubConfigurations(EventHub eventHubConfigurations) {
        this.eventHubConfigurations = eventHubConfigurations;
        return this;
    }

    /**
     * Get the monitorConfigurations property: Monitor Log configurations.
     * 
     * @return the monitorConfigurations value.
     */
    public MonitorLog monitorConfigurations() {
        return this.monitorConfigurations;
    }

    /**
     * Set the monitorConfigurations property: Monitor Log configurations.
     * 
     * @param monitorConfigurations the monitorConfigurations value to set.
     * @return the LogDestination object itself.
     */
    public LogDestination withMonitorConfigurations(MonitorLog monitorConfigurations) {
        this.monitorConfigurations = monitorConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageConfigurations() != null) {
            storageConfigurations().validate();
        }
        if (eventHubConfigurations() != null) {
            eventHubConfigurations().validate();
        }
        if (monitorConfigurations() != null) {
            monitorConfigurations().validate();
        }
    }
}
