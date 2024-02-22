// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.AVS.ScriptExecutionFailed event.
 */
@Fluent
public final class AvsScriptExecutionFailedEventData extends AvsScriptExecutionEventData {
    /*
     * Failure reason of an event.
     */
    private String failureMessage;

    /**
     * Creates an instance of AvsScriptExecutionFailedEventData class.
     */
    public AvsScriptExecutionFailedEventData() {
    }

    /**
     * Get the failureMessage property: Failure reason of an event.
     * 
     * @return the failureMessage value.
     */
    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * Set the failureMessage property: Failure reason of an event.
     * 
     * @param failureMessage the failureMessage value to set.
     * @return the AvsScriptExecutionFailedEventData object itself.
     */
    public AvsScriptExecutionFailedEventData setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvsScriptExecutionFailedEventData setOperationId(String operationId) {
        super.setOperationId(operationId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvsScriptExecutionFailedEventData setCmdletId(String cmdletId) {
        super.setCmdletId(cmdletId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvsScriptExecutionFailedEventData setOutput(List<String> output) {
        super.setOutput(output);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operationId", getOperationId());
        jsonWriter.writeStringField("cmdletId", getCmdletId());
        jsonWriter.writeArrayField("output", getOutput(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("failureMessage", this.failureMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvsScriptExecutionFailedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvsScriptExecutionFailedEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvsScriptExecutionFailedEventData.
     */
    public static AvsScriptExecutionFailedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvsScriptExecutionFailedEventData deserializedAvsScriptExecutionFailedEventData
                = new AvsScriptExecutionFailedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationId".equals(fieldName)) {
                    deserializedAvsScriptExecutionFailedEventData.setOperationId(reader.getString());
                } else if ("cmdletId".equals(fieldName)) {
                    deserializedAvsScriptExecutionFailedEventData.setCmdletId(reader.getString());
                } else if ("output".equals(fieldName)) {
                    List<String> output = reader.readArray(reader1 -> reader1.getString());
                    deserializedAvsScriptExecutionFailedEventData.setOutput(output);
                } else if ("failureMessage".equals(fieldName)) {
                    deserializedAvsScriptExecutionFailedEventData.failureMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvsScriptExecutionFailedEventData;
        });
    }
}
