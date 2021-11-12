// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A skill looks for text from a custom, user-defined list of words and phrases. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Skills.Text.CustomEntityLookupSkill")
@Fluent
public final class CustomEntityLookupSkill extends SearchIndexerSkill {
    /*
     * Identifies the concrete type of the skill.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Skills.Text.CustomEntityLookupSkill";

    /*
     * A value indicating which language code to use. Default is en.
     */
    @JsonProperty(value = "defaultLanguageCode")
    private CustomEntityLookupSkillLanguage defaultLanguageCode;

    /*
     * Path to a JSON or CSV file containing all the target text to match
     * against. This entity definition is read at the beginning of an indexer
     * run. Any updates to this file during an indexer run will not take effect
     * until subsequent runs. This config must be accessible over HTTPS.
     */
    @JsonProperty(value = "entitiesDefinitionUri")
    private String entitiesDefinitionUri;

    /*
     * The inline CustomEntity definition.
     */
    @JsonProperty(value = "inlineEntitiesDefinition")
    private List<CustomEntity> inlineEntitiesDefinition;

    /*
     * A global flag for CaseSensitive. If CaseSensitive is not set in
     * CustomEntity, this value will be the default value.
     */
    @JsonProperty(value = "globalDefaultCaseSensitive")
    private Boolean globalDefaultCaseSensitive;

    /*
     * A global flag for AccentSensitive. If AccentSensitive is not set in
     * CustomEntity, this value will be the default value.
     */
    @JsonProperty(value = "globalDefaultAccentSensitive")
    private Boolean globalDefaultAccentSensitive;

    /*
     * A global flag for FuzzyEditDistance. If FuzzyEditDistance is not set in
     * CustomEntity, this value will be the default value.
     */
    @JsonProperty(value = "globalDefaultFuzzyEditDistance")
    private Integer globalDefaultFuzzyEditDistance;

    /**
     * Creates an instance of CustomEntityLookupSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @JsonCreator
    public CustomEntityLookupSkill(
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public CustomEntityLookupSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setDefaultLanguageCode(CustomEntityLookupSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the entitiesDefinitionUri property: Path to a JSON or CSV file containing all the target text to match
     * against. This entity definition is read at the beginning of an indexer run. Any updates to this file during an
     * indexer run will not take effect until subsequent runs. This config must be accessible over HTTPS.
     *
     * @return the entitiesDefinitionUri value.
     */
    public String getEntitiesDefinitionUri() {
        return this.entitiesDefinitionUri;
    }

    /**
     * Set the entitiesDefinitionUri property: Path to a JSON or CSV file containing all the target text to match
     * against. This entity definition is read at the beginning of an indexer run. Any updates to this file during an
     * indexer run will not take effect until subsequent runs. This config must be accessible over HTTPS.
     *
     * @param entitiesDefinitionUri the entitiesDefinitionUri value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setEntitiesDefinitionUri(String entitiesDefinitionUri) {
        this.entitiesDefinitionUri = entitiesDefinitionUri;
        return this;
    }

    /**
     * Get the inlineEntitiesDefinition property: The inline CustomEntity definition.
     *
     * @return the inlineEntitiesDefinition value.
     */
    public List<CustomEntity> getInlineEntitiesDefinition() {
        return this.inlineEntitiesDefinition;
    }

    /**
     * Set the inlineEntitiesDefinition property: The inline CustomEntity definition.
     *
     * @param inlineEntitiesDefinition the inlineEntitiesDefinition value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    @JsonSetter
    public CustomEntityLookupSkill setInlineEntitiesDefinition(List<CustomEntity> inlineEntitiesDefinition) {
        this.inlineEntitiesDefinition = inlineEntitiesDefinition;
        return this;
    }

    /**
     * Get the globalDefaultCaseSensitive property: A global flag for CaseSensitive. If CaseSensitive is not set in
     * CustomEntity, this value will be the default value.
     *
     * @return the globalDefaultCaseSensitive value.
     */
    public Boolean isGlobalDefaultCaseSensitive() {
        return this.globalDefaultCaseSensitive;
    }

    /**
     * Set the globalDefaultCaseSensitive property: A global flag for CaseSensitive. If CaseSensitive is not set in
     * CustomEntity, this value will be the default value.
     *
     * @param globalDefaultCaseSensitive the globalDefaultCaseSensitive value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setGlobalDefaultCaseSensitive(Boolean globalDefaultCaseSensitive) {
        this.globalDefaultCaseSensitive = globalDefaultCaseSensitive;
        return this;
    }

    /**
     * Get the globalDefaultAccentSensitive property: A global flag for AccentSensitive. If AccentSensitive is not set
     * in CustomEntity, this value will be the default value.
     *
     * @return the globalDefaultAccentSensitive value.
     */
    public Boolean isGlobalDefaultAccentSensitive() {
        return this.globalDefaultAccentSensitive;
    }

    /**
     * Set the globalDefaultAccentSensitive property: A global flag for AccentSensitive. If AccentSensitive is not set
     * in CustomEntity, this value will be the default value.
     *
     * @param globalDefaultAccentSensitive the globalDefaultAccentSensitive value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setGlobalDefaultAccentSensitive(Boolean globalDefaultAccentSensitive) {
        this.globalDefaultAccentSensitive = globalDefaultAccentSensitive;
        return this;
    }

    /**
     * Get the globalDefaultFuzzyEditDistance property: A global flag for FuzzyEditDistance. If FuzzyEditDistance is not
     * set in CustomEntity, this value will be the default value.
     *
     * @return the globalDefaultFuzzyEditDistance value.
     */
    public Integer getGlobalDefaultFuzzyEditDistance() {
        return this.globalDefaultFuzzyEditDistance;
    }

    /**
     * Set the globalDefaultFuzzyEditDistance property: A global flag for FuzzyEditDistance. If FuzzyEditDistance is not
     * set in CustomEntity, this value will be the default value.
     *
     * @param globalDefaultFuzzyEditDistance the globalDefaultFuzzyEditDistance value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setGlobalDefaultFuzzyEditDistance(Integer globalDefaultFuzzyEditDistance) {
        this.globalDefaultFuzzyEditDistance = globalDefaultFuzzyEditDistance;
        return this;
    }

    /**
     * Set the inlineEntitiesDefinition property: The inline CustomEntity definition.
     *
     * @param inlineEntitiesDefinition the inlineEntitiesDefinition value to set.
     * @return the CustomEntityLookupSkill object itself.
     */
    public CustomEntityLookupSkill setInlineEntitiesDefinition(CustomEntity... inlineEntitiesDefinition) {
        this.inlineEntitiesDefinition =
                (inlineEntitiesDefinition == null) ? null : java.util.Arrays.asList(inlineEntitiesDefinition);
        return this;
    }
}
