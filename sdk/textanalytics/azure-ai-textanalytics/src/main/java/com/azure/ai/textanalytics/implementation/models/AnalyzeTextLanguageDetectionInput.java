// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The AnalyzeTextLanguageDetectionInput model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("LanguageDetection")
@Fluent
public final class AnalyzeTextLanguageDetectionInput extends AnalyzeTextTask {
    /*
     * The analysisInput property.
     */
    @JsonProperty(value = "analysisInput")
    private LanguageDetectionAnalysisInput analysisInput;

    /*
     * Supported parameters for a Language Detection task.
     */
    @JsonProperty(value = "parameters")
    private LanguageDetectionTaskParameters parameters;

    /**
     * Get the analysisInput property: The analysisInput property.
     *
     * @return the analysisInput value.
     */
    public LanguageDetectionAnalysisInput getAnalysisInput() {
        return this.analysisInput;
    }

    /**
     * Set the analysisInput property: The analysisInput property.
     *
     * @param analysisInput the analysisInput value to set.
     * @return the AnalyzeTextLanguageDetectionInput object itself.
     */
    public AnalyzeTextLanguageDetectionInput setAnalysisInput(LanguageDetectionAnalysisInput analysisInput) {
        this.analysisInput = analysisInput;
        return this;
    }

    /**
     * Get the parameters property: Supported parameters for a Language Detection task.
     *
     * @return the parameters value.
     */
    public LanguageDetectionTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for a Language Detection task.
     *
     * @param parameters the parameters value to set.
     * @return the AnalyzeTextLanguageDetectionInput object itself.
     */
    public AnalyzeTextLanguageDetectionInput setParameters(LanguageDetectionTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
