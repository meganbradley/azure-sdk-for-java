// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity used to authenticate with key vault.
 */
@Fluent
public final class EncryptionIdentity {
    /*
     * The principal ID (object ID) of the identity used to authenticate with key vault. Read-only.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The ARM resource identifier of the user assigned identity used to authenticate with key vault. Applicable if
     * identity.type has 'UserAssigned'. It should match key of identity.userAssignedIdentities.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /**
     * Creates an instance of EncryptionIdentity class.
     */
    public EncryptionIdentity() {
    }

    /**
     * Get the principalId property: The principal ID (object ID) of the identity used to authenticate with key vault.
     * Read-only.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the userAssignedIdentity property: The ARM resource identifier of the user assigned identity used to
     * authenticate with key vault. Applicable if identity.type has 'UserAssigned'. It should match key of
     * identity.userAssignedIdentities.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The ARM resource identifier of the user assigned identity used to
     * authenticate with key vault. Applicable if identity.type has 'UserAssigned'. It should match key of
     * identity.userAssignedIdentities.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the EncryptionIdentity object itself.
     */
    public EncryptionIdentity withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
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
