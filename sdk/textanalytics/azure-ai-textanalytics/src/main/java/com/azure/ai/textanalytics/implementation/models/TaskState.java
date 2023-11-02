// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;

/** The TaskState model. */
@Fluent
public class TaskState implements JsonSerializable<TaskState> {
    /*
     * The lastUpdateDateTime property.
     */
    private OffsetDateTime lastUpdateDateTime;

    /*
     * The status property.
     */
    private State status;

    /** Creates an instance of TaskState class. */
    public TaskState() {}

    /**
     * Get the lastUpdateDateTime property: The lastUpdateDateTime property.
     *
     * @return the lastUpdateDateTime value.
     */
    public OffsetDateTime getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    /**
     * Set the lastUpdateDateTime property: The lastUpdateDateTime property.
     *
     * @param lastUpdateDateTime the lastUpdateDateTime value to set.
     * @return the TaskState object itself.
     */
    public TaskState setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public State getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the TaskState object itself.
     */
    public TaskState setStatus(State status) {
        this.status = status;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("lastUpdateDateTime", Objects.toString(this.lastUpdateDateTime, null));
        jsonWriter.writeStringField("status", Objects.toString(this.status, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TaskState from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TaskState if the JsonReader was pointing to an instance of it, or null if it was pointing
     *     to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TaskState.
     */
    public static TaskState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    TaskState deserializedTaskState = new TaskState();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("lastUpdateDateTime".equals(fieldName)) {
                            deserializedTaskState.lastUpdateDateTime =
                                    reader.getNullable(
                                            nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                        } else if ("status".equals(fieldName)) {
                            deserializedTaskState.status = State.fromString(reader.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedTaskState;
                });
    }
}
