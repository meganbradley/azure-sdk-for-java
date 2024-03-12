// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapVirtualInstanceProperties;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.UserAssignedServiceIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Define the Virtual Instance for SAP solutions resource.
 */
@Fluent
public final class SapVirtualInstanceInner extends Resource {
    /*
     * Managed service identity (user assigned identities)
     */
    @JsonProperty(value = "identity")
    private UserAssignedServiceIdentity identity;

    /*
     * Defines the Virtual Instance for SAP solutions resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private SapVirtualInstanceProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of SapVirtualInstanceInner class.
     */
    public SapVirtualInstanceInner() {
    }

    /**
     * Get the identity property: Managed service identity (user assigned identities).
     * 
     * @return the identity value.
     */
    public UserAssignedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (user assigned identities).
     * 
     * @param identity the identity value to set.
     * @return the SapVirtualInstanceInner object itself.
     */
    public SapVirtualInstanceInner withIdentity(UserAssignedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: Defines the Virtual Instance for SAP solutions resource properties.
     * 
     * @return the properties value.
     */
    public SapVirtualInstanceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Defines the Virtual Instance for SAP solutions resource properties.
     * 
     * @param properties the properties value to set.
     * @return the SapVirtualInstanceInner object itself.
     */
    public SapVirtualInstanceInner withProperties(SapVirtualInstanceProperties properties) {
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
     * {@inheritDoc}
     */
    @Override
    public SapVirtualInstanceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapVirtualInstanceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property properties in model SapVirtualInstanceInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapVirtualInstanceInner.class);
}
