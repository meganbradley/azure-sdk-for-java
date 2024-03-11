// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hardware specifications for the Dev Box.
 */
@Immutable
public final class DevBoxHardwareProfile {

    /*
     * The name of the SKU
     */
    @Generated
    @JsonProperty(value = "skuName", access = JsonProperty.Access.WRITE_ONLY)
    private SkuName skuName;

    /*
     * The number of vCPUs available for the Dev Box.
     */
    @Generated
    @JsonProperty(value = "vCPUs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer vCpus;

    /*
     * The amount of memory available for the Dev Box.
     */
    @Generated
    @JsonProperty(value = "memoryGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer memoryGb;

    /**
     * Creates an instance of DevBoxHardwareProfile class.
     */
    @Generated
    private DevBoxHardwareProfile() {
    }

    /**
     * Get the skuName property: The name of the SKU.
     *
     * @return the skuName value.
     */
    @Generated
    public SkuName getSkuName() {
        return this.skuName;
    }

    /**
     * Get the vCpus property: The number of vCPUs available for the Dev Box.
     *
     * @return the vCpus value.
     */
    @Generated
    public Integer getVCpus() {
        return this.vCpus;
    }

    /**
     * Get the memoryGb property: The amount of memory available for the Dev Box.
     *
     * @return the memoryGb value.
     */
    @Generated
    public Integer getMemoryGb() {
        return this.memoryGb;
    }
}
