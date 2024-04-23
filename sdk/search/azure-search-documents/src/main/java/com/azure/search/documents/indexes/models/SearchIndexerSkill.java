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
import com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkillV1;
import com.azure.search.documents.indexes.implementation.models.EntityRecognitionSkillV3;
import com.azure.search.documents.indexes.implementation.models.SentimentSkillV1;
import com.azure.search.documents.indexes.implementation.models.SentimentSkillV3;
import java.io.IOException;
import java.util.List;

/** Base type for skills. */
@Fluent
public abstract class SearchIndexerSkill implements JsonSerializable<SearchIndexerSkill> {
    /*
     * The name of the skill which uniquely identifies it within the skillset. A skill with no name defined will be
     * given a default name of its 1-based index in the skills array, prefixed with the character `#`.
     */
    private String name;

    /*
     * The description of the skill which describes the inputs, outputs, and usage of the skill.
     */
    private String description;

    /*
     * Represents the level at which operations take place, such as the document root or document content (for example,
     * /document or /document/content). The default is /document.
     */
    private String context;

    /*
     * Inputs of the skills could be a column in the source data set, or the output of an upstream skill.
     */
    private final List<InputFieldMappingEntry> inputs;

    /*
     * The output of a skill is either a field in a search index, or a value that can be consumed as an input by
     * another skill.
     */
    private final List<OutputFieldMappingEntry> outputs;

    /**
     * Creates an instance of SearchIndexerSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public SearchIndexerSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        this.inputs = inputs;
        this.outputs = outputs;
    }

    /**
     * Get the name property: The name of the skill which uniquely identifies it within the skillset. A skill with no
     * name defined will be given a default name of its 1-based index in the skills array, prefixed with the character
     * `#`.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the skill which uniquely identifies it within the skillset. A skill with no
     * name defined will be given a default name of its 1-based index in the skills array, prefixed with the character
     * `#`.
     *
     * @param name the name value to set.
     * @return the SearchIndexerSkill object itself.
     */
    public SearchIndexerSkill setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: The description of the skill which describes the inputs, outputs, and usage of the
     * skill.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the skill which describes the inputs, outputs, and usage of the
     * skill.
     *
     * @param description the description value to set.
     * @return the SearchIndexerSkill object itself.
     */
    public SearchIndexerSkill setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the context property: Represents the level at which operations take place, such as the document root or
     * document content (for example, /document or /document/content). The default is /document.
     *
     * @return the context value.
     */
    public String getContext() {
        return this.context;
    }

    /**
     * Set the context property: Represents the level at which operations take place, such as the document root or
     * document content (for example, /document or /document/content). The default is /document.
     *
     * @param context the context value to set.
     * @return the SearchIndexerSkill object itself.
     */
    public SearchIndexerSkill setContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get the inputs property: Inputs of the skills could be a column in the source data set, or the output of an
     * upstream skill.
     *
     * @return the inputs value.
     */
    public List<InputFieldMappingEntry> getInputs() {
        return this.inputs;
    }

    /**
     * Get the outputs property: The output of a skill is either a field in a search index, or a value that can be
     * consumed as an input by another skill.
     *
     * @return the outputs value.
     */
    public List<OutputFieldMappingEntry> getOutputs() {
        return this.outputs;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("inputs", this.inputs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", this.outputs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("context", this.context);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerSkill from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerSkill if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the SearchIndexerSkill.
     */
    public static SearchIndexerSkill fromJson(JsonReader jsonReader) throws IOException {
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
                    if ("#Microsoft.Skills.Util.ConditionalSkill".equals(discriminatorValue)) {
                        return ConditionalSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.KeyPhraseExtractionSkill".equals(discriminatorValue)) {
                        return KeyPhraseExtractionSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Vision.OcrSkill".equals(discriminatorValue)) {
                        return OcrSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Vision.ImageAnalysisSkill".equals(discriminatorValue)) {
                        return ImageAnalysisSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.LanguageDetectionSkill".equals(discriminatorValue)) {
                        return LanguageDetectionSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Util.ShaperSkill".equals(discriminatorValue)) {
                        return ShaperSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.MergeSkill".equals(discriminatorValue)) {
                        return MergeSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.V3.SentimentSkill".equals(discriminatorValue)) {
                        SentimentSkillV3 codegen = SentimentSkillV3.fromJson(readerToUse);
                        return (codegen == null) ? null : new SentimentSkill(codegen);
                    } else if ("#Microsoft.Skills.Text.V3.EntityLinkingSkill".equals(discriminatorValue)) {
                        return EntityLinkingSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.V3.EntityRecognitionSkill".equals(discriminatorValue)) {
                        EntityRecognitionSkillV3 codegen = EntityRecognitionSkillV3.fromJson(readerToUse);
                        return (codegen == null) ? null : new EntityRecognitionSkill(codegen);
                    } else if ("#Microsoft.Skills.Text.SplitSkill".equals(discriminatorValue)) {
                        return SplitSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.CustomEntityLookupSkill".equals(discriminatorValue)) {
                        return CustomEntityLookupSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.TranslationSkill".equals(discriminatorValue)) {
                        return TextTranslationSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Util.DocumentExtractionSkill".equals(discriminatorValue)) {
                        return DocumentExtractionSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Custom.WebApiSkill".equals(discriminatorValue)) {
                        return WebApiSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.PIIDetectionSkill".equals(discriminatorValue)) {
                        return PiiDetectionSkill.fromJson(readerToUse);
                    } else if ("#Microsoft.Skills.Text.EntityRecognitionSkill".equals(discriminatorValue)) {
                        EntityRecognitionSkillV1 codegen = EntityRecognitionSkillV1.fromJson(readerToUse);
                        return (codegen == null) ? null : new EntityRecognitionSkill(codegen);
                    } else if ("#Microsoft.Skills.Text.SentimentSkill".equals(discriminatorValue)) {
                        SentimentSkillV1 codegen = SentimentSkillV1.fromJson(readerToUse);
                        return (codegen == null) ? null : new SentimentSkill(codegen);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field '@odata.type' didn't match one of the expected values '#Microsoft.Skills.Util.ConditionalSkill', '#Microsoft.Skills.Text.KeyPhraseExtractionSkill', '#Microsoft.Skills.Vision.OcrSkill', '#Microsoft.Skills.Vision.ImageAnalysisSkill', '#Microsoft.Skills.Text.LanguageDetectionSkill', '#Microsoft.Skills.Util.ShaperSkill', '#Microsoft.Skills.Text.MergeSkill', '#Microsoft.Skills.Text.V3.SentimentSkill', '#Microsoft.Skills.Text.V3.EntityLinkingSkill', '#Microsoft.Skills.Text.V3.EntityRecognitionSkill', '#Microsoft.Skills.Text.SplitSkill', '#Microsoft.Skills.Text.CustomEntityLookupSkill', '#Microsoft.Skills.Text.TranslationSkill', '#Microsoft.Skills.Util.DocumentExtractionSkill', '#Microsoft.Skills.Custom.WebApiSkill', '#Microsoft.Skills.Text.PIIDetectionSkill', '#Microsoft.Skills.Text.EntityRecognitionSkill', or '#Microsoft.Skills.Text.SentimentSkill'. It was: '"
                                        + discriminatorValue
                                        + "'.");
                    }
                });
    }
}
