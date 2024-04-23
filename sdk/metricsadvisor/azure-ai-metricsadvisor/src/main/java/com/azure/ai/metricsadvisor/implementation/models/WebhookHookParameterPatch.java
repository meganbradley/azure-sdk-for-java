// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The WebhookHookParameterPatch model. */
@Fluent
public final class WebhookHookParameterPatch {
    /*
     * API address, will be called when alert is triggered, only support POST method via SSL
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /*
     * (Deprecated) The username, if using basic authentication
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * (Deprecated) The password, if using basic authentication
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * custom headers in api call
     */
    @JsonProperty(value = "headers")
    private Map<String, String> headers;

    /*
     * The certificate key, if using client certificate
     */
    @JsonProperty(value = "certificateKey")
    private String certificateKey;

    /*
     * The certificate password, if using client certificate
     */
    @JsonProperty(value = "certificatePassword")
    private String certificatePassword;

    /** Creates an instance of WebhookHookParameterPatch class. */
    public WebhookHookParameterPatch() {}

    /**
     * Get the endpoint property: API address, will be called when alert is triggered, only support POST method via SSL.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: API address, will be called when alert is triggered, only support POST method via SSL.
     *
     * @param endpoint the endpoint value to set.
     * @return the WebhookHookParameterPatch object itself.
     */
    public WebhookHookParameterPatch setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the username property: (Deprecated) The username, if using basic authentication.
     *
     * @return the username value.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username property: (Deprecated) The username, if using basic authentication.
     *
     * @param username the username value to set.
     * @return the WebhookHookParameterPatch object itself.
     */
    public WebhookHookParameterPatch setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: (Deprecated) The password, if using basic authentication.
     *
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: (Deprecated) The password, if using basic authentication.
     *
     * @param password the password value to set.
     * @return the WebhookHookParameterPatch object itself.
     */
    public WebhookHookParameterPatch setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the headers property: custom headers in api call.
     *
     * @return the headers value.
     */
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * Set the headers property: custom headers in api call.
     *
     * @param headers the headers value to set.
     * @return the WebhookHookParameterPatch object itself.
     */
    public WebhookHookParameterPatch setHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the certificateKey property: The certificate key, if using client certificate.
     *
     * @return the certificateKey value.
     */
    public String getCertificateKey() {
        return this.certificateKey;
    }

    /**
     * Set the certificateKey property: The certificate key, if using client certificate.
     *
     * @param certificateKey the certificateKey value to set.
     * @return the WebhookHookParameterPatch object itself.
     */
    public WebhookHookParameterPatch setCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
        return this;
    }

    /**
     * Get the certificatePassword property: The certificate password, if using client certificate.
     *
     * @return the certificatePassword value.
     */
    public String getCertificatePassword() {
        return this.certificatePassword;
    }

    /**
     * Set the certificatePassword property: The certificate password, if using client certificate.
     *
     * @param certificatePassword the certificatePassword value to set.
     * @return the WebhookHookParameterPatch object itself.
     */
    public WebhookHookParameterPatch setCertificatePassword(String certificatePassword) {
        this.certificatePassword = certificatePassword;
        return this;
    }
}
