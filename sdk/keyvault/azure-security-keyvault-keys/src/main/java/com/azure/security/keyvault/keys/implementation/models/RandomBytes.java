// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** The get random bytes response object containing the bytes. */
@Fluent
public final class RandomBytes implements JsonSerializable<RandomBytes> {
    /*
     * The bytes encoded as a base64url string.
     */
    private Base64Url value;

    /** Creates an instance of RandomBytes class. */
    public RandomBytes() {}

    /**
     * Get the value property: The bytes encoded as a base64url string.
     *
     * @return the value value.
     */
    public byte[] getValue() {
        if (this.value == null) {
            return null;
        }
        return this.value.decodedBytes();
    }

    /**
     * Set the value property: The bytes encoded as a base64url string.
     *
     * @param value the value value to set.
     * @return the RandomBytes object itself.
     */
    public RandomBytes setValue(byte[] value) {
        if (value == null) {
            this.value = null;
        } else {
            this.value = Base64Url.encode(CoreUtils.clone(value));
        }
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", Objects.toString(this.value, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RandomBytes from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RandomBytes if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RandomBytes.
     */
    public static RandomBytes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    RandomBytes deserializedRandomBytes = new RandomBytes();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("value".equals(fieldName)) {
                            deserializedRandomBytes.value =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedRandomBytes;
                });
    }
}
