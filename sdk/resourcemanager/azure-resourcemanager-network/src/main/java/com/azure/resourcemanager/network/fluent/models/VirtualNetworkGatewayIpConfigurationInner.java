// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP configuration for virtual network gateway. */
@Fluent
public final class VirtualNetworkGatewayIpConfigurationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkGatewayIpConfigurationInner.class);

    /*
     * Properties of the virtual network gateway ip configuration.
     */
    @JsonProperty(value = "properties")
    private VirtualNetworkGatewayIpConfigurationPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Properties of the virtual network gateway ip configuration.
     *
     * @return the innerProperties value.
     */
    private VirtualNetworkGatewayIpConfigurationPropertiesFormat innerProperties() {
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
     * @return the VirtualNetworkGatewayIpConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIpConfigurationInner withName(String name) {
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

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkGatewayIpConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the VirtualNetworkGatewayIpConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIpConfigurationInner withPrivateIpAllocationMethod(
        IpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Get the subnet property: The reference to the subnet resource.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The reference to the subnet resource.
     *
     * @param subnet the subnet value to set.
     * @return the VirtualNetworkGatewayIpConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIpConfigurationInner withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the publicIpAddress property: The reference to the public IP resource.
     *
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: The reference to the public IP resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the VirtualNetworkGatewayIpConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIpConfigurationInner withPublicIpAddress(SubResource publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the privateIpAddress property: Private IP Address for this gateway.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway IP configuration
     * resource.
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
