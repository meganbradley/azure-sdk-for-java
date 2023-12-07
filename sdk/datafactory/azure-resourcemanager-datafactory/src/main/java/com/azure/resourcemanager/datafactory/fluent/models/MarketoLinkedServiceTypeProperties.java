// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Marketo server linked service properties.
 */
@Fluent
public final class MarketoLinkedServiceTypeProperties {
    /*
     * The endpoint of the Marketo server. (i.e. 123-ABC-321.mktorest.com)
     */
    @JsonProperty(value = "endpoint", required = true)
    private Object endpoint;

    /*
     * The client Id of your Marketo service.
     */
    @JsonProperty(value = "clientId", required = true)
    private Object clientId;

    /*
     * The client secret of your Marketo service.
     */
    @JsonProperty(value = "clientSecret")
    private SecretBase clientSecret;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     */
    @JsonProperty(value = "useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true.
     */
    @JsonProperty(value = "useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     */
    @JsonProperty(value = "usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of MarketoLinkedServiceTypeProperties class.
     */
    public MarketoLinkedServiceTypeProperties() {
    }

    /**
     * Get the endpoint property: The endpoint of the Marketo server. (i.e. 123-ABC-321.mktorest.com).
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of the Marketo server. (i.e. 123-ABC-321.mktorest.com).
     * 
     * @param endpoint the endpoint value to set.
     * @return the MarketoLinkedServiceTypeProperties object itself.
     */
    public MarketoLinkedServiceTypeProperties withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the clientId property: The client Id of your Marketo service.
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client Id of your Marketo service.
     * 
     * @param clientId the clientId value to set.
     * @return the MarketoLinkedServiceTypeProperties object itself.
     */
    public MarketoLinkedServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret of your Marketo service.
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret of your Marketo service.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the MarketoLinkedServiceTypeProperties object itself.
     */
    public MarketoLinkedServiceTypeProperties withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the MarketoLinkedServiceTypeProperties object itself.
     */
    public MarketoLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the MarketoLinkedServiceTypeProperties object itself.
     */
    public MarketoLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     * 
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the MarketoLinkedServiceTypeProperties object itself.
     */
    public MarketoLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
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
     * @return the MarketoLinkedServiceTypeProperties object itself.
     */
    public MarketoLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoint() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property endpoint in model MarketoLinkedServiceTypeProperties"));
        }
        if (clientId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property clientId in model MarketoLinkedServiceTypeProperties"));
        }
        if (clientSecret() != null) {
            clientSecret().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MarketoLinkedServiceTypeProperties.class);
}
