// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterPatchProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The patch for a cluster. */
@Fluent
public final class ClusterPatch extends Resource {
    /*
     * Define cluster patch specific properties.
     */
    @JsonProperty(value = "properties")
    private ClusterPatchProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ClusterPatch class. */
    public ClusterPatch() {
    }

    /**
     * Get the innerProperties property: Define cluster patch specific properties.
     *
     * @return the innerProperties value.
     */
    private ClusterPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterPatch withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterPatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the clusterProfile property: Cluster resource patch properties.
     *
     * @return the clusterProfile value.
     */
    public UpdatableClusterProfile clusterProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterProfile();
    }

    /**
     * Set the clusterProfile property: Cluster resource patch properties.
     *
     * @param clusterProfile the clusterProfile value to set.
     * @return the ClusterPatch object itself.
     */
    public ClusterPatch withClusterProfile(UpdatableClusterProfile clusterProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPatchProperties();
        }
        this.innerProperties().withClusterProfile(clusterProfile);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
