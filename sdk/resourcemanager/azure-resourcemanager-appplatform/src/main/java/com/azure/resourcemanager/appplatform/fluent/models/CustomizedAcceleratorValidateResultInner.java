// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.models.CustomizedAcceleratorValidateResultState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Validation result for customized accelerator properties. */
@Fluent
public final class CustomizedAcceleratorValidateResultInner {
    /*
     * State of the customized accelerator validation result
     */
    @JsonProperty(value = "state")
    private CustomizedAcceleratorValidateResultState state;

    /*
     * The detail validation results
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /** Creates an instance of CustomizedAcceleratorValidateResultInner class. */
    public CustomizedAcceleratorValidateResultInner() {
    }

    /**
     * Get the state property: State of the customized accelerator validation result.
     *
     * @return the state value.
     */
    public CustomizedAcceleratorValidateResultState state() {
        return this.state;
    }

    /**
     * Set the state property: State of the customized accelerator validation result.
     *
     * @param state the state value to set.
     * @return the CustomizedAcceleratorValidateResultInner object itself.
     */
    public CustomizedAcceleratorValidateResultInner withState(CustomizedAcceleratorValidateResultState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the errorMessage property: The detail validation results.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: The detail validation results.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the CustomizedAcceleratorValidateResultInner object itself.
     */
    public CustomizedAcceleratorValidateResultInner withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
