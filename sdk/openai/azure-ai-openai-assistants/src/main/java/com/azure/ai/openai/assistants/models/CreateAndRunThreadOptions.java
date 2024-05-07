// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The details used when creating and immediately running a new assistant thread.
 */
@Fluent
public final class CreateAndRunThreadOptions implements JsonSerializable<CreateAndRunThreadOptions> {

    /*
     * The ID of the assistant for which the thread should be created.
     */
    @Generated
    private final String assistantId;

    /*
     * The details used to create the new thread. If no thread is provided, an empty one will be created.
     */
    @Generated
    private AssistantThreadCreationOptions thread;

    /*
     * The overridden model that the assistant should use to run the thread.
     */
    @Generated
    private String model;

    /*
     * The overridden system instructions the assistant should use to run the thread.
     */
    @Generated
    private String instructions;

    /*
     * The overridden list of enabled tools the assistant should use to run the thread.
     */
    @Generated
    private List<ToolDefinition> tools;

    /*
     * A set of up to 16 key/value pairs that can be attached to an object, used for storing additional information about that object in a structured format. Keys may be up to 64 characters in length and values may be up to 512 characters in length.
     */
    @Generated
    private Map<String, String> metadata;

    /**
     * Creates an instance of CreateAndRunThreadOptions class.
     *
     * @param assistantId the assistantId value to set.
     */
    @Generated
    public CreateAndRunThreadOptions(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * Get the assistantId property: The ID of the assistant for which the thread should be created.
     *
     * @return the assistantId value.
     */
    @Generated
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * Get the thread property: The details used to create the new thread. If no thread is provided, an empty one will
     * be created.
     *
     * @return the thread value.
     */
    @Generated
    public AssistantThreadCreationOptions getThread() {
        return this.thread;
    }

    /**
     * Set the thread property: The details used to create the new thread. If no thread is provided, an empty one will
     * be created.
     *
     * @param thread the thread value to set.
     * @return the CreateAndRunThreadOptions object itself.
     */
    @Generated
    public CreateAndRunThreadOptions setThread(AssistantThreadCreationOptions thread) {
        this.thread = thread;
        return this;
    }

    /**
     * Get the model property: The overridden model that the assistant should use to run the thread.
     *
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: The overridden model that the assistant should use to run the thread.
     *
     * @param model the model value to set.
     * @return the CreateAndRunThreadOptions object itself.
     */
    @Generated
    public CreateAndRunThreadOptions setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Get the instructions property: The overridden system instructions the assistant should use to run the thread.
     *
     * @return the instructions value.
     */
    @Generated
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: The overridden system instructions the assistant should use to run the thread.
     *
     * @param instructions the instructions value to set.
     * @return the CreateAndRunThreadOptions object itself.
     */
    @Generated
    public CreateAndRunThreadOptions setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the tools property: The overridden list of enabled tools the assistant should use to run the thread.
     *
     * @return the tools value.
     */
    @Generated
    public List<ToolDefinition> getTools() {
        return this.tools;
    }

    /**
     * Set the tools property: The overridden list of enabled tools the assistant should use to run the thread.
     *
     * @param tools the tools value to set.
     * @return the CreateAndRunThreadOptions object itself.
     */
    @Generated
    public CreateAndRunThreadOptions setTools(List<ToolDefinition> tools) {
        this.tools = tools;
        return this;
    }

    /**
     * Get the metadata property: A set of up to 16 key/value pairs that can be attached to an object, used for storing
     * additional information about that object in a structured format. Keys may be up to 64 characters in length and
     * values may be up to 512 characters in length.
     *
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A set of up to 16 key/value pairs that can be attached to an object, used for storing
     * additional information about that object in a structured format. Keys may be up to 64 characters in length and
     * values may be up to 512 characters in length.
     *
     * @param metadata the metadata value to set.
     * @return the CreateAndRunThreadOptions object itself.
     */
    @Generated
    public CreateAndRunThreadOptions setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("assistant_id", this.assistantId);
        jsonWriter.writeJsonField("thread", this.thread);
        jsonWriter.writeStringField("model", this.model);
        jsonWriter.writeStringField("instructions", this.instructions);
        jsonWriter.writeArrayField("tools", this.tools, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("stream", this.stream);
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateAndRunThreadOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateAndRunThreadOptions if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateAndRunThreadOptions.
     */
    @Generated
    public static CreateAndRunThreadOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String assistantId = null;
            AssistantThreadCreationOptions thread = null;
            String model = null;
            String instructions = null;
            List<ToolDefinition> tools = null;
            Boolean stream = null;
            Map<String, String> metadata = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("assistant_id".equals(fieldName)) {
                    assistantId = reader.getString();
                } else if ("thread".equals(fieldName)) {
                    thread = AssistantThreadCreationOptions.fromJson(reader);
                } else if ("model".equals(fieldName)) {
                    model = reader.getString();
                } else if ("instructions".equals(fieldName)) {
                    instructions = reader.getString();
                } else if ("tools".equals(fieldName)) {
                    tools = reader.readArray(reader1 -> ToolDefinition.fromJson(reader1));
                } else if ("stream".equals(fieldName)) {
                    stream = reader.getNullable(JsonReader::getBoolean);
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            CreateAndRunThreadOptions deserializedCreateAndRunThreadOptions
                = new CreateAndRunThreadOptions(assistantId);
            deserializedCreateAndRunThreadOptions.thread = thread;
            deserializedCreateAndRunThreadOptions.model = model;
            deserializedCreateAndRunThreadOptions.instructions = instructions;
            deserializedCreateAndRunThreadOptions.tools = tools;
            deserializedCreateAndRunThreadOptions.stream = stream;
            deserializedCreateAndRunThreadOptions.metadata = metadata;
            return deserializedCreateAndRunThreadOptions;
        });
    }

    /*
     * If `true`, returns a stream of events that happen during the Run as server-sent events,
     * terminating when the Run enters a terminal state with a `data: [DONE]` message.
     */
    @Generated
    private Boolean stream;

    /**
     * Get the stream property: If `true`, returns a stream of events that happen during the Run as server-sent events,
     * terminating when the Run enters a terminal state with a `data: [DONE]` message.
     *
     * @return the stream value.
     */
    @Generated
    public Boolean isStream() {
        return this.stream;
    }

    /**
     * Set the stream property: If `true`, returns a stream of events that happen during the Run as server-sent events,
     * terminating when the Run enters a terminal state with a `data: [DONE]` message.
     *
     * @param stream the stream value to set.
     * @return the CreateAndRunThreadOptions object itself.
     */
    @Generated
    public CreateAndRunThreadOptions setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
}
