// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hub Item.
 */
@Fluent
public final class Hub {
    /*
     * Resource Id.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Resource Type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * Creates an instance of Hub class.
     */
    public Hub() {
    }

    /**
     * Get the resourceId property: Resource Id.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource Id.
     * 
     * @param resourceId the resourceId value to set.
     * @return the Hub object itself.
     */
    public Hub withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceType property: Resource Type.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource Type.
     * 
     * @param resourceType the resourceType value to set.
     * @return the Hub object itself.
     */
    public Hub withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
