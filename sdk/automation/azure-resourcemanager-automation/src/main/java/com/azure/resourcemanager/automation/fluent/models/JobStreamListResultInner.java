// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response model for the list job stream operation. */
@Fluent
public final class JobStreamListResultInner {
    /*
     * A list of job streams.
     */
    @JsonProperty(value = "value")
    private List<JobStreamInner> value;

    /*
     * Gets or sets the next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of job streams.
     *
     * @return the value value.
     */
    public List<JobStreamInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of job streams.
     *
     * @param value the value value to set.
     * @return the JobStreamListResultInner object itself.
     */
    public JobStreamListResultInner withValue(List<JobStreamInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the JobStreamListResultInner object itself.
     */
    public JobStreamListResultInner withNextLink(String nextLink) {
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
