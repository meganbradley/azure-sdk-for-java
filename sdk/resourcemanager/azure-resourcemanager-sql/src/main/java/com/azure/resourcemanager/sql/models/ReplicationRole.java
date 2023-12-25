// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Local replication role.
 */
public enum ReplicationRole {
    /**
     * Enum value Primary.
     */
    PRIMARY("Primary"),

    /**
     * Enum value Secondary.
     */
    SECONDARY("Secondary"),

    /**
     * Enum value NonReadableSecondary.
     */
    NON_READABLE_SECONDARY("NonReadableSecondary"),

    /**
     * Enum value Source.
     */
    SOURCE("Source"),

    /**
     * Enum value Copy.
     */
    COPY("Copy");

    /**
     * The actual serialized value for a ReplicationRole instance.
     */
    private final String value;

    ReplicationRole(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReplicationRole instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ReplicationRole object, or null if unable to parse.
     */
    @JsonCreator
    public static ReplicationRole fromString(String value) {
        if (value == null) {
            return null;
        }
        ReplicationRole[] items = ReplicationRole.values();
        for (ReplicationRole item : items) {
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
