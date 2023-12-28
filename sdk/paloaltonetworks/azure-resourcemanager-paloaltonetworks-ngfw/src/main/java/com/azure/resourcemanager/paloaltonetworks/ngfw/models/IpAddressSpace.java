// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP Address Space.
 */
@Fluent
public final class IpAddressSpace {
    /*
     * Resource Id
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Address Space
     */
    @JsonProperty(value = "addressSpace")
    private String addressSpace;

    /**
     * Creates an instance of IpAddressSpace class.
     */
    public IpAddressSpace() {
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
     * @return the IpAddressSpace object itself.
     */
    public IpAddressSpace withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the addressSpace property: Address Space.
     * 
     * @return the addressSpace value.
     */
    public String addressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the addressSpace property: Address Space.
     * 
     * @param addressSpace the addressSpace value to set.
     * @return the IpAddressSpace object itself.
     */
    public IpAddressSpace withAddressSpace(String addressSpace) {
        this.addressSpace = addressSpace;
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
