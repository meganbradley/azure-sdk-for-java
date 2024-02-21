// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The base backup engine class. All workload specific backup engines derive from this class.
 */
@Fluent
public final class BackupEngineBaseResourceInner extends Resource {
    /*
     * BackupEngineBaseResource properties
     */
    @JsonProperty(value = "properties")
    private BackupEngineBase properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Creates an instance of BackupEngineBaseResourceInner class.
     */
    public BackupEngineBaseResourceInner() {
    }

    /**
     * Get the properties property: BackupEngineBaseResource properties.
     * 
     * @return the properties value.
     */
    public BackupEngineBase properties() {
        return this.properties;
    }

    /**
     * Set the properties property: BackupEngineBaseResource properties.
     * 
     * @param properties the properties value to set.
     * @return the BackupEngineBaseResourceInner object itself.
     */
    public BackupEngineBaseResourceInner withProperties(BackupEngineBase properties) {
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
     * @return the BackupEngineBaseResourceInner object itself.
     */
    public BackupEngineBaseResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupEngineBaseResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupEngineBaseResourceInner withTags(Map<String, String> tags) {
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
