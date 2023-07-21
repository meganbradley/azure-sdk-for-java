// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The basic authentication properties for the container registry resource. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BasicAuth")
@Fluent
public final class ContainerRegistryBasicCredentials extends ContainerRegistryCredentials {
    /*
     * The login server of the Container Registry.
     */
    @JsonProperty(value = "server", required = true)
    private String server;

    /*
     * The username of the Container Registry.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /*
     * The password of the Container Registry.
     */
    @JsonProperty(value = "password")
    private String password;

    /** Creates an instance of ContainerRegistryBasicCredentials class. */
    public ContainerRegistryBasicCredentials() {
    }

    /**
     * Get the server property: The login server of the Container Registry.
     *
     * @return the server value.
     */
    public String server() {
        return this.server;
    }

    /**
     * Set the server property: The login server of the Container Registry.
     *
     * @param server the server value to set.
     * @return the ContainerRegistryBasicCredentials object itself.
     */
    public ContainerRegistryBasicCredentials withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username property: The username of the Container Registry.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username of the Container Registry.
     *
     * @param username the username value to set.
     * @return the ContainerRegistryBasicCredentials object itself.
     */
    public ContainerRegistryBasicCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of the Container Registry.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password of the Container Registry.
     *
     * @param password the password value to set.
     * @return the ContainerRegistryBasicCredentials object itself.
     */
    public ContainerRegistryBasicCredentials withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (server() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property server in model ContainerRegistryBasicCredentials"));
        }
        if (username() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property username in model ContainerRegistryBasicCredentials"));
        }
        if (password() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property password in model ContainerRegistryBasicCredentials"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerRegistryBasicCredentials.class);
}
