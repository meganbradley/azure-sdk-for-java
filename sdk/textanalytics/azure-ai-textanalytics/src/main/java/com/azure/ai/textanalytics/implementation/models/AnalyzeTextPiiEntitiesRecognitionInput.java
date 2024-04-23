// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The AnalyzeTextPiiEntitiesRecognitionInput model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("PiiEntityRecognition")
@Fluent
public final class AnalyzeTextPiiEntitiesRecognitionInput extends AnalyzeTextTask {
    /*
     * The analysisInput property.
     */
    @JsonProperty(value = "analysisInput")
    private MultiLanguageAnalysisInput analysisInput;

    /*
     * Supported parameters for a PII Entities Recognition task.
     */
    @JsonProperty(value = "parameters")
    private PiiTaskParameters parameters;

    /** Creates an instance of AnalyzeTextPiiEntitiesRecognitionInput class. */
    public AnalyzeTextPiiEntitiesRecognitionInput() {}

    /**
     * Get the analysisInput property: The analysisInput property.
     *
     * @return the analysisInput value.
     */
    public MultiLanguageAnalysisInput getAnalysisInput() {
        return this.analysisInput;
    }

    /**
     * Set the analysisInput property: The analysisInput property.
     *
     * @param analysisInput the analysisInput value to set.
     * @return the AnalyzeTextPiiEntitiesRecognitionInput object itself.
     */
    public AnalyzeTextPiiEntitiesRecognitionInput setAnalysisInput(MultiLanguageAnalysisInput analysisInput) {
        this.analysisInput = analysisInput;
        return this;
    }

    /**
     * Get the parameters property: Supported parameters for a PII Entities Recognition task.
     *
     * @return the parameters value.
     */
    public PiiTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for a PII Entities Recognition task.
     *
     * @param parameters the parameters value to set.
     * @return the AnalyzeTextPiiEntitiesRecognitionInput object itself.
     */
    public AnalyzeTextPiiEntitiesRecognitionInput setParameters(PiiTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
