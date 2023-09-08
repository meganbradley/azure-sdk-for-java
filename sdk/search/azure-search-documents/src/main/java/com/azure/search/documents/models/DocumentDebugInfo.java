// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Contains debugging information that can be used to further explore your search results. */
@Immutable
public final class DocumentDebugInfo implements JsonSerializable<DocumentDebugInfo> {
    /*
     * Contains debugging information specific to semantic search queries.
     */
    private SemanticDebugInfo semantic;

    /** Creates an instance of DocumentDebugInfo class. */
    public DocumentDebugInfo() {}

    /**
     * Get the semantic property: Contains debugging information specific to semantic search queries.
     *
     * @return the semantic value.
     */
    public SemanticDebugInfo getSemantic() {
        return this.semantic;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("semantic", this.semantic);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentDebugInfo from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentDebugInfo if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the DocumentDebugInfo.
     */
    public static DocumentDebugInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    DocumentDebugInfo deserializedDocumentDebugInfo = new DocumentDebugInfo();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("semantic".equals(fieldName)) {
                            deserializedDocumentDebugInfo.semantic = SemanticDebugInfo.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedDocumentDebugInfo;
                });
    }
}
