// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.selfhelp.models.SolutionNlpMetadataResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Successfully fetched list of solution metadata.
 */
@Fluent
public final class DiscoveryNlpResponseInner {
    /*
     * The list of solution metadata.
     */
    @JsonProperty(value = "value")
    private List<SolutionNlpMetadataResource> value;

    /**
     * Creates an instance of DiscoveryNlpResponseInner class.
     */
    public DiscoveryNlpResponseInner() {
    }

    /**
     * Get the value property: The list of solution metadata.
     * 
     * @return the value value.
     */
    public List<SolutionNlpMetadataResource> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of solution metadata.
     * 
     * @param value the value value to set.
     * @return the DiscoveryNlpResponseInner object itself.
     */
    public DiscoveryNlpResponseInner withValue(List<SolutionNlpMetadataResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
