// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the Topics Configuration. */
@Immutable
public final class TopicsConfiguration {
    /*
     * The hostname for the topics configuration. This is a read-only property.
     */
    @JsonProperty(value = "hostname", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /** Creates an instance of TopicsConfiguration class. */
    public TopicsConfiguration() {
    }

    /**
     * Get the hostname property: The hostname for the topics configuration. This is a read-only property.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
