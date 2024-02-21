// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The request for a VIP swap.
 */
@Fluent
public final class LoadBalancerVipSwapRequest {
    /*
     * A list of frontend IP configuration resources that should swap VIPs.
     */
    @JsonProperty(value = "frontendIPConfigurations")
    private List<LoadBalancerVipSwapRequestFrontendIpConfiguration> frontendIpConfigurations;

    /**
     * Creates an instance of LoadBalancerVipSwapRequest class.
     */
    public LoadBalancerVipSwapRequest() {
    }

    /**
     * Get the frontendIpConfigurations property: A list of frontend IP configuration resources that should swap VIPs.
     * 
     * @return the frontendIpConfigurations value.
     */
    public List<LoadBalancerVipSwapRequestFrontendIpConfiguration> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: A list of frontend IP configuration resources that should swap VIPs.
     * 
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerVipSwapRequest object itself.
     */
    public LoadBalancerVipSwapRequest
        withFrontendIpConfigurations(List<LoadBalancerVipSwapRequestFrontendIpConfiguration> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontendIpConfigurations() != null) {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
    }
}
