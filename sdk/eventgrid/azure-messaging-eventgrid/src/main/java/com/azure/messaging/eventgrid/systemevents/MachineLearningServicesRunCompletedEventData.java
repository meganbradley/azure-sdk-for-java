// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.MachineLearningServices.RunCompleted event.
 */
@Fluent
public final class MachineLearningServicesRunCompletedEventData
    implements JsonSerializable<MachineLearningServicesRunCompletedEventData> {
    /*
     * The ID of the experiment that the run belongs to.
     */
    private String experimentId;

    /*
     * The name of the experiment that the run belongs to.
     */
    private String experimentName;

    /*
     * The ID of the Run that was completed.
     */
    private String runId;

    /*
     * The Run Type of the completed Run.
     */
    private String runType;

    /*
     * The tags of the completed Run.
     */
    private Object runTags;

    /*
     * The properties of the completed Run.
     */
    private Object runProperties;

    /**
     * Creates an instance of MachineLearningServicesRunCompletedEventData class.
     */
    public MachineLearningServicesRunCompletedEventData() {
    }

    /**
     * Get the experimentId property: The ID of the experiment that the run belongs to.
     * 
     * @return the experimentId value.
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * Set the experimentId property: The ID of the experiment that the run belongs to.
     * 
     * @param experimentId the experimentId value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    /**
     * Get the experimentName property: The name of the experiment that the run belongs to.
     * 
     * @return the experimentName value.
     */
    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * Set the experimentName property: The name of the experiment that the run belongs to.
     * 
     * @param experimentName the experimentName value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get the runId property: The ID of the Run that was completed.
     * 
     * @return the runId value.
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * Set the runId property: The ID of the Run that was completed.
     * 
     * @param runId the runId value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the runType property: The Run Type of the completed Run.
     * 
     * @return the runType value.
     */
    public String getRunType() {
        return this.runType;
    }

    /**
     * Set the runType property: The Run Type of the completed Run.
     * 
     * @param runType the runType value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setRunType(String runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Get the runTags property: The tags of the completed Run.
     * 
     * @return the runTags value.
     */
    public Object getRunTags() {
        return this.runTags;
    }

    /**
     * Set the runTags property: The tags of the completed Run.
     * 
     * @param runTags the runTags value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setRunTags(Object runTags) {
        this.runTags = runTags;
        return this;
    }

    /**
     * Get the runProperties property: The properties of the completed Run.
     * 
     * @return the runProperties value.
     */
    public Object getRunProperties() {
        return this.runProperties;
    }

    /**
     * Set the runProperties property: The properties of the completed Run.
     * 
     * @param runProperties the runProperties value to set.
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData setRunProperties(Object runProperties) {
        this.runProperties = runProperties;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("experimentId", this.experimentId);
        jsonWriter.writeStringField("experimentName", this.experimentName);
        jsonWriter.writeStringField("runId", this.runId);
        jsonWriter.writeStringField("runType", this.runType);
        jsonWriter.writeUntypedField("runTags", this.runTags);
        jsonWriter.writeUntypedField("runProperties", this.runProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MachineLearningServicesRunCompletedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachineLearningServicesRunCompletedEventData if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MachineLearningServicesRunCompletedEventData.
     */
    public static MachineLearningServicesRunCompletedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MachineLearningServicesRunCompletedEventData deserializedMachineLearningServicesRunCompletedEventData
                = new MachineLearningServicesRunCompletedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("experimentId".equals(fieldName)) {
                    deserializedMachineLearningServicesRunCompletedEventData.experimentId = reader.getString();
                } else if ("experimentName".equals(fieldName)) {
                    deserializedMachineLearningServicesRunCompletedEventData.experimentName = reader.getString();
                } else if ("runId".equals(fieldName)) {
                    deserializedMachineLearningServicesRunCompletedEventData.runId = reader.getString();
                } else if ("runType".equals(fieldName)) {
                    deserializedMachineLearningServicesRunCompletedEventData.runType = reader.getString();
                } else if ("runTags".equals(fieldName)) {
                    deserializedMachineLearningServicesRunCompletedEventData.runTags = reader.readUntyped();
                } else if ("runProperties".equals(fieldName)) {
                    deserializedMachineLearningServicesRunCompletedEventData.runProperties = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMachineLearningServicesRunCompletedEventData;
        });
    }
}
