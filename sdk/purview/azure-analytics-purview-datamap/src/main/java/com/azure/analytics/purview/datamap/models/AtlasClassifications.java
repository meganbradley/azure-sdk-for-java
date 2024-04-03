// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * REST serialization friendly list.
 */
@Immutable
public final class AtlasClassifications implements JsonSerializable<AtlasClassifications> {
    /*
     * An array of objects.
     */
    @Generated
    private List<Object> list;

    /*
     * The size of the page.
     */
    @Generated
    private Integer pageSize;

    /*
     * The sorted by field.
     */
    @Generated
    private String sortBy;

    /*
     * to specify whether the result should be sorted? If yes, whether asc or desc.
     */
    @Generated
    private SortType sortType;

    /*
     * The start index of the page.
     */
    @Generated
    private Integer startIndex;

    /*
     * The total count of items.
     */
    @Generated
    private Integer totalCount;

    /**
     * Creates an instance of AtlasClassifications class.
     */
    @Generated
    private AtlasClassifications() {
    }

    /**
     * Get the list property: An array of objects.
     * 
     * @return the list value.
     */
    @Generated
    public List<Object> getList() {
        return this.list;
    }

    /**
     * Get the pageSize property: The size of the page.
     * 
     * @return the pageSize value.
     */
    @Generated
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * Get the sortBy property: The sorted by field.
     * 
     * @return the sortBy value.
     */
    @Generated
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * Get the sortType property: to specify whether the result should be sorted? If yes, whether asc or desc.
     * 
     * @return the sortType value.
     */
    @Generated
    public SortType getSortType() {
        return this.sortType;
    }

    /**
     * Get the startIndex property: The start index of the page.
     * 
     * @return the startIndex value.
     */
    @Generated
    public Integer getStartIndex() {
        return this.startIndex;
    }

    /**
     * Get the totalCount property: The total count of items.
     * 
     * @return the totalCount value.
     */
    @Generated
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("list", this.list, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeNumberField("pageSize", this.pageSize);
        jsonWriter.writeStringField("sortBy", this.sortBy);
        jsonWriter.writeStringField("sortType", this.sortType == null ? null : this.sortType.toString());
        jsonWriter.writeNumberField("startIndex", this.startIndex);
        jsonWriter.writeNumberField("totalCount", this.totalCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AtlasClassifications from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AtlasClassifications if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AtlasClassifications.
     */
    @Generated
    public static AtlasClassifications fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AtlasClassifications deserializedAtlasClassifications = new AtlasClassifications();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("list".equals(fieldName)) {
                    List<Object> list = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAtlasClassifications.list = list;
                } else if ("pageSize".equals(fieldName)) {
                    deserializedAtlasClassifications.pageSize = reader.getNullable(JsonReader::getInt);
                } else if ("sortBy".equals(fieldName)) {
                    deserializedAtlasClassifications.sortBy = reader.getString();
                } else if ("sortType".equals(fieldName)) {
                    deserializedAtlasClassifications.sortType = SortType.fromString(reader.getString());
                } else if ("startIndex".equals(fieldName)) {
                    deserializedAtlasClassifications.startIndex = reader.getNullable(JsonReader::getInt);
                } else if ("totalCount".equals(fieldName)) {
                    deserializedAtlasClassifications.totalCount = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAtlasClassifications;
        });
    }
}
