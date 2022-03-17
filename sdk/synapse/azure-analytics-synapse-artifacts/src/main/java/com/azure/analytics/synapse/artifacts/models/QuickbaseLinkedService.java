// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Linked service for Quickbase. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Quickbase")
@JsonFlatten
@Fluent
public class QuickbaseLinkedService extends LinkedService {
    /*
     * The url to connect Quickbase source. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * The user token for the Quickbase source.
     */
    @JsonProperty(value = "typeProperties.userToken", required = true)
    private SecretBase userToken;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the url property: The url to connect Quickbase source. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The url to connect Quickbase source. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the QuickbaseLinkedService object itself.
     */
    public QuickbaseLinkedService setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the userToken property: The user token for the Quickbase source.
     *
     * @return the userToken value.
     */
    public SecretBase getUserToken() {
        return this.userToken;
    }

    /**
     * Set the userToken property: The user token for the Quickbase source.
     *
     * @param userToken the userToken value to set.
     * @return the QuickbaseLinkedService object itself.
     */
    public QuickbaseLinkedService setUserToken(SecretBase userToken) {
        this.userToken = userToken;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the QuickbaseLinkedService object itself.
     */
    public QuickbaseLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
