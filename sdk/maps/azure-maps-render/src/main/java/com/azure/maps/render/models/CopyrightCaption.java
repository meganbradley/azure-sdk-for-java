// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This object is returned from a successful copyright call.
 */
@Immutable
public final class CopyrightCaption implements JsonSerializable<CopyrightCaption> {
    /*
     * Format Version property
     */
    private String formatVersion;

    /*
     * Copyrights Caption property
     */
    private String copyrightsCaption;

    /**
     * Creates an instance of CopyrightCaption class.
     */
    public CopyrightCaption() {
    }

    /**
     * Get the formatVersion property: Format Version property.
     * 
     * @return the formatVersion value.
     */
    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * Get the copyrightsCaption property: Copyrights Caption property.
     * 
     * @return the copyrightsCaption value.
     */
    public String getCopyrightsCaption() {
        return this.copyrightsCaption;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CopyrightCaption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CopyrightCaption if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CopyrightCaption.
     */
    public static CopyrightCaption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CopyrightCaption deserializedCopyrightCaption = new CopyrightCaption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("formatVersion".equals(fieldName)) {
                    deserializedCopyrightCaption.formatVersion = reader.getString();
                } else if ("copyrightsCaption".equals(fieldName)) {
                    deserializedCopyrightCaption.copyrightsCaption = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCopyrightCaption;
        });
    }
}
