// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.fluent.models.WebhookInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a request to list webhooks for a container registry. */
@Fluent
public final class WebhookListResult {
    /*
     * The list of webhooks. Since this list may be incomplete, the nextLink field should be used to request the next
     * list of webhooks.
     */
    @JsonProperty(value = "value")
    private List<WebhookInner> value;

    /*
     * The URI that can be used to request the next list of webhooks.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of WebhookListResult class. */
    public WebhookListResult() {
    }

    /**
     * Get the value property: The list of webhooks. Since this list may be incomplete, the nextLink field should be
     * used to request the next list of webhooks.
     *
     * @return the value value.
     */
    public List<WebhookInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of webhooks. Since this list may be incomplete, the nextLink field should be
     * used to request the next list of webhooks.
     *
     * @param value the value value to set.
     * @return the WebhookListResult object itself.
     */
    public WebhookListResult withValue(List<WebhookInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of webhooks.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of webhooks.
     *
     * @param nextLink the nextLink value to set.
     * @return the WebhookListResult object itself.
     */
    public WebhookListResult withNextLink(String nextLink) {
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
