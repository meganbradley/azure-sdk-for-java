// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.DatabaseKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * A recoverable database resource.
 */
@Fluent
public final class RecoverableDatabaseInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private RecoverableDatabaseProperties innerProperties;

    /**
     * Creates an instance of RecoverableDatabaseInner class.
     */
    public RecoverableDatabaseInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private RecoverableDatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the edition property: The edition of the database.
     * 
     * @return the edition value.
     */
    public String edition() {
        return this.innerProperties() == null ? null : this.innerProperties().edition();
    }

    /**
     * Get the serviceLevelObjective property: The service level objective name of the database.
     * 
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevelObjective();
    }

    /**
     * Get the elasticPoolName property: The elastic pool name of the database.
     * 
     * @return the elasticPoolName value.
     */
    public String elasticPoolName() {
        return this.innerProperties() == null ? null : this.innerProperties().elasticPoolName();
    }

    /**
     * Get the lastAvailableBackupDate property: The last available backup date.
     * 
     * @return the lastAvailableBackupDate value.
     */
    public OffsetDateTime lastAvailableBackupDate() {
        return this.innerProperties() == null ? null : this.innerProperties().lastAvailableBackupDate();
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
     * @return the RecoverableDatabaseInner object itself.
     */
    public RecoverableDatabaseInner withKeys(Map<String, DatabaseKey> keys) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecoverableDatabaseProperties();
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
