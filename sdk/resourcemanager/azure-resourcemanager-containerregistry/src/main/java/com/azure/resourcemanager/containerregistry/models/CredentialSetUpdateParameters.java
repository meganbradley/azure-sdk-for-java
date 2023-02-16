// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.fluent.models.CredentialSetUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The parameters for updating a credential set. */
@Fluent
public final class CredentialSetUpdateParameters {
    /*
     * The properties of the credential set update parameters
     */
    @JsonProperty(value = "properties")
    private CredentialSetUpdateProperties innerProperties;

    /*
     * Identities associated with the resource. This is used to access the KeyVault secrets.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /** Creates an instance of CredentialSetUpdateParameters class. */
    public CredentialSetUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The properties of the credential set update parameters.
     *
     * @return the innerProperties value.
     */
    private CredentialSetUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: Identities associated with the resource. This is used to access the KeyVault secrets.
     *
     * @return the identity value.
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identities associated with the resource. This is used to access the KeyVault secrets.
     *
     * @param identity the identity value to set.
     * @return the CredentialSetUpdateParameters object itself.
     */
    public CredentialSetUpdateParameters withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the authCredentials property: List of authentication credentials stored for an upstream. Usually consists of
     * a primary and an optional secondary credential.
     *
     * @return the authCredentials value.
     */
    public List<AuthCredential> authCredentials() {
        return this.innerProperties() == null ? null : this.innerProperties().authCredentials();
    }

    /**
     * Set the authCredentials property: List of authentication credentials stored for an upstream. Usually consists of
     * a primary and an optional secondary credential.
     *
     * @param authCredentials the authCredentials value to set.
     * @return the CredentialSetUpdateParameters object itself.
     */
    public CredentialSetUpdateParameters withAuthCredentials(List<AuthCredential> authCredentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CredentialSetUpdateProperties();
        }
        this.innerProperties().withAuthCredentials(authCredentials);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
