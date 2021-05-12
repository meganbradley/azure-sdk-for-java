// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.models.WebhookInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response model for the list webhook operation. */
@Fluent
public final class WebhookListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebhookListResult.class);

    /*
     * Gets or sets a list of webhooks.
     */
    @JsonProperty(value = "value")
    private List<WebhookInner> value;

    /*
     * Gets or sets the next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets or sets a list of webhooks.
     *
     * @return the value value.
     */
    public List<WebhookInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets a list of webhooks.
     *
     * @param value the value value to set.
     * @return the WebhookListResult object itself.
     */
    public WebhookListResult withValue(List<WebhookInner> value) {
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
