// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LanguageDetectionDocumentResult model. */
@Fluent
public final class LanguageDetectionDocumentResult extends DocumentResult {
    /*
     * Detected Language.
     */
    @JsonProperty(value = "detectedLanguage", required = true)
    private DetectedLanguage detectedLanguage;

    /**
     * Get the detectedLanguage property: Detected Language.
     *
     * @return the detectedLanguage value.
     */
    public DetectedLanguage getDetectedLanguage() {
        return this.detectedLanguage;
    }

    /**
     * Set the detectedLanguage property: Detected Language.
     *
     * @param detectedLanguage the detectedLanguage value to set.
     * @return the LanguageDetectionDocumentResult object itself.
     */
    public LanguageDetectionDocumentResult setDetectedLanguage(DetectedLanguage detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LanguageDetectionDocumentResult setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LanguageDetectionDocumentResult setWarnings(List<DocumentWarning> warnings) {
        super.setWarnings(warnings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LanguageDetectionDocumentResult setStatistics(DocumentStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }
}
