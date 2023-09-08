// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Validation configuration properties. */
@Fluent
public final class ValidateConfigurationProperties {
    /*
     * Validate action that to be performed
     */
    @JsonProperty(value = "validateAction")
    private ValidateAction validateAction;

    /** Creates an instance of ValidateConfigurationProperties class. */
    public ValidateConfigurationProperties() {
    }

    /**
     * Get the validateAction property: Validate action that to be performed.
     *
     * @return the validateAction value.
     */
    public ValidateAction validateAction() {
        return this.validateAction;
    }

    /**
     * Set the validateAction property: Validate action that to be performed.
     *
     * @param validateAction the validateAction value to set.
     * @return the ValidateConfigurationProperties object itself.
     */
    public ValidateConfigurationProperties withValidateAction(ValidateAction validateAction) {
        this.validateAction = validateAction;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
