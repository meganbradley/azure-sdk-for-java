// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridnetwork.fluent.models.PreviewSubscriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of customer subscriptions which can use a sku. */
@Fluent
public final class PreviewSubscriptionsList {
    /*
     * A list of preview subscriptions.
     */
    @JsonProperty(value = "value")
    private List<PreviewSubscriptionInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of PreviewSubscriptionsList class. */
    public PreviewSubscriptionsList() {
    }

    /**
     * Get the value property: A list of preview subscriptions.
     *
     * @return the value value.
     */
    public List<PreviewSubscriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of preview subscriptions.
     *
     * @param value the value value to set.
     * @return the PreviewSubscriptionsList object itself.
     */
    public PreviewSubscriptionsList withValue(List<PreviewSubscriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
