// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.ai.metricsadvisor.models.FeedbackType;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * The ChangePointFeedback model.
 */
@Fluent
public final class ChangePointFeedback extends MetricFeedback {
    /*
     * the start timestamp of feedback time range
     */
    private OffsetDateTime startTime;

    /*
     * the end timestamp of feedback time range, when equals to startTime means only one timestamp
     */
    private OffsetDateTime endTime;

    /*
     * The value property.
     */
    private ChangePointFeedbackValue value;

    /**
     * Creates an instance of ChangePointFeedback class.
     */
    public ChangePointFeedback() {
    }

    /**
     * Get the startTime property: the start timestamp of feedback time range.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: the start timestamp of feedback time range.
     * 
     * @param startTime the startTime value to set.
     * @return the ChangePointFeedback object itself.
     */
    public ChangePointFeedback setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: the end timestamp of feedback time range, when equals to startTime means only one
     * timestamp.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: the end timestamp of feedback time range, when equals to startTime means only one
     * timestamp.
     * 
     * @param endTime the endTime value to set.
     * @return the ChangePointFeedback object itself.
     */
    public ChangePointFeedback setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public ChangePointFeedbackValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the ChangePointFeedback object itself.
     */
    public ChangePointFeedback setValue(ChangePointFeedbackValue value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangePointFeedback setMetricId(UUID metricId) {
        super.setMetricId(metricId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangePointFeedback setDimensionFilter(FeedbackDimensionFilter dimensionFilter) {
        super.setDimensionFilter(dimensionFilter);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("feedbackType", Objects.toString(FeedbackType.CHANGE_POINT, null));
        jsonWriter.writeStringField("metricId", Objects.toString(getMetricId(), null));
        jsonWriter.writeJsonField("dimensionFilter", getDimensionFilter());
        jsonWriter.writeStringField("startTime", Objects.toString(this.startTime, null));
        jsonWriter.writeStringField("endTime", Objects.toString(this.endTime, null));
        jsonWriter.writeJsonField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChangePointFeedback from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChangePointFeedback if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ChangePointFeedback.
     */
    public static ChangePointFeedback fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChangePointFeedback deserializedChangePointFeedback = new ChangePointFeedback();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("feedbackType".equals(fieldName)) {
                    String feedbackType = reader.getString();
                    if (!"ChangePoint".equals(feedbackType)) {
                        throw new IllegalStateException(
                            "'feedbackType' was expected to be non-null and equal to 'ChangePoint'. The found 'feedbackType' was '"
                                + feedbackType + "'.");
                    }
                } else if ("metricId".equals(fieldName)) {
                    deserializedChangePointFeedback
                        .setMetricId(reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString())));
                } else if ("dimensionFilter".equals(fieldName)) {
                    deserializedChangePointFeedback.setDimensionFilter(FeedbackDimensionFilter.fromJson(reader));
                } else if ("feedbackId".equals(fieldName)) {
                    deserializedChangePointFeedback
                        .setFeedbackId(reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString())));
                } else if ("createdTime".equals(fieldName)) {
                    deserializedChangePointFeedback.setCreatedTime(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("userPrincipal".equals(fieldName)) {
                    deserializedChangePointFeedback.setUserPrincipal(reader.getString());
                } else if ("startTime".equals(fieldName)) {
                    deserializedChangePointFeedback.startTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedChangePointFeedback.endTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("value".equals(fieldName)) {
                    deserializedChangePointFeedback.value = ChangePointFeedbackValue.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChangePointFeedback;
        });
    }
}
