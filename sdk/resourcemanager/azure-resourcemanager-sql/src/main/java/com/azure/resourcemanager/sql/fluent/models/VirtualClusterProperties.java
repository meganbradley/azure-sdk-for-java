// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties of a virtual cluster.
 */
@Fluent
public final class VirtualClusterProperties {
    /*
     * Subnet resource ID for the virtual cluster.
     */
    @JsonProperty(value = "subnetId", access = JsonProperty.Access.WRITE_ONLY)
    private String subnetId;

    /*
     * Virtual cluster version.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * List of resources in this virtual cluster.
     */
    @JsonProperty(value = "childResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> childResources;

    /**
     * Creates an instance of VirtualClusterProperties class.
     */
    public VirtualClusterProperties() {
    }

    /**
     * Get the subnetId property: Subnet resource ID for the virtual cluster.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Get the version property: Virtual cluster version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Virtual cluster version.
     * 
     * @param version the version value to set.
     * @return the VirtualClusterProperties object itself.
     */
    public VirtualClusterProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the childResources property: List of resources in this virtual cluster.
     * 
     * @return the childResources value.
     */
    public List<String> childResources() {
        return this.childResources;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
