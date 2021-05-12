// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The object that contains details of encryption used on the workspace. */
@Fluent
public final class Encryption {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Encryption.class);

    /*
     * The encryption keySource (provider). Possible values (case-insensitive):
     * Default, Microsoft.Keyvault
     */
    @JsonProperty(value = "keySource")
    private KeySource keySource;

    /*
     * The name of KeyVault key.
     */
    @JsonProperty(value = "KeyName")
    private String keyName;

    /*
     * The version of KeyVault key.
     */
    @JsonProperty(value = "keyversion")
    private String keyVersion;

    /*
     * The Uri of KeyVault.
     */
    @JsonProperty(value = "keyvaulturi")
    private String keyVaultUri;

    /**
     * Get the keySource property: The encryption keySource (provider). Possible values (case-insensitive): Default,
     * Microsoft.Keyvault.
     *
     * @return the keySource value.
     */
    public KeySource keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource property: The encryption keySource (provider). Possible values (case-insensitive): Default,
     * Microsoft.Keyvault.
     *
     * @param keySource the keySource value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeySource(KeySource keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the keyName property: The name of KeyVault key.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of KeyVault key.
     *
     * @param keyName the keyName value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The version of KeyVault key.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The version of KeyVault key.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the keyVaultUri property: The Uri of KeyVault.
     *
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: The Uri of KeyVault.
     *
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
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
