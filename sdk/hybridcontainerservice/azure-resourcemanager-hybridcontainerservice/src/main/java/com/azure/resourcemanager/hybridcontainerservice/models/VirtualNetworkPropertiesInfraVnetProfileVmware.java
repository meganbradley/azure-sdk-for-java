// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Infra network profile for VMware platform.
 */
@Fluent
public final class VirtualNetworkPropertiesInfraVnetProfileVmware {
    /*
     * Name of the network segment in VSphere
     */
    @JsonProperty(value = "segmentName")
    private String segmentName;

    /**
     * Creates an instance of VirtualNetworkPropertiesInfraVnetProfileVmware class.
     */
    public VirtualNetworkPropertiesInfraVnetProfileVmware() {
    }

    /**
     * Get the segmentName property: Name of the network segment in VSphere.
     * 
     * @return the segmentName value.
     */
    public String segmentName() {
        return this.segmentName;
    }

    /**
     * Set the segmentName property: Name of the network segment in VSphere.
     * 
     * @param segmentName the segmentName value to set.
     * @return the VirtualNetworkPropertiesInfraVnetProfileVmware object itself.
     */
    public VirtualNetworkPropertiesInfraVnetProfileVmware withSegmentName(String segmentName) {
        this.segmentName = segmentName;
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
