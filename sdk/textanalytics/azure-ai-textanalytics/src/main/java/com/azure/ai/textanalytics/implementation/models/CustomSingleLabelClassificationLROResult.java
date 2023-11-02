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

/** The CustomSingleLabelClassificationLROResult model. */
@Fluent
public final class CustomSingleLabelClassificationLROResult extends AnalyzeTextLROResult {
    /*
     * The results property.
     */
    private CustomLabelClassificationResult results;

    /** Creates an instance of CustomSingleLabelClassificationLROResult class. */
    public CustomSingleLabelClassificationLROResult() {}

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public CustomLabelClassificationResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the CustomSingleLabelClassificationLROResult object itself.
     */
    public CustomSingleLabelClassificationLROResult setResults(CustomLabelClassificationResult results) {
        this.results = results;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomSingleLabelClassificationLROResult setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomSingleLabelClassificationLROResult setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        super.setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomSingleLabelClassificationLROResult setStatus(State status) {
        super.setStatus(status);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField(
                "kind",
                Objects.toString(AnalyzeTextLROResultsKind.CUSTOM_SINGLE_LABEL_CLASSIFICATION_LRORESULTS, null));
        jsonWriter.writeStringField("lastUpdateDateTime", Objects.toString(getLastUpdateDateTime(), null));
        jsonWriter.writeStringField("status", Objects.toString(getStatus(), null));
        jsonWriter.writeStringField("taskName", getTaskName());
        jsonWriter.writeJsonField("results", this.results);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomSingleLabelClassificationLROResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomSingleLabelClassificationLROResult if the JsonReader was pointing to an instance of
     *     it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the CustomSingleLabelClassificationLROResult.
     */
    public static CustomSingleLabelClassificationLROResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    CustomSingleLabelClassificationLROResult deserializedCustomSingleLabelClassificationLROResult =
                            new CustomSingleLabelClassificationLROResult();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"CustomSingleLabelClassificationLROResults".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'CustomSingleLabelClassificationLROResults'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("lastUpdateDateTime".equals(fieldName)) {
                            deserializedCustomSingleLabelClassificationLROResult.setLastUpdateDateTime(
                                    reader.getNullable(
                                            nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                        } else if ("status".equals(fieldName)) {
                            deserializedCustomSingleLabelClassificationLROResult.setStatus(
                                    State.fromString(reader.getString()));
                        } else if ("taskName".equals(fieldName)) {
                            deserializedCustomSingleLabelClassificationLROResult.setTaskName(reader.getString());
                        } else if ("results".equals(fieldName)) {
                            deserializedCustomSingleLabelClassificationLROResult.results =
                                    CustomLabelClassificationResult.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCustomSingleLabelClassificationLROResult;
                });
    }
}
