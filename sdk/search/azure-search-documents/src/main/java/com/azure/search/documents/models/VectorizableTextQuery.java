// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.implementation.models.VectorQueryKind;
import java.io.IOException;

/**
 * The query parameters to use for vector search when a text value that needs to be vectorized is provided.
 */
@Fluent
public final class VectorizableTextQuery extends VectorQuery {

    /*
     * The text to be vectorized to perform a vector search query.
     */
    private final String text;

    /**
     * Creates an instance of VectorizableTextQuery class.
     *
     * @param text the text value to set.
     */
    public VectorizableTextQuery(String text) {
        this.text = text;
    }

    /**
     * Get the text property: The text to be vectorized to perform a vector search query.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizableTextQuery setKNearestNeighborsCount(Integer kNearestNeighborsCount) {
        super.setKNearestNeighborsCount(kNearestNeighborsCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizableTextQuery setFields(String... fields) {
        super.setFields(fields);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizableTextQuery setExhaustive(Boolean exhaustive) {
        super.setExhaustive(exhaustive);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", VectorQueryKind.TEXT == null ? null : VectorQueryKind.TEXT.toString());
        jsonWriter.writeNumberField("k", getKNearestNeighborsCount());
        jsonWriter.writeStringField("fields", getFields());
        jsonWriter.writeBooleanField("exhaustive", isExhaustive());
        jsonWriter.writeStringField("text", this.text);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VectorizableTextQuery from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of VectorizableTextQuery if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the VectorizableTextQuery.
     */
    public static VectorizableTextQuery fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Integer kNearestNeighborsCount = null;
            String fields = null;
            Boolean exhaustive = null;
            boolean textFound = false;
            String text = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"text".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'text'. The found 'kind' was '" + kind
                                + "'.");
                    }
                } else if ("k".equals(fieldName)) {
                    kNearestNeighborsCount = reader.getNullable(JsonReader::getInt);
                } else if ("fields".equals(fieldName)) {
                    fields = reader.getString();
                } else if ("exhaustive".equals(fieldName)) {
                    exhaustive = reader.getNullable(JsonReader::getBoolean);
                } else if ("text".equals(fieldName)) {
                    text = reader.getString();
                    textFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (textFound) {
                VectorizableTextQuery deserializedVectorizableTextQuery = new VectorizableTextQuery(text);
                deserializedVectorizableTextQuery.setKNearestNeighborsCount(kNearestNeighborsCount);
                deserializedVectorizableTextQuery.setFields(fields);
                deserializedVectorizableTextQuery.setExhaustive(exhaustive);
                return deserializedVectorizableTextQuery;
            }
            throw new IllegalStateException("Missing required property: text");
        });
    }
}
