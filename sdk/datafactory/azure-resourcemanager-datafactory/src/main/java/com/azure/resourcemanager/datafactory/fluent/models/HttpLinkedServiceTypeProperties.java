// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.HttpAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties specific to this linked service type.
 */
@Fluent
public final class HttpLinkedServiceTypeProperties {
    /*
     * The base URL of the HTTP endpoint, e.g. https://www.microsoft.com. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * The authentication type to be used to connect to the HTTP server.
     */
    @JsonProperty(value = "authenticationType")
    private HttpAuthenticationType authenticationType;

    /*
     * User name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userName")
    private Object username;

    /*
     * Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression
     * with resultType object).
     */
    @JsonProperty(value = "authHeaders")
    private Object authHeaders;

    /*
     * Base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with
     * ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "embeddedCertData")
    private Object embeddedCertData;

    /*
     * Thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises
     * copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be
     * specified. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "certThumbprint")
    private Object certThumbprint;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /*
     * If true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "enableServerCertificateValidation")
    private Object enableServerCertificateValidation;

    /**
     * Creates an instance of HttpLinkedServiceTypeProperties class.
     */
    public HttpLinkedServiceTypeProperties() {
    }

    /**
     * Get the url property: The base URL of the HTTP endpoint, e.g. https://www.microsoft.com. Type: string (or
     * Expression with resultType string).
     * 
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The base URL of the HTTP endpoint, e.g. https://www.microsoft.com. Type: string (or
     * Expression with resultType string).
     * 
     * @param url the url value to set.
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the HTTP server.
     * 
     * @return the authenticationType value.
     */
    public HttpAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the HTTP server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties withAuthenticationType(HttpAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: User name for Basic, Digest, or Windows authentication. Type: string (or Expression
     * with resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: User name for Basic, Digest, or Windows authentication. Type: string (or Expression
     * with resultType string).
     * 
     * @param username the username value to set.
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData
     * authentication.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData
     * authentication.
     * 
     * @param password the password value to set.
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: object (or Expression with resultType object).
     * 
     * @return the authHeaders value.
     */
    public Object authHeaders() {
        return this.authHeaders;
    }

    /**
     * Set the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: object (or Expression with resultType object).
     * 
     * @param authHeaders the authHeaders value to set.
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties withAuthHeaders(Object authHeaders) {
        this.authHeaders = authHeaders;
        return this;
    }

    /**
     * Get the embeddedCertData property: Base64 encoded certificate data for ClientCertificate authentication. For
     * on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password
     * should be specified. Type: string (or Expression with resultType string).
     * 
     * @return the embeddedCertData value.
     */
    public Object embeddedCertData() {
        return this.embeddedCertData;
    }

    /**
     * Set the embeddedCertData property: Base64 encoded certificate data for ClientCertificate authentication. For
     * on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password
     * should be specified. Type: string (or Expression with resultType string).
     * 
     * @param embeddedCertData the embeddedCertData value to set.
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties withEmbeddedCertData(Object embeddedCertData) {
        this.embeddedCertData = embeddedCertData;
        return this;
    }

    /**
     * Get the certThumbprint property: Thumbprint of certificate for ClientCertificate authentication. Only valid for
     * on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or
     * EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     * @return the certThumbprint value.
     */
    public Object certThumbprint() {
        return this.certThumbprint;
    }

    /**
     * Set the certThumbprint property: Thumbprint of certificate for ClientCertificate authentication. Only valid for
     * on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or
     * EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     * @param certThumbprint the certThumbprint value to set.
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties withCertThumbprint(Object certThumbprint) {
        this.certThumbprint = certThumbprint;
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
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the enableServerCertificateValidation property: If true, validate the HTTPS server SSL certificate. Default
     * value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableServerCertificateValidation value.
     */
    public Object enableServerCertificateValidation() {
        return this.enableServerCertificateValidation;
    }

    /**
     * Set the enableServerCertificateValidation property: If true, validate the HTTPS server SSL certificate. Default
     * value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set.
     * @return the HttpLinkedServiceTypeProperties object itself.
     */
    public HttpLinkedServiceTypeProperties
        withEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property url in model HttpLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HttpLinkedServiceTypeProperties.class);
}
