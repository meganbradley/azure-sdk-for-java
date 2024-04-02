// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Element containing the text with translation.
 */
@Immutable
public final class DictionaryExampleTextItem extends InputTextItem {

    /*
     * A string specifying the translated text previously returned by the Dictionary lookup operation.
     * This should be the value from the normalizedTarget field in the translations list of the Dictionary
     * lookup response. The service will return examples for the specific source-target word-pair.
     */
    @Generated
    @JsonProperty(value = "translation")
    private String translation;

    /**
     * Creates an instance of DictionaryExampleTextItem class.
     *
     * @param text the text value to set.
     * @param translation the translation value to set.
     */
    @Generated
    @JsonCreator
    public DictionaryExampleTextItem(@JsonProperty(value = "text") String text,
        @JsonProperty(value = "translation") String translation) {
        super(text);
        this.translation = translation;
    }

    /**
     * Get the translation property: A string specifying the translated text previously returned by the Dictionary
     * lookup operation.
     * This should be the value from the normalizedTarget field in the translations list of the Dictionary
     * lookup response. The service will return examples for the specific source-target word-pair.
     *
     * @return the translation value.
     */
    @Generated
    public String getTranslation() {
        return this.translation;
    }
}
