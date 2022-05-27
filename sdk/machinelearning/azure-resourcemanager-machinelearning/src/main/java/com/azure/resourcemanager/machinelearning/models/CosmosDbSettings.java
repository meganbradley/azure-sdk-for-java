// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CosmosDbSettings model. */
@Fluent
public final class CosmosDbSettings {
    /*
     * The throughput of the collections in cosmosdb database
     */
    @JsonProperty(value = "collectionsThroughput")
    private Integer collectionsThroughput;

    /**
     * Get the collectionsThroughput property: The throughput of the collections in cosmosdb database.
     *
     * @return the collectionsThroughput value.
     */
    public Integer collectionsThroughput() {
        return this.collectionsThroughput;
    }

    /**
     * Set the collectionsThroughput property: The throughput of the collections in cosmosdb database.
     *
     * @param collectionsThroughput the collectionsThroughput value to set.
     * @return the CosmosDbSettings object itself.
     */
    public CosmosDbSettings withCollectionsThroughput(Integer collectionsThroughput) {
        this.collectionsThroughput = collectionsThroughput;
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
