// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Supported parameters for a Custom Entities task. */
@Fluent
public final class CustomEntitiesTaskParameters extends CustomTaskParameters {
    /*
     * Specifies the method used to interpret string offsets.  Defaults to Text Elements (Graphemes) according to
     * Unicode v8.0.0. For additional information see https://aka.ms/text-analytics-offsets.
     */
    @JsonProperty(value = "stringIndexType")
    private StringIndexType stringIndexType;

    /** Creates an instance of CustomEntitiesTaskParameters class. */
    public CustomEntitiesTaskParameters() {}

    /**
     * Get the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the CustomEntitiesTaskParameters object itself.
     */
    public CustomEntitiesTaskParameters setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntitiesTaskParameters setProjectName(String projectName) {
        super.setProjectName(projectName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntitiesTaskParameters setDeploymentName(String deploymentName) {
        super.setDeploymentName(deploymentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEntitiesTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        super.setLoggingOptOut(loggingOptOut);
        return this;
    }
}
