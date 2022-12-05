// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** physicalAddress. */
@Fluent
public final class MicrosoftGraphPhysicalAddress {
    /*
     * The city.
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * The country or region. It's a free-format string value, for example, 'United States'.
     */
    @JsonProperty(value = "countryOrRegion")
    private String countryOrRegion;

    /*
     * The postal code.
     */
    @JsonProperty(value = "postalCode")
    private String postalCode;

    /*
     * The state.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * The street.
     */
    @JsonProperty(value = "street")
    private String street;

    /*
     * physicalAddress
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphPhysicalAddress class. */
    public MicrosoftGraphPhysicalAddress() {
    }

    /**
     * Get the city property: The city.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: The city.
     *
     * @param city the city value to set.
     * @return the MicrosoftGraphPhysicalAddress object itself.
     */
    public MicrosoftGraphPhysicalAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the countryOrRegion property: The country or region. It's a free-format string value, for example, 'United
     * States'.
     *
     * @return the countryOrRegion value.
     */
    public String countryOrRegion() {
        return this.countryOrRegion;
    }

    /**
     * Set the countryOrRegion property: The country or region. It's a free-format string value, for example, 'United
     * States'.
     *
     * @param countryOrRegion the countryOrRegion value to set.
     * @return the MicrosoftGraphPhysicalAddress object itself.
     */
    public MicrosoftGraphPhysicalAddress withCountryOrRegion(String countryOrRegion) {
        this.countryOrRegion = countryOrRegion;
        return this;
    }

    /**
     * Get the postalCode property: The postal code.
     *
     * @return the postalCode value.
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: The postal code.
     *
     * @param postalCode the postalCode value to set.
     * @return the MicrosoftGraphPhysicalAddress object itself.
     */
    public MicrosoftGraphPhysicalAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the state property: The state.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The state.
     *
     * @param state the state value to set.
     * @return the MicrosoftGraphPhysicalAddress object itself.
     */
    public MicrosoftGraphPhysicalAddress withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the street property: The street.
     *
     * @return the street value.
     */
    public String street() {
        return this.street;
    }

    /**
     * Set the street property: The street.
     *
     * @param street the street value to set.
     * @return the MicrosoftGraphPhysicalAddress object itself.
     */
    public MicrosoftGraphPhysicalAddress withStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Get the additionalProperties property: physicalAddress.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: physicalAddress.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPhysicalAddress object itself.
     */
    public MicrosoftGraphPhysicalAddress withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
