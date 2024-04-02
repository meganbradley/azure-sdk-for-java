// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.redisenterprise.fluent.models.OperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of REST API operations supported by an Azure Resource Provider. It contains an URL link to get the next set
 * of results.
 */
@Immutable
public final class OperationListResult {
    /*
     * List of operations supported by the resource provider
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationInner> value;

    /*
     * URL to get the next set of operation list results (if there are any).
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of OperationListResult class.
     */
    public OperationListResult() {
    }

    /**
     * Get the value property: List of operations supported by the resource provider.
     * 
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results (if there are any).
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
