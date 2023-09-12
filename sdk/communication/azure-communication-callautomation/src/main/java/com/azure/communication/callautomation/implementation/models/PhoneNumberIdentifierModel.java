// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A phone number. */
@Fluent
public final class PhoneNumberIdentifierModel {
    /*
     * The phone number in E.164 format.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /** Creates an instance of PhoneNumberIdentifierModel class. */
    public PhoneNumberIdentifierModel() {}

    /**
     * Get the value property: The phone number in E.164 format.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The phone number in E.164 format.
     *
     * @param value the value value to set.
     * @return the PhoneNumberIdentifierModel object itself.
     */
    public PhoneNumberIdentifierModel setValue(String value) {
        this.value = value;
        return this;
    }
}
