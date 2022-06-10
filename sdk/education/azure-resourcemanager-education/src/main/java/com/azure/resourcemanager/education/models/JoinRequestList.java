// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.education.fluent.models.JoinRequestDetailsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** list of join requests. */
@Immutable
public final class JoinRequestList {
    /*
     * The list of requests.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<JoinRequestDetailsInner> value;

    /*
     * the link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of requests.
     *
     * @return the value value.
     */
    public List<JoinRequestDetailsInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: the link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
