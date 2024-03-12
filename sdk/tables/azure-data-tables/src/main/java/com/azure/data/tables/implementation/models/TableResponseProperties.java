// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties for the table response.
 */
@Fluent
public class TableResponseProperties implements JsonSerializable<TableResponseProperties> {
    /*
     * The name of the table.
     */
    private String tableName;

    /*
     * The odata type of the table.
     */
    private String odataType;

    /*
     * The id of the table.
     */
    private String odataId;

    /*
     * The edit link of the table.
     */
    private String odataEditLink;

    /**
     * Creates an instance of TableResponseProperties class.
     */
    public TableResponseProperties() {
    }

    /**
     * Get the tableName property: The name of the table.
     * 
     * @return the tableName value.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The name of the table.
     * 
     * @param tableName the tableName value to set.
     * @return the TableResponseProperties object itself.
     */
    public TableResponseProperties setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the odataType property: The odata type of the table.
     * 
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The odata type of the table.
     * 
     * @param odataType the odataType value to set.
     * @return the TableResponseProperties object itself.
     */
    public TableResponseProperties setOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the odataId property: The id of the table.
     * 
     * @return the odataId value.
     */
    public String getOdataId() {
        return this.odataId;
    }

    /**
     * Set the odataId property: The id of the table.
     * 
     * @param odataId the odataId value to set.
     * @return the TableResponseProperties object itself.
     */
    public TableResponseProperties setOdataId(String odataId) {
        this.odataId = odataId;
        return this;
    }

    /**
     * Get the odataEditLink property: The edit link of the table.
     * 
     * @return the odataEditLink value.
     */
    public String getOdataEditLink() {
        return this.odataEditLink;
    }

    /**
     * Set the odataEditLink property: The edit link of the table.
     * 
     * @param odataEditLink the odataEditLink value to set.
     * @return the TableResponseProperties object itself.
     */
    public TableResponseProperties setOdataEditLink(String odataEditLink) {
        this.odataEditLink = odataEditLink;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("TableName", this.tableName);
        jsonWriter.writeStringField("odata.type", this.odataType);
        jsonWriter.writeStringField("odata.id", this.odataId);
        jsonWriter.writeStringField("odata.editLink", this.odataEditLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TableResponseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TableResponseProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TableResponseProperties.
     */
    public static TableResponseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TableResponseProperties deserializedTableResponseProperties = new TableResponseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("TableName".equals(fieldName)) {
                    deserializedTableResponseProperties.tableName = reader.getString();
                } else if ("odata.type".equals(fieldName)) {
                    deserializedTableResponseProperties.odataType = reader.getString();
                } else if ("odata.id".equals(fieldName)) {
                    deserializedTableResponseProperties.odataId = reader.getString();
                } else if ("odata.editLink".equals(fieldName)) {
                    deserializedTableResponseProperties.odataEditLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTableResponseProperties;
        });
    }
}
