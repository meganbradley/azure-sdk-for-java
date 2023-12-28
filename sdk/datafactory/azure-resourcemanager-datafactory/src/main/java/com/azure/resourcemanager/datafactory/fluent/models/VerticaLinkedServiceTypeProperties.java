// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vertica linked service properties.
 */
@Fluent
public final class VerticaLinkedServiceTypeProperties {
    /*
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "connectionString")
    private Object connectionString;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    @JsonProperty(value = "pwd")
    private AzureKeyVaultSecretReference pwd;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of VerticaLinkedServiceTypeProperties class.
     */
    public VerticaLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the VerticaLinkedServiceTypeProperties object itself.
     */
    public VerticaLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the pwd property: The Azure key vault secret reference of password in connection string.
     * 
     * @return the pwd value.
     */
    public AzureKeyVaultSecretReference pwd() {
        return this.pwd;
    }

    /**
     * Set the pwd property: The Azure key vault secret reference of password in connection string.
     * 
     * @param pwd the pwd value to set.
     * @return the VerticaLinkedServiceTypeProperties object itself.
     */
    public VerticaLinkedServiceTypeProperties withPwd(AzureKeyVaultSecretReference pwd) {
        this.pwd = pwd;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the VerticaLinkedServiceTypeProperties object itself.
     */
    public VerticaLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pwd() != null) {
            pwd().validate();
        }
    }
}
