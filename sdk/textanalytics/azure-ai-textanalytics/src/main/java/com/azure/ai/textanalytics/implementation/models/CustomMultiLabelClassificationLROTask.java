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

/** Use custom models to classify text into multi label taxonomy. */
@Fluent
public final class CustomMultiLabelClassificationLROTask extends AnalyzeTextLROTask {
    /*
     * Supported parameters for a Custom Multi Classification task.
     */
    private CustomMultiLabelClassificationTaskParameters parameters;

    /** Creates an instance of CustomMultiLabelClassificationLROTask class. */
    public CustomMultiLabelClassificationLROTask() {}

    /**
     * Get the parameters property: Supported parameters for a Custom Multi Classification task.
     *
     * @return the parameters value.
     */
    public CustomMultiLabelClassificationTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for a Custom Multi Classification task.
     *
     * @param parameters the parameters value to set.
     * @return the CustomMultiLabelClassificationLROTask object itself.
     */
    public CustomMultiLabelClassificationLROTask setParameters(
            CustomMultiLabelClassificationTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomMultiLabelClassificationLROTask setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField(
                "kind", Objects.toString(AnalyzeTextLROTaskKind.CUSTOM_MULTI_LABEL_CLASSIFICATION, null));
        jsonWriter.writeStringField("taskName", getTaskName());
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomMultiLabelClassificationLROTask from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomMultiLabelClassificationLROTask if the JsonReader was pointing to an instance of it,
     *     or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the CustomMultiLabelClassificationLROTask.
     */
    public static CustomMultiLabelClassificationLROTask fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    CustomMultiLabelClassificationLROTask deserializedCustomMultiLabelClassificationLROTask =
                            new CustomMultiLabelClassificationLROTask();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"CustomMultiLabelClassification".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'CustomMultiLabelClassification'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("taskName".equals(fieldName)) {
                            deserializedCustomMultiLabelClassificationLROTask.setTaskName(reader.getString());
                        } else if ("parameters".equals(fieldName)) {
                            deserializedCustomMultiLabelClassificationLROTask.parameters =
                                    CustomMultiLabelClassificationTaskParameters.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCustomMultiLabelClassificationLROTask;
                });
    }
}
