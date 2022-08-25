// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Range of route errors. */
@Fluent
public final class RouteErrorRange {
    /*
     * Start where the route error happened
     */
    @JsonProperty(value = "start")
    private RouteErrorPosition start;

    /*
     * End where the route error happened
     */
    @JsonProperty(value = "end")
    private RouteErrorPosition end;

    /**
     * Get the start property: Start where the route error happened.
     *
     * @return the start value.
     */
    public RouteErrorPosition start() {
        return this.start;
    }

    /**
     * Set the start property: Start where the route error happened.
     *
     * @param start the start value to set.
     * @return the RouteErrorRange object itself.
     */
    public RouteErrorRange withStart(RouteErrorPosition start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: End where the route error happened.
     *
     * @return the end value.
     */
    public RouteErrorPosition end() {
        return this.end;
    }

    /**
     * Set the end property: End where the route error happened.
     *
     * @param end the end value to set.
     * @return the RouteErrorRange object itself.
     */
    public RouteErrorRange withEnd(RouteErrorPosition end) {
        this.end = end;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (start() != null) {
            start().validate();
        }
        if (end() != null) {
            end().validate();
        }
    }
}
