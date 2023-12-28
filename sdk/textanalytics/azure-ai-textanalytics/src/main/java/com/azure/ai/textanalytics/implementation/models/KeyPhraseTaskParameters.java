// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Supported parameters for a Key Phrase Extraction task. */
@Fluent
public final class KeyPhraseTaskParameters extends PreBuiltTaskParameters {
    /** Creates an instance of KeyPhraseTaskParameters class. */
    public KeyPhraseTaskParameters() {}

    /** {@inheritDoc} */
    @Override
    public KeyPhraseTaskParameters setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyPhraseTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        super.setLoggingOptOut(loggingOptOut);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("loggingOptOut", isLoggingOptOut());
        jsonWriter.writeStringField("modelVersion", getModelVersion());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyPhraseTaskParameters from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyPhraseTaskParameters if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyPhraseTaskParameters.
     */
    public static KeyPhraseTaskParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    KeyPhraseTaskParameters deserializedKeyPhraseTaskParameters = new KeyPhraseTaskParameters();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("loggingOptOut".equals(fieldName)) {
                            deserializedKeyPhraseTaskParameters.setLoggingOptOut(
                                    reader.getNullable(JsonReader::getBoolean));
                        } else if ("modelVersion".equals(fieldName)) {
                            deserializedKeyPhraseTaskParameters.setModelVersion(reader.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedKeyPhraseTaskParameters;
                });
    }
}
