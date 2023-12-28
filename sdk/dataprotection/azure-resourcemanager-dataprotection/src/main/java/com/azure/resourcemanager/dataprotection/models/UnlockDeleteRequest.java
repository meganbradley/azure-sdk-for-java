// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Request body of unlock delete API.
 */
@Fluent
public final class UnlockDeleteRequest {
    /*
     * The resourceGuardOperationRequests property.
     */
    @JsonProperty(value = "resourceGuardOperationRequests")
    private List<String> resourceGuardOperationRequests;

    /*
     * The resourceToBeDeleted property.
     */
    @JsonProperty(value = "resourceToBeDeleted")
    private String resourceToBeDeleted;

    /**
     * Creates an instance of UnlockDeleteRequest class.
     */
    public UnlockDeleteRequest() {
    }

    /**
     * Get the resourceGuardOperationRequests property: The resourceGuardOperationRequests property.
     * 
     * @return the resourceGuardOperationRequests value.
     */
    public List<String> resourceGuardOperationRequests() {
        return this.resourceGuardOperationRequests;
    }

    /**
     * Set the resourceGuardOperationRequests property: The resourceGuardOperationRequests property.
     * 
     * @param resourceGuardOperationRequests the resourceGuardOperationRequests value to set.
     * @return the UnlockDeleteRequest object itself.
     */
    public UnlockDeleteRequest withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        this.resourceGuardOperationRequests = resourceGuardOperationRequests;
        return this;
    }

    /**
     * Get the resourceToBeDeleted property: The resourceToBeDeleted property.
     * 
     * @return the resourceToBeDeleted value.
     */
    public String resourceToBeDeleted() {
        return this.resourceToBeDeleted;
    }

    /**
     * Set the resourceToBeDeleted property: The resourceToBeDeleted property.
     * 
     * @param resourceToBeDeleted the resourceToBeDeleted value to set.
     * @return the UnlockDeleteRequest object itself.
     */
    public UnlockDeleteRequest withResourceToBeDeleted(String resourceToBeDeleted) {
        this.resourceToBeDeleted = resourceToBeDeleted;
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
