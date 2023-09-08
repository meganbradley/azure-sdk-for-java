// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.storage.models.EncryptionScopeKeyVaultProperties;
import com.azure.resourcemanager.storage.models.EncryptionScopeSource;
import com.azure.resourcemanager.storage.models.EncryptionScopeState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Encryption Scope resource. */
@Fluent
public final class EncryptionScopeInner extends ProxyResource {
    /*
     * Properties of the encryption scope.
     */
    @JsonProperty(value = "properties")
    private EncryptionScopeProperties innerEncryptionScopeProperties;

    /** Creates an instance of EncryptionScopeInner class. */
    public EncryptionScopeInner() {
    }

    /**
     * Get the innerEncryptionScopeProperties property: Properties of the encryption scope.
     *
     * @return the innerEncryptionScopeProperties value.
     */
    private EncryptionScopeProperties innerEncryptionScopeProperties() {
        return this.innerEncryptionScopeProperties;
    }

    /**
     * Get the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     *
     * @return the source value.
     */
    public EncryptionScopeSource source() {
        return this.innerEncryptionScopeProperties() == null ? null : this.innerEncryptionScopeProperties().source();
    }

    /**
     * Set the source property: The provider for the encryption scope. Possible values (case-insensitive):
     * Microsoft.Storage, Microsoft.KeyVault.
     *
     * @param source the source value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withSource(EncryptionScopeSource source) {
        if (this.innerEncryptionScopeProperties() == null) {
            this.innerEncryptionScopeProperties = new EncryptionScopeProperties();
        }
        this.innerEncryptionScopeProperties().withSource(source);
        return this;
    }

    /**
     * Get the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     *
     * @return the state value.
     */
    public EncryptionScopeState state() {
        return this.innerEncryptionScopeProperties() == null ? null : this.innerEncryptionScopeProperties().state();
    }

    /**
     * Set the state property: The state of the encryption scope. Possible values (case-insensitive): Enabled, Disabled.
     *
     * @param state the state value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withState(EncryptionScopeState state) {
        if (this.innerEncryptionScopeProperties() == null) {
            this.innerEncryptionScopeProperties = new EncryptionScopeProperties();
        }
        this.innerEncryptionScopeProperties().withState(state);
        return this;
    }

    /**
     * Get the creationTime property: Gets the creation date and time of the encryption scope in UTC.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerEncryptionScopeProperties() == null
            ? null
            : this.innerEncryptionScopeProperties().creationTime();
    }

    /**
     * Get the lastModifiedTime property: Gets the last modification date and time of the encryption scope in UTC.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerEncryptionScopeProperties() == null
            ? null
            : this.innerEncryptionScopeProperties().lastModifiedTime();
    }

    /**
     * Get the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     *
     * @return the keyVaultProperties value.
     */
    public EncryptionScopeKeyVaultProperties keyVaultProperties() {
        return this.innerEncryptionScopeProperties() == null
            ? null
            : this.innerEncryptionScopeProperties().keyVaultProperties();
    }

    /**
     * Set the keyVaultProperties property: The key vault properties for the encryption scope. This is a required field
     * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withKeyVaultProperties(EncryptionScopeKeyVaultProperties keyVaultProperties) {
        if (this.innerEncryptionScopeProperties() == null) {
            this.innerEncryptionScopeProperties = new EncryptionScopeProperties();
        }
        this.innerEncryptionScopeProperties().withKeyVaultProperties(keyVaultProperties);
        return this;
    }

    /**
     * Get the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     *
     * @return the requireInfrastructureEncryption value.
     */
    public Boolean requireInfrastructureEncryption() {
        return this.innerEncryptionScopeProperties() == null
            ? null
            : this.innerEncryptionScopeProperties().requireInfrastructureEncryption();
    }

    /**
     * Set the requireInfrastructureEncryption property: A boolean indicating whether or not the service applies a
     * secondary layer of encryption with platform managed keys for data at rest.
     *
     * @param requireInfrastructureEncryption the requireInfrastructureEncryption value to set.
     * @return the EncryptionScopeInner object itself.
     */
    public EncryptionScopeInner withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        if (this.innerEncryptionScopeProperties() == null) {
            this.innerEncryptionScopeProperties = new EncryptionScopeProperties();
        }
        this.innerEncryptionScopeProperties().withRequireInfrastructureEncryption(requireInfrastructureEncryption);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerEncryptionScopeProperties() != null) {
            innerEncryptionScopeProperties().validate();
        }
    }
}
