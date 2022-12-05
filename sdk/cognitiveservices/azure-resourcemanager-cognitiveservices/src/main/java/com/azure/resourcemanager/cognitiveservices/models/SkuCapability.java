// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SkuCapability indicates the capability of a certain feature. */
@Fluent
public final class SkuCapability {
    /*
     * The name of the SkuCapability.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the SkuCapability.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of SkuCapability class. */
    public SkuCapability() {
    }

    /**
     * Get the name property: The name of the SkuCapability.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SkuCapability.
     *
     * @param name the name value to set.
     * @return the SkuCapability object itself.
     */
    public SkuCapability withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the SkuCapability.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the SkuCapability.
     *
     * @param value the value value to set.
     * @return the SkuCapability object itself.
     */
    public SkuCapability withValue(String value) {
        this.value = value;
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
