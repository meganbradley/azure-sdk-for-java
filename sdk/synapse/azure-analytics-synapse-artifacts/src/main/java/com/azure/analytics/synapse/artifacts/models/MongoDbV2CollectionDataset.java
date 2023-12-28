// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * The MongoDB database dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDbV2Collection")
@JsonFlatten
@Fluent
public class MongoDbV2CollectionDataset extends Dataset {
    /*
     * The collection name of the MongoDB database. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.collection", required = true)
    private Object collection;

    /**
     * Creates an instance of MongoDbV2CollectionDataset class.
     */
    public MongoDbV2CollectionDataset() {
    }

    /**
     * Get the collection property: The collection name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     * 
     * @return the collection value.
     */
    public Object getCollection() {
        return this.collection;
    }

    /**
     * Set the collection property: The collection name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     * 
     * @param collection the collection value to set.
     * @return the MongoDbV2CollectionDataset object itself.
     */
    public MongoDbV2CollectionDataset setCollection(Object collection) {
        this.collection = collection;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbV2CollectionDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbV2CollectionDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbV2CollectionDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbV2CollectionDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbV2CollectionDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbV2CollectionDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbV2CollectionDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
