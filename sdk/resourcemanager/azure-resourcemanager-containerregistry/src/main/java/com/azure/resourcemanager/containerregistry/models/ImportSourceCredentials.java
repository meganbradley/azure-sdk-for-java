// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImportSourceCredentials model.
 */
@Fluent
public final class ImportSourceCredentials {
    /*
     * The username to authenticate with the source registry.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * The password used to authenticate with the source registry.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Creates an instance of ImportSourceCredentials class.
     */
    public ImportSourceCredentials() {
    }

    /**
     * Get the username property: The username to authenticate with the source registry.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username to authenticate with the source registry.
     * 
     * @param username the username value to set.
     * @return the ImportSourceCredentials object itself.
     */
    public ImportSourceCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password used to authenticate with the source registry.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password used to authenticate with the source registry.
     * 
     * @param password the password value to set.
     * @return the ImportSourceCredentials object itself.
     */
    public ImportSourceCredentials withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property password in model ImportSourceCredentials"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImportSourceCredentials.class);
}
