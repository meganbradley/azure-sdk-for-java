// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A representation of the request options that control the behavior of a text-to-speech operation.
 */
@Fluent
public final class SpeechGenerationOptions implements JsonSerializable<SpeechGenerationOptions> {

    /*
     * The text to generate audio for. The maximum length is 4096 characters.
     */
    @Generated
    private final String input;

    /*
     * The voice to use for text-to-speech.
     */
    @Generated
    private final SpeechVoice voice;

    /*
     * The audio output format for the spoken text. By default, the MP3 format will be used.
     */
    @Generated
    private SpeechGenerationResponseFormat responseFormat;

    /*
     * The speed of speech for generated audio. Values are valid in the range from 0.25 to 4.0, with 1.0 the default and higher values corresponding to faster speech.
     */
    @Generated
    private Double speed;

    /**
     * Creates an instance of SpeechGenerationOptions class.
     *
     * @param input the input value to set.
     * @param voice the voice value to set.
     */
    @Generated
    public SpeechGenerationOptions(String input, SpeechVoice voice) {
        this.input = input;
        this.voice = voice;
    }

    /**
     * Get the input property: The text to generate audio for. The maximum length is 4096 characters.
     *
     * @return the input value.
     */
    @Generated
    public String getInput() {
        return this.input;
    }

    /**
     * Get the voice property: The voice to use for text-to-speech.
     *
     * @return the voice value.
     */
    @Generated
    public SpeechVoice getVoice() {
        return this.voice;
    }

    /**
     * Get the responseFormat property: The audio output format for the spoken text. By default, the MP3 format will be
     * used.
     *
     * @return the responseFormat value.
     */
    @Generated
    public SpeechGenerationResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * Set the responseFormat property: The audio output format for the spoken text. By default, the MP3 format will be
     * used.
     *
     * @param responseFormat the responseFormat value to set.
     * @return the SpeechGenerationOptions object itself.
     */
    @Generated
    public SpeechGenerationOptions setResponseFormat(SpeechGenerationResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }

    /**
     * Get the speed property: The speed of speech for generated audio. Values are valid in the range from 0.25 to 4.0,
     * with 1.0 the default and higher values corresponding to faster speech.
     *
     * @return the speed value.
     */
    @Generated
    public Double getSpeed() {
        return this.speed;
    }

    /**
     * Set the speed property: The speed of speech for generated audio. Values are valid in the range from 0.25 to 4.0,
     * with 1.0 the default and higher values corresponding to faster speech.
     *
     * @param speed the speed value to set.
     * @return the SpeechGenerationOptions object itself.
     */
    @Generated
    public SpeechGenerationOptions setSpeed(Double speed) {
        this.speed = speed;
        return this;
    }

    /*
     * The model to use for this text-to-speech request.
     */
    @Generated
    private String model;

    /**
     * Get the model property: The model to use for this text-to-speech request.
     *
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model to use for this text-to-speech request.
     *
     * @param model the model value to set.
     * @return the SpeechGenerationOptions object itself.
     */
    @Generated
    public SpeechGenerationOptions setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("input", this.input);
        jsonWriter.writeStringField("voice", this.voice == null ? null : this.voice.toString());
        jsonWriter.writeStringField("response_format",
            this.responseFormat == null ? null : this.responseFormat.toString());
        jsonWriter.writeNumberField("speed", this.speed);
        jsonWriter.writeStringField("model", this.model);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SpeechGenerationOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SpeechGenerationOptions if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SpeechGenerationOptions.
     */
    @Generated
    public static SpeechGenerationOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String input = null;
            SpeechVoice voice = null;
            SpeechGenerationResponseFormat responseFormat = null;
            Double speed = null;
            String model = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("input".equals(fieldName)) {
                    input = reader.getString();
                } else if ("voice".equals(fieldName)) {
                    voice = SpeechVoice.fromString(reader.getString());
                } else if ("response_format".equals(fieldName)) {
                    responseFormat = SpeechGenerationResponseFormat.fromString(reader.getString());
                } else if ("speed".equals(fieldName)) {
                    speed = reader.getNullable(JsonReader::getDouble);
                } else if ("model".equals(fieldName)) {
                    model = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            SpeechGenerationOptions deserializedSpeechGenerationOptions = new SpeechGenerationOptions(input, voice);
            deserializedSpeechGenerationOptions.responseFormat = responseFormat;
            deserializedSpeechGenerationOptions.speed = speed;
            deserializedSpeechGenerationOptions.model = model;
            return deserializedSpeechGenerationOptions;
        });
    }
}
