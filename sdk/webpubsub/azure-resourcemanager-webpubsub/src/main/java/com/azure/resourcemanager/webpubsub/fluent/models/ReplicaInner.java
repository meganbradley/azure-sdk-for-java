// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import com.azure.resourcemanager.webpubsub.models.ResourceSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A class represent a replica resource. */
@Fluent
public final class ReplicaInner extends Resource {
    /*
     * The billing information of the resource.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private ReplicaProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ReplicaInner class. */
    public ReplicaInner() {
    }

    /**
     * Get the sku property: The billing information of the resource.
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The billing information of the resource.
     *
     * @param sku the sku value to set.
     * @return the ReplicaInner object itself.
     */
    public ReplicaInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: The properties property.
     *
     * @return the innerProperties value.
     */
    private ReplicaProperties innerProperties() {
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
    public ReplicaInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ReplicaInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the regionEndpointEnabled property: Enable or disable the regional endpoint. Default to "Enabled". When it's
     * Disabled, new connections will not be routed to this endpoint, however existing connections will not be affected.
     *
     * @return the regionEndpointEnabled value.
     */
    public String regionEndpointEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().regionEndpointEnabled();
    }

    /**
     * Set the regionEndpointEnabled property: Enable or disable the regional endpoint. Default to "Enabled". When it's
     * Disabled, new connections will not be routed to this endpoint, however existing connections will not be affected.
     *
     * @param regionEndpointEnabled the regionEndpointEnabled value to set.
     * @return the ReplicaInner object itself.
     */
    public ReplicaInner withRegionEndpointEnabled(String regionEndpointEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReplicaProperties();
        }
        this.innerProperties().withRegionEndpointEnabled(regionEndpointEnabled);
        return this;
    }

    /**
     * Get the resourceStopped property: Stop or start the resource. Default to "false". When it's true, the data plane
     * of the resource is shutdown. When it's false, the data plane of the resource is started.
     *
     * @return the resourceStopped value.
     */
    public String resourceStopped() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceStopped();
    }

    /**
     * Set the resourceStopped property: Stop or start the resource. Default to "false". When it's true, the data plane
     * of the resource is shutdown. When it's false, the data plane of the resource is started.
     *
     * @param resourceStopped the resourceStopped value to set.
     * @return the ReplicaInner object itself.
     */
    public ReplicaInner withResourceStopped(String resourceStopped) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ReplicaProperties();
        }
        this.innerProperties().withResourceStopped(resourceStopped);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
