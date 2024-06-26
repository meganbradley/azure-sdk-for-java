// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The GeoJsonMultiLineStringData model.
 */
@Fluent
public class GeoJsonMultiLineStringData implements JsonSerializable<GeoJsonMultiLineStringData> {
    /*
     * Coordinates for the `GeoJson MultiLineString` geometry.
     */
    private List<List<List<Double>>> coordinates;

    /**
     * Creates an instance of GeoJsonMultiLineStringData class.
     */
    public GeoJsonMultiLineStringData() {
    }

    /**
     * Get the coordinates property: Coordinates for the `GeoJson MultiLineString` geometry.
     * 
     * @return the coordinates value.
     */
    public List<List<List<Double>>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson MultiLineString` geometry.
     * 
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiLineStringData object itself.
     */
    public GeoJsonMultiLineStringData setCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("coordinates", this.coordinates, (writer, element) -> writer.writeArray(element,
            (writer1, element1) -> writer1.writeArray(element1, (writer2, element2) -> writer2.writeDouble(element2))));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeoJsonMultiLineStringData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeoJsonMultiLineStringData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GeoJsonMultiLineStringData.
     */
    public static GeoJsonMultiLineStringData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeoJsonMultiLineStringData deserializedGeoJsonMultiLineStringData = new GeoJsonMultiLineStringData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("coordinates".equals(fieldName)) {
                    List<List<List<Double>>> coordinates = reader.readArray(
                        reader1 -> reader1.readArray(reader2 -> reader2.readArray(reader3 -> reader3.getDouble())));
                    deserializedGeoJsonMultiLineStringData.coordinates = coordinates;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeoJsonMultiLineStringData;
        });
    }
}
