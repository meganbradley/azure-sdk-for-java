// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MongoDB database dataset properties.
 */
@Fluent
public final class MongoDbV2CollectionDatasetTypeProperties {
    /*
     * The collection name of the MongoDB database. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "collection", required = true)
    private Object collection;

    /**
     * Creates an instance of MongoDbV2CollectionDatasetTypeProperties class.
     */
    public MongoDbV2CollectionDatasetTypeProperties() {
    }

    /**
     * Get the collection property: The collection name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     * 
     * @return the collection value.
     */
    public Object collection() {
        return this.collection;
    }

    /**
     * Set the collection property: The collection name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     * 
     * @param collection the collection value to set.
     * @return the MongoDbV2CollectionDatasetTypeProperties object itself.
     */
    public MongoDbV2CollectionDatasetTypeProperties withCollection(Object collection) {
        this.collection = collection;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (collection() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property collection in model MongoDbV2CollectionDatasetTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbV2CollectionDatasetTypeProperties.class);
}
