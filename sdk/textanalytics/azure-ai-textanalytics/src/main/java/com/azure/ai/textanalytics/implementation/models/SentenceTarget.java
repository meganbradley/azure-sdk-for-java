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
import java.util.List;
import java.util.Objects;

/** The SentenceTarget model. */
@Fluent
public final class SentenceTarget implements JsonSerializable<SentenceTarget> {
    /*
     * Targeted sentiment in the sentence.
     */
    private TokenSentimentValue sentiment;

    /*
     * Target sentiment confidence scores for the target in the sentence.
     */
    private TargetConfidenceScoreLabel confidenceScores;

    /*
     * The target offset from the start of the sentence.
     */
    private int offset;

    /*
     * The length of the target.
     */
    private int length;

    /*
     * The target text detected.
     */
    private String text;

    /*
     * The array of either assessment or target objects which is related to the target.
     */
    private List<TargetRelation> relations;

    /** Creates an instance of SentenceTarget class. */
    public SentenceTarget() {}

    /**
     * Get the sentiment property: Targeted sentiment in the sentence.
     *
     * @return the sentiment value.
     */
    public TokenSentimentValue getSentiment() {
        return this.sentiment;
    }

    /**
     * Set the sentiment property: Targeted sentiment in the sentence.
     *
     * @param sentiment the sentiment value to set.
     * @return the SentenceTarget object itself.
     */
    public SentenceTarget setSentiment(TokenSentimentValue sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * Get the confidenceScores property: Target sentiment confidence scores for the target in the sentence.
     *
     * @return the confidenceScores value.
     */
    public TargetConfidenceScoreLabel getConfidenceScores() {
        return this.confidenceScores;
    }

    /**
     * Set the confidenceScores property: Target sentiment confidence scores for the target in the sentence.
     *
     * @param confidenceScores the confidenceScores value to set.
     * @return the SentenceTarget object itself.
     */
    public SentenceTarget setConfidenceScores(TargetConfidenceScoreLabel confidenceScores) {
        this.confidenceScores = confidenceScores;
        return this;
    }

    /**
     * Get the offset property: The target offset from the start of the sentence.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: The target offset from the start of the sentence.
     *
     * @param offset the offset value to set.
     * @return the SentenceTarget object itself.
     */
    public SentenceTarget setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: The length of the target.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: The length of the target.
     *
     * @param length the length value to set.
     * @return the SentenceTarget object itself.
     */
    public SentenceTarget setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * Get the text property: The target text detected.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The target text detected.
     *
     * @param text the text value to set.
     * @return the SentenceTarget object itself.
     */
    public SentenceTarget setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the relations property: The array of either assessment or target objects which is related to the target.
     *
     * @return the relations value.
     */
    public List<TargetRelation> getRelations() {
        return this.relations;
    }

    /**
     * Set the relations property: The array of either assessment or target objects which is related to the target.
     *
     * @param relations the relations value to set.
     * @return the SentenceTarget object itself.
     */
    public SentenceTarget setRelations(List<TargetRelation> relations) {
        this.relations = relations;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sentiment", Objects.toString(this.sentiment, null));
        jsonWriter.writeJsonField("confidenceScores", this.confidenceScores);
        jsonWriter.writeIntField("offset", this.offset);
        jsonWriter.writeIntField("length", this.length);
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeArrayField("relations", this.relations, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SentenceTarget from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SentenceTarget if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SentenceTarget.
     */
    public static SentenceTarget fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    SentenceTarget deserializedSentenceTarget = new SentenceTarget();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("sentiment".equals(fieldName)) {
                            deserializedSentenceTarget.sentiment = TokenSentimentValue.fromString(reader.getString());
                        } else if ("confidenceScores".equals(fieldName)) {
                            deserializedSentenceTarget.confidenceScores = TargetConfidenceScoreLabel.fromJson(reader);
                        } else if ("offset".equals(fieldName)) {
                            deserializedSentenceTarget.offset = reader.getInt();
                        } else if ("length".equals(fieldName)) {
                            deserializedSentenceTarget.length = reader.getInt();
                        } else if ("text".equals(fieldName)) {
                            deserializedSentenceTarget.text = reader.getString();
                        } else if ("relations".equals(fieldName)) {
                            List<TargetRelation> relations =
                                    reader.readArray(reader1 -> TargetRelation.fromJson(reader1));
                            deserializedSentenceTarget.relations = relations;
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedSentenceTarget;
                });
    }
}
