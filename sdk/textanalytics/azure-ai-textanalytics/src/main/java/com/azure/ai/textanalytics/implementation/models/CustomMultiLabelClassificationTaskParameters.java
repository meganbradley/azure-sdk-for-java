// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;

/** Supported parameters for a Custom Multi Classification task. */
@Fluent
public final class CustomMultiLabelClassificationTaskParameters extends CustomTaskParameters {
    /** Creates an instance of CustomMultiLabelClassificationTaskParameters class. */
    public CustomMultiLabelClassificationTaskParameters() {}

    /** {@inheritDoc} */
    @Override
    public CustomMultiLabelClassificationTaskParameters setProjectName(String projectName) {
        super.setProjectName(projectName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomMultiLabelClassificationTaskParameters setDeploymentName(String deploymentName) {
        super.setDeploymentName(deploymentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomMultiLabelClassificationTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        super.setLoggingOptOut(loggingOptOut);
        return this;
    }
}
