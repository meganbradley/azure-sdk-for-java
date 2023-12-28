// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to
 * the Application Insights component.
 */
public enum FavoriteType {
    /** Enum value shared. */
    SHARED("shared"),

    /** Enum value user. */
    USER("user");

    /** The actual serialized value for a FavoriteType instance. */
    private final String value;

    FavoriteType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FavoriteType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FavoriteType object, or null if unable to parse.
     */
    @JsonCreator
    public static FavoriteType fromString(String value) {
        if (value == null) {
            return null;
        }
        FavoriteType[] items = FavoriteType.values();
        for (FavoriteType item : items) {
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
