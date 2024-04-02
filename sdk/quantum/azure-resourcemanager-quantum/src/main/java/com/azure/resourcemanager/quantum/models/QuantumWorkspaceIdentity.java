// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed Identity information.
 */
@Fluent
public final class QuantumWorkspaceIdentity {
    /*
     * The principal ID of resource identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant ID of resource.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The identity type.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * Creates an instance of QuantumWorkspaceIdentity class.
     */
    public QuantumWorkspaceIdentity() {
    }

    /**
     * Get the principalId property: The principal ID of resource identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID of resource.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The identity type.
     * 
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     * 
     * @param type the type value to set.
     * @return the QuantumWorkspaceIdentity object itself.
     */
    public QuantumWorkspaceIdentity withType(ResourceIdentityType type) {
        this.type = type;
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
