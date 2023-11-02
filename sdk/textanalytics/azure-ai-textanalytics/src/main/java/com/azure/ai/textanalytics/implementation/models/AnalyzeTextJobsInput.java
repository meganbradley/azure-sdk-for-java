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

/** The AnalyzeTextJobsInput model. */
@Fluent
public final class AnalyzeTextJobsInput implements JsonSerializable<AnalyzeTextJobsInput> {
    /*
     * Optional display name for the analysis job.
     */
    private String displayName;

    /*
     * The analysisInput property.
     */
    private MultiLanguageAnalysisInput analysisInput;

    /*
     * The set of tasks to execute on the input documents.
     */
    private List<AnalyzeTextLROTask> tasks;

    /** Creates an instance of AnalyzeTextJobsInput class. */
    public AnalyzeTextJobsInput() {}

    /**
     * Get the displayName property: Optional display name for the analysis job.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Optional display name for the analysis job.
     *
     * @param displayName the displayName value to set.
     * @return the AnalyzeTextJobsInput object itself.
     */
    public AnalyzeTextJobsInput setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the analysisInput property: The analysisInput property.
     *
     * @return the analysisInput value.
     */
    public MultiLanguageAnalysisInput getAnalysisInput() {
        return this.analysisInput;
    }

    /**
     * Set the analysisInput property: The analysisInput property.
     *
     * @param analysisInput the analysisInput value to set.
     * @return the AnalyzeTextJobsInput object itself.
     */
    public AnalyzeTextJobsInput setAnalysisInput(MultiLanguageAnalysisInput analysisInput) {
        this.analysisInput = analysisInput;
        return this;
    }

    /**
     * Get the tasks property: The set of tasks to execute on the input documents.
     *
     * @return the tasks value.
     */
    public List<AnalyzeTextLROTask> getTasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: The set of tasks to execute on the input documents.
     *
     * @param tasks the tasks value to set.
     * @return the AnalyzeTextJobsInput object itself.
     */
    public AnalyzeTextJobsInput setTasks(List<AnalyzeTextLROTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("analysisInput", this.analysisInput);
        jsonWriter.writeArrayField("tasks", this.tasks, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("displayName", this.displayName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalyzeTextJobsInput from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalyzeTextJobsInput if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnalyzeTextJobsInput.
     */
    public static AnalyzeTextJobsInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    AnalyzeTextJobsInput deserializedAnalyzeTextJobsInput = new AnalyzeTextJobsInput();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("analysisInput".equals(fieldName)) {
                            deserializedAnalyzeTextJobsInput.analysisInput =
                                    MultiLanguageAnalysisInput.fromJson(reader);
                        } else if ("tasks".equals(fieldName)) {
                            List<AnalyzeTextLROTask> tasks =
                                    reader.readArray(reader1 -> AnalyzeTextLROTask.fromJson(reader1));
                            deserializedAnalyzeTextJobsInput.tasks = tasks;
                        } else if ("displayName".equals(fieldName)) {
                            deserializedAnalyzeTextJobsInput.displayName = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedAnalyzeTextJobsInput;
                });
    }
}
