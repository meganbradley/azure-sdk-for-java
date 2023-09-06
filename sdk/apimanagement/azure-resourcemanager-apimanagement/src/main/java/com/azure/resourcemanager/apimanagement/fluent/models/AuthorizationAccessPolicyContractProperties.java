// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authorization Access Policy details. */
@Fluent
public final class AuthorizationAccessPolicyContractProperties {
    /*
     * The Tenant Id
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The Object Id
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /** Creates an instance of AuthorizationAccessPolicyContractProperties class. */
    public AuthorizationAccessPolicyContractProperties() {
    }

    /**
     * Get the tenantId property: The Tenant Id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The Tenant Id.
     *
     * @param tenantId the tenantId value to set.
     * @return the AuthorizationAccessPolicyContractProperties object itself.
     */
    public AuthorizationAccessPolicyContractProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the objectId property: The Object Id.
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: The Object Id.
     *
     * @param objectId the objectId value to set.
     * @return the AuthorizationAccessPolicyContractProperties object itself.
     */
    public AuthorizationAccessPolicyContractProperties withObjectId(String objectId) {
        this.objectId = objectId;
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
