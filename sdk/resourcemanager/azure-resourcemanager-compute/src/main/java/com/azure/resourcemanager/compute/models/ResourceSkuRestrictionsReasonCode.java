// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The reason for restriction. */
public enum ResourceSkuRestrictionsReasonCode {
    /** Enum value QuotaId. */
    QUOTA_ID("QuotaId"),

    /** Enum value NotAvailableForSubscription. */
    NOT_AVAILABLE_FOR_SUBSCRIPTION("NotAvailableForSubscription");

    /** The actual serialized value for a ResourceSkuRestrictionsReasonCode instance. */
    private final String value;

    ResourceSkuRestrictionsReasonCode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceSkuRestrictionsReasonCode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceSkuRestrictionsReasonCode object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceSkuRestrictionsReasonCode fromString(String value) {
        if (value == null) {
            return null;
        }
        ResourceSkuRestrictionsReasonCode[] items = ResourceSkuRestrictionsReasonCode.values();
        for (ResourceSkuRestrictionsReasonCode item : items) {
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
