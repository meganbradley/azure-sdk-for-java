// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.iothub.models.IotHubNameUnavailabilityReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties indicating whether a given IoT hub name is available. */
@Fluent
public final class IotHubNameAvailabilityInfoInner {
    /*
     * The value which indicates whether the provided name is available.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /*
     * The reason for unavailability.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private IotHubNameUnavailabilityReason reason;

    /*
     * The detailed reason message.
     */
    @JsonProperty(value = "message")
    private String message;

    /** Creates an instance of IotHubNameAvailabilityInfoInner class. */
    public IotHubNameAvailabilityInfoInner() {
    }

    /**
     * Get the nameAvailable property: The value which indicates whether the provided name is available.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason property: The reason for unavailability.
     *
     * @return the reason value.
     */
    public IotHubNameUnavailabilityReason reason() {
        return this.reason;
    }

    /**
     * Get the message property: The detailed reason message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The detailed reason message.
     *
     * @param message the message value to set.
     * @return the IotHubNameAvailabilityInfoInner object itself.
     */
    public IotHubNameAvailabilityInfoInner withMessage(String message) {
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
