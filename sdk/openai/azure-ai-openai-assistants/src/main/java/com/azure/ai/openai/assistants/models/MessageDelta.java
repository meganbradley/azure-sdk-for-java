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
import java.util.List;

/**
 * Represents the typed 'delta' payload within a streaming message delta chunk.
 */
@Immutable
public final class MessageDelta implements JsonSerializable<MessageDelta> {

    /*
     * The entity that produced the message.
     */
    @Generated
    private final MessageRole role;

    /*
     * The content of the message as an array of text and/or images.
     */
    @Generated
    private final List<MessageDeltaContent> content;

    /**
     * Creates an instance of MessageDelta class.
     *
     * @param role the role value to set.
     * @param content the content value to set.
     */
    @Generated
    private MessageDelta(MessageRole role, List<MessageDeltaContent> content) {
        this.role = role;
        this.content = content;
    }

    /**
     * Get the role property: The entity that produced the message.
     *
     * @return the role value.
     */
    @Generated
    public MessageRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The content of the message as an array of text and/or images.
     *
     * @return the content value.
     */
    @Generated
    public List<MessageDeltaContent> getContent() {
        return this.content;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        jsonWriter.writeArrayField("content", this.content, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageDelta from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageDelta if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageDelta.
     */
    @Generated
    public static MessageDelta fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MessageRole role = null;
            List<MessageDeltaContent> content = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("role".equals(fieldName)) {
                    role = MessageRole.fromString(reader.getString());
                } else if ("content".equals(fieldName)) {
                    content = reader.readArray(reader1 -> MessageDeltaContent.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new MessageDelta(role, content);
        });
    }
}
