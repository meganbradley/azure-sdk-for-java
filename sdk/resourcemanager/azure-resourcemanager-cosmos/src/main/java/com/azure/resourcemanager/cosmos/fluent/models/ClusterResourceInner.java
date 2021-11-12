// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.ClusterResourceProperties;
import com.azure.resourcemanager.cosmos.models.ManagedCassandraArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.ManagedCassandraManagedServiceIdentity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Representation of a managed Cassandra cluster. */
@Fluent
public final class ClusterResourceInner extends ManagedCassandraArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterResourceInner.class);

    /*
     * Properties of a managed Cassandra cluster.
     */
    @JsonProperty(value = "properties")
    private ClusterResourceProperties properties;

    /**
     * Get the properties property: Properties of a managed Cassandra cluster.
     *
     * @return the properties value.
     */
    public ClusterResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a managed Cassandra cluster.
     *
     * @param properties the properties value to set.
     * @return the ClusterResourceInner object itself.
     */
    public ClusterResourceInner withProperties(ClusterResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterResourceInner withIdentity(ManagedCassandraManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
