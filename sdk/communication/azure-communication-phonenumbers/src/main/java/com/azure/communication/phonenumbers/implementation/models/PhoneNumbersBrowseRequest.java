// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.communication.phonenumbers.CodeCoverageAnnotation.Generated;
import com.azure.communication.phonenumbers.models.PhoneNumberAssignmentType;
import com.azure.communication.phonenumbers.models.PhoneNumberType;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PhoneNumbersBrowseRequest model. */
@Fluent
@Generated
public final class PhoneNumbersBrowseRequest {
    /*
     * Represents the number type of the offering.
     */
    @JsonProperty(value = "phoneNumberType", required = true)
    private PhoneNumberType phoneNumberType;

    /*
     * Capabilities of a phone number.
     */
    @JsonProperty(value = "capabilities")
    private PhoneNumberCapabilitiesRequest capabilities;

    /*
     * Represents the assignment type of the offering. Also known as the use
     * case.
     */
    @JsonProperty(value = "assignmentType")
    private PhoneNumberAssignmentType assignmentType;

    /*
     * The phone number prefix to match. If specified, the search will be
     * limited to phone numbers that start with the any of the given prefixes.
     */
    @JsonProperty(value = "phoneNumberPrefixes")
    private List<String> phoneNumberPrefixes;

    /**
     * Get the phoneNumberType property: Represents the number type of the offering.
     *
     * @return the phoneNumberType value.
     */
    public PhoneNumberType getPhoneNumberType() {
        return this.phoneNumberType;
    }

    /**
     * Set the phoneNumberType property: Represents the number type of the offering.
     *
     * @param phoneNumberType the phoneNumberType value to set.
     * @return the PhoneNumbersBrowseRequest object itself.
     */
    public PhoneNumbersBrowseRequest setPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
        return this;
    }

    /**
     * Get the capabilities property: Capabilities of a phone number.
     *
     * @return the capabilities value.
     */
    public PhoneNumberCapabilitiesRequest getCapabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: Capabilities of a phone number.
     *
     * @param capabilities the capabilities value to set.
     * @return the PhoneNumbersBrowseRequest object itself.
     */
    public PhoneNumbersBrowseRequest setCapabilities(PhoneNumberCapabilitiesRequest capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the assignmentType property: Represents the assignment type of the offering. Also known as the use case.
     *
     * @return the assignmentType value.
     */
    public PhoneNumberAssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    /**
     * Set the assignmentType property: Represents the assignment type of the offering. Also known as the use case.
     *
     * @param assignmentType the assignmentType value to set.
     * @return the PhoneNumbersBrowseRequest object itself.
     */
    public PhoneNumbersBrowseRequest setAssignmentType(PhoneNumberAssignmentType assignmentType) {
        this.assignmentType = assignmentType;
        return this;
    }

    /**
     * Get the phoneNumberPrefixes property: The phone number prefix to match. If specified, the search will be limited
     * to phone numbers that start with the any of the given prefixes.
     *
     * @return the phoneNumberPrefixes value.
     */
    public List<String> getPhoneNumberPrefixes() {
        return this.phoneNumberPrefixes;
    }

    /**
     * Set the phoneNumberPrefixes property: The phone number prefix to match. If specified, the search will be limited
     * to phone numbers that start with the any of the given prefixes.
     *
     * @param phoneNumberPrefixes the phoneNumberPrefixes value to set.
     * @return the PhoneNumbersBrowseRequest object itself.
     */
    public PhoneNumbersBrowseRequest setPhoneNumberPrefixes(List<String> phoneNumberPrefixes) {
        this.phoneNumberPrefixes = phoneNumberPrefixes;
        return this;
    }
}
