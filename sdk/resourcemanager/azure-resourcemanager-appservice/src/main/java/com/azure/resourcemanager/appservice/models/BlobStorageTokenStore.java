// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration settings of the storage of the tokens if blob storage is used.
 */
@Fluent
public final class BlobStorageTokenStore {
    /*
     * The name of the app setting containing the SAS URL of the blob storage containing the tokens.
     */
    @JsonProperty(value = "sasUrlSettingName")
    private String sasUrlSettingName;

    /**
     * Creates an instance of BlobStorageTokenStore class.
     */
    public BlobStorageTokenStore() {
    }

    /**
     * Get the sasUrlSettingName property: The name of the app setting containing the SAS URL of the blob storage
     * containing the tokens.
     * 
     * @return the sasUrlSettingName value.
     */
    public String sasUrlSettingName() {
        return this.sasUrlSettingName;
    }

    /**
     * Set the sasUrlSettingName property: The name of the app setting containing the SAS URL of the blob storage
     * containing the tokens.
     * 
     * @param sasUrlSettingName the sasUrlSettingName value to set.
     * @return the BlobStorageTokenStore object itself.
     */
    public BlobStorageTokenStore withSasUrlSettingName(String sasUrlSettingName) {
        this.sasUrlSettingName = sasUrlSettingName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
