// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resourcehealth.fluent.models.EmergingIssuesGetResultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of emerging issues. */
@Fluent
public final class EmergingIssueListResult {
    /*
     * The list of emerging issues.
     */
    @JsonProperty(value = "value")
    private List<EmergingIssuesGetResultInner> value;

    /*
     * The link used to get the next page of emerging issues.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of EmergingIssueListResult class. */
    public EmergingIssueListResult() {
    }

    /**
     * Get the value property: The list of emerging issues.
     *
     * @return the value value.
     */
    public List<EmergingIssuesGetResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of emerging issues.
     *
     * @param value the value value to set.
     * @return the EmergingIssueListResult object itself.
     */
    public EmergingIssueListResult withValue(List<EmergingIssuesGetResultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of emerging issues.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of emerging issues.
     *
     * @param nextLink the nextLink value to set.
     * @return the EmergingIssueListResult object itself.
     */
    public EmergingIssueListResult withNextLink(String nextLink) {
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
