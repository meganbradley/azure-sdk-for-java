// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.models.EntityCategory;
import com.azure.search.documents.indexes.models.EntityRecognitionSkillLanguage;
import com.azure.search.documents.indexes.models.InputFieldMappingEntry;
import com.azure.search.documents.indexes.models.OutputFieldMappingEntry;
import com.azure.search.documents.indexes.models.SearchIndexerSkill;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Text analytics entity recognition. */
@Fluent
public final class EntityRecognitionSkillV1 extends SearchIndexerSkill {
    /*
     * A list of entity categories that should be extracted.
     */
    private List<EntityCategory> categories;

    /*
     * A value indicating which language code to use. Default is `en`.
     */
    private EntityRecognitionSkillLanguage defaultLanguageCode;

    /*
     * Determines whether or not to include entities which are well known but don't conform to a pre-defined type. If
     * this configuration is not set (default), set to null or set to false, entities which don't conform to one of the
     * pre-defined types will not be surfaced.
     */
    private Boolean includeTypelessEntities;

    /*
     * A value between 0 and 1 that be used to only include entities whose confidence score is greater than the value
     * specified. If not set (default), or if explicitly set to null, all entities will be included.
     */
    private Double minimumPrecision;

    /**
     * Creates an instance of EntityRecognitionSkillV1 class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public EntityRecognitionSkillV1(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the categories property: A list of entity categories that should be extracted.
     *
     * @return the categories value.
     */
    public List<EntityCategory> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: A list of entity categories that should be extracted.
     *
     * @param categories the categories value to set.
     * @return the EntityRecognitionSkillV1 object itself.
     */
    public EntityRecognitionSkillV1 setCategories(List<EntityCategory> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is `en`.
     *
     * @return the defaultLanguageCode value.
     */
    public EntityRecognitionSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is `en`.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the EntityRecognitionSkillV1 object itself.
     */
    public EntityRecognitionSkillV1 setDefaultLanguageCode(EntityRecognitionSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the includeTypelessEntities property: Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set (default), set to null or set to false,
     * entities which don't conform to one of the pre-defined types will not be surfaced.
     *
     * @return the includeTypelessEntities value.
     */
    public Boolean isIncludeTypelessEntities() {
        return this.includeTypelessEntities;
    }

    /**
     * Set the includeTypelessEntities property: Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set (default), set to null or set to false,
     * entities which don't conform to one of the pre-defined types will not be surfaced.
     *
     * @param includeTypelessEntities the includeTypelessEntities value to set.
     * @return the EntityRecognitionSkillV1 object itself.
     */
    public EntityRecognitionSkillV1 setIncludeTypelessEntities(Boolean includeTypelessEntities) {
        this.includeTypelessEntities = includeTypelessEntities;
        return this;
    }

    /**
     * Get the minimumPrecision property: A value between 0 and 1 that be used to only include entities whose confidence
     * score is greater than the value specified. If not set (default), or if explicitly set to null, all entities will
     * be included.
     *
     * @return the minimumPrecision value.
     */
    public Double getMinimumPrecision() {
        return this.minimumPrecision;
    }

    /**
     * Set the minimumPrecision property: A value between 0 and 1 that be used to only include entities whose confidence
     * score is greater than the value specified. If not set (default), or if explicitly set to null, all entities will
     * be included.
     *
     * @param minimumPrecision the minimumPrecision value to set.
     * @return the EntityRecognitionSkillV1 object itself.
     */
    public EntityRecognitionSkillV1 setMinimumPrecision(Double minimumPrecision) {
        this.minimumPrecision = minimumPrecision;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityRecognitionSkillV1 setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityRecognitionSkillV1 setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EntityRecognitionSkillV1 setContext(String context) {
        super.setContext(context);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Skills.Text.EntityRecognitionSkill");
        jsonWriter.writeArrayField("inputs", getInputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", getOutputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("context", getContext());
        jsonWriter.writeArrayField(
                "categories",
                this.categories,
                (writer, element) -> writer.writeString(Objects.toString(element, null)));
        jsonWriter.writeStringField("defaultLanguageCode", Objects.toString(this.defaultLanguageCode, null));
        jsonWriter.writeBooleanField("includeTypelessEntities", this.includeTypelessEntities);
        jsonWriter.writeNumberField("minimumPrecision", this.minimumPrecision);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EntityRecognitionSkillV1 from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of EntityRecognitionSkillV1 if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the EntityRecognitionSkillV1.
     */
    public static EntityRecognitionSkillV1 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean inputsFound = false;
                    List<InputFieldMappingEntry> inputs = null;
                    boolean outputsFound = false;
                    List<OutputFieldMappingEntry> outputs = null;
                    String name = null;
                    String description = null;
                    String context = null;
                    List<EntityCategory> categories = null;
                    EntityRecognitionSkillLanguage defaultLanguageCode = null;
                    Boolean includeTypelessEntities = null;
                    Double minimumPrecision = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Skills.Text.EntityRecognitionSkill".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Skills.Text.EntityRecognitionSkill'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("inputs".equals(fieldName)) {
                            inputs = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                            inputsFound = true;
                        } else if ("outputs".equals(fieldName)) {
                            outputs = reader.readArray(reader1 -> OutputFieldMappingEntry.fromJson(reader1));
                            outputsFound = true;
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                        } else if ("description".equals(fieldName)) {
                            description = reader.getString();
                        } else if ("context".equals(fieldName)) {
                            context = reader.getString();
                        } else if ("categories".equals(fieldName)) {
                            categories = reader.readArray(reader1 -> EntityCategory.fromString(reader1.getString()));
                        } else if ("defaultLanguageCode".equals(fieldName)) {
                            defaultLanguageCode = EntityRecognitionSkillLanguage.fromString(reader.getString());
                        } else if ("includeTypelessEntities".equals(fieldName)) {
                            includeTypelessEntities = reader.getNullable(JsonReader::getBoolean);
                        } else if ("minimumPrecision".equals(fieldName)) {
                            minimumPrecision = reader.getNullable(JsonReader::getDouble);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (inputsFound && outputsFound) {
                        EntityRecognitionSkillV1 deserializedEntityRecognitionSkillV1 =
                                new EntityRecognitionSkillV1(inputs, outputs);
                        deserializedEntityRecognitionSkillV1.setName(name);
                        deserializedEntityRecognitionSkillV1.setDescription(description);
                        deserializedEntityRecognitionSkillV1.setContext(context);
                        deserializedEntityRecognitionSkillV1.categories = categories;
                        deserializedEntityRecognitionSkillV1.defaultLanguageCode = defaultLanguageCode;
                        deserializedEntityRecognitionSkillV1.includeTypelessEntities = includeTypelessEntities;
                        deserializedEntityRecognitionSkillV1.minimumPrecision = minimumPrecision;

                        return deserializedEntityRecognitionSkillV1;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!inputsFound) {
                        missingProperties.add("inputs");
                    }
                    if (!outputsFound) {
                        missingProperties.add("outputs");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
