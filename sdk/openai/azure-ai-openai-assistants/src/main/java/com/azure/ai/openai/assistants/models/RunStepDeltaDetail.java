// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a single run step detail item in a streaming run step's delta payload.
 */
@Immutable
public class RunStepDeltaDetail implements JsonSerializable<RunStepDeltaDetail> {

    /*
     * The object type for the run step detail object.
     */
    @Generated
    private String type;

    /**
     * Creates an instance of RunStepDeltaDetail class.
     */
    @Generated
    protected RunStepDeltaDetail() {
        this.type = "RunStepDeltaDetail";
    }

    /**
     * Get the type property: The object type for the run step detail object.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaDetail from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunStepDeltaDetail.
     */
    @Generated
    public static RunStepDeltaDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("message_creation".equals(discriminatorValue)) {
                    return RunStepDeltaMessageCreation.fromJson(readerToUse.reset());
                } else if ("tool_calls".equals(discriminatorValue)) {
                    return RunStepDeltaToolCallObject.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static RunStepDeltaDetail fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDeltaDetail deserializedRunStepDeltaDetail = new RunStepDeltaDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedRunStepDeltaDetail.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRunStepDeltaDetail;
        });
    }
}
