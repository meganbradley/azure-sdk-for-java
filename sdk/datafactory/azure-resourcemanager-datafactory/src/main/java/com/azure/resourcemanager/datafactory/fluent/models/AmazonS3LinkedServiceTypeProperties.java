// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Amazon S3 linked service properties. */
@Fluent
public final class AmazonS3LinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AmazonS3LinkedServiceTypeProperties.class);

    /*
     * The authentication type of S3. Allowed value: AccessKey (default) or
     * TemporarySecurityCredentials. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "authenticationType")
    private Object authenticationType;

    /*
     * The access key identifier of the Amazon S3 Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "accessKeyId")
    private Object accessKeyId;

    /*
     * The secret access key of the Amazon S3 Identity and Access Management
     * (IAM) user.
     */
    @JsonProperty(value = "secretAccessKey")
    private SecretBase secretAccessKey;

    /*
     * This value specifies the endpoint to access with the S3 Connector. This
     * is an optional property; change it only if you want to try a different
     * service endpoint or want to switch between https and http. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "serviceUrl")
    private Object serviceUrl;

    /*
     * The session token for the S3 temporary security credential.
     */
    @JsonProperty(value = "sessionToken")
    private SecretBase sessionToken;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the authenticationType property: The authentication type of S3. Allowed value: AccessKey (default) or
     * TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type of S3. Allowed value: AccessKey (default) or
     * TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the AmazonS3LinkedServiceTypeProperties object itself.
     */
    public AmazonS3LinkedServiceTypeProperties withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the accessKeyId property: The access key identifier of the Amazon S3 Identity and Access Management (IAM)
     * user. Type: string (or Expression with resultType string).
     *
     * @return the accessKeyId value.
     */
    public Object accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Set the accessKeyId property: The access key identifier of the Amazon S3 Identity and Access Management (IAM)
     * user. Type: string (or Expression with resultType string).
     *
     * @param accessKeyId the accessKeyId value to set.
     * @return the AmazonS3LinkedServiceTypeProperties object itself.
     */
    public AmazonS3LinkedServiceTypeProperties withAccessKeyId(Object accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Get the secretAccessKey property: The secret access key of the Amazon S3 Identity and Access Management (IAM)
     * user.
     *
     * @return the secretAccessKey value.
     */
    public SecretBase secretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * Set the secretAccessKey property: The secret access key of the Amazon S3 Identity and Access Management (IAM)
     * user.
     *
     * @param secretAccessKey the secretAccessKey value to set.
     * @return the AmazonS3LinkedServiceTypeProperties object itself.
     */
    public AmazonS3LinkedServiceTypeProperties withSecretAccessKey(SecretBase secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * Get the serviceUrl property: This value specifies the endpoint to access with the S3 Connector. This is an
     * optional property; change it only if you want to try a different service endpoint or want to switch between https
     * and http. Type: string (or Expression with resultType string).
     *
     * @return the serviceUrl value.
     */
    public Object serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: This value specifies the endpoint to access with the S3 Connector. This is an
     * optional property; change it only if you want to try a different service endpoint or want to switch between https
     * and http. Type: string (or Expression with resultType string).
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the AmazonS3LinkedServiceTypeProperties object itself.
     */
    public AmazonS3LinkedServiceTypeProperties withServiceUrl(Object serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the sessionToken property: The session token for the S3 temporary security credential.
     *
     * @return the sessionToken value.
     */
    public SecretBase sessionToken() {
        return this.sessionToken;
    }

    /**
     * Set the sessionToken property: The session token for the S3 temporary security credential.
     *
     * @param sessionToken the sessionToken value to set.
     * @return the AmazonS3LinkedServiceTypeProperties object itself.
     */
    public AmazonS3LinkedServiceTypeProperties withSessionToken(SecretBase sessionToken) {
        this.sessionToken = sessionToken;
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
     * @return the AmazonS3LinkedServiceTypeProperties object itself.
     */
    public AmazonS3LinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secretAccessKey() != null) {
            secretAccessKey().validate();
        }
        if (sessionToken() != null) {
            sessionToken().validate();
        }
    }
}
