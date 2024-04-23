// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Base type for data deletion detection policies. */
@Immutable
public abstract class DataDeletionDetectionPolicy implements JsonSerializable<DataDeletionDetectionPolicy> {
    /** Creates an instance of DataDeletionDetectionPolicy class. */
    public DataDeletionDetectionPolicy() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataDeletionDetectionPolicy from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataDeletionDetectionPolicy if the JsonReader was pointing to an instance of it, or null
     *     if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the DataDeletionDetectionPolicy.
     */
    public static DataDeletionDetectionPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    String discriminatorValue = null;
                    JsonReader readerToUse = reader.bufferObject();

                    readerToUse.nextToken(); // Prepare for reading
                    while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = readerToUse.getFieldName();
                        readerToUse.nextToken();
                        if ("@odata.type".equals(fieldName)) {
                            discriminatorValue = readerToUse.getString();
                            break;
                        } else {
                            readerToUse.skipChildren();
                        }
                    }

                    if (discriminatorValue != null) {
                        readerToUse = readerToUse.reset();
                    }
                    // Use the discriminator value to determine which subtype should be deserialized.
                    if ("#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy".equals(discriminatorValue)) {
                        return SoftDeleteColumnDeletionDetectionPolicy.fromJson(readerToUse);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field '@odata.type' didn't match one of the expected values '#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy'");
                    }
                });
    }
}
