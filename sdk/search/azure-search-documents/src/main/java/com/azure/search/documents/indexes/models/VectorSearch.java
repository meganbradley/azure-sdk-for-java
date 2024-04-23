// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/** Contains configuration options related to vector search. */
@Fluent
public final class VectorSearch implements JsonSerializable<VectorSearch> {

    /*
     * Defines combinations of configurations to use with vector search.
     */
    private List<VectorSearchProfile> profiles;

    /*
     * Contains configuration options specific to the algorithm used during indexing or querying.
     */
    private List<VectorSearchAlgorithmConfiguration> algorithms;

    /** Creates an instance of VectorSearch class. */
    public VectorSearch() {}

    /**
     * Get the profiles property: Defines combinations of configurations to use with vector search.
     *
     * @return the profiles value.
     */
    public List<VectorSearchProfile> getProfiles() {
        return this.profiles;
    }

    /**
     * Set the profiles property: Defines combinations of configurations to use with vector search.
     *
     * @param profiles the profiles value to set.
     * @return the VectorSearch object itself.
     */
    public VectorSearch setProfiles(List<VectorSearchProfile> profiles) {
        this.profiles = profiles;
        return this;
    }

    /**
     * Get the algorithms property: Contains configuration options specific to the algorithm used during indexing or
     * querying.
     *
     * @return the algorithms value.
     */
    public List<VectorSearchAlgorithmConfiguration> getAlgorithms() {
        return this.algorithms;
    }

    /**
     * Set the algorithms property: Contains configuration options specific to the algorithm used during indexing or
     * querying.
     *
     * @param algorithms the algorithms value to set.
     * @return the VectorSearch object itself.
     */
    public VectorSearch setAlgorithms(List<VectorSearchAlgorithmConfiguration> algorithms) {
        this.algorithms = algorithms;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("profiles", this.profiles, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("algorithms", this.algorithms, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VectorSearch from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of VectorSearch if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the VectorSearch.
     */
    public static VectorSearch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    VectorSearch deserializedVectorSearch = new VectorSearch();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();
                        if ("profiles".equals(fieldName)) {
                            List<VectorSearchProfile> profiles =
                                    reader.readArray(reader1 -> VectorSearchProfile.fromJson(reader1));
                            deserializedVectorSearch.profiles = profiles;
                        } else if ("algorithms".equals(fieldName)) {
                            List<VectorSearchAlgorithmConfiguration> algorithms =
                                    reader.readArray(reader1 -> VectorSearchAlgorithmConfiguration.fromJson(reader1));
                            deserializedVectorSearch.algorithms = algorithms;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    return deserializedVectorSearch;
                });
    }

    /**
     * Set the profiles property: Defines combinations of configurations to use with vector search.
     *
     * @param profiles the profiles value to set.
     * @return the VectorSearch object itself.
     */
    public VectorSearch setProfiles(VectorSearchProfile... profiles) {
        this.profiles = (profiles == null) ? null : java.util.Arrays.asList(profiles);
        return this;
    }

    /**
     * Set the algorithms property: Contains configuration options specific to the algorithm used during indexing or
     * querying.
     *
     * @param algorithms the algorithms value to set.
     * @return the VectorSearch object itself.
     */
    public VectorSearch setAlgorithms(VectorSearchAlgorithmConfiguration... algorithms) {
        this.algorithms = (algorithms == null) ? null : java.util.Arrays.asList(algorithms);
        return this;
    }
}
