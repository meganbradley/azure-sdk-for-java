// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The DimensionGroupIdentity model.
 */
@Fluent
public final class DimensionGroupIdentity implements JsonSerializable<DimensionGroupIdentity> {
    /*
     * dimension specified for series group
     */
    private Map<String, String> dimension;

    /**
     * Creates an instance of DimensionGroupIdentity class.
     */
    public DimensionGroupIdentity() {
    }

    /**
     * Get the dimension property: dimension specified for series group.
     * 
     * @return the dimension value.
     */
    public Map<String, String> getDimension() {
        return this.dimension;
    }

    /**
     * Set the dimension property: dimension specified for series group.
     * 
     * @param dimension the dimension value to set.
     * @return the DimensionGroupIdentity object itself.
     */
    public DimensionGroupIdentity setDimension(Map<String, String> dimension) {
        this.dimension = dimension;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("dimension", this.dimension, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DimensionGroupIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DimensionGroupIdentity if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DimensionGroupIdentity.
     */
    public static DimensionGroupIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DimensionGroupIdentity deserializedDimensionGroupIdentity = new DimensionGroupIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dimension".equals(fieldName)) {
                    Map<String, String> dimension = reader.readMap(reader1 -> reader1.getString());
                    deserializedDimensionGroupIdentity.dimension = dimension;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDimensionGroupIdentity;
        });
    }
}
