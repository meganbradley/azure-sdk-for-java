// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The user assigned Identity. */
@Immutable
public final class UserAssignedIdentity {

    /*
     * The ARM resource id of the user assigned identity
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * The client id of the user assigned identity.
     */
    @JsonProperty(value = "clientId", access = JsonProperty.Access.WRITE_ONLY)
    private String clientId;

    /*
     * The principal id of the user assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * Creates an instance of UserAssignedIdentity class.
     *
     * @param resourceId the resourceId value to set.
     */
    @JsonCreator
    private UserAssignedIdentity(@JsonProperty(value = "resourceId", required = true) String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Get the resourceId property: The ARM resource id of the user assigned identity.
     *
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Get the clientId property: The client id of the user assigned identity.
     *
     * @return the clientId value.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Get the principalId property: The principal id of the user assigned identity.
     *
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }
}
