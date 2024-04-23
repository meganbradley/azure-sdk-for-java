// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Tokenizer for path-like hierarchies. This tokenizer is implemented using Apache Lucene. */
@Fluent
public final class PathHierarchyTokenizer extends LexicalTokenizer {
    /*
     * The delimiter character to use. Default is "/".
     */
    private Character delimiter;

    /*
     * A value that, if set, replaces the delimiter character. Default is "/".
     */
    private Character replacement;

    /*
     * The maximum token length. Default and maximum is 300.
     */
    private Integer maxTokenLength;

    /*
     * A value indicating whether to generate tokens in reverse order. Default is false.
     */
    private Boolean tokenOrderReversed;

    /*
     * The number of initial tokens to skip. Default is 0.
     */
    private Integer numberOfTokensToSkip;

    /**
     * Creates an instance of PathHierarchyTokenizer class.
     *
     * @param name the name value to set.
     */
    public PathHierarchyTokenizer(String name) {
        super(name);
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
     * @return the PathHierarchyTokenizer object itself.
     */
    public PathHierarchyTokenizer setDelimiter(Character delimiter) {
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
     * @return the PathHierarchyTokenizer object itself.
     */
    public PathHierarchyTokenizer setReplacement(Character replacement) {
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
     * @return the PathHierarchyTokenizer object itself.
     */
    public PathHierarchyTokenizer setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
        return this;
    }

    /**
     * Get the tokenOrderReversed property: A value indicating whether to generate tokens in reverse order. Default is
     * false.
     *
     * @return the tokenOrderReversed value.
     */
    public Boolean isTokenOrderReversed() {
        return this.tokenOrderReversed;
    }

    /**
     * Set the tokenOrderReversed property: A value indicating whether to generate tokens in reverse order. Default is
     * false.
     *
     * @param tokenOrderReversed the tokenOrderReversed value to set.
     * @return the PathHierarchyTokenizer object itself.
     */
    public PathHierarchyTokenizer setTokenOrderReversed(Boolean tokenOrderReversed) {
        this.tokenOrderReversed = tokenOrderReversed;
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
     * @return the PathHierarchyTokenizer object itself.
     */
    public PathHierarchyTokenizer setNumberOfTokensToSkip(Integer numberOfTokensToSkip) {
        this.numberOfTokensToSkip = numberOfTokensToSkip;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.PathHierarchyTokenizerV2");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("delimiter", Objects.toString(this.delimiter, null));
        jsonWriter.writeStringField("replacement", Objects.toString(this.replacement, null));
        jsonWriter.writeNumberField("maxTokenLength", this.maxTokenLength);
        jsonWriter.writeBooleanField("reverse", this.tokenOrderReversed);
        jsonWriter.writeNumberField("skip", this.numberOfTokensToSkip);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PathHierarchyTokenizer from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PathHierarchyTokenizer if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the PathHierarchyTokenizer.
     */
    public static PathHierarchyTokenizer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    Character delimiter = null;
                    Character replacement = null;
                    Integer maxTokenLength = null;
                    Boolean tokenOrderReversed = null;
                    Integer numberOfTokensToSkip = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Azure.Search.PathHierarchyTokenizerV2".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.PathHierarchyTokenizerV2'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("delimiter".equals(fieldName)) {
                            delimiter = reader.getNullable(nonNullReader -> nonNullReader.getString().charAt(0));
                        } else if ("replacement".equals(fieldName)) {
                            replacement = reader.getNullable(nonNullReader -> nonNullReader.getString().charAt(0));
                        } else if ("maxTokenLength".equals(fieldName)) {
                            maxTokenLength = reader.getNullable(JsonReader::getInt);
                        } else if ("reverse".equals(fieldName)) {
                            tokenOrderReversed = reader.getNullable(JsonReader::getBoolean);
                        } else if ("skip".equals(fieldName)) {
                            numberOfTokensToSkip = reader.getNullable(JsonReader::getInt);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        PathHierarchyTokenizer deserializedPathHierarchyTokenizer = new PathHierarchyTokenizer(name);
                        deserializedPathHierarchyTokenizer.delimiter = delimiter;
                        deserializedPathHierarchyTokenizer.replacement = replacement;
                        deserializedPathHierarchyTokenizer.maxTokenLength = maxTokenLength;
                        deserializedPathHierarchyTokenizer.tokenOrderReversed = tokenOrderReversed;
                        deserializedPathHierarchyTokenizer.numberOfTokensToSkip = numberOfTokensToSkip;

                        return deserializedPathHierarchyTokenizer;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
