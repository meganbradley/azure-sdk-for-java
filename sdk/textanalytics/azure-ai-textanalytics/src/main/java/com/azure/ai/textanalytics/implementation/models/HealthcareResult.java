// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The HealthcareResult model. */
@Fluent
public final class HealthcareResult extends PreBuiltResult {
    /*
     * The documents property.
     */
    @JsonProperty(value = "documents", required = true)
    private List<HealthcareEntitiesDocumentResultWithDocumentDetectedLanguage> documents;

    /**
     * Get the documents property: The documents property.
     *
     * @return the documents value.
     */
    public List<HealthcareEntitiesDocumentResultWithDocumentDetectedLanguage> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: The documents property.
     *
     * @param documents the documents value to set.
     * @return the HealthcareResult object itself.
     */
    public HealthcareResult setDocuments(List<HealthcareEntitiesDocumentResultWithDocumentDetectedLanguage> documents) {
        this.documents = documents;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthcareResult setErrors(List<InputError> errors) {
        super.setErrors(errors);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthcareResult setStatistics(RequestStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HealthcareResult setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }
}
