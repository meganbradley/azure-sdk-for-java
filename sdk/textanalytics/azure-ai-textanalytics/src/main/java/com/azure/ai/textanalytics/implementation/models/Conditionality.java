// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Conditionality. */
public enum Conditionality {
    /** Enum value hypothetical. */
    HYPOTHETICAL("hypothetical"),

    /** Enum value conditional. */
    CONDITIONAL("conditional");

    /** The actual serialized value for a Conditionality instance. */
    private final String value;

    Conditionality(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Conditionality instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Conditionality object, or null if unable to parse.
     */
    @JsonCreator
    public static Conditionality fromString(String value) {
        if (value == null) {
            return null;
        }
        Conditionality[] items = Conditionality.values();
        for (Conditionality item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
