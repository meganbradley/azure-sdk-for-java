// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/** Abstract class to share properties between concrete selectors. */
@Fluent
public abstract class SearchIndexerKnowledgeStoreProjectionSelector
        implements JsonSerializable<SearchIndexerKnowledgeStoreProjectionSelector> {
    /*
     * Name of reference key to different projection.
     */
    private String referenceKeyName;

    /*
     * Name of generated key to store projection under.
     */
    private String generatedKeyName;

    /*
     * Source data to project.
     */
    private String source;

    /*
     * Source context for complex projections.
     */
    private String sourceContext;

    /*
     * Nested inputs for complex projections.
     */
    private List<InputFieldMappingEntry> inputs;

    /** Creates an instance of SearchIndexerKnowledgeStoreProjectionSelector class. */
    public SearchIndexerKnowledgeStoreProjectionSelector() {}

    /**
     * Get the referenceKeyName property: Name of reference key to different projection.
     *
     * @return the referenceKeyName value.
     */
    public String getReferenceKeyName() {
        return this.referenceKeyName;
    }

    /**
     * Set the referenceKeyName property: Name of reference key to different projection.
     *
     * @param referenceKeyName the referenceKeyName value to set.
     * @return the SearchIndexerKnowledgeStoreProjectionSelector object itself.
     */
    public SearchIndexerKnowledgeStoreProjectionSelector setReferenceKeyName(String referenceKeyName) {
        this.referenceKeyName = referenceKeyName;
        return this;
    }

    /**
     * Get the generatedKeyName property: Name of generated key to store projection under.
     *
     * @return the generatedKeyName value.
     */
    public String getGeneratedKeyName() {
        return this.generatedKeyName;
    }

    /**
     * Set the generatedKeyName property: Name of generated key to store projection under.
     *
     * @param generatedKeyName the generatedKeyName value to set.
     * @return the SearchIndexerKnowledgeStoreProjectionSelector object itself.
     */
    public SearchIndexerKnowledgeStoreProjectionSelector setGeneratedKeyName(String generatedKeyName) {
        this.generatedKeyName = generatedKeyName;
        return this;
    }

    /**
     * Get the source property: Source data to project.
     *
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: Source data to project.
     *
     * @param source the source value to set.
     * @return the SearchIndexerKnowledgeStoreProjectionSelector object itself.
     */
    public SearchIndexerKnowledgeStoreProjectionSelector setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sourceContext property: Source context for complex projections.
     *
     * @return the sourceContext value.
     */
    public String getSourceContext() {
        return this.sourceContext;
    }

    /**
     * Set the sourceContext property: Source context for complex projections.
     *
     * @param sourceContext the sourceContext value to set.
     * @return the SearchIndexerKnowledgeStoreProjectionSelector object itself.
     */
    public SearchIndexerKnowledgeStoreProjectionSelector setSourceContext(String sourceContext) {
        this.sourceContext = sourceContext;
        return this;
    }

    /**
     * Get the inputs property: Nested inputs for complex projections.
     *
     * @return the inputs value.
     */
    public List<InputFieldMappingEntry> getInputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: Nested inputs for complex projections.
     *
     * @param inputs the inputs value to set.
     * @return the SearchIndexerKnowledgeStoreProjectionSelector object itself.
     */
    public SearchIndexerKnowledgeStoreProjectionSelector setInputs(List<InputFieldMappingEntry> inputs) {
        this.inputs = inputs;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("referenceKeyName", this.referenceKeyName);
        jsonWriter.writeStringField("generatedKeyName", this.generatedKeyName);
        jsonWriter.writeStringField("source", this.source);
        jsonWriter.writeStringField("sourceContext", this.sourceContext);
        jsonWriter.writeArrayField("inputs", this.inputs, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }
}
