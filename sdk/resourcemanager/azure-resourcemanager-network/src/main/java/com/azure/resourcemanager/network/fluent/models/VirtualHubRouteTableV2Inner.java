// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualHubRouteV2;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * VirtualHubRouteTableV2 Resource.
 */
@Fluent
public final class VirtualHubRouteTableV2Inner extends SubResource {
    /*
     * Properties of the virtual hub route table v2.
     */
    @JsonProperty(value = "properties")
    private VirtualHubRouteTableV2Properties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of VirtualHubRouteTableV2Inner class.
     */
    public VirtualHubRouteTableV2Inner() {
    }

    /**
     * Get the innerProperties property: Properties of the virtual hub route table v2.
     * 
     * @return the innerProperties value.
     */
    private VirtualHubRouteTableV2Properties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the VirtualHubRouteTableV2Inner object itself.
     */
    public VirtualHubRouteTableV2Inner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualHubRouteTableV2Inner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the routes property: List of all routes.
     * 
     * @return the routes value.
     */
    public List<VirtualHubRouteV2> routes() {
        return this.innerProperties() == null ? null : this.innerProperties().routes();
    }

    /**
     * Set the routes property: List of all routes.
     * 
     * @param routes the routes value to set.
     * @return the VirtualHubRouteTableV2Inner object itself.
     */
    public VirtualHubRouteTableV2Inner withRoutes(List<VirtualHubRouteV2> routes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubRouteTableV2Properties();
        }
        this.innerProperties().withRoutes(routes);
        return this;
    }

    /**
     * Get the attachedConnections property: List of all connections attached to this route table v2.
     * 
     * @return the attachedConnections value.
     */
    public List<String> attachedConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().attachedConnections();
    }

    /**
     * Set the attachedConnections property: List of all connections attached to this route table v2.
     * 
     * @param attachedConnections the attachedConnections value to set.
     * @return the VirtualHubRouteTableV2Inner object itself.
     */
    public VirtualHubRouteTableV2Inner withAttachedConnections(List<String> attachedConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubRouteTableV2Properties();
        }
        this.innerProperties().withAttachedConnections(attachedConnections);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual hub route table v2 resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
