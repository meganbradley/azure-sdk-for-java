// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values
 * are 'Enabled' and 'Disabled'.
 */
public enum AutoExecuteStatus {
    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled"),

    /**
     * Enum value Default.
     */
    DEFAULT("Default");

    /**
     * The actual serialized value for a AutoExecuteStatus instance.
     */
    private final String value;

    AutoExecuteStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutoExecuteStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AutoExecuteStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static AutoExecuteStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        AutoExecuteStatus[] items = AutoExecuteStatus.values();
        for (AutoExecuteStatus item : items) {
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
