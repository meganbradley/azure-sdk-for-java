// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The pass name. Currently, the only allowable value is OobeSystem.
 */
public enum PassNames {
    /**
     * Enum value OobeSystem.
     */
    OOBE_SYSTEM("OobeSystem");

    /**
     * The actual serialized value for a PassNames instance.
     */
    private final String value;

    PassNames(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PassNames instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed PassNames object, or null if unable to parse.
     */
    @JsonCreator
    public static PassNames fromString(String value) {
        if (value == null) {
            return null;
        }
        PassNames[] items = PassNames.values();
        for (PassNames item : items) {
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
