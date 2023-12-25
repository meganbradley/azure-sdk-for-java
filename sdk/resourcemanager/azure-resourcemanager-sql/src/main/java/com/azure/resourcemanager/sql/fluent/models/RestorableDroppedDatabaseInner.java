// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.BackupStorageRedundancy;
import com.azure.resourcemanager.sql.models.DatabaseKey;
import com.azure.resourcemanager.sql.models.Sku;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * A restorable dropped database resource.
 */
@Fluent
public final class RestorableDroppedDatabaseInner extends ProxyResource {
    /*
     * The name and tier of the SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private RestorableDroppedDatabaseProperties innerProperties;

    /**
     * Creates an instance of RestorableDroppedDatabaseInner class.
     */
    public RestorableDroppedDatabaseInner() {
    }

    /**
     * Get the sku property: The name and tier of the SKU.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The name and tier of the SKU.
     * 
     * @param sku the sku value to set.
     * @return the RestorableDroppedDatabaseInner object itself.
     */
    public RestorableDroppedDatabaseInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     * 
     * @param location the location value to set.
     * @return the RestorableDroppedDatabaseInner object itself.
     */
    public RestorableDroppedDatabaseInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the RestorableDroppedDatabaseInner object itself.
     */
    public RestorableDroppedDatabaseInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private RestorableDroppedDatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the databaseName property: The name of the database.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Get the maxSizeBytes property: The max size of the database expressed in bytes.
     * 
     * @return the maxSizeBytes value.
     */
    public Long maxSizeBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().maxSizeBytes();
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the deletionDate property: The deletion date of the database (ISO8601 format).
     * 
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.innerProperties() == null ? null : this.innerProperties().deletionDate();
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
     * 
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.innerProperties() == null ? null : this.innerProperties().earliestRestoreDate();
    }

    /**
     * Get the backupStorageRedundancy property: The storage account type used to store backups for this database.
     * 
     * @return the backupStorageRedundancy value.
     */
    public BackupStorageRedundancy backupStorageRedundancy() {
        return this.innerProperties() == null ? null : this.innerProperties().backupStorageRedundancy();
    }

    /**
     * Get the keys property: The resource ids of the user assigned identities to use.
     * 
     * @return the keys value.
     */
    public Map<String, DatabaseKey> keys() {
        return this.innerProperties() == null ? null : this.innerProperties().keys();
    }

    /**
     * Set the keys property: The resource ids of the user assigned identities to use.
     * 
     * @param keys the keys value to set.
     * @return the RestorableDroppedDatabaseInner object itself.
     */
    public RestorableDroppedDatabaseInner withKeys(Map<String, DatabaseKey> keys) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestorableDroppedDatabaseProperties();
        }
        this.innerProperties().withKeys(keys);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
