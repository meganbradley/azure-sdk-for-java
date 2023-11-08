// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** The pending certificate signing request result. */
@Immutable
public final class PendingCertificateSigningRequestResult
        implements JsonSerializable<PendingCertificateSigningRequestResult> {
    /*
     * The pending certificate signing request as Base64 encoded string.
     */
    private String value;

    /** Creates an instance of PendingCertificateSigningRequestResult class. */
    public PendingCertificateSigningRequestResult() {}

    /**
     * Get the value property: The pending certificate signing request as Base64 encoded string.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PendingCertificateSigningRequestResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PendingCertificateSigningRequestResult if the JsonReader was pointing to an instance of
     *     it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PendingCertificateSigningRequestResult.
     */
    public static PendingCertificateSigningRequestResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    PendingCertificateSigningRequestResult deserializedPendingCertificateSigningRequestResult =
                            new PendingCertificateSigningRequestResult();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("value".equals(fieldName)) {
                            deserializedPendingCertificateSigningRequestResult.value = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedPendingCertificateSigningRequestResult;
                });
    }
}
