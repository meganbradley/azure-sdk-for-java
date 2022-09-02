// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the Update credential. */
@Fluent
public final class CredentialUpdateProperties {
    /*
     * Gets or sets the user name of the credential.
     */
    @JsonProperty(value = "userName")
    private String username;

    /*
     * Gets or sets the password of the credential.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Gets or sets the description of the credential.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the username property: Gets or sets the user name of the credential.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Gets or sets the user name of the credential.
     *
     * @param username the username value to set.
     * @return the CredentialUpdateProperties object itself.
     */
    public CredentialUpdateProperties withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Gets or sets the password of the credential.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Gets or sets the password of the credential.
     *
     * @param password the password value to set.
     * @return the CredentialUpdateProperties object itself.
     */
    public CredentialUpdateProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description of the credential.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description of the credential.
     *
     * @param description the description value to set.
     * @return the CredentialUpdateProperties object itself.
     */
    public CredentialUpdateProperties withDescription(String description) {
        this.description = description;
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
