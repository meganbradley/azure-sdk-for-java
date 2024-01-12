// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The event data for a Job output asset.
 */
@Fluent
public final class MediaJobOutputAsset extends MediaJobOutput {
    /*
     * Gets the Job output asset name.
     */
    private String assetName;

    /**
     * Creates an instance of MediaJobOutputAsset class.
     */
    public MediaJobOutputAsset() {
    }

    /**
     * Get the assetName property: Gets the Job output asset name.
     * 
     * @return the assetName value.
     */
    public String getAssetName() {
        return this.assetName;
    }

    /**
     * Set the assetName property: Gets the Job output asset name.
     * 
     * @param assetName the assetName value to set.
     * @return the MediaJobOutputAsset object itself.
     */
    public MediaJobOutputAsset setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobOutputAsset setError(MediaJobError error) {
        super.setError(error);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobOutputAsset setLabel(String label) {
        super.setLabel(label);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobOutputAsset setProgress(long progress) {
        super.setProgress(progress);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MediaJobOutputAsset setState(MediaJobState state) {
        super.setState(state);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Media.JobOutputAsset");
        jsonWriter.writeLongField("progress", getProgress());
        jsonWriter.writeStringField("state", getState() == null ? null : getState().toString());
        jsonWriter.writeJsonField("error", getError());
        jsonWriter.writeStringField("label", getLabel());
        jsonWriter.writeStringField("assetName", this.assetName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaJobOutputAsset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaJobOutputAsset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the MediaJobOutputAsset.
     */
    public static MediaJobOutputAsset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaJobOutputAsset deserializedMediaJobOutputAsset = new MediaJobOutputAsset();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    String odataType = reader.getString();
                    if (!"#Microsoft.Media.JobOutputAsset".equals(odataType)) {
                        throw new IllegalStateException(
                            "'@odata.type' was expected to be non-null and equal to '#Microsoft.Media.JobOutputAsset'. The found '@odata.type' was '"
                                + odataType + "'.");
                    }
                } else if ("progress".equals(fieldName)) {
                    deserializedMediaJobOutputAsset.setProgress(reader.getLong());
                } else if ("state".equals(fieldName)) {
                    deserializedMediaJobOutputAsset.setState(MediaJobState.fromString(reader.getString()));
                } else if ("error".equals(fieldName)) {
                    deserializedMediaJobOutputAsset.setError(MediaJobError.fromJson(reader));
                } else if ("label".equals(fieldName)) {
                    deserializedMediaJobOutputAsset.setLabel(reader.getString());
                } else if ("assetName".equals(fieldName)) {
                    deserializedMediaJobOutputAsset.assetName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaJobOutputAsset;
        });
    }
}
