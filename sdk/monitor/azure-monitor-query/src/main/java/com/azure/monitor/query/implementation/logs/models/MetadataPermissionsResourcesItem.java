// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The MetadataPermissionsResourcesItem model.
 */
@Fluent
public final class MetadataPermissionsResourcesItem implements JsonSerializable<MetadataPermissionsResourcesItem> {
    /*
     * The resource ID on the permission indication.
     */
    private final String resourceId;

    /*
     * The list of tables that were denied access for the resource ID.
     */
    private List<String> denyTables;

    /**
     * Creates an instance of MetadataPermissionsResourcesItem class.
     * 
     * @param resourceId the resourceId value to set.
     */
    public MetadataPermissionsResourcesItem(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Get the resourceId property: The resource ID on the permission indication.
     * 
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Get the denyTables property: The list of tables that were denied access for the resource ID.
     * 
     * @return the denyTables value.
     */
    public List<String> getDenyTables() {
        return this.denyTables;
    }

    /**
     * Set the denyTables property: The list of tables that were denied access for the resource ID.
     * 
     * @param denyTables the denyTables value to set.
     * @return the MetadataPermissionsResourcesItem object itself.
     */
    public MetadataPermissionsResourcesItem setDenyTables(List<String> denyTables) {
        this.denyTables = denyTables;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeArrayField("denyTables", this.denyTables, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetadataPermissionsResourcesItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetadataPermissionsResourcesItem if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetadataPermissionsResourcesItem.
     */
    public static MetadataPermissionsResourcesItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean resourceIdFound = false;
            String resourceId = null;
            List<String> denyTables = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    resourceId = reader.getString();
                    resourceIdFound = true;
                } else if ("denyTables".equals(fieldName)) {
                    denyTables = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            if (resourceIdFound) {
                MetadataPermissionsResourcesItem deserializedMetadataPermissionsResourcesItem
                    = new MetadataPermissionsResourcesItem(resourceId);
                deserializedMetadataPermissionsResourcesItem.denyTables = denyTables;

                return deserializedMetadataPermissionsResourcesItem;
            }
            throw new IllegalStateException("Missing required property: resourceId");
        });
    }
}
