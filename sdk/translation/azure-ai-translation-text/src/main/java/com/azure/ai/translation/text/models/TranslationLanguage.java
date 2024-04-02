// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The value of the translation property is a dictionary of (key, value) pairs. Each key is a BCP 47 language tag.
 * A key identifies a language for which text can be translated to or translated from.
 */
@Immutable
public final class TranslationLanguage {

    /*
     * Display name of the language in the locale requested via Accept-Language header.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of the language in the locale native for this language.
     */
    @Generated
    @JsonProperty(value = "nativeName")
    private String nativeName;

    /*
     * Directionality, which is rtl for right-to-left languages or ltr for left-to-right languages.
     */
    @Generated
    @JsonProperty(value = "dir")
    private String dir;

    /**
     * Creates an instance of TranslationLanguage class.
     *
     * @param name the name value to set.
     * @param nativeName the nativeName value to set.
     * @param dir the dir value to set.
     */
    @Generated
    @JsonCreator
    private TranslationLanguage(@JsonProperty(value = "name") String name,
        @JsonProperty(value = "nativeName") String nativeName, @JsonProperty(value = "dir") String dir) {
        this.name = name;
        this.nativeName = nativeName;
        this.dir = dir;
    }

    /**
     * Get the name property: Display name of the language in the locale requested via Accept-Language header.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the nativeName property: Display name of the language in the locale native for this language.
     *
     * @return the nativeName value.
     */
    @Generated
    public String getNativeName() {
        return this.nativeName;
    }

    /**
     * Get the dir property: Directionality, which is rtl for right-to-left languages or ltr for left-to-right
     * languages.
     *
     * @return the dir value.
     */
    @Generated
    public String getDir() {
        return this.dir;
    }
}
