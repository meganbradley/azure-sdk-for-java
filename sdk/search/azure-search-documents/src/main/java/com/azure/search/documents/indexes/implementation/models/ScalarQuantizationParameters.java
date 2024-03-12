// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.models.VectorSearchCompressionTargetDataType;
import java.io.IOException;

/**
 * Contains the parameters specific to Scalar Quantization.
 */
@Fluent
public final class ScalarQuantizationParameters implements JsonSerializable<ScalarQuantizationParameters> {
    /*
     * The quantized data type of compressed vector values.
     */
    private VectorSearchCompressionTargetDataType quantizedDataType;

    /**
     * Creates an instance of ScalarQuantizationParameters class.
     */
    public ScalarQuantizationParameters() {
    }

    /**
     * Get the quantizedDataType property: The quantized data type of compressed vector values.
     * 
     * @return the quantizedDataType value.
     */
    public VectorSearchCompressionTargetDataType getQuantizedDataType() {
        return this.quantizedDataType;
    }

    /**
     * Set the quantizedDataType property: The quantized data type of compressed vector values.
     * 
     * @param quantizedDataType the quantizedDataType value to set.
     * @return the ScalarQuantizationParameters object itself.
     */
    public ScalarQuantizationParameters setQuantizedDataType(VectorSearchCompressionTargetDataType quantizedDataType) {
        this.quantizedDataType = quantizedDataType;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("quantizedDataType",
            this.quantizedDataType == null ? null : this.quantizedDataType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScalarQuantizationParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScalarQuantizationParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ScalarQuantizationParameters.
     */
    public static ScalarQuantizationParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScalarQuantizationParameters deserializedScalarQuantizationParameters = new ScalarQuantizationParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("quantizedDataType".equals(fieldName)) {
                    deserializedScalarQuantizationParameters.quantizedDataType
                        = VectorSearchCompressionTargetDataType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScalarQuantizationParameters;
        });
    }
}
