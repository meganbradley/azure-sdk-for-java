// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** An object representing the task definition for an Entities Recognition task. */
@Fluent
public final class EntitiesLROTask extends AnalyzeTextLROTask {
    /*
     * Supported parameters for an Entity Recognition task.
     */
    private EntitiesTaskParameters parameters;

    /** Creates an instance of EntitiesLROTask class. */
    public EntitiesLROTask() {}

    /**
     * Get the parameters property: Supported parameters for an Entity Recognition task.
     *
     * @return the parameters value.
     */
    public EntitiesTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for an Entity Recognition task.
     *
     * @param parameters the parameters value to set.
     * @return the EntitiesLROTask object itself.
     */
    public EntitiesLROTask setParameters(EntitiesTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntitiesLROTask setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", Objects.toString(AnalyzeTextLROTaskKind.ENTITY_RECOGNITION, null));
        jsonWriter.writeStringField("taskName", getTaskName());
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EntitiesLROTask from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of EntitiesLROTask if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the EntitiesLROTask.
     */
    public static EntitiesLROTask fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    EntitiesLROTask deserializedEntitiesLROTask = new EntitiesLROTask();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"EntityRecognition".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'EntityRecognition'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("taskName".equals(fieldName)) {
                            deserializedEntitiesLROTask.setTaskName(reader.getString());
                        } else if ("parameters".equals(fieldName)) {
                            deserializedEntitiesLROTask.parameters = EntitiesTaskParameters.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedEntitiesLROTask;
                });
    }
}
