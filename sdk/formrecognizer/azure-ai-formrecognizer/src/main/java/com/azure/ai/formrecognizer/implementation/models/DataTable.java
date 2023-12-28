// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Information about the extracted table contained in a page.
 */
@Fluent
public final class DataTable implements JsonSerializable<DataTable> {
    /*
     * Number of rows.
     */
    private int rows;

    /*
     * Number of columns.
     */
    private int columns;

    /*
     * List of cells contained in the table.
     */
    private List<DataTableCell> cells;

    /*
     * Bounding box of the table.
     */
    private List<Float> boundingBox;

    /**
     * Creates an instance of DataTable class.
     */
    public DataTable() {
    }

    /**
     * Get the rows property: Number of rows.
     * 
     * @return the rows value.
     */
    public int getRows() {
        return this.rows;
    }

    /**
     * Set the rows property: Number of rows.
     * 
     * @param rows the rows value to set.
     * @return the DataTable object itself.
     */
    public DataTable setRows(int rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Get the columns property: Number of columns.
     * 
     * @return the columns value.
     */
    public int getColumns() {
        return this.columns;
    }

    /**
     * Set the columns property: Number of columns.
     * 
     * @param columns the columns value to set.
     * @return the DataTable object itself.
     */
    public DataTable setColumns(int columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the cells property: List of cells contained in the table.
     * 
     * @return the cells value.
     */
    public List<DataTableCell> getCells() {
        return this.cells;
    }

    /**
     * Set the cells property: List of cells contained in the table.
     * 
     * @param cells the cells value to set.
     * @return the DataTable object itself.
     */
    public DataTable setCells(List<DataTableCell> cells) {
        this.cells = cells;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of the table.
     * 
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of the table.
     * 
     * @param boundingBox the boundingBox value to set.
     * @return the DataTable object itself.
     */
    public DataTable setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("rows", this.rows);
        jsonWriter.writeIntField("columns", this.columns);
        jsonWriter.writeArrayField("cells", this.cells, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("boundingBox", this.boundingBox, (writer, element) -> writer.writeFloat(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataTable from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataTable if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataTable.
     */
    public static DataTable fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataTable deserializedDataTable = new DataTable();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("rows".equals(fieldName)) {
                    deserializedDataTable.rows = reader.getInt();
                } else if ("columns".equals(fieldName)) {
                    deserializedDataTable.columns = reader.getInt();
                } else if ("cells".equals(fieldName)) {
                    List<DataTableCell> cells = reader.readArray(reader1 -> DataTableCell.fromJson(reader1));
                    deserializedDataTable.cells = cells;
                } else if ("boundingBox".equals(fieldName)) {
                    List<Float> boundingBox = reader.readArray(reader1 -> reader1.getFloat());
                    deserializedDataTable.boundingBox = boundingBox;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataTable;
        });
    }
}
