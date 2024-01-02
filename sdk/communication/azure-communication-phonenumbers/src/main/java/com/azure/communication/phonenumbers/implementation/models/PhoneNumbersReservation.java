// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.communication.phonenumbers.CodeCoverageAnnotation.Generated;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The PhoneNumbersReservation model. */
@Fluent
@Generated
public final class PhoneNumbersReservation {
    /*
     * The id of the reservation.
     */
    @JsonProperty(value = "id", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The time at which the reservation will expire. If a reservation is not
     * purchased before this time, all of the reserved phone numbers will be
     * released and made available for others to purchase.
     */
    @JsonProperty(value = "expiresAt", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expiresAt;

    /*
     * Dictionary of <AvailablePhoneNumber>
     */
    @JsonProperty(value = "phoneNumbers", required = true)
    private Map<String, AvailablePhoneNumber> phoneNumbers;

    /*
     * The status property.
     */
    @JsonProperty(value = "status", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private ReservationStatus status;

    /**
     * Get the id property: The id of the reservation.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the expiresAt property: The time at which the reservation will expire. If a reservation is not purchased
     * before this time, all of the reserved phone numbers will be released and made available for others to purchase.
     *
     * @return the expiresAt value.
     */
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Get the phoneNumbers property: Dictionary of &lt;AvailablePhoneNumber&gt;.
     *
     * @return the phoneNumbers value.
     */
    public Map<String, AvailablePhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Set the phoneNumbers property: Dictionary of &lt;AvailablePhoneNumber&gt;.
     *
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the PhoneNumbersReservation object itself.
     */
    public PhoneNumbersReservation setPhoneNumbers(Map<String, AvailablePhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public ReservationStatus getStatus() {
        return this.status;
    }
}
