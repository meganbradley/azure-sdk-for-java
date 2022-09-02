// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Tokenizer for path-like hierarchies. This tokenizer is implemented using Apache Lucene. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.PathHierarchyTokenizerV2")
@Fluent
public final class PathHierarchyTokenizerV2 extends LexicalTokenizer {
    /*
     * Identifies the concrete type of the tokenizer.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.PathHierarchyTokenizerV2";

    /*
     * The delimiter character to use. Default is "/".
     */
    @JsonProperty(value = "delimiter")
    private Character delimiter;

    /*
     * A value that, if set, replaces the delimiter character. Default is "/".
     */
    @JsonProperty(value = "replacement")
    private Character replacement;

    /*
     * The maximum token length. Default and maximum is 300.
     */
    @JsonProperty(value = "maxTokenLength")
    private Integer maxTokenLength;

    /*
     * A value indicating whether to generate tokens in reverse order. Default is false.
     */
    @JsonProperty(value = "reverse")
    private Boolean reverseTokenOrder;

    /*
     * The number of initial tokens to skip. Default is 0.
     */
    @JsonProperty(value = "skip")
    private Integer numberOfTokensToSkip;

    /**
     * Creates an instance of PathHierarchyTokenizerV2 class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public PathHierarchyTokenizerV2(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the odataType property: Identifies the concrete type of the tokenizer.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the delimiter property: The delimiter character to use. Default is "/".
     *
     * @return the delimiter value.
     */
    public Character getDelimiter() {
        return this.delimiter;
    }

    /**
     * Set the delimiter property: The delimiter character to use. Default is "/".
     *
     * @param delimiter the delimiter value to set.
     * @return the PathHierarchyTokenizerV2 object itself.
     */
    public PathHierarchyTokenizerV2 setDelimiter(Character delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Get the replacement property: A value that, if set, replaces the delimiter character. Default is "/".
     *
     * @return the replacement value.
     */
    public Character getReplacement() {
        return this.replacement;
    }

    /**
     * Set the replacement property: A value that, if set, replaces the delimiter character. Default is "/".
     *
     * @param replacement the replacement value to set.
     * @return the PathHierarchyTokenizerV2 object itself.
     */
    public PathHierarchyTokenizerV2 setReplacement(Character replacement) {
        this.replacement = replacement;
        return this;
    }

    /**
     * Get the maxTokenLength property: The maximum token length. Default and maximum is 300.
     *
     * @return the maxTokenLength value.
     */
    public Integer getMaxTokenLength() {
        return this.maxTokenLength;
    }

    /**
     * Set the maxTokenLength property: The maximum token length. Default and maximum is 300.
     *
     * @param maxTokenLength the maxTokenLength value to set.
     * @return the PathHierarchyTokenizerV2 object itself.
     */
    public PathHierarchyTokenizerV2 setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
        return this;
    }

    /**
     * Get the reverseTokenOrder property: A value indicating whether to generate tokens in reverse order. Default is
     * false.
     *
     * @return the reverseTokenOrder value.
     */
    public Boolean isReverseTokenOrder() {
        return this.reverseTokenOrder;
    }

    /**
     * Set the reverseTokenOrder property: A value indicating whether to generate tokens in reverse order. Default is
     * false.
     *
     * @param reverseTokenOrder the reverseTokenOrder value to set.
     * @return the PathHierarchyTokenizerV2 object itself.
     */
    public PathHierarchyTokenizerV2 setReverseTokenOrder(Boolean reverseTokenOrder) {
        this.reverseTokenOrder = reverseTokenOrder;
        return this;
    }

    /**
     * Get the numberOfTokensToSkip property: The number of initial tokens to skip. Default is 0.
     *
     * @return the numberOfTokensToSkip value.
     */
    public Integer getNumberOfTokensToSkip() {
        return this.numberOfTokensToSkip;
    }

    /**
     * Set the numberOfTokensToSkip property: The number of initial tokens to skip. Default is 0.
     *
     * @param numberOfTokensToSkip the numberOfTokensToSkip value to set.
     * @return the PathHierarchyTokenizerV2 object itself.
     */
    public PathHierarchyTokenizerV2 setNumberOfTokensToSkip(Integer numberOfTokensToSkip) {
        this.numberOfTokensToSkip = numberOfTokensToSkip;
        return this;
    }
}
