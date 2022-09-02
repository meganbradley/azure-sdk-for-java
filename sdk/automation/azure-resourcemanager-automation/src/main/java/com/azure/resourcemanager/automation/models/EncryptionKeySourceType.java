// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Encryption Key Source. */
public enum EncryptionKeySourceType {
    /** Enum value Microsoft.Automation. */
    MICROSOFT_AUTOMATION("Microsoft.Automation"),

    /** Enum value Microsoft.Keyvault. */
    MICROSOFT_KEYVAULT("Microsoft.Keyvault");

    /** The actual serialized value for a EncryptionKeySourceType instance. */
    private final String value;

    EncryptionKeySourceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EncryptionKeySourceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EncryptionKeySourceType object, or null if unable to parse.
     */
    @JsonCreator
    public static EncryptionKeySourceType fromString(String value) {
        if (value == null) {
            return null;
        }
        EncryptionKeySourceType[] items = EncryptionKeySourceType.values();
        for (EncryptionKeySourceType item : items) {
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
