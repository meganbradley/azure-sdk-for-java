// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters for a PATCH request to a grafana resource. */
@Fluent
public final class ManagedGrafanaUpdateParameters {
    /*
     * The managed identity of the grafana resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * The new tags of the grafana resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Properties specific to the managed grafana resource.
     */
    @JsonProperty(value = "properties")
    private ManagedGrafanaPropertiesUpdateParameters properties;

    /**
     * Get the identity property: The managed identity of the grafana resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity of the grafana resource.
     *
     * @param identity the identity value to set.
     * @return the ManagedGrafanaUpdateParameters object itself.
     */
    public ManagedGrafanaUpdateParameters withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the tags property: The new tags of the grafana resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The new tags of the grafana resource.
     *
     * @param tags the tags value to set.
     * @return the ManagedGrafanaUpdateParameters object itself.
     */
    public ManagedGrafanaUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Properties specific to the managed grafana resource.
     *
     * @return the properties value.
     */
    public ManagedGrafanaPropertiesUpdateParameters properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties specific to the managed grafana resource.
     *
     * @param properties the properties value to set.
     * @return the ManagedGrafanaUpdateParameters object itself.
     */
    public ManagedGrafanaUpdateParameters withProperties(ManagedGrafanaPropertiesUpdateParameters properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
