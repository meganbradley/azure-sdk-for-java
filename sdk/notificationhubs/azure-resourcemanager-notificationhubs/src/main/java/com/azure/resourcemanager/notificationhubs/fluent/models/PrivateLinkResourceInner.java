// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.notificationhubs.models.PrivateLinkResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Private Link Arm Resource.
 */
@Fluent
public final class PrivateLinkResourceInner extends ProxyResource {
    /*
     * Represents properties of Private Link Resource.
     */
    @JsonProperty(value = "properties")
    private PrivateLinkResourceProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of PrivateLinkResourceInner class.
     */
    public PrivateLinkResourceInner() {
    }

    /**
     * Get the properties property: Represents properties of Private Link Resource.
     * 
     * @return the properties value.
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Represents properties of Private Link Resource.
     * 
     * @param properties the properties value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withProperties(PrivateLinkResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
