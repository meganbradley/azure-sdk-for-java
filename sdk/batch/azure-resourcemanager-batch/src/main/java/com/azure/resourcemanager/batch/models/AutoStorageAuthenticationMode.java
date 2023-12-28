// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The authentication mode which the Batch service will use to manage the auto-storage account.
 */
public enum AutoStorageAuthenticationMode {
    /**
     * Enum value StorageKeys.
     */
    STORAGE_KEYS("StorageKeys"),

    /**
     * Enum value BatchAccountManagedIdentity.
     */
    BATCH_ACCOUNT_MANAGED_IDENTITY("BatchAccountManagedIdentity");

    /**
     * The actual serialized value for a AutoStorageAuthenticationMode instance.
     */
    private final String value;

    AutoStorageAuthenticationMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutoStorageAuthenticationMode instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AutoStorageAuthenticationMode object, or null if unable to parse.
     */
    @JsonCreator
    public static AutoStorageAuthenticationMode fromString(String value) {
        if (value == null) {
            return null;
        }
        AutoStorageAuthenticationMode[] items = AutoStorageAuthenticationMode.values();
        for (AutoStorageAuthenticationMode item : items) {
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
