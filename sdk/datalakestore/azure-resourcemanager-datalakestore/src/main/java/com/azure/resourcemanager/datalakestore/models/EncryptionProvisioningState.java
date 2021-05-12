// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for EncryptionProvisioningState. */
public enum EncryptionProvisioningState {
    /** Enum value Creating. */
    CREATING("Creating"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded");

    /** The actual serialized value for a EncryptionProvisioningState instance. */
    private final String value;

    EncryptionProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EncryptionProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EncryptionProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static EncryptionProvisioningState fromString(String value) {
        EncryptionProvisioningState[] items = EncryptionProvisioningState.values();
        for (EncryptionProvisioningState item : items) {
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
