// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Describes if the entity is the subject of the text or if it describes someone else. */
public enum Association {
    /** Enum value subject. */
    SUBJECT("subject"),

    /** Enum value other. */
    OTHER("other");

    /** The actual serialized value for a Association instance. */
    private final String value;

    Association(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Association instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Association object, or null if unable to parse.
     */
    @JsonCreator
    public static Association fromString(String value) {
        if (value == null) {
            return null;
        }
        Association[] items = Association.values();
        for (Association item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
