// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.models.UnavailableReason;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Result of the CheckNameAvailability operation. */
@Fluent
public final class CheckNameAvailabilityResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilityResultInner.class);

    /*
     * The detailed info regarding the reason associated with the Namespace.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Value indicating Namespace is availability, true if the Namespace is
     * available; otherwise, false.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /*
     * The reason for unavailability of a Namespace.
     */
    @JsonProperty(value = "reason")
    private UnavailableReason reason;

    /**
     * Get the message property: The detailed info regarding the reason associated with the Namespace.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the nameAvailable property: Value indicating Namespace is availability, true if the Namespace is available;
     * otherwise, false.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Value indicating Namespace is availability, true if the Namespace is available;
     * otherwise, false.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: The reason for unavailability of a Namespace.
     *
     * @return the reason value.
     */
    public UnavailableReason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for unavailability of a Namespace.
     *
     * @param reason the reason value to set.
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withReason(UnavailableReason reason) {
        this.reason = reason;
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
