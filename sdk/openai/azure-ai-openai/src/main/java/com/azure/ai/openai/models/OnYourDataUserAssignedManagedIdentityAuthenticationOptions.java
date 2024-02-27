// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The authentication options for Azure OpenAI On Your Data when using a user-assigned managed identity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("user_assigned_managed_identity")
@Immutable
public final class OnYourDataUserAssignedManagedIdentityAuthenticationOptions extends OnYourDataAuthenticationOptions {

    /*
     * The resource ID of the user-assigned managed identity to use for authentication.
     */
    @Generated
    @JsonProperty(value = "managed_identity_resource_id")
    private String managedIdentityResourceId;

    /**
     * Creates an instance of OnYourDataUserAssignedManagedIdentityAuthenticationOptions class.
     *
     * @param managedIdentityResourceId the managedIdentityResourceId value to set.
     */
    @Generated
    @JsonCreator
    public OnYourDataUserAssignedManagedIdentityAuthenticationOptions(
        @JsonProperty(value = "managed_identity_resource_id") String managedIdentityResourceId) {
        this.managedIdentityResourceId = managedIdentityResourceId;
    }

    /**
     * Get the managedIdentityResourceId property: The resource ID of the user-assigned managed identity to use for
     * authentication.
     *
     * @return the managedIdentityResourceId value.
     */
    @Generated
    public String getManagedIdentityResourceId() {
        return this.managedIdentityResourceId;
    }
}
