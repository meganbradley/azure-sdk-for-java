// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SASTokenParameter model. */
@Fluent
public final class SASTokenParameter {
    /*
     * Azure Blob storage container Uri
     */
    @JsonProperty(value = "storageResourceUri", required = true)
    private String storageResourceUri;

    /*
     * The SAS token pointing to an Azure Blob storage container
     */
    @JsonProperty(value = "token", required = true)
    private String token;

    /** Creates an instance of SASTokenParameter class. */
    public SASTokenParameter() {}

    /**
     * Get the storageResourceUri property: Azure Blob storage container Uri.
     *
     * @return the storageResourceUri value.
     */
    public String getStorageResourceUri() {
        return this.storageResourceUri;
    }

    /**
     * Set the storageResourceUri property: Azure Blob storage container Uri.
     *
     * @param storageResourceUri the storageResourceUri value to set.
     * @return the SASTokenParameter object itself.
     */
    public SASTokenParameter setStorageResourceUri(String storageResourceUri) {
        this.storageResourceUri = storageResourceUri;
        return this;
    }

    /**
     * Get the token property: The SAS token pointing to an Azure Blob storage container.
     *
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token property: The SAS token pointing to an Azure Blob storage container.
     *
     * @param token the token value to set.
     * @return the SASTokenParameter object itself.
     */
    public SASTokenParameter setToken(String token) {
        this.token = token;
        return this;
    }
}
