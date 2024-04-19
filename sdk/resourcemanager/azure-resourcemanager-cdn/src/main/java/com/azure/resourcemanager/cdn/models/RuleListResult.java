// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.fluent.models.RuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list rules. It contains a list of rule objects and a URL link to get the next set of
 * results.
 */
@Fluent
public final class RuleListResult {
    /*
     * List of AzureFrontDoor rules within a rule set.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<RuleInner> value;

    /*
     * URL to get the next set of rule objects if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of RuleListResult class.
     */
    public RuleListResult() {
    }

    /**
     * Get the value property: List of AzureFrontDoor rules within a rule set.
     * 
     * @return the value value.
     */
    public List<RuleInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of rule objects if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of rule objects if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the RuleListResult object itself.
     */
    public RuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
