// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile for how to handle networking for Labs. */
@Fluent
public final class LabNetworkProfile {
    /*
     * The external subnet resource id
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /*
     * The external load balancer resource id
     */
    @JsonProperty(value = "loadBalancerId")
    private String loadBalancerId;

    /*
     * The external public IP resource id
     */
    @JsonProperty(value = "publicIpId")
    private String publicIpId;

    /**
     * Get the subnetId property: The external subnet resource id.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The external subnet resource id.
     *
     * @param subnetId the subnetId value to set.
     * @return the LabNetworkProfile object itself.
     */
    public LabNetworkProfile withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the loadBalancerId property: The external load balancer resource id.
     *
     * @return the loadBalancerId value.
     */
    public String loadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * Set the loadBalancerId property: The external load balancer resource id.
     *
     * @param loadBalancerId the loadBalancerId value to set.
     * @return the LabNetworkProfile object itself.
     */
    public LabNetworkProfile withLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }

    /**
     * Get the publicIpId property: The external public IP resource id.
     *
     * @return the publicIpId value.
     */
    public String publicIpId() {
        return this.publicIpId;
    }

    /**
     * Set the publicIpId property: The external public IP resource id.
     *
     * @param publicIpId the publicIpId value to set.
     * @return the LabNetworkProfile object itself.
     */
    public LabNetworkProfile withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
