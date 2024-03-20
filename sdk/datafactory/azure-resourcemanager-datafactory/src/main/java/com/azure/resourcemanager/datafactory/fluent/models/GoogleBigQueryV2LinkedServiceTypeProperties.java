// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.GoogleBigQueryV2AuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Google BigQuery service linked service properties.
 */
@Fluent
public final class GoogleBigQueryV2LinkedServiceTypeProperties {
    /*
     * The default BigQuery project id to query against. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "projectId", required = true)
    private Object projectId;

    /*
     * The OAuth 2.0 authentication mechanism used for authentication.
     */
    @JsonProperty(value = "authenticationType", required = true)
    private GoogleBigQueryV2AuthenticationType authenticationType;

    /*
     * The client id of the google application used to acquire the refresh token. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "clientId")
    private Object clientId;

    /*
     * The client secret of the google application used to acquire the refresh token.
     */
    @JsonProperty(value = "clientSecret")
    private SecretBase clientSecret;

    /*
     * The refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     */
    @JsonProperty(value = "refreshToken")
    private SecretBase refreshToken;

    /*
     * The content of the .json key file that is used to authenticate the service account. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "keyFileContent")
    private SecretBase keyFileContent;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of GoogleBigQueryV2LinkedServiceTypeProperties class.
     */
    public GoogleBigQueryV2LinkedServiceTypeProperties() {
    }

    /**
     * Get the projectId property: The default BigQuery project id to query against. Type: string (or Expression with
     * resultType string).
     * 
     * @return the projectId value.
     */
    public Object projectId() {
        return this.projectId;
    }

    /**
     * Set the projectId property: The default BigQuery project id to query against. Type: string (or Expression with
     * resultType string).
     * 
     * @param projectId the projectId value to set.
     * @return the GoogleBigQueryV2LinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryV2LinkedServiceTypeProperties withProjectId(Object projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get the authenticationType property: The OAuth 2.0 authentication mechanism used for authentication.
     * 
     * @return the authenticationType value.
     */
    public GoogleBigQueryV2AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The OAuth 2.0 authentication mechanism used for authentication.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the GoogleBigQueryV2LinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryV2LinkedServiceTypeProperties
        withAuthenticationType(GoogleBigQueryV2AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the clientId property: The client id of the google application used to acquire the refresh token. Type:
     * string (or Expression with resultType string).
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client id of the google application used to acquire the refresh token. Type:
     * string (or Expression with resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the GoogleBigQueryV2LinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryV2LinkedServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret of the google application used to acquire the refresh token.
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret of the google application used to acquire the refresh token.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the GoogleBigQueryV2LinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryV2LinkedServiceTypeProperties withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the refreshToken property: The refresh token obtained from Google for authorizing access to BigQuery for
     * UserAuthentication.
     * 
     * @return the refreshToken value.
     */
    public SecretBase refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: The refresh token obtained from Google for authorizing access to BigQuery for
     * UserAuthentication.
     * 
     * @param refreshToken the refreshToken value to set.
     * @return the GoogleBigQueryV2LinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryV2LinkedServiceTypeProperties withRefreshToken(SecretBase refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the keyFileContent property: The content of the .json key file that is used to authenticate the service
     * account. Type: string (or Expression with resultType string).
     * 
     * @return the keyFileContent value.
     */
    public SecretBase keyFileContent() {
        return this.keyFileContent;
    }

    /**
     * Set the keyFileContent property: The content of the .json key file that is used to authenticate the service
     * account. Type: string (or Expression with resultType string).
     * 
     * @param keyFileContent the keyFileContent value to set.
     * @return the GoogleBigQueryV2LinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryV2LinkedServiceTypeProperties withKeyFileContent(SecretBase keyFileContent) {
        this.keyFileContent = keyFileContent;
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
     * @return the GoogleBigQueryV2LinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryV2LinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (projectId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property projectId in model GoogleBigQueryV2LinkedServiceTypeProperties"));
        }
        if (authenticationType() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property authenticationType in model GoogleBigQueryV2LinkedServiceTypeProperties"));
        }
        if (clientSecret() != null) {
            clientSecret().validate();
        }
        if (refreshToken() != null) {
            refreshToken().validate();
        }
        if (keyFileContent() != null) {
            keyFileContent().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GoogleBigQueryV2LinkedServiceTypeProperties.class);
}
