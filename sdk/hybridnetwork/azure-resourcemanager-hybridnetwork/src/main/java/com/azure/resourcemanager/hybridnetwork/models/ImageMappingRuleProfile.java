// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image mapping rule profile.
 */
@Fluent
public final class ImageMappingRuleProfile {
    /*
     * List of values.
     */
    @JsonProperty(value = "userConfiguration")
    private String userConfiguration;

    /**
     * Creates an instance of ImageMappingRuleProfile class.
     */
    public ImageMappingRuleProfile() {
    }

    /**
     * Get the userConfiguration property: List of values.
     * 
     * @return the userConfiguration value.
     */
    public String userConfiguration() {
        return this.userConfiguration;
    }

    /**
     * Set the userConfiguration property: List of values.
     * 
     * @param userConfiguration the userConfiguration value to set.
     * @return the ImageMappingRuleProfile object itself.
     */
    public ImageMappingRuleProfile withUserConfiguration(String userConfiguration) {
        this.userConfiguration = userConfiguration;
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
