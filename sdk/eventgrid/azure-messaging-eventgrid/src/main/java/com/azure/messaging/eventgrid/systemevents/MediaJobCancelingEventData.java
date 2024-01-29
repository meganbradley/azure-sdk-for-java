// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Job canceling event data. Schema of the data property of an EventGridEvent for a Microsoft.Media.JobCanceling event.
 */
@Fluent
public final class MediaJobCancelingEventData extends MediaJobStateChangeEventData {
    /**
     * Creates an instance of MediaJobCancelingEventData class.
     */
    public MediaJobCancelingEventData() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobCancelingEventData setCorrelationData(Map<String, String> correlationData) {
        super.setCorrelationData(correlationData);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("correlationData", getCorrelationData(),
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaJobCancelingEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaJobCancelingEventData if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MediaJobCancelingEventData.
     */
    public static MediaJobCancelingEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaJobCancelingEventData deserializedMediaJobCancelingEventData = new MediaJobCancelingEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("previousState".equals(fieldName)) {
                    deserializedMediaJobCancelingEventData
                        .setPreviousState(MediaJobState.fromString(reader.getString()));
                } else if ("state".equals(fieldName)) {
                    deserializedMediaJobCancelingEventData.setState(MediaJobState.fromString(reader.getString()));
                } else if ("correlationData".equals(fieldName)) {
                    Map<String, String> correlationData = reader.readMap(reader1 -> reader1.getString());
                    deserializedMediaJobCancelingEventData.setCorrelationData(correlationData);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaJobCancelingEventData;
        });
    }
}
