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

/** Supported parameters for a Custom Entities task. */
@Fluent
public final class CustomEntitiesTaskParameters extends CustomTaskParameters {
    /*
     * Specifies the method used to interpret string offsets.  Defaults to Text Elements (Graphemes) according to
     * Unicode v8.0.0. For additional information see https://aka.ms/text-analytics-offsets.
     */
    private StringIndexType stringIndexType;

    /** Creates an instance of CustomEntitiesTaskParameters class. */
    public CustomEntitiesTaskParameters() {}

    /**
     * Get the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the CustomEntitiesTaskParameters object itself.
     */
    public CustomEntitiesTaskParameters setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntitiesTaskParameters setProjectName(String projectName) {
        super.setProjectName(projectName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntitiesTaskParameters setDeploymentName(String deploymentName) {
        super.setDeploymentName(deploymentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntitiesTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        super.setLoggingOptOut(loggingOptOut);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("projectName", getProjectName());
        jsonWriter.writeStringField("deploymentName", getDeploymentName());
        jsonWriter.writeBooleanField("loggingOptOut", isLoggingOptOut());
        jsonWriter.writeStringField("stringIndexType", Objects.toString(this.stringIndexType, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomEntitiesTaskParameters from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomEntitiesTaskParameters if the JsonReader was pointing to an instance of it, or null
     *     if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomEntitiesTaskParameters.
     */
    public static CustomEntitiesTaskParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    CustomEntitiesTaskParameters deserializedCustomEntitiesTaskParameters =
                            new CustomEntitiesTaskParameters();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("projectName".equals(fieldName)) {
                            deserializedCustomEntitiesTaskParameters.setProjectName(reader.getString());
                        } else if ("deploymentName".equals(fieldName)) {
                            deserializedCustomEntitiesTaskParameters.setDeploymentName(reader.getString());
                        } else if ("loggingOptOut".equals(fieldName)) {
                            deserializedCustomEntitiesTaskParameters.setLoggingOptOut(
                                    reader.getNullable(JsonReader::getBoolean));
                        } else if ("stringIndexType".equals(fieldName)) {
                            deserializedCustomEntitiesTaskParameters.stringIndexType =
                                    StringIndexType.fromString(reader.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCustomEntitiesTaskParameters;
                });
    }
}
