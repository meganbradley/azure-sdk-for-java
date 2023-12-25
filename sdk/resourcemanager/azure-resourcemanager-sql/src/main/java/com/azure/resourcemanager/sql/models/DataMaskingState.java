// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of the data masking policy.
 */
public enum DataMaskingState {
    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled"),

    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled");

    /**
     * The actual serialized value for a DataMaskingState instance.
     */
    private final String value;

    DataMaskingState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataMaskingState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed DataMaskingState object, or null if unable to parse.
     */
    @JsonCreator
    public static DataMaskingState fromString(String value) {
        if (value == null) {
            return null;
        }
        DataMaskingState[] items = DataMaskingState.values();
        for (DataMaskingState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
