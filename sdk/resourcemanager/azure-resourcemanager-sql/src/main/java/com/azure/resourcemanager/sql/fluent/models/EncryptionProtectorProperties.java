// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.ServerKeyType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for an encryption protector execution. */
@Fluent
public final class EncryptionProtectorProperties {
    /*
     * Subregion of the encryption protector.
     */
    @JsonProperty(value = "subregion", access = JsonProperty.Access.WRITE_ONLY)
    private String subregion;

    /*
     * The name of the server key.
     */
    @JsonProperty(value = "serverKeyName")
    private String serverKeyName;

    /*
     * The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     */
    @JsonProperty(value = "serverKeyType", required = true)
    private ServerKeyType serverKeyType;

    /*
     * The URI of the server key.
     */
    @JsonProperty(value = "uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /*
     * Thumbprint of the server key.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Get the subregion property: Subregion of the encryption protector.
     *
     * @return the subregion value.
     */
    public String subregion() {
        return this.subregion;
    }

    /**
     * Get the serverKeyName property: The name of the server key.
     *
     * @return the serverKeyName value.
     */
    public String serverKeyName() {
        return this.serverKeyName;
    }

    /**
     * Set the serverKeyName property: The name of the server key.
     *
     * @param serverKeyName the serverKeyName value to set.
     * @return the EncryptionProtectorProperties object itself.
     */
    public EncryptionProtectorProperties withServerKeyName(String serverKeyName) {
        this.serverKeyName = serverKeyName;
        return this;
    }

    /**
     * Get the serverKeyType property: The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.serverKeyType;
    }

    /**
     * Set the serverKeyType property: The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @param serverKeyType the serverKeyType value to set.
     * @return the EncryptionProtectorProperties object itself.
     */
    public EncryptionProtectorProperties withServerKeyType(ServerKeyType serverKeyType) {
        this.serverKeyType = serverKeyType;
        return this;
    }

    /**
     * Get the uri property: The URI of the server key.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Get the thumbprint property: Thumbprint of the server key.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serverKeyType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serverKeyType in model EncryptionProtectorProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EncryptionProtectorProperties.class);
}
