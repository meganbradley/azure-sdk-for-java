// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Text Classification Multilabel task in AutoML NLP vertical. NLP - Natural Language Processing. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("TextClassificationMultilabel")
@Fluent
public final class TextClassificationMultilabel extends AutoMLVertical {
    /*
     * Primary metric for Text-Classification-Multilabel task.
     * Currently only Accuracy is supported as primary metric, hence user need
     * not set it explicitly.
     */
    @JsonProperty(value = "primaryMetric", access = JsonProperty.Access.WRITE_ONLY)
    private ClassificationMultilabelPrimaryMetrics primaryMetric;

    /*
     * Data inputs for AutoMLJob.
     */
    @JsonProperty(value = "dataSettings")
    private NlpVerticalDataSettings dataSettings;

    /*
     * Featurization inputs needed for AutoML job.
     */
    @JsonProperty(value = "featurizationSettings")
    private NlpVerticalFeaturizationSettings featurizationSettings;

    /*
     * Execution constraints for AutoMLJob.
     */
    @JsonProperty(value = "limitSettings")
    private NlpVerticalLimitSettings limitSettings;

    /**
     * Get the primaryMetric property: Primary metric for Text-Classification-Multilabel task. Currently only Accuracy
     * is supported as primary metric, hence user need not set it explicitly.
     *
     * @return the primaryMetric value.
     */
    public ClassificationMultilabelPrimaryMetrics primaryMetric() {
        return this.primaryMetric;
    }

    /**
     * Get the dataSettings property: Data inputs for AutoMLJob.
     *
     * @return the dataSettings value.
     */
    public NlpVerticalDataSettings dataSettings() {
        return this.dataSettings;
    }

    /**
     * Set the dataSettings property: Data inputs for AutoMLJob.
     *
     * @param dataSettings the dataSettings value to set.
     * @return the TextClassificationMultilabel object itself.
     */
    public TextClassificationMultilabel withDataSettings(NlpVerticalDataSettings dataSettings) {
        this.dataSettings = dataSettings;
        return this;
    }

    /**
     * Get the featurizationSettings property: Featurization inputs needed for AutoML job.
     *
     * @return the featurizationSettings value.
     */
    public NlpVerticalFeaturizationSettings featurizationSettings() {
        return this.featurizationSettings;
    }

    /**
     * Set the featurizationSettings property: Featurization inputs needed for AutoML job.
     *
     * @param featurizationSettings the featurizationSettings value to set.
     * @return the TextClassificationMultilabel object itself.
     */
    public TextClassificationMultilabel withFeaturizationSettings(
        NlpVerticalFeaturizationSettings featurizationSettings) {
        this.featurizationSettings = featurizationSettings;
        return this;
    }

    /**
     * Get the limitSettings property: Execution constraints for AutoMLJob.
     *
     * @return the limitSettings value.
     */
    public NlpVerticalLimitSettings limitSettings() {
        return this.limitSettings;
    }

    /**
     * Set the limitSettings property: Execution constraints for AutoMLJob.
     *
     * @param limitSettings the limitSettings value to set.
     * @return the TextClassificationMultilabel object itself.
     */
    public TextClassificationMultilabel withLimitSettings(NlpVerticalLimitSettings limitSettings) {
        this.limitSettings = limitSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TextClassificationMultilabel withLogVerbosity(LogVerbosity logVerbosity) {
        super.withLogVerbosity(logVerbosity);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataSettings() != null) {
            dataSettings().validate();
        }
        if (featurizationSettings() != null) {
            featurizationSettings().validate();
        }
        if (limitSettings() != null) {
            limitSettings().validate();
        }
    }
}
