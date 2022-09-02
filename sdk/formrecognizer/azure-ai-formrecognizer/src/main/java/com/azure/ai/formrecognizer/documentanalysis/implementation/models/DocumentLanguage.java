// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing the detected language for a given text span. */
@Fluent
public final class DocumentLanguage {
    /*
     * Detected language.  Value may an ISO 639-1 language code (ex. "en",
     * "fr") or BCP 47 language tag (ex. "zh-Hans").
     */
    @JsonProperty(value = "locale", required = true)
    private String locale;

    /*
     * Location of the text elements in the concatenated content the language
     * applies to.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /*
     * Confidence of correctly identifying the language.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /**
     * Get the locale property: Detected language. Value may an ISO 639-1 language code (ex. "en", "fr") or BCP 47
     * language tag (ex. "zh-Hans").
     *
     * @return the locale value.
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * Set the locale property: Detected language. Value may an ISO 639-1 language code (ex. "en", "fr") or BCP 47
     * language tag (ex. "zh-Hans").
     *
     * @param locale the locale value to set.
     * @return the DocumentLanguage object itself.
     */
    public DocumentLanguage setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get the spans property: Location of the text elements in the concatenated content the language applies to.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the text elements in the concatenated content the language applies to.
     *
     * @param spans the spans value to set.
     * @return the DocumentLanguage object itself.
     */
    public DocumentLanguage setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }

    /**
     * Get the confidence property: Confidence of correctly identifying the language.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence of correctly identifying the language.
     *
     * @param confidence the confidence value to set.
     * @return the DocumentLanguage object itself.
     */
    public DocumentLanguage setConfidence(float confidence) {
        this.confidence = confidence;
        return this;
    }
}
