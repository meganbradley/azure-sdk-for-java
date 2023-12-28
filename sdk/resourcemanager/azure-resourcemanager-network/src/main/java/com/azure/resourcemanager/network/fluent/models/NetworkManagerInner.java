// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.network.models.ConfigurationType;
import com.azure.resourcemanager.network.models.NetworkManagerPropertiesNetworkManagerScopes;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The Managed Network resource.
 */
@Fluent
public final class NetworkManagerInner extends Resource {
    /*
     * The network manager properties
     */
    @JsonProperty(value = "properties")
    private NetworkManagerProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The system metadata related to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of NetworkManagerInner class.
     */
    public NetworkManagerInner() {
    }

    /**
     * Get the innerProperties property: The network manager properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkManagerProperties innerProperties() {
        return this.innerProperties;
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
     * Get the systemData property: The system metadata related to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the NetworkManagerInner object itself.
     */
    public NetworkManagerInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkManagerInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkManagerInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: A description of the network manager.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the network manager.
     * 
     * @param description the description value to set.
     * @return the NetworkManagerInner object itself.
     */
    public NetworkManagerInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkManagerProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the networkManagerScopes property: Scope of Network Manager.
     * 
     * @return the networkManagerScopes value.
     */
    public NetworkManagerPropertiesNetworkManagerScopes networkManagerScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().networkManagerScopes();
    }

    /**
     * Set the networkManagerScopes property: Scope of Network Manager.
     * 
     * @param networkManagerScopes the networkManagerScopes value to set.
     * @return the NetworkManagerInner object itself.
     */
    public NetworkManagerInner
        withNetworkManagerScopes(NetworkManagerPropertiesNetworkManagerScopes networkManagerScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkManagerProperties();
        }
        this.innerProperties().withNetworkManagerScopes(networkManagerScopes);
        return this;
    }

    /**
     * Get the networkManagerScopeAccesses property: Scope Access.
     * 
     * @return the networkManagerScopeAccesses value.
     */
    public List<ConfigurationType> networkManagerScopeAccesses() {
        return this.innerProperties() == null ? null : this.innerProperties().networkManagerScopeAccesses();
    }

    /**
     * Set the networkManagerScopeAccesses property: Scope Access.
     * 
     * @param networkManagerScopeAccesses the networkManagerScopeAccesses value to set.
     * @return the NetworkManagerInner object itself.
     */
    public NetworkManagerInner withNetworkManagerScopeAccesses(List<ConfigurationType> networkManagerScopeAccesses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkManagerProperties();
        }
        this.innerProperties().withNetworkManagerScopeAccesses(networkManagerScopeAccesses);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network manager resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
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
