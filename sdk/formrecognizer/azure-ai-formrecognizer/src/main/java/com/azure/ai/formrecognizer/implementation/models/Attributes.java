// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Optional model attributes.
 */
@Fluent
public final class Attributes implements JsonSerializable<Attributes> {
    /*
     * Is this model composed? (default: false).
     */
    private Boolean isComposed;

    /**
     * Creates an instance of Attributes class.
     */
    public Attributes() {
    }

    /**
     * Get the isComposed property: Is this model composed? (default: false).
     * 
     * @return the isComposed value.
     */
    public Boolean isComposed() {
        return this.isComposed;
    }

    /**
     * Set the isComposed property: Is this model composed? (default: false).
     * 
     * @param isComposed the isComposed value to set.
     * @return the Attributes object itself.
     */
    public Attributes setIsComposed(Boolean isComposed) {
        this.isComposed = isComposed;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("isComposed", this.isComposed);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Attributes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Attributes if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Attributes.
     */
    public static Attributes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Attributes deserializedAttributes = new Attributes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isComposed".equals(fieldName)) {
                    deserializedAttributes.isComposed = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAttributes;
        });
    }
}
