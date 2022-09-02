// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A skill to split a string into chunks of text. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Skills.Text.SplitSkill")
@Fluent
public final class SplitSkill extends SearchIndexerSkill {

    /*
     * Identifies the concrete type of the skill.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Skills.Text.SplitSkill";

    /*
     * A value indicating which language code to use. Default is en.
     */
    @JsonProperty(value = "defaultLanguageCode")
    private SplitSkillLanguage defaultLanguageCode;

    /*
     * A value indicating which split mode to perform.
     */
    @JsonProperty(value = "textSplitMode")
    private TextSplitMode textSplitMode;

    /*
     * The desired maximum page length. Default is 10000.
     */
    @JsonProperty(value = "maximumPageLength")
    private Integer maximumPageLength;

    /**
     * Creates an instance of SplitSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @JsonCreator
    public SplitSkill(
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public SplitSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setDefaultLanguageCode(SplitSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the textSplitMode property: A value indicating which split mode to perform.
     *
     * @return the textSplitMode value.
     */
    public TextSplitMode getTextSplitMode() {
        return this.textSplitMode;
    }

    /**
     * Set the textSplitMode property: A value indicating which split mode to perform.
     *
     * @param textSplitMode the textSplitMode value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setTextSplitMode(TextSplitMode textSplitMode) {
        this.textSplitMode = textSplitMode;
        return this;
    }

    /**
     * Get the maximumPageLength property: The desired maximum page length. Default is 10000.
     *
     * @return the maximumPageLength value.
     */
    public Integer getMaximumPageLength() {
        return this.maximumPageLength;
    }

    /**
     * Set the maximumPageLength property: The desired maximum page length. Default is 10000.
     *
     * @param maximumPageLength the maximumPageLength value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setMaximumPageLength(Integer maximumPageLength) {
        this.maximumPageLength = maximumPageLength;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SplitSkill setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SplitSkill setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SplitSkill setContext(String context) {
        super.setContext(context);
        return this;
    }
}
