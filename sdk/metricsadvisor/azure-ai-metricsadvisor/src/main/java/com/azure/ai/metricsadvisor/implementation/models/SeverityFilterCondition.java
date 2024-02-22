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

/**
 * The SeverityFilterCondition model.
 */
@Fluent
public final class SeverityFilterCondition implements JsonSerializable<SeverityFilterCondition> {
    /*
     * min severity
     */
    private Severity min;

    /*
     * max severity
     */
    private Severity max;

    /**
     * Creates an instance of SeverityFilterCondition class.
     */
    public SeverityFilterCondition() {
    }

    /**
     * Get the min property: min severity.
     * 
     * @return the min value.
     */
    public Severity getMin() {
        return this.min;
    }

    /**
     * Set the min property: min severity.
     * 
     * @param min the min value to set.
     * @return the SeverityFilterCondition object itself.
     */
    public SeverityFilterCondition setMin(Severity min) {
        this.min = min;
        return this;
    }

    /**
     * Get the max property: max severity.
     * 
     * @return the max value.
     */
    public Severity getMax() {
        return this.max;
    }

    /**
     * Set the max property: max severity.
     * 
     * @param max the max value to set.
     * @return the SeverityFilterCondition object itself.
     */
    public SeverityFilterCondition setMax(Severity max) {
        this.max = max;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("min", this.min == null ? null : this.min.toString());
        jsonWriter.writeStringField("max", this.max == null ? null : this.max.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SeverityFilterCondition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SeverityFilterCondition if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SeverityFilterCondition.
     */
    public static SeverityFilterCondition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SeverityFilterCondition deserializedSeverityFilterCondition = new SeverityFilterCondition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("min".equals(fieldName)) {
                    deserializedSeverityFilterCondition.min = Severity.fromString(reader.getString());
                } else if ("max".equals(fieldName)) {
                    deserializedSeverityFilterCondition.max = Severity.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSeverityFilterCondition;
        });
    }
}
