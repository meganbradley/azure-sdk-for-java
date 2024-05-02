// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.models;

import com.azure.cosmos.implementation.Constants;
import com.azure.cosmos.implementation.JsonSerializable;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Vector Embedding Policy
 */
public final class CosmosVectorEmbeddingPolicy {

    private JsonSerializable jsonSerializable;
    /**
     * Paths for embeddings along with path-specific settings for the item.
     */
    @JsonProperty(Constants.Properties.VECTOR_EMBEDDINGS)
    private List<CosmosVectorEmbedding> cosmosVectorEmbeddings;

    /**
     * Constructor
     */
    public CosmosVectorEmbeddingPolicy() {
        this.jsonSerializable = new JsonSerializable();
    }

    /**
     * Gets the paths for embeddings along with path-specific settings for the item.
     *
     * @return the paths for embeddings along with path-specific settings for the item.
     */
    public List<CosmosVectorEmbedding> getVectorEmbeddings() {
        return this.cosmosVectorEmbeddings;
    }

    /**
     * Sets the paths for embeddings along with path-specific settings for the item.
     *
     * @param cosmosVectorEmbeddings paths for embeddings along with path-specific settings for the item.
     */
    public void setCosmosVectorEmbeddings(List<CosmosVectorEmbedding> cosmosVectorEmbeddings) {
        cosmosVectorEmbeddings.forEach(embedding -> {
            if (embedding == null) {
                throw new NullPointerException("Embedding cannot be null.");
            }
        });
        this.cosmosVectorEmbeddings = cosmosVectorEmbeddings;
//        this.jsonSerializable.set(Constants.Properties.VECTOR_EMBEDDINGS, cosmosVectorEmbeddings);
    }

}
