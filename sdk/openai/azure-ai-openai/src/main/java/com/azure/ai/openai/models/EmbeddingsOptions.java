// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration information for an embeddings request. Embeddings measure the relatedness of text strings and are
 * commonly used for search, clustering, recommendations, and other similar scenarios.
 */
@Fluent
public final class EmbeddingsOptions {
    /*
     * An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     */
    @JsonProperty(value = "user")
    private String user;

    /*
     * The model name to provide as part of this embeddings request.
     * Not applicable to Azure OpenAI, where deployment information should be included in the Azure
     * resource URI that's connected to.
     */
    @JsonProperty(value = "model")
    private String model;

    /*
     * Input text to get embeddings for, encoded as a string.
     * To get embeddings for multiple inputs in a single request, pass an array of strings.
     * Each input must not exceed 2048 tokens in length.
     *
     * Unless you are embedding code, we suggest replacing newlines (\n) in your input with a single space,
     * as we have observed inferior results when newlines are present.
     */
    @JsonProperty(value = "input", required = true)
    private InputModelBase input;

    /**
     * Creates an instance of EmbeddingsOptions class.
     *
     * @param input the input value to set.
     */
    @JsonCreator
    public EmbeddingsOptions(@JsonProperty(value = "input", required = true) InputModelBase input) {
        this.input = input;
    }

    /**
     * Get the user property: An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     *
     * @return the user value.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Set the user property: An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     *
     * @param user the user value to set.
     * @return the EmbeddingsOptions object itself.
     */
    public EmbeddingsOptions setUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the model property: The model name to provide as part of this embeddings request. Not applicable to Azure
     * OpenAI, where deployment information should be included in the Azure resource URI that's connected to.
     *
     * @return the model value.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model name to provide as part of this embeddings request. Not applicable to Azure
     * OpenAI, where deployment information should be included in the Azure resource URI that's connected to.
     *
     * @param model the model value to set.
     * @return the EmbeddingsOptions object itself.
     */
    public EmbeddingsOptions setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Get the input property: Input text to get embeddings for, encoded as a string. To get embeddings for multiple
     * inputs in a single request, pass an array of strings. Each input must not exceed 2048 tokens in length.
     *
     * <p>Unless you are embedding code, we suggest replacing newlines (\n) in your input with a single space, as we
     * have observed inferior results when newlines are present.
     *
     * @return the input value.
     */
    public InputModelBase getInput() {
        return this.input;
    }
}
