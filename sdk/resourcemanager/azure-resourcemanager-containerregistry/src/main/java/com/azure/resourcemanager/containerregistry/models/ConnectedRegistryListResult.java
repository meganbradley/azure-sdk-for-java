// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.fluent.models.ConnectedRegistryInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result of a request to list connected registries for a container registry.
 */
@Fluent
public final class ConnectedRegistryListResult {
    /*
     * The list of connected registries. Since this list may be incomplete, the nextLink field should be used to
     * request the next list of connected registries.
     */
    @JsonProperty(value = "value")
    private List<ConnectedRegistryInner> value;

    /*
     * The URI that can be used to request the next list of connected registries.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ConnectedRegistryListResult class.
     */
    public ConnectedRegistryListResult() {
    }

    /**
     * Get the value property: The list of connected registries. Since this list may be incomplete, the nextLink field
     * should be used to request the next list of connected registries.
     * 
     * @return the value value.
     */
    public List<ConnectedRegistryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of connected registries. Since this list may be incomplete, the nextLink field
     * should be used to request the next list of connected registries.
     * 
     * @param value the value value to set.
     * @return the ConnectedRegistryListResult object itself.
     */
    public ConnectedRegistryListResult withValue(List<ConnectedRegistryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of connected registries.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of connected registries.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ConnectedRegistryListResult object itself.
     */
    public ConnectedRegistryListResult withNextLink(String nextLink) {
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
