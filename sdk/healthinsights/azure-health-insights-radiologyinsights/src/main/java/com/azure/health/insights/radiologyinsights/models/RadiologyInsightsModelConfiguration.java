// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Configuration affecting the Radiology Insights model's inference.
 */
@Fluent
public final class RadiologyInsightsModelConfiguration {

    /*
     * An indication whether the model should produce verbose output.
     */
    @Generated
    @JsonProperty(value = "verbose")
    private Boolean verbose;

    /*
     * An indication whether the model's output should include evidence for the inferences.
     */
    @Generated
    @JsonProperty(value = "includeEvidence")
    private Boolean includeEvidence;

    /*
     * This is a list of inference types to be inferred for the current request. It could be used if only part of the
     * Radiology Insights inferences are required. If this list is omitted or empty, the model will return all the
     * inference types.
     */
    @Generated
    @JsonProperty(value = "inferenceTypes")
    private List<RadiologyInsightsInferenceType> inferenceTypes;

    /*
     * Options regarding follow up recommendation inferences and finding inferences.
     */
    @Generated
    @JsonProperty(value = "inferenceOptions")
    private RadiologyInsightsInferenceOptions inferenceOptions;

    /*
     * Local for the model to use. If not specified, the model will use the default locale.
     */
    @Generated
    @JsonProperty(value = "locale")
    private String locale;

    /**
     * Creates an instance of RadiologyInsightsModelConfiguration class.
     */
    @Generated
    public RadiologyInsightsModelConfiguration() {
    }

    /**
     * Get the verbose property: An indication whether the model should produce verbose output.
     *
     * @return the verbose value.
     */
    @Generated
    public Boolean isVerbose() {
        return this.verbose;
    }

    /**
     * Set the verbose property: An indication whether the model should produce verbose output.
     *
     * @param verbose the verbose value to set.
     * @return the RadiologyInsightsModelConfiguration object itself.
     */
    @Generated
    public RadiologyInsightsModelConfiguration setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }

    /**
     * Get the includeEvidence property: An indication whether the model's output should include evidence for the
     * inferences.
     *
     * @return the includeEvidence value.
     */
    @Generated
    public Boolean isIncludeEvidence() {
        return this.includeEvidence;
    }

    /**
     * Set the includeEvidence property: An indication whether the model's output should include evidence for the
     * inferences.
     *
     * @param includeEvidence the includeEvidence value to set.
     * @return the RadiologyInsightsModelConfiguration object itself.
     */
    @Generated
    public RadiologyInsightsModelConfiguration setIncludeEvidence(Boolean includeEvidence) {
        this.includeEvidence = includeEvidence;
        return this;
    }

    /**
     * Get the inferenceTypes property: This is a list of inference types to be inferred for the current request. It
     * could be used if only part of the Radiology Insights inferences are required. If this list is omitted or empty,
     * the model will return all the inference types.
     *
     * @return the inferenceTypes value.
     */
    @Generated
    public List<RadiologyInsightsInferenceType> getInferenceTypes() {
        return this.inferenceTypes;
    }

    /**
     * Set the inferenceTypes property: This is a list of inference types to be inferred for the current request. It
     * could be used if only part of the Radiology Insights inferences are required. If this list is omitted or empty,
     * the model will return all the inference types.
     *
     * @param inferenceTypes the inferenceTypes value to set.
     * @return the RadiologyInsightsModelConfiguration object itself.
     */
    @Generated
    public RadiologyInsightsModelConfiguration setInferenceTypes(List<RadiologyInsightsInferenceType> inferenceTypes) {
        this.inferenceTypes = inferenceTypes;
        return this;
    }

    /**
     * Get the inferenceOptions property: Options regarding follow up recommendation inferences and finding inferences.
     *
     * @return the inferenceOptions value.
     */
    @Generated
    public RadiologyInsightsInferenceOptions getInferenceOptions() {
        return this.inferenceOptions;
    }

    /**
     * Set the inferenceOptions property: Options regarding follow up recommendation inferences and finding inferences.
     *
     * @param inferenceOptions the inferenceOptions value to set.
     * @return the RadiologyInsightsModelConfiguration object itself.
     */
    @Generated
    public RadiologyInsightsModelConfiguration setInferenceOptions(RadiologyInsightsInferenceOptions inferenceOptions) {
        this.inferenceOptions = inferenceOptions;
        return this;
    }

    /**
     * Get the locale property: Local for the model to use. If not specified, the model will use the default locale.
     *
     * @return the locale value.
     */
    @Generated
    public String getLocale() {
        return this.locale;
    }

    /**
     * Set the locale property: Local for the model to use. If not specified, the model will use the default locale.
     *
     * @param locale the locale value to set.
     * @return the RadiologyInsightsModelConfiguration object itself.
     */
    @Generated
    public RadiologyInsightsModelConfiguration setLocale(String locale) {
        this.locale = locale;
        return this;
    }
}
