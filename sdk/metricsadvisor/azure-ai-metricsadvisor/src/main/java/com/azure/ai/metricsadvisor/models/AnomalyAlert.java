// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The AnomalyAlert model.
 */
@Immutable
public final class AnomalyAlert implements JsonSerializable<AnomalyAlert> {
    /*
     * alert id
     */
    private String id;

    /*
     * anomaly time
     */
    private OffsetDateTime timestamp;

    /*
     * created time
     */
    private OffsetDateTime createdTime;

    /*
     * modified time
     */
    private OffsetDateTime modifiedTime;

    /**
     * Creates an instance of AnomalyAlert class.
     */
    public AnomalyAlert() {
    }

    /**
     * Get the id property: alert id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the timestamp property: anomaly time.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the createdTime property: created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Get the modifiedTime property: modified time.
     * 
     * @return the modifiedTime value.
     */
    public OffsetDateTime getModifiedTime() {
        return this.modifiedTime;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnomalyAlert from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnomalyAlert if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnomalyAlert.
     */
    public static AnomalyAlert fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnomalyAlert deserializedAnomalyAlert = new AnomalyAlert();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alertId".equals(fieldName)) {
                    deserializedAnomalyAlert.id = reader.getString();
                } else if ("timestamp".equals(fieldName)) {
                    deserializedAnomalyAlert.timestamp
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("createdTime".equals(fieldName)) {
                    deserializedAnomalyAlert.createdTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("modifiedTime".equals(fieldName)) {
                    deserializedAnomalyAlert.modifiedTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnomalyAlert;
        });
    }
}
