// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Current status of the App Service Environment. */
public enum HostingEnvironmentStatus {
    /** Enum value Preparing. */
    PREPARING("Preparing"),

    /** Enum value Ready. */
    READY("Ready"),

    /** Enum value Scaling. */
    SCALING("Scaling"),

    /** Enum value Deleting. */
    DELETING("Deleting");

    /** The actual serialized value for a HostingEnvironmentStatus instance. */
    private final String value;

    HostingEnvironmentStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HostingEnvironmentStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HostingEnvironmentStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static HostingEnvironmentStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        HostingEnvironmentStatus[] items = HostingEnvironmentStatus.values();
        for (HostingEnvironmentStatus item : items) {
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
