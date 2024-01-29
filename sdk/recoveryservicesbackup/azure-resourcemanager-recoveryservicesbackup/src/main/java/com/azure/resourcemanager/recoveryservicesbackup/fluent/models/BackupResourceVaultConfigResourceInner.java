// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceVaultConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Backup resource vault config details.
 */
@Fluent
public final class BackupResourceVaultConfigResourceInner extends Resource {
    /*
     * BackupResourceVaultConfigResource properties
     */
    @JsonProperty(value = "properties")
    private BackupResourceVaultConfig properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Creates an instance of BackupResourceVaultConfigResourceInner class.
     */
    public BackupResourceVaultConfigResourceInner() {
    }

    /**
     * Get the properties property: BackupResourceVaultConfigResource properties.
     * 
     * @return the properties value.
     */
    public BackupResourceVaultConfig properties() {
        return this.properties;
    }

    /**
     * Set the properties property: BackupResourceVaultConfigResource properties.
     * 
     * @param properties the properties value to set.
     * @return the BackupResourceVaultConfigResourceInner object itself.
     */
    public BackupResourceVaultConfigResourceInner withProperties(BackupResourceVaultConfig properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: Optional ETag.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Optional ETag.
     * 
     * @param etag the etag value to set.
     * @return the BackupResourceVaultConfigResourceInner object itself.
     */
    public BackupResourceVaultConfigResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupResourceVaultConfigResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupResourceVaultConfigResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
