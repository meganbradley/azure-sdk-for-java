// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package azure.ai.openai.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Expected response schema to embeddings request. */
@Immutable
public final class Embeddings {
    /*
     * Type of the data field
     */
    @JsonProperty(value = "object", required = true)
    private String object = "list";

    /*
     * Embedding values for the prompts submitted in the request
     */
    @JsonProperty(value = "data", required = true)
    private List<EmbeddingItem> data;

    /*
     * ID of the model to use
     */
    @JsonProperty(value = "model")
    private String model;

    /*
     * Usage counts for tokens input using the embeddings API
     */
    @JsonProperty(value = "usage", required = true)
    private EmbeddingsUsage usage;

    /**
     * Creates an instance of Embeddings class.
     *
     * @param data the data value to set.
     * @param usage the usage value to set.
     */
    @JsonCreator
    private Embeddings(
            @JsonProperty(value = "data", required = true) List<EmbeddingItem> data,
            @JsonProperty(value = "usage", required = true) EmbeddingsUsage usage) {
        object = "list";
        this.data = data;
        this.usage = usage;
    }

    /**
     * Get the object property: Type of the data field.
     *
     * @return the object value.
     */
    public String getObject() {
        return this.object;
    }

    /**
     * Get the data property: Embedding values for the prompts submitted in the request.
     *
     * @return the data value.
     */
    public List<EmbeddingItem> getData() {
        return this.data;
    }

    /**
     * Get the model property: ID of the model to use.
     *
     * @return the model value.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Get the usage property: Usage counts for tokens input using the embeddings API.
     *
     * @return the usage value.
     */
    public EmbeddingsUsage getUsage() {
        return this.usage;
    }
}
