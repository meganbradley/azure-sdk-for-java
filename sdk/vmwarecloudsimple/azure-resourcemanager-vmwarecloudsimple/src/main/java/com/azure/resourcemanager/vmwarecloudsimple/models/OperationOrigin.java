// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The origin of operation. */
public enum OperationOrigin {
    /** Enum value user. */
    USER("user"),

    /** Enum value system. */
    SYSTEM("system"),

    /** Enum value user,system. */
    USER_SYSTEM("user,system");

    /** The actual serialized value for a OperationOrigin instance. */
    private final String value;

    OperationOrigin(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperationOrigin instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OperationOrigin object, or null if unable to parse.
     */
    @JsonCreator
    public static OperationOrigin fromString(String value) {
        if (value == null) {
            return null;
        }
        OperationOrigin[] items = OperationOrigin.values();
        for (OperationOrigin item : items) {
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
