// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;

/** The CustomEntityRecognitionLROResult model. */
@Fluent
public final class CustomEntityRecognitionLROResult extends AnalyzeTextLROResult {
    /*
     * The results property.
     */
    private CustomEntitiesResult results;

    /** Creates an instance of CustomEntityRecognitionLROResult class. */
    public CustomEntityRecognitionLROResult() {}

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public CustomEntitiesResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the CustomEntityRecognitionLROResult object itself.
     */
    public CustomEntityRecognitionLROResult setResults(CustomEntitiesResult results) {
        this.results = results;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntityRecognitionLROResult setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntityRecognitionLROResult setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        super.setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntityRecognitionLROResult setStatus(State status) {
        super.setStatus(status);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField(
                "kind", Objects.toString(AnalyzeTextLROResultsKind.CUSTOM_ENTITY_RECOGNITION_LRORESULTS, null));
        jsonWriter.writeStringField("lastUpdateDateTime", Objects.toString(getLastUpdateDateTime(), null));
        jsonWriter.writeStringField("status", Objects.toString(getStatus(), null));
        jsonWriter.writeStringField("taskName", getTaskName());
        jsonWriter.writeJsonField("results", this.results);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomEntityRecognitionLROResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomEntityRecognitionLROResult if the JsonReader was pointing to an instance of it, or
     *     null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the CustomEntityRecognitionLROResult.
     */
    public static CustomEntityRecognitionLROResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    CustomEntityRecognitionLROResult deserializedCustomEntityRecognitionLROResult =
                            new CustomEntityRecognitionLROResult();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"CustomEntityRecognitionLROResults".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'CustomEntityRecognitionLROResults'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("lastUpdateDateTime".equals(fieldName)) {
                            deserializedCustomEntityRecognitionLROResult.setLastUpdateDateTime(
                                    reader.getNullable(
                                            nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                        } else if ("status".equals(fieldName)) {
                            deserializedCustomEntityRecognitionLROResult.setStatus(
                                    State.fromString(reader.getString()));
                        } else if ("taskName".equals(fieldName)) {
                            deserializedCustomEntityRecognitionLROResult.setTaskName(reader.getString());
                        } else if ("results".equals(fieldName)) {
                            deserializedCustomEntityRecognitionLROResult.results =
                                    CustomEntitiesResult.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCustomEntityRecognitionLROResult;
                });
    }
}
