// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

/**
 * Representation of the response data from a completions request.
 * Completions support a wide variety of tasks and generate text that continues from or "completes"
 * provided prompt data.
 */
@Immutable
public final class Completions implements JsonSerializable<Completions> {

    /*
     * A unique identifier associated with this completions response.
     */
    @Generated
    private final String id;

    /*
     * The collection of completions choices associated with this completions response.
     * Generally, `n` choices are generated per provided prompt with a default value of 1.
     * Token limits and other settings may limit the number of choices generated.
     */
    @Generated
    private final List<Choice> choices;

    /*
     * Usage information for tokens processed and generated as part of this completions operation.
     */
    @Generated
    private final CompletionsUsage usage;

    /**
     * Get the id property: A unique identifier associated with this completions response.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the choices property: The collection of completions choices associated with this completions response.
     * Generally, `n` choices are generated per provided prompt with a default value of 1.
     * Token limits and other settings may limit the number of choices generated.
     *
     * @return the choices value.
     */
    @Generated
    public List<Choice> getChoices() {
        return this.choices;
    }

    /**
     * Get the usage property: Usage information for tokens processed and generated as part of this completions
     * operation.
     *
     * @return the usage value.
     */
    @Generated
    public CompletionsUsage getUsage() {
        return this.usage;
    }

    /*
     * Content filtering results for zero or more prompts in the request. In a streaming request,
     * results for different prompts may arrive at different times or in different orders.
     */
    @Generated
    private List<ContentFilterResultsForPrompt> promptFilterResults;

    /**
     * Get the promptFilterResults property: Content filtering results for zero or more prompts in the request. In a
     * streaming request,
     * results for different prompts may arrive at different times or in different orders.
     *
     * @return the promptFilterResults value.
     */
    @Generated
    public List<ContentFilterResultsForPrompt> getPromptFilterResults() {
        return this.promptFilterResults;
    }

    /*
     * The first timestamp associated with generation activity for this completions response,
     * represented as seconds since the beginning of the Unix epoch of 00:00 on 1 Jan 1970.
     */
    @Generated
    private final long createdAt;

    /**
     * Creates an instance of Completions class.
     *
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param choices the choices value to set.
     * @param usage the usage value to set.
     */
    @Generated
    private Completions(String id, OffsetDateTime createdAt, List<Choice> choices, CompletionsUsage usage) {
        this.id = id;
        if (createdAt == null) {
            this.createdAt = 0L;
        } else {
            this.createdAt = createdAt.toEpochSecond();
        }
        this.choices = choices;
        this.usage = usage;
    }

    /**
     * Get the createdAt property: The first timestamp associated with generation activity for this completions
     * response,
     * represented as seconds since the beginning of the Unix epoch of 00:00 on 1 Jan 1970.
     *
     * @return the createdAt value.
     */
    @Generated
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeLongField("created", this.createdAt);
        jsonWriter.writeArrayField("choices", this.choices, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("usage", this.usage);
        jsonWriter.writeArrayField("prompt_filter_results", this.promptFilterResults,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Completions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Completions if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Completions.
     */
    @Generated
    public static Completions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime createdAt = null;
            List<Choice> choices = null;
            CompletionsUsage usage = null;
            List<ContentFilterResultsForPrompt> promptFilterResults = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("created".equals(fieldName)) {
                    createdAt = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("choices".equals(fieldName)) {
                    choices = reader.readArray(reader1 -> Choice.fromJson(reader1));
                } else if ("usage".equals(fieldName)) {
                    usage = CompletionsUsage.fromJson(reader);
                } else if ("prompt_filter_results".equals(fieldName)) {
                    promptFilterResults = reader.readArray(reader1 -> ContentFilterResultsForPrompt.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            Completions deserializedCompletions = new Completions(id, createdAt, choices, usage);
            deserializedCompletions.promptFilterResults = promptFilterResults;
            return deserializedCompletions;
        });
    }
}
