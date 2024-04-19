// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.models.ResponseError;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The current status of an async operation.
 */
@Immutable
public final class DevCenterOperationDetails implements JsonSerializable<DevCenterOperationDetails> {

    /*
     * Fully qualified ID for the operation status.
     */
    @Generated
    private String id;

    /*
     * The operation id name
     */
    @Generated
    private String name;

    /*
     * Provisioning state of the resource.
     */
    @Generated
    private final DevCenterOperationStatus status;

    /*
     * The id of the resource.
     */
    @Generated
    private String resourceId;

    /*
     * The start time of the operation
     */
    @Generated
    private OffsetDateTime startTime;

    /*
     * The end time of the operation
     */
    @Generated
    private OffsetDateTime endTime;

    /*
     * Percent of the operation that is complete
     */
    @Generated
    private Double percentComplete;

    /*
     * Custom operation properties, populated only for a successful operation.
     */
    @Generated
    private Object properties;

    /*
     * Operation Error message
     */
    @Generated
    private ResponseError error;

    /**
     * Creates an instance of DevCenterOperationDetails class.
     *
     * @param status the status value to set.
     */
    @Generated
    private DevCenterOperationDetails(DevCenterOperationStatus status) {
        this.status = status;
    }

    /**
     * Get the id property: Fully qualified ID for the operation status.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The operation id name.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the status property: Provisioning state of the resource.
     *
     * @return the status value.
     */
    @Generated
    public DevCenterOperationStatus getStatus() {
        return this.status;
    }

    /**
     * Get the resourceId property: The id of the resource.
     *
     * @return the resourceId value.
     */
    @Generated
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Get the startTime property: The start time of the operation.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of the operation.
     *
     * @return the endTime value.
     */
    @Generated
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the percentComplete property: Percent of the operation that is complete.
     *
     * @return the percentComplete value.
     */
    @Generated
    public Double getPercentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the properties property: Custom operation properties, populated only for a successful operation.
     *
     * @return the properties value.
     */
    @Generated
    public Object getProperties() {
        return this.properties;
    }

    /**
     * Get the error property: Operation Error message.
     *
     * @return the error value.
     */
    @Generated
    public ResponseError getError() {
        return this.error;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeNumberField("percentComplete", this.percentComplete);
        jsonWriter.writeUntypedField("properties", this.properties);
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DevCenterOperationDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DevCenterOperationDetails if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DevCenterOperationDetails.
     */
    @Generated
    public static DevCenterOperationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            DevCenterOperationStatus status = null;
            String name = null;
            String resourceId = null;
            OffsetDateTime startTime = null;
            OffsetDateTime endTime = null;
            Double percentComplete = null;
            Object properties = null;
            ResponseError error = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("status".equals(fieldName)) {
                    status = DevCenterOperationStatus.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("resourceId".equals(fieldName)) {
                    resourceId = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    startTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    endTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("percentComplete".equals(fieldName)) {
                    percentComplete = reader.getNullable(JsonReader::getDouble);
                } else if ("properties".equals(fieldName)) {
                    properties = reader.readUntyped();
                } else if ("error".equals(fieldName)) {
                    error = ResponseError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            DevCenterOperationDetails deserializedDevCenterOperationDetails = new DevCenterOperationDetails(status);
            deserializedDevCenterOperationDetails.id = id;
            deserializedDevCenterOperationDetails.name = name;
            deserializedDevCenterOperationDetails.resourceId = resourceId;
            deserializedDevCenterOperationDetails.startTime = startTime;
            deserializedDevCenterOperationDetails.endTime = endTime;
            deserializedDevCenterOperationDetails.percentComplete = percentComplete;
            deserializedDevCenterOperationDetails.properties = properties;
            deserializedDevCenterOperationDetails.error = error;
            return deserializedDevCenterOperationDetails;
        });
    }
}
