// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The content hash. */
@Fluent
public final class ContentHash {
    /*
     * The algorithm of the content hash.
     */
    @JsonProperty(value = "algorithm")
    private String algorithm;

    /*
     * The value of the content hash.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of ContentHash class. */
    public ContentHash() {
    }

    /**
     * Get the algorithm property: The algorithm of the content hash.
     *
     * @return the algorithm value.
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: The algorithm of the content hash.
     *
     * @param algorithm the algorithm value to set.
     * @return the ContentHash object itself.
     */
    public ContentHash withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the value property: The value of the content hash.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the content hash.
     *
     * @param value the value value to set.
     * @return the ContentHash object itself.
     */
    public ContentHash withValue(String value) {
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
