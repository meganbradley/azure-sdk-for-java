// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The detailed information associated with a message creation run step.
 */
@Immutable
public final class RunStepMessageCreationDetails extends RunStepDetails {

    /*
     * Information about the message creation associated with this run step.
     */
    @Generated
    private final RunStepMessageCreationReference messageCreation;

    /**
     * Creates an instance of RunStepMessageCreationDetails class.
     *
     * @param messageCreation the messageCreation value to set.
     */
    @Generated
    private RunStepMessageCreationDetails(RunStepMessageCreationReference messageCreation) {
        this.messageCreation = messageCreation;
    }

    /**
     * Get the messageCreation property: Information about the message creation associated with this run step.
     *
     * @return the messageCreation value.
     */
    @Generated
    public RunStepMessageCreationReference getMessageCreation() {
        return this.messageCreation;
    }

    /*
     * The object type.
     */
    @Generated
    private RunStepType type = RunStepType.MESSAGE_CREATION;

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public RunStepType getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("message_creation", this.messageCreation);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepMessageCreationDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepMessageCreationDetails if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepMessageCreationDetails.
     */
    @Generated
    public static RunStepMessageCreationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepMessageCreationReference messageCreation = null;
            RunStepType type = RunStepType.MESSAGE_CREATION;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("message_creation".equals(fieldName)) {
                    messageCreation = RunStepMessageCreationReference.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = RunStepType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RunStepMessageCreationDetails deserializedRunStepMessageCreationDetails
                = new RunStepMessageCreationDetails(messageCreation);
            deserializedRunStepMessageCreationDetails.type = type;
            return deserializedRunStepMessageCreationDetails;
        });
    }
}
