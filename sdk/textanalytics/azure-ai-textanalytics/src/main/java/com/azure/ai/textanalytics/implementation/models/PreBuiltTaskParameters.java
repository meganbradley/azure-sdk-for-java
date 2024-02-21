// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters object for a text analysis task using pre-built models. */
@Fluent
public class PreBuiltTaskParameters extends TaskParameters {
    /*
     * The modelVersion property.
     */
    @JsonProperty(value = "modelVersion")
    private String modelVersion;

    /** Creates an instance of PreBuiltTaskParameters class. */
    public PreBuiltTaskParameters() {}

    /**
     * Get the modelVersion property: The modelVersion property.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The modelVersion property.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the PreBuiltTaskParameters object itself.
     */
    public PreBuiltTaskParameters setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PreBuiltTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        super.setLoggingOptOut(loggingOptOut);
        return this;
    }
}
