// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Control Plane Apis version constraint for the API Management service. */
@Fluent
public final class ApiVersionConstraint {
    /*
     * Limit control plane API calls to API Management service with version equal to or newer than this value.
     */
    @JsonProperty(value = "minApiVersion")
    private String minApiVersion;

    /** Creates an instance of ApiVersionConstraint class. */
    public ApiVersionConstraint() {
    }

    /**
     * Get the minApiVersion property: Limit control plane API calls to API Management service with version equal to or
     * newer than this value.
     *
     * @return the minApiVersion value.
     */
    public String minApiVersion() {
        return this.minApiVersion;
    }

    /**
     * Set the minApiVersion property: Limit control plane API calls to API Management service with version equal to or
     * newer than this value.
     *
     * @param minApiVersion the minApiVersion value to set.
     * @return the ApiVersionConstraint object itself.
     */
    public ApiVersionConstraint withMinApiVersion(String minApiVersion) {
        this.minApiVersion = minApiVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
