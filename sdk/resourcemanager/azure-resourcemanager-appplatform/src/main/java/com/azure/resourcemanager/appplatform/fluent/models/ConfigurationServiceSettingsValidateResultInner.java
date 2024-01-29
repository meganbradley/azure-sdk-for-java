// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.models.ConfigurationServiceGitPropertyValidateResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Validation result for configuration service settings.
 */
@Fluent
public final class ConfigurationServiceSettingsValidateResultInner {
    /*
     * Validation result for configuration service settings
     */
    @JsonProperty(value = "gitPropertyValidationResult")
    private ConfigurationServiceGitPropertyValidateResult gitPropertyValidationResult;

    /**
     * Creates an instance of ConfigurationServiceSettingsValidateResultInner class.
     */
    public ConfigurationServiceSettingsValidateResultInner() {
    }

    /**
     * Get the gitPropertyValidationResult property: Validation result for configuration service settings.
     * 
     * @return the gitPropertyValidationResult value.
     */
    public ConfigurationServiceGitPropertyValidateResult gitPropertyValidationResult() {
        return this.gitPropertyValidationResult;
    }

    /**
     * Set the gitPropertyValidationResult property: Validation result for configuration service settings.
     * 
     * @param gitPropertyValidationResult the gitPropertyValidationResult value to set.
     * @return the ConfigurationServiceSettingsValidateResultInner object itself.
     */
    public ConfigurationServiceSettingsValidateResultInner
        withGitPropertyValidationResult(ConfigurationServiceGitPropertyValidateResult gitPropertyValidationResult) {
        this.gitPropertyValidationResult = gitPropertyValidationResult;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gitPropertyValidationResult() != null) {
            gitPropertyValidationResult().validate();
        }
    }
}
