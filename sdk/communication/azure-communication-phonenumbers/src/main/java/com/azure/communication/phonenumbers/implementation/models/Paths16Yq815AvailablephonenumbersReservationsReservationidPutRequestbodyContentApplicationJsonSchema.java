// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.communication.phonenumbers.CodeCoverageAnnotation.Generated;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths16Yq815AvailablephonenumbersReservationsReservationidPutRequestbodyContentApplicationJsonSchema model. */
@Fluent
@Generated
public final
class Paths16Yq815AvailablephonenumbersReservationsReservationidPutRequestbodyContentApplicationJsonSchema {
    /*
     * The phoneNumbers property.
     */
    @JsonProperty(value = "phoneNumbers")
    private List<AvailablePhoneNumber> phoneNumbers;

    /**
     * Get the phoneNumbers property: The phoneNumbers property.
     *
     * @return the phoneNumbers value.
     */
    public List<AvailablePhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Set the phoneNumbers property: The phoneNumbers property.
     *
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the Paths16Yq815AvailablephonenumbersReservationsReservationidPutRequestbodyContentApplicationJsonSchema
     *     object itself.
     */
    public Paths16Yq815AvailablephonenumbersReservationsReservationidPutRequestbodyContentApplicationJsonSchema
            setPhoneNumbers(List<AvailablePhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
}
