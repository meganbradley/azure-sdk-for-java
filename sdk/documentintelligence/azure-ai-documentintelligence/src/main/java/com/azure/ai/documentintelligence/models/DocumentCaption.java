// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A caption object describing a table or figure.
 */
@Immutable
public final class DocumentCaption implements JsonSerializable<DocumentCaption> {
    /*
     * Content of the caption.
     */
    @Generated
    private final String content;

    /*
     * Bounding regions covering the caption.
     */
    @Generated
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the caption in the reading order concatenated content.
     */
    @Generated
    private final List<DocumentSpan> spans;

    /*
     * Child elements of the caption.
     */
    @Generated
    private List<String> elements;

    /**
     * Creates an instance of DocumentCaption class.
     * 
     * @param content the content value to set.
     * @param spans the spans value to set.
     */
    @Generated
    private DocumentCaption(String content, List<DocumentSpan> spans) {
        this.content = content;
        this.spans = spans;
    }

    /**
     * Get the content property: Content of the caption.
     * 
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the caption.
     * 
     * @return the boundingRegions value.
     */
    @Generated
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the caption in the reading order concatenated content.
     * 
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the elements property: Child elements of the caption.
     * 
     * @return the elements value.
     */
    @Generated
    public List<String> getElements() {
        return this.elements;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeArrayField("spans", this.spans, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("boundingRegions", this.boundingRegions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("elements", this.elements, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentCaption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentCaption if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentCaption.
     */
    @Generated
    public static DocumentCaption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String content = null;
            List<DocumentSpan> spans = null;
            List<BoundingRegion> boundingRegions = null;
            List<String> elements = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("content".equals(fieldName)) {
                    content = reader.getString();
                } else if ("spans".equals(fieldName)) {
                    spans = reader.readArray(reader1 -> DocumentSpan.fromJson(reader1));
                } else if ("boundingRegions".equals(fieldName)) {
                    boundingRegions = reader.readArray(reader1 -> BoundingRegion.fromJson(reader1));
                } else if ("elements".equals(fieldName)) {
                    elements = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            DocumentCaption deserializedDocumentCaption = new DocumentCaption(content, spans);
            deserializedDocumentCaption.boundingRegions = boundingRegions;
            deserializedDocumentCaption.elements = elements;

            return deserializedDocumentCaption;
        });
    }
}
