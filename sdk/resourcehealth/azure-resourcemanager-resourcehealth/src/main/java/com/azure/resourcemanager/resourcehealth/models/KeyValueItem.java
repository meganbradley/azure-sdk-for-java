// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Key value tuple. */
@Immutable
public final class KeyValueItem {
    /*
     * Key of tuple.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /*
     * Value of tuple.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /** Creates an instance of KeyValueItem class. */
    public KeyValueItem() {
    }

    /**
     * Get the key property: Key of tuple.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Get the value property: Value of tuple.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
