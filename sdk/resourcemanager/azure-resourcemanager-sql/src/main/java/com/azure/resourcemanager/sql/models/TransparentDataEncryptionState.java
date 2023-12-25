// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the state of the transparent data encryption.
 */
public enum TransparentDataEncryptionState {
    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled");

    /**
     * The actual serialized value for a TransparentDataEncryptionState instance.
     */
    private final String value;

    TransparentDataEncryptionState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TransparentDataEncryptionState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed TransparentDataEncryptionState object, or null if unable to parse.
     */
    @JsonCreator
    public static TransparentDataEncryptionState fromString(String value) {
        if (value == null) {
            return null;
        }
        TransparentDataEncryptionState[] items = TransparentDataEncryptionState.values();
        for (TransparentDataEncryptionState item : items) {
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
