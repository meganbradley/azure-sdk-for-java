// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.GoogleBigQueryAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Google BigQuery service linked service properties. */
@Fluent
public final class GoogleBigQueryLinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GoogleBigQueryLinkedServiceTypeProperties.class);

    /*
     * The default BigQuery project to query against.
     */
    @JsonProperty(value = "project", required = true)
    private Object project;

    /*
     * A comma-separated list of public BigQuery projects to access.
     */
    @JsonProperty(value = "additionalProjects")
    private Object additionalProjects;

    /*
     * Whether to request access to Google Drive. Allowing Google Drive access
     * enables support for federated tables that combine BigQuery data with
     * data from Google Drive. The default value is false.
     */
    @JsonProperty(value = "requestGoogleDriveScope")
    private Object requestGoogleDriveScope;

    /*
     * The OAuth 2.0 authentication mechanism used for authentication.
     * ServiceAuthentication can only be used on self-hosted IR.
     */
    @JsonProperty(value = "authenticationType", required = true)
    private GoogleBigQueryAuthenticationType authenticationType;

    /*
     * The refresh token obtained from Google for authorizing access to
     * BigQuery for UserAuthentication.
     */
    @JsonProperty(value = "refreshToken")
    private SecretBase refreshToken;

    /*
     * The client id of the google application used to acquire the refresh
     * token. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "clientId")
    private Object clientId;

    /*
     * The client secret of the google application used to acquire the refresh
     * token.
     */
    @JsonProperty(value = "clientSecret")
    private SecretBase clientSecret;

    /*
     * The service account email ID that is used for ServiceAuthentication and
     * can only be used on self-hosted IR.
     */
    @JsonProperty(value = "email")
    private Object email;

    /*
     * The full path to the .p12 key file that is used to authenticate the
     * service account email address and can only be used on self-hosted IR.
     */
    @JsonProperty(value = "keyFilePath")
    private Object keyFilePath;

    /*
     * The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be
     * set when using SSL on self-hosted IR. The default value is the
     * cacerts.pem file installed with the IR.
     */
    @JsonProperty(value = "trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     */
    @JsonProperty(value = "useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the project property: The default BigQuery project to query against.
     *
     * @return the project value.
     */
    public Object project() {
        return this.project;
    }

    /**
     * Set the project property: The default BigQuery project to query against.
     *
     * @param project the project value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withProject(Object project) {
        this.project = project;
        return this;
    }

    /**
     * Get the additionalProjects property: A comma-separated list of public BigQuery projects to access.
     *
     * @return the additionalProjects value.
     */
    public Object additionalProjects() {
        return this.additionalProjects;
    }

    /**
     * Set the additionalProjects property: A comma-separated list of public BigQuery projects to access.
     *
     * @param additionalProjects the additionalProjects value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withAdditionalProjects(Object additionalProjects) {
        this.additionalProjects = additionalProjects;
        return this;
    }

    /**
     * Get the requestGoogleDriveScope property: Whether to request access to Google Drive. Allowing Google Drive access
     * enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is
     * false.
     *
     * @return the requestGoogleDriveScope value.
     */
    public Object requestGoogleDriveScope() {
        return this.requestGoogleDriveScope;
    }

    /**
     * Set the requestGoogleDriveScope property: Whether to request access to Google Drive. Allowing Google Drive access
     * enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is
     * false.
     *
     * @param requestGoogleDriveScope the requestGoogleDriveScope value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withRequestGoogleDriveScope(Object requestGoogleDriveScope) {
        this.requestGoogleDriveScope = requestGoogleDriveScope;
        return this;
    }

    /**
     * Get the authenticationType property: The OAuth 2.0 authentication mechanism used for authentication.
     * ServiceAuthentication can only be used on self-hosted IR.
     *
     * @return the authenticationType value.
     */
    public GoogleBigQueryAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The OAuth 2.0 authentication mechanism used for authentication.
     * ServiceAuthentication can only be used on self-hosted IR.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withAuthenticationType(
        GoogleBigQueryAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
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
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withRefreshToken(SecretBase refreshToken) {
        this.refreshToken = refreshToken;
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
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withClientId(Object clientId) {
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
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the email property: The service account email ID that is used for ServiceAuthentication and can only be used
     * on self-hosted IR.
     *
     * @return the email value.
     */
    public Object email() {
        return this.email;
    }

    /**
     * Set the email property: The service account email ID that is used for ServiceAuthentication and can only be used
     * on self-hosted IR.
     *
     * @param email the email value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withEmail(Object email) {
        this.email = email;
        return this;
    }

    /**
     * Get the keyFilePath property: The full path to the .p12 key file that is used to authenticate the service account
     * email address and can only be used on self-hosted IR.
     *
     * @return the keyFilePath value.
     */
    public Object keyFilePath() {
        return this.keyFilePath;
    }

    /**
     * Set the keyFilePath property: The full path to the .p12 key file that is used to authenticate the service account
     * email address and can only be used on self-hosted IR.
     *
     * @param keyFilePath the keyFilePath value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withKeyFilePath(Object keyFilePath) {
        this.keyFilePath = keyFilePath;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value.
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the GoogleBigQueryLinkedServiceTypeProperties object itself.
     */
    public GoogleBigQueryLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (project() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property project in model GoogleBigQueryLinkedServiceTypeProperties"));
        }
        if (authenticationType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authenticationType in model"
                            + " GoogleBigQueryLinkedServiceTypeProperties"));
        }
        if (refreshToken() != null) {
            refreshToken().validate();
        }
        if (clientSecret() != null) {
            clientSecret().validate();
        }
    }
}
