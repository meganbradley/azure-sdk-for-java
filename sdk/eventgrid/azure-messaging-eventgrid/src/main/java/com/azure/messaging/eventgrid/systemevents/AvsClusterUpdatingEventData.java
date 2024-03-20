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
 * Schema of the Data property of an EventGridEvent for a Microsoft.AVS.ClusterUpdating event.
 */
@Fluent
public final class AvsClusterUpdatingEventData extends AvsClusterEventData {
    /**
     * Creates an instance of AvsClusterUpdatingEventData class.
     */
    public AvsClusterUpdatingEventData() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvsClusterUpdatingEventData setOperationId(String operationId) {
        super.setOperationId(operationId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvsClusterUpdatingEventData setAddedHostNames(List<String> addedHostNames) {
        super.setAddedHostNames(addedHostNames);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvsClusterUpdatingEventData setRemovedHostNames(List<String> removedHostNames) {
        super.setRemovedHostNames(removedHostNames);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvsClusterUpdatingEventData setInMaintenanceHostNames(List<String> inMaintenanceHostNames) {
        super.setInMaintenanceHostNames(inMaintenanceHostNames);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operationId", getOperationId());
        jsonWriter.writeArrayField("addedHostNames", getAddedHostNames(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("removedHostNames", getRemovedHostNames(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("inMaintenanceHostNames", getInMaintenanceHostNames(),
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvsClusterUpdatingEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvsClusterUpdatingEventData if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvsClusterUpdatingEventData.
     */
    public static AvsClusterUpdatingEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvsClusterUpdatingEventData deserializedAvsClusterUpdatingEventData = new AvsClusterUpdatingEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationId".equals(fieldName)) {
                    deserializedAvsClusterUpdatingEventData.setOperationId(reader.getString());
                } else if ("addedHostNames".equals(fieldName)) {
                    List<String> addedHostNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedAvsClusterUpdatingEventData.setAddedHostNames(addedHostNames);
                } else if ("removedHostNames".equals(fieldName)) {
                    List<String> removedHostNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedAvsClusterUpdatingEventData.setRemovedHostNames(removedHostNames);
                } else if ("inMaintenanceHostNames".equals(fieldName)) {
                    List<String> inMaintenanceHostNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedAvsClusterUpdatingEventData.setInMaintenanceHostNames(inMaintenanceHostNames);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvsClusterUpdatingEventData;
        });
    }
}
