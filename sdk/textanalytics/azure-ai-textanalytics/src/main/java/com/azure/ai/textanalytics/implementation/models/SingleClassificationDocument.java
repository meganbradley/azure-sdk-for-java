// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SingleClassificationDocument model. */
@Fluent
public final class SingleClassificationDocument {
    /*
     * Unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The classification property.
     */
    @JsonProperty(value = "classification", required = true)
    private ClassificationResult classification;

    /*
     * Warnings encountered while processing document.
     */
    @JsonProperty(value = "warnings", required = true)
    private List<TextAnalyticsWarning> warnings;

    /*
     * if showStats=true was specified in the request this field will contain
     * information about the document payload.
     */
    @JsonProperty(value = "statistics")
    private DocumentStatistics statistics;

    /**
     * Get the id property: Unique, non-empty document identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique, non-empty document identifier.
     *
     * @param id the id value to set.
     * @return the SingleClassificationDocument object itself.
     */
    public SingleClassificationDocument setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the classification property: The classification property.
     *
     * @return the classification value.
     */
    public ClassificationResult getClassification() {
        return this.classification;
    }

    /**
     * Set the classification property: The classification property.
     *
     * @param classification the classification value to set.
     * @return the SingleClassificationDocument object itself.
     */
    public SingleClassificationDocument setClassification(ClassificationResult classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get the warnings property: Warnings encountered while processing document.
     *
     * @return the warnings value.
     */
    public List<TextAnalyticsWarning> getWarnings() {
        return this.warnings;
    }

    /**
     * Set the warnings property: Warnings encountered while processing document.
     *
     * @param warnings the warnings value to set.
     * @return the SingleClassificationDocument object itself.
     */
    public SingleClassificationDocument setWarnings(List<TextAnalyticsWarning> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Get the statistics property: if showStats=true was specified in the request this field will contain information
     * about the document payload.
     *
     * @return the statistics value.
     */
    public DocumentStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the request this field will contain information
     * about the document payload.
     *
     * @param statistics the statistics value to set.
     * @return the SingleClassificationDocument object itself.
     */
    public SingleClassificationDocument setStatistics(DocumentStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
}
