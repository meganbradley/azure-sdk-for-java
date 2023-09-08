// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The encryption settings on the storage account. */
@Fluent
public final class Encryption {
    /*
     * List of services which support encryption.
     */
    @JsonProperty(value = "services")
    private EncryptionServices services;

    /*
     * The encryption keySource (provider). Possible values (case-insensitive):  Microsoft.Storage, Microsoft.Keyvault
     */
    @JsonProperty(value = "keySource")
    private KeySource keySource;

    /*
     * A boolean indicating whether or not the service applies a secondary layer of encryption with platform managed
     * keys for data at rest.
     */
    @JsonProperty(value = "requireInfrastructureEncryption")
    private Boolean requireInfrastructureEncryption;

    /*
     * Properties provided by key vault.
     */
    @JsonProperty(value = "keyvaultproperties")
    private KeyVaultProperties keyVaultProperties;

    /*
     * The identity to be used with service-side encryption at rest.
     */
    @JsonProperty(value = "identity")
    private EncryptionIdentity encryptionIdentity;

    /** Creates an instance of Encryption class. */
    public Encryption() {
    }

    /**
     * Get the services property: List of services which support encryption.
     *
     * @return the services value.
     */
    public EncryptionServices services() {
        return this.services;
    }

    /**
     * Set the services property: List of services which support encryption.
     *
     * @param services the services value to set.
     * @return the Encryption object itself.
     */
    public Encryption withServices(EncryptionServices services) {
        this.services = services;
        return this;
    }

    /**
     * Get the keySource property: The encryption keySource (provider). Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.Keyvault.
     *
     * @return the keySource value.
     */
    public KeySource keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource property: The encryption keySource (provider). Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.Keyvault.
     *
     * @param keySource the keySource value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeySource(KeySource keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     *
     * @return the requireInfrastructureEncryption value.
     */
    public Boolean requireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }

    /**
     * Set the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     *
     * @param requireInfrastructureEncryption the requireInfrastructureEncryption value to set.
     * @return the Encryption object itself.
     */
    public Encryption withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        return this;
    }

    /**
     * Get the keyVaultProperties property: Properties provided by key vault.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: Properties provided by key vault.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the encryptionIdentity property: The identity to be used with service-side encryption at rest.
     *
     * @return the encryptionIdentity value.
     */
    public EncryptionIdentity encryptionIdentity() {
        return this.encryptionIdentity;
    }

    /**
     * Set the encryptionIdentity property: The identity to be used with service-side encryption at rest.
     *
     * @param encryptionIdentity the encryptionIdentity value to set.
     * @return the Encryption object itself.
     */
    public Encryption withEncryptionIdentity(EncryptionIdentity encryptionIdentity) {
        this.encryptionIdentity = encryptionIdentity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (services() != null) {
            services().validate();
        }
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
        if (encryptionIdentity() != null) {
            encryptionIdentity().validate();
        }
    }
}
