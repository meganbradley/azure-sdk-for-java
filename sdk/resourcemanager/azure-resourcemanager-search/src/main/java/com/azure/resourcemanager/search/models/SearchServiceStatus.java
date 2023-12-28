// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the search service. Possible values include: 'running': The search service is running and no
 * provisioning operations are underway. 'provisioning': The search service is being provisioned or scaled up or down.
 * 'deleting': The search service is being deleted. 'degraded': The search service is degraded. This can occur when the
 * underlying search units are not healthy. The search service is most likely operational, but performance might be slow
 * and some requests might be dropped. 'disabled': The search service is disabled. In this state, the service will
 * reject all API requests. 'error': The search service is in an error state. If your service is in the degraded,
 * disabled, or error states, Microsoft is actively investigating the underlying issue. Dedicated services in these
 * states are still chargeable based on the number of search units provisioned.
 */
public enum SearchServiceStatus {
    /** Enum value running. */
    RUNNING("running"),

    /** Enum value provisioning. */
    PROVISIONING("provisioning"),

    /** Enum value deleting. */
    DELETING("deleting"),

    /** Enum value degraded. */
    DEGRADED("degraded"),

    /** Enum value disabled. */
    DISABLED("disabled"),

    /** Enum value error. */
    ERROR("error");

    /** The actual serialized value for a SearchServiceStatus instance. */
    private final String value;

    SearchServiceStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SearchServiceStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SearchServiceStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static SearchServiceStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        SearchServiceStatus[] items = SearchServiceStatus.values();
        for (SearchServiceStatus item : items) {
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
