// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled or a state has not been
 * applied yet on the specific database or server.
 */
public enum AdvancedThreatProtectionState {
    /**
     * Enum value New.
     */
    NEW("New"),

    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled");

    /**
     * The actual serialized value for a AdvancedThreatProtectionState instance.
     */
    private final String value;

    AdvancedThreatProtectionState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AdvancedThreatProtectionState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AdvancedThreatProtectionState object, or null if unable to parse.
     */
    @JsonCreator
    public static AdvancedThreatProtectionState fromString(String value) {
        if (value == null) {
            return null;
        }
        AdvancedThreatProtectionState[] items = AdvancedThreatProtectionState.values();
        for (AdvancedThreatProtectionState item : items) {
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
