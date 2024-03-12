// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Response for the languages API.
 */
@Immutable
public final class GetLanguagesResult {

    /*
     * Languages that support translate API.
     */
    @Generated
    @JsonProperty(value = "translation")
    private Map<String, TranslationLanguage> translation;

    /*
     * Languages that support transliteration API.
     */
    @Generated
    @JsonProperty(value = "transliteration")
    private Map<String, TransliterationLanguage> transliteration;

    /*
     * Languages that support dictionary API.
     */
    @Generated
    @JsonProperty(value = "dictionary")
    private Map<String, SourceDictionaryLanguage> dictionary;

    /**
     * Creates an instance of GetLanguagesResult class.
     */
    @Generated
    private GetLanguagesResult() {
    }

    /**
     * Get the translation property: Languages that support translate API.
     *
     * @return the translation value.
     */
    @Generated
    public Map<String, TranslationLanguage> getTranslation() {
        return this.translation;
    }

    /**
     * Get the transliteration property: Languages that support transliteration API.
     *
     * @return the transliteration value.
     */
    @Generated
    public Map<String, TransliterationLanguage> getTransliteration() {
        return this.transliteration;
    }

    /**
     * Get the dictionary property: Languages that support dictionary API.
     *
     * @return the dictionary value.
     */
    @Generated
    public Map<String, SourceDictionaryLanguage> getDictionary() {
        return this.dictionary;
    }
}
