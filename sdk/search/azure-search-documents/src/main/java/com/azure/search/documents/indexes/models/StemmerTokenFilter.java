// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Language specific stemming filter. This token filter is implemented using Apache Lucene. */
@Immutable
public final class StemmerTokenFilter extends TokenFilter {
    /*
     * The language to use.
     */
    private final StemmerTokenFilterLanguage language;

    /**
     * Creates an instance of StemmerTokenFilter class.
     *
     * @param name the name value to set.
     * @param language the language value to set.
     */
    public StemmerTokenFilter(String name, StemmerTokenFilterLanguage language) {
        super(name);
        this.language = language;
    }

    /**
     * Get the language property: The language to use.
     *
     * @return the language value.
     */
    public StemmerTokenFilterLanguage getLanguage() {
        return this.language;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.StemmerTokenFilter");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("language", Objects.toString(this.language, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StemmerTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of StemmerTokenFilter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the StemmerTokenFilter.
     */
    public static StemmerTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean languageFound = false;
                    StemmerTokenFilterLanguage language = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Azure.Search.StemmerTokenFilter".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.StemmerTokenFilter'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("language".equals(fieldName)) {
                            language = StemmerTokenFilterLanguage.fromString(reader.getString());
                            languageFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound && languageFound) {
                        StemmerTokenFilter deserializedStemmerTokenFilter = new StemmerTokenFilter(name, language);

                        return deserializedStemmerTokenFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!languageFound) {
                        missingProperties.add("language");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
